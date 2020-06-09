package in.quallit.postgresMultiSchemaDemo.config.datasource;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

import in.quallit.postgresMultiSchemaDemo.entity.common.TenantContext;

@Component
public class TenantSchemaResolver implements CurrentTenantIdentifierResolver {

	private String defaultTenant = "default";

	@Override
	public String resolveCurrentTenantIdentifier() {
		String t = TenantContext.getCurrentTenant();
		if (t != null) {
			return t;
		} else {
			return defaultTenant;
		}
	}

	@Override
	public boolean validateExistingCurrentSessions() {
		return true;
	}
}

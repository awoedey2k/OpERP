package devopsdistilled.operp.client.context.party;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import devopsdistilled.operp.client.party.panes.controllers.CustomerPaneController;
import devopsdistilled.operp.client.party.panes.controllers.ListCustomerPaneController;
import devopsdistilled.operp.client.party.panes.controllers.ListVendorPaneController;
import devopsdistilled.operp.client.party.panes.controllers.VendorPaneController;
import devopsdistilled.operp.client.party.panes.controllers.impl.CustomerPaneControllerImpl;
import devopsdistilled.operp.client.party.panes.controllers.impl.ListCustomerPaneControllerImpl;
import devopsdistilled.operp.client.party.panes.controllers.impl.ListVendorPaneControllerImpl;
import devopsdistilled.operp.client.party.panes.controllers.impl.VendorPaneControllerImpl;

@Configuration
public class MvcControllerContext {

	@Bean
	public VendorPaneController vendorPaneController() {
		return new VendorPaneControllerImpl();
	}

	@Bean
	public ListVendorPaneController listVendorPaneController() {
		return new ListVendorPaneControllerImpl();
	}

	@Bean
	public CustomerPaneController customerPaneController() {
		return new CustomerPaneControllerImpl();
	}

	@Bean
	public ListCustomerPaneController listCustomerPaneController() {
		return new ListCustomerPaneControllerImpl();
	}
}
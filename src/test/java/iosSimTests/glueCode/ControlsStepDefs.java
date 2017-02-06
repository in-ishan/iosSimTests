package iosSimTests.glueCode;



import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import iosSimTests.pages.ControlsMobilePage;
import iosSimTests.pages.HomePage;

public class ControlsStepDefs {
	
	HomePage hp=new HomePage();
	ControlsMobilePage cp=new ControlsMobilePage();
	
	@Given("^user is on controls page$")
	public void user_is_on_controls_page()  
	{
	    hp.ClickOnControlsLabel();
	}

	@When("^user slided the customized slider to (\\d+)%$")
	public void user_slided_the_customized_slider_to(int arg1)  
	{
	    cp.slideCustomizedSlider("1.0");
	}

	@Then("^slider value should changed to 100%$")
	public void slider_value_should_changed_to()  
	{
	    Assert.assertEquals(cp.getCustomizedSliderValue(), "100%");
	}

}

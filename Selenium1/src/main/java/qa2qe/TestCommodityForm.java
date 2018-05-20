package qa2qe;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCommodityForm {
	public WebDriver driver;
	@Test
	public void test_Commodity_Details() {
		new CommodityForm().enterName("LG 335 Refrigerator").
		enterWeight("100")
		.enterLength("450")
		.enterWidth("520")
		.enterHeight("1200")
		.clickAdd()
		.verifyName1("LG 335 Refrigerator")
		.verifyWeight1("100")
		.verifyLength1("450")
		.verifyWidth1("520")
		.verifyHeight1("1200")
		.verifyTotalNumOfCommodity()
		.verifyTotalWeight()
		.enterName("")
		.enterWeight("")
		.enterLength("")
		.enterWidth("")
		.enterHeight("")
		.verifyName2("")
		.verifyWeight2("")
		.verifyLength2("")
		.verifyWidth2("")
		.verifyHeight2("")
		.verifyTotalNumOfCommodity()
		.verifyTotalWeight();
	}

}

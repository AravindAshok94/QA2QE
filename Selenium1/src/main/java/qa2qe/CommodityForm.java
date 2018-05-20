package qa2qe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommodityForm extends DriverSetup {

	public WebDriver driver;
	public CommodityForm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="name")
	private WebElement eleName;
	public CommodityForm enterName(String data) {
		eleName.sendKeys(data);
		return this;
	}
	
	@FindBy(how=How.ID,using="weight")
	private WebElement eleWeight;
	public CommodityForm enterWeight(String data) {
		eleWeight.sendKeys(data);
		return this;
	}
	
	@FindBy(how=How.ID,using="length")
	private WebElement eleLength;
	public CommodityForm enterLength(String data) {
		eleLength.sendKeys(data);
		return this;
	}
	
	@FindBy(how=How.ID,using="width")
	private WebElement eleWidth;
	public CommodityForm enterWidth(String data) {
		eleWidth.sendKeys(data);
		return this;
	}
	
	@FindBy(how=How.ID,using="height")
	private WebElement eleHeight;
	public CommodityForm enterHeight(String data) {
		eleHeight.sendKeys(data);
		return this;
	}
	@FindBy(how=How.ID,using="add")
	private WebElement eleAdd;
	public CommodityForm clickAdd() {
		eleAdd.click();
		return this;
	}
	@FindBy(how=How.XPATH,using="//table/tbody/tr[2]/td[1]")
	private WebElement dataName1;
	public CommodityForm verifyName1(String data) {
		String text = dataName1.getText();
		if(text==data) {
			System.out.println("Given name present in the table");
		}
		else {
			System.out.println("Given name does not exist in the table");
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr[2]/td[2]")
	private WebElement dataWeight1;
	public CommodityForm verifyWeight1(String data) {
		String text = dataWeight1.getText();
		if(text==data) {
			System.out.println("Given weight present in the table");
		}
		else {
			System.out.println("Given weight does not exist in the table");
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr[2]/td[3]")
	private WebElement dataLength1;
	public CommodityForm verifyLength1(String data) {
		String text = dataLength1.getText();
		if(text==data) {
			System.out.println("Given length present in the table");
		}
		else {
			System.out.println("Given length does not exist in the table");
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr[2]/td[4]")
	private WebElement dataWidth1;
	public CommodityForm verifyWidth1(String data) {
		String text = dataWidth1.getText();
		if(text==data) {
			System.out.println("Given width present in the table");
		}
		else {
			System.out.println("Given width does not exist in the table");
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr[2]/td[5]")
	private WebElement dataHeight1;
	public CommodityForm verifyHeight1(String data) {
		String text = dataHeight1.getText();
		if(text==data) {
			System.out.println("Given height present in the table");
		}
		else {
			System.out.println("Given height does not exist in the table");
		}
		return this;
	}
		
		@FindBy(how=How.XPATH,using="//table/tbody/tr[3]/td[1]")
		private WebElement dataName2;
		public CommodityForm verifyName2(String data) {
			String text = dataName2.getText();
			if(text==data) {
				System.out.println("Given name present in the table");
			}
			else {
				System.out.println("Given name does not exist in the table");
			}
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//table/tbody/tr[3]/td[2]")
		private WebElement dataWeight2;
		public CommodityForm verifyWeight2(String data) {
			String text = dataWeight2.getText();
			if(text==data) {
				System.out.println("Given weight present in the table");
			}
			else {
				System.out.println("Given weight does not exist in the table");
			}
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//table/tbody/tr[3]/td[3]")
		private WebElement dataLength2;
		public CommodityForm verifyLength2(String data) {
			String text = dataLength2.getText();
			if(text==data) {
				System.out.println("Given length present in the table");
			}
			else {
				System.out.println("Given length does not exist in the table");
			}
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//table/tbody/tr[3]/td[4]")
		private WebElement dataWidth2;
		public CommodityForm verifyWidth2(String data) {
			String text = dataWidth2.getText();
			if(text==data) {
				System.out.println("Given width present in the table");
			}
			else {
				System.out.println("Given width does not exist in the table");
			}
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//table/tbody/tr[3]/td[5]")
		private WebElement dataHeight2;
		public CommodityForm verifyHeight2(String data) {
			String text = dataHeight2.getText();
			if(text==data) {
				System.out.println("Given height present in the table");
			}
			else {
				System.out.println("Given height does not exist in the table");
			}
			return this;
	}
		@FindBy(how=How.ID,using="count")
		private WebElement eleCommodityCount;
		public CommodityForm verifyTotalNumOfCommodity() {
			String text = eleCommodityCount.getText();
			System.out.println(text);
			return this;
		}
		
		@FindBy(how=How.ID,using="total")
		private WebElement eleTotalWeight;
		public CommodityForm verifyTotalWeight() {
			String text = eleTotalWeight.getText();
			System.out.println(text);
			return this;
		}


}

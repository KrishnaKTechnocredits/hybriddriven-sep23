package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ControlActions;

public class DashboardPage extends ControlActions{

	@FindBy(xpath = "//section[@id='sidebar']//h6[text()='Categories']//following-sibling::div[not(@id)]/label")
	List<WebElement> categoriesElementList ;
	
	@FindBy(xpath = "//section[@id= 'sidebar']//h6[text()='Sub Categories']/following-sibling::div[not(@id)]/label")
	List<WebElement> subCategoriesElementList; 
	
	@FindBy(xpath = "//section//h6[text()='Search For']//following-sibling::div[contains(@class,'form-group')]/label")
	List<WebElement> searchForElementList;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public int getTotalNumberItemsInCategories() {
		return categoriesElementList.size();
	}
	
	public List<String> getCategoriesItemTextList(){
		/*
		 * List<String> categoriesItemTextList = new ArrayList<String>(); for(WebElement
		 * item : categoriesElementList) { categoriesItemTextList.add(item.getText()); }
		 * return categoriesItemTextList;
		 */
		
		return getElementTextList(categoriesElementList);
	}
	
	public int getTotalNumberItemsInSubCategories() {
		return subCategoriesElementList.size();
	}
	
	public List<String> getSubCategoriesItemTextList(){
		/*
		 * List<String> subCategoriesItemTextList = new ArrayList<String>();
		 * for(WebElement item : subCategoriesElementList) {
		 * subCategoriesItemTextList.add(item.getText()); } return
		 * subCategoriesItemTextList;
		 */
		List<String> subCategoriesItemTextList = getElementTextList(subCategoriesElementList);
		return subCategoriesItemTextList;
	}
	
	public int getTotalNumberItemsInSearchFor() {
		return searchForElementList.size();
	}
	
	public List<String> getSearchForItemTextList(){
		/*
		 * List<String> searchForItemTextList = new ArrayList<String>(); for(WebElement
		 * item : searchForElementList) { searchForItemTextList.add(item.getText()); }
		 * return searchForItemTextList;
		 */
		return getElementTextList(searchForElementList);
	}
}

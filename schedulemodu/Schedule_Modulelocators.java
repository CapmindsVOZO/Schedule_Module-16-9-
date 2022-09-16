package com.schedulemodu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schedule_Modulelocators {
	public WebDriver driver;

	@FindBy(xpath = "(//button[normalize-space()='Month'])[1]")
	private WebElement month;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMonth() {
		return month;
	}

////////calendar
	public Schedule_Modulelocators(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	@FindBy(xpath = "//tbody/tr[1]/td[6]")
	private WebElement monthcalender;

	public WebElement getMonthcalender() {
		return monthcalender;
	}

	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Cancel1;

	public WebElement getCancel1() {
		return Cancel1;
	}

	@FindBy(xpath = "(//span[@class='sc-bKhNmF dZKOdZ'])[1]")
	private WebElement Visibletext1;

	public WebElement getVisibletext1() {
		return Visibletext1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Week'])[1]")
	private WebElement Workweek;

	public WebElement getWorkweek() {
		return Workweek;
	}

	@FindBy(xpath = "//tbody/tr[5]/td[2]")
	private WebElement Wwcalender;

	public WebElement getWwcalender() {
		return Wwcalender;
	}

	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Cancel2;

	public WebElement getCancel2() {
		return Cancel2;
	}

	@FindBy(xpath = "(//span[@class='sc-cUEIKg fsBOFX'])[1]")
	private WebElement Visibletext2;

	public WebElement getVisibletext2() {
		return Visibletext2;

	}

	@FindBy(xpath = "(//button[normalize-space()='Week'])[1]")
	private WebElement week;

	public WebElement getweek() {
		return week;
	}

	@FindBy(xpath = "//tbody/tr[6]/td[5]")
	private WebElement wcalender;

	public WebElement getwcalender() {
		return wcalender;
	}

	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Cancel3;

	public WebElement getCancel3() {
		return Cancel3;
	}

	@FindBy(xpath = "(//span[@class='sc-bKhNmF dZKOdZ'])[1]")
	private WebElement Visibletext3;

	public WebElement getVisibletext3() {
		return Visibletext3;

	}

	@FindBy(xpath = "(//button[normalize-space()='Day'])[1]")
	private WebElement Day;

	public WebElement getDay() {
		return Day;

	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/table[1]/tbody[1]/tr[6]/td[1]")
	private WebElement Daycalender;

	public WebElement getDaycalender() {
		return Daycalender;

	}

	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement Cancel4;

	public WebElement getCancel4() {
		return Cancel4;

	}

	@FindBy(xpath = "(//span[@class='sc-bKhNmF dZKOdZ'])[1]")
	private WebElement Visibletext4;

	public WebElement getVisibletext4() {
		return Visibletext4;

	}

	@FindBy(xpath = "(//span[@class='sc-bKhNmF dZKOdZ'])[1]")
	private WebElement CenterCalender;

	public WebElement getCenterCalender() {
		return CenterCalender;

	}

	@FindBy(xpath = "//button[contains(text(),'Today')]")
	private WebElement Today;

	public WebElement getToday() {
		return Today;

	}

	@FindBy(xpath = "(//button[@class='sc-ivmvlL kKgcMT'])[1]")
	private WebElement Right;

	public WebElement getRight() {
		return Right;

	}

	@FindBy(xpath = "(//button[@class='sc-jclSIp iEcIvQ'])[1]")
	private WebElement Left;

	public WebElement getLeft() {
		return Left;

	}

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement Providerselect;

	public WebElement getProviderselect() {
		return Providerselect;

	}

	@FindBy(xpath = "(//div[@class='demo-option-label-item'][contains(text(),'James')])[1]")
	private WebElement selectProvider;

	public WebElement getselectProvider() {
		return selectProvider;

	}

	@FindBy(xpath = "(//*[name()='svg'])[10]")
	private WebElement Providerselectclo;

	public WebElement getProviderselectclo() {
		return Providerselectclo;

	}

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement FacilitySelect;

	public WebElement getFacilitySelect() {
		return FacilitySelect;

	}

	@FindBy(xpath = "(//div[contains(text(),'defaults hospital')])[1]")
	private WebElement SelectFacility;

	public WebElement getSelectFacility() {
		return SelectFacility;

	}

	@FindBy(xpath = "(//*[name()='svg'])[9]")
	private WebElement FacilitySelectclo;

	public WebElement getFacilitySelectclo() {
		return FacilitySelectclo;

	}

	@FindBy(xpath = "(//button[normalize-space()='Today'])[1]")
	private WebElement Todayoption;

	public WebElement getTodayoption() {
		return Todayoption;

	}

	@FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
	private WebElement Appointmentoption;

	public WebElement getAppointmentoption() {
		return Appointmentoption;

	}
	/////////// Appointment

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Clcikpatient;

	public WebElement getClcikpatient() {
		return Clcikpatient;
	}

	@FindBy(xpath = "(//a[normalize-space()='Create Appoiment'])[1]")
	private WebElement Appointmentclick;

	public WebElement getAppointmentclick() {
		return Appointmentclick;

	}

	@FindBy(xpath = "(//input[@value='1'])[5]")
	private WebElement Appointtyp;

	public WebElement getAppointtyp() {
		return Appointtyp;

	}

	@FindBy(xpath = "(//span[normalize-space()='TestPatient'])[1]")
	private WebElement Selectpatient;

	public WebElement getSelectpatient() {
		return Selectpatient;

	}

	@FindBy(xpath = "(//span[normalize-space()='TestPatient'])[1]")
	private WebElement Selectpatient1;

	public WebElement getSelectpatient1() {
		return Selectpatient1;

	}

	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")
	private WebElement Selectdate;

	public WebElement getSelectdate() {
		return Selectdate;

	}
	
	@FindBy(xpath = "(//a[normalize-space()='Today'])[1]")
	private WebElement clcitoda;

	public WebElement getclcitoda() {
		return clcitoda;

	}

	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")
	private WebElement Selectdate1;

	public WebElement getSelectdate1() {
		return Selectdate1;

	}

	@FindBy(xpath = "(//div[@class='ant-picker-time-panel-cell-inner'][normalize-space()='12'])[1]")
	private WebElement Selecttime2;

	public WebElement getSelecttime2() {
		return Selecttime2;

	}

	@FindBy(xpath = "(//div[normalize-space()='PM'])[1]")
	private WebElement Selecttime1;

	public WebElement getSelecttime1() {
		return Selecttime1;

	}

	@FindBy(xpath = "(//input[@id='new-set-time'])[1]")
	private WebElement Selecttime;

	public WebElement getSelecttime() {
		return Selecttime;

	}

	@FindBy(xpath = "(//input[@id='new-set-time'])[1]")
	private WebElement Selecttimevid;

	public WebElement getSelecttimevid() {
		return Selecttimevid;

	}

	@FindBy(xpath = "(//span[normalize-space()='Ok'])[1]")
	private WebElement Selecttimeok;

	public WebElement getSelecttimeok() {
		return Selecttimeok;

	}

	@FindBy(xpath = "(//a[normalize-space()='Now'])[1]")
	private WebElement Selecttimenow;

	public WebElement getSelecttimenow() {
		return Selecttimenow;

	}

//	@FindBy(xpath = "//span[contains(text(),'Ok')]")
//	private WebElement Clickok;
//
//	public WebElement getClickok() {
//		return Clickok;
//
//	}

	@FindBy(xpath = "(//input[@id='new-app-duration'])[1]")
	private WebElement Sendmin;

	public WebElement getSendmin() {
		return Sendmin;

	}

	@FindBy(xpath = "(//input[@id='new-app-repeats-check1'])[1]")
	private WebElement Repeat;

	public WebElement getRepeat() {
		return Repeat;

	}

	@FindBy(xpath = "(//div[normalize-space()='Search Provider'])[1]")
	private WebElement prosel;

	public WebElement getprosel() {
		return prosel;

	}

	@FindBy(xpath = "(//span[contains(text(),'Martin Edward')])[1]")
	private WebElement proselected;

	public WebElement getproselected() {
		return proselected;

	}

	@FindBy(xpath = "(//select[@id='new-app-select1'])[1]")
	private WebElement selec;

	public WebElement getselec() {
		return selec;

	}

	@FindBy(xpath = "(//select[@id='new-app-select2'])[1]")
	private WebElement selecda;

	public WebElement getselecda() {
		return selecda;

	}

	@FindBy(xpath = "(//div[@class='ant-switch-handle'])[1]")
	private WebElement dayw;

	public WebElement getdayw() {
		return dayw;

	}

	@FindBy(xpath = "(//label[@id='tbg-btn-1'])[1]")
	private WebElement dayws;

	public WebElement getdayws() {
		return dayws;

	}

	@FindBy(xpath = "(//input[@id='new-app-untildate'])[1]")
	private WebElement cals;

	public WebElement getcals() {
		return cals;

	}

	@FindBy(id = "new-app-select1")
	private WebElement Selectevery;

	public WebElement getSelectevery() {
		return Selectevery;

	}

	@FindBy(id = "new-app-select2")
	private WebElement Selectday;

	public WebElement getSelectday() {
		return Selectday;

	}

	@FindBy(xpath = "//span[contains(text(),'Days wise')]")
	private WebElement Daywise;

	public WebElement getDaywise() {
		return Daywise;

	}

	@FindBy(id = "new-app-days-wise")
	private WebElement Daywise2;

	public WebElement getSelectDaywise2() {
		return Daywise2;

	}

	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'][normalize-space()='6'])[1]")
	private WebElement Selectcalender1;

	public WebElement getSelectcalender1() {
		return Selectcalender1;

	}

	@FindBy(id = "tbg-btn-1")
	private WebElement Selectweek;

	public WebElement getSelectweek() {
		return Selectweek;

	}

	@FindBy(xpath = "//div[contains(text(),'Search Provider')]")
	private WebElement SearchProvider;

	public WebElement getSearchProvider() {
		return SearchProvider;

	}

	@FindBy(xpath = "(//div[@class='demo-option-label-item'])[1]")
	private WebElement Selectprovider;

	public WebElement getSelectprovider() {
		return Selectprovider;

	}

	@FindBy(xpath = "//div[contains(text(),'Profile')]")
	private WebElement Clickprofile;

	public WebElement getClickprofile() {
		return Clickprofile;

	}

	@FindBy(xpath = "(//span[normalize-space()='Office Visit'])[1]")
	private WebElement Selectprofile;

	public WebElement getSelectprofile() {
		return Selectprofile;

	}

	@FindBy(xpath = "(//i[@class='dropdown icon'])[4]")
	private WebElement Location;

	public WebElement getLocation() {
		return Location;

	}

	@FindBy(xpath = "(//span[contains(text(),'Test Facility Phar')])[2]")
	private WebElement SelectLocation;

	public WebElement getSelectLocation() {
		return SelectLocation;

	}

	@FindBy(xpath = "//div[contains(text(),'Status')]")
	private WebElement Clickstatus;

	public WebElement getClickstatus() {
		return Clickstatus;

	}

	@FindBy(xpath = "(//span[normalize-space()='@ Arrived/Lobby'])[1]")
	private WebElement Selectstatus;

	public WebElement getSelectstatus() {
		return Selectstatus;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement Clicksave;

	public WebElement getClicksave() {
		return Clicksave;

	}

	@FindBy(xpath = "(//button[@class='close-btn btn btn-light'])[1]")
	private WebElement Clickclose;

	public WebElement getClickclose() {
		return Clickclose;

	}

	@FindBy(xpath = "(//span[normalize-space()='Video Visit'])[1]")
	private WebElement videovis;

	public WebElement getvideovis() {
		return videovis;

	}

	@FindBy(xpath = "(//div[normalize-space()='Search Patient'])[1]")
	private WebElement searvid;

	public WebElement getsearvid() {

		return searvid;

	}

	@FindBy(xpath = "(//input[contains(@type,'text')])[2]")
	private WebElement searvidpat;

	public WebElement getsearvidpat() {

		return searvidpat;

	}

	@FindBy(xpath = "(//div[normalize-space()='Status'])[1]")
	private WebElement statsel;

	public WebElement getstatsel() {

		return statsel;

	}

	@FindBy(xpath = "(//span[normalize-space()='Meet Completed'])[1]")
	private WebElement statsel1;

	public WebElement getstatse1l() {

		return statsel1;

	}

	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	private WebElement closvi;

	public WebElement getclosvi() {

		return closvi;

	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement savevi;

	public WebElement getsavevi() {

		return savevi;

	}

	////////////// new appoin

	@FindBy(xpath = "//span[@class='e-tbar-btn-text'][normalize-space()='Day']")
	private WebElement Clickdayn;

	public WebElement getClickdayn() {
		return Clickdayn;

	}

	@FindBy(xpath = "(//button[normalize-space()='Create'])[1]")
	private WebElement Clickcaln;

	public WebElement getClickcaln() {
		return Clickcaln;

	}

	@FindBy(xpath = "(//a[normalize-space()='Create Appoiment'])[1]")
	private WebElement Clickcreateappn;

	public WebElement getClickcreateappn() {
		return Clickcreateappn;

	}

	@FindBy(xpath = "//div[contains(text(),'Search Patient')]")
	private WebElement serachpatn;

	public WebElement getserachpatn() {
		return serachpatn;

	}

	@FindBy(xpath = "(//span[normalize-space()='DhilipKumar'])[1]")
	private WebElement sendpatn;

	public WebElement getsendpatn() {
		return sendpatn;

	}

	@FindBy(xpath = "(//input[@id='new-set-time'])[1]")
	private WebElement sendtimen;

	public WebElement getsendtimen() {
		return sendtimen;

	}

	@FindBy(xpath = "//div[contains(text(),'Search Provider')]")
	private WebElement searprovin;

	public WebElement getsearprovin() {
		return searprovin;

	}

	@FindBy(xpath = "(//span[@class='text'][normalize-space()='Tech1'])[1]")
	private WebElement sendprovn;

	public WebElement getsendprovn() {
		return sendprovn;

	}

	@FindBy(xpath = "(//div[normalize-space()='Profile'])[1]")
	private WebElement searprofn;

	public WebElement getsearprofn() {
		return searprofn;

	}

	@FindBy(xpath = "//span[contains(text(),'In Office')]")
	private WebElement sendprofn;

	public WebElement getsendprofn() {
		return sendprofn;

	}

	@FindBy(xpath = "(//div[@class='divider default text'])[1]")
	private WebElement searoffn;

	public WebElement getsearoffn() {
		return searoffn;

	}

	@FindBy(xpath = "(//span[contains(text(),'Test Facility Phar')])[2]")
	private WebElement sendoffn;

	public WebElement getsendoffn() {
		return sendoffn;

	}

	@FindBy(xpath = "(//div[normalize-space()='Status'])[1]")
	private WebElement searchstan;

	public WebElement getsearchstan() {
		return searchstan;

	}

	@FindBy(xpath = "(//span[normalize-space()='In Lobby'])[1]")
	private WebElement sendstatn;

	public WebElement getsendstatn() {
		return sendstatn;

	}

	@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
	private WebElement saven;

	public WebElement getsaven() {
		return saven;

	}

	@FindBy(xpath = "(//td[@role='gridcell'])[3]")
	private WebElement cal1;

	public WebElement getcal1() {
		return cal1;

	}

	@FindBy(xpath = "(//td[@role='gridcell'])[4]")
	private WebElement cal2;

	public WebElement getcal2() {
		return cal2;

	}

	@FindBy(xpath = "(//td[@role='gridcell'])[5]")
	private WebElement cal3;

	public WebElement getcal3() {
		return cal3;

	}

	@FindBy(xpath = "(//button[contains(text(),'Cancel')])[2]")
	private WebElement canceln;

	public WebElement getcanceln() {
		return canceln;

	}

	///// Notification/////
	@FindBy(xpath = "(//*[name()='svg'][@class='bell-icon'])[1]")
	private WebElement notif;

	public WebElement getnotif() {
		return notif;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-1'])[1]")
	private WebElement appreq;

	public WebElement getappreq() {
		return appreq;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")
	private WebElement secumsg;

	public WebElement getsecumsg() {
		return secumsg;
	}

	////////////// Appointment Dashboard
	@FindBy(xpath = "//a[contains(text(),'Appointment Dashboard')]")
	private WebElement ClcikAppointmentdashboard;

	public WebElement getClcikAppointmentdashboard() {
		return ClcikAppointmentdashboard;
	}

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement Searchoffice;

	public WebElement getSearchoffice() {
		return Searchoffice;
	}

	@FindBy(xpath = "(//div[contains(text(),'defaults hospital')])[1]")
	private WebElement Selecttestfac2;

	public WebElement getSelecttestfac2() {
		return Selecttestfac2;
	}

	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement Clickcalender;

	public WebElement getClickcalender() {
		return Clickcalender;
	}

	@FindBy(xpath = "//button[contains(text(),'Update Filter')]")
	private WebElement Clickupdate;

	public WebElement getClickupdate() {
		return Clickupdate;
	}

	@FindBy(xpath = "(//label[normalize-space()='Uncheck All'])[1]")
	private WebElement Selectnone;

	public WebElement getSelectnone() {
		return Selectnone;
	}

	@FindBy(xpath = "(//label[contains(text(),'Show Status')])[1]")
	private WebElement statsh;

	public WebElement getstatsh() {
		return statsh;
	}

	@FindBy(xpath = "//div[contains(text(),'Telehealth Appointment')]")
	private WebElement telehe;

	public WebElement gettelehe() {
		return telehe;
	}

	@FindBy(xpath = "(//label[normalize-space()='Check All'])[1]")
	private WebElement Selectall1;

	public WebElement getSelectall1() {
		return Selectall1;
	}

	@FindBy(xpath = "(//tbody[@class='MuiTableBody-root'])[1]")
	private WebElement getpatientname;

	public WebElement getgetpatientname() {
		return getpatientname;
	}

	@FindBy(xpath = "(//select[@name='office_1'])[1]")
	private WebElement getstatustext;

	public WebElement getgetstatustext() {
		return getstatustext;
	}

	@FindBy(xpath = "(//label[@class='for-dash-t-h-8'])[1]")
	private WebElement clickshowstatus;

	public WebElement getclickshowstatus() {

		return clickshowstatus;
	}

	////// tele //////

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement Searchoffice2;

	public WebElement getSearchoffice2() {
		return Searchoffice2;
	}

	@FindBy(xpath = "((//div[@label='K G Hospitals'])[1]")
	private WebElement Selecttestfac3;

	public WebElement getSelecttestfac3() {
		return Selecttestfac3;
	}

	@FindBy(xpath = "(//input[@id='duration'])[2]")
	private WebElement Clickcalender1;

	public WebElement getClickcalender1() {
		return Clickcalender1;
	}

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Update Filter'])[2]")
	private WebElement Clickupdate1;

	public WebElement getClickupdate1() {
		return Clickupdate1;
	}

	@FindBy(xpath = "(//label[@class='for-s-none'][normalize-space()='Uncheck All'])[2]")
	private WebElement Select1;

	public WebElement getSelect1() {
		return Select1;
	}

	@FindBy(xpath = "(//label[@class='for-s-all'][normalize-space()='Check All'])[2]")
	private WebElement Selectalltele;

	public WebElement getSelectalltele() {

		return Selectalltele;
	}

	@FindBy(xpath = "(//label[normalize-space()='Check All'])[1]")
	private WebElement Selectall;

	public WebElement getSelectall() {
		return Selectall;
	}

	////////////// Provider Availability

	@FindBy(xpath = "//a[contains(text(),'Provider Availability')]")
	private WebElement ClickProvideravailability;

	public WebElement getClickProvideravailability() {

		return ClickProvideravailability;
	}

	@FindBy(xpath = "(//i[@class='dropdown icon'])[1]")
	private WebElement ClickProvideravailability1;

	public WebElement getClickProvideravailability1() {

		return ClickProvideravailability1;
	}

	@FindBy(xpath = "(//span[normalize-space()='Martin Edward'])[1]")

	private WebElement editselectprovider;

	public WebElement geteditselectprovider() {

		return editselectprovider;
	}

	@FindBy(xpath = "(//i[@class='dropdown icon'])[3]")
	private WebElement editclcikoffice;

	public WebElement geteditclcikoffice() {

		return editclcikoffice;
	}

	@FindBy(xpath = "//span[contains(text(),'Test Facility2')]")
	private WebElement editselectoffice;

	public WebElement geteditselectoffice2() {

		return editselectoffice;
	}

	@FindBy(xpath = "(//i[@class='dropdown icon'])[4]")
	private WebElement editappointment;

	public WebElement geteditappointment() {

		return editappointment;

	}

	@FindBy(xpath = "//span[contains(text(),'@ Arrived/Lobby')]")
	private WebElement editselectappointment;

	public WebElement geteditselectappointment() {

		return editselectappointment;

	}

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[5]")
	private WebElement editappstatus;

	public WebElement geteditappstatus() {

		return editappstatus;

	}

	@FindBy(xpath = "(//div[@title='? No show'])[1]")
	private WebElement editappselect;

	public WebElement geteditappselect() {

		return editappselect;

	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement editappdate;

	public WebElement geteditappdate() {

		return editappdate;

	}

	@FindBy(xpath = "//input[contains(@name,'timeapp')]")
	private WebElement clcicktime;

	public WebElement getclcicktime() {

		return clcicktime;

	}

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement editappsave;

	public WebElement geteditappsave() {

		return editappsave;

	}

	@FindBy(xpath = "//div[@class='ant-select-selection-overflow']")
	private WebElement Clickofficesearch;

	public WebElement getClickofficesearch() {
		return Clickofficesearch;
	}

	@FindBy(xpath = "//div[contains(text(),'oemrvozo')]")
	private WebElement Selectprov;

	public WebElement getSelectprov() {
		return Selectprov;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/*[1]")
	private WebElement Clickedit;

	public WebElement getClickedit() {
		return Clickedit;

	}

	@FindBy(xpath = "//div[contains(text(),'Search Provider')]")
	private WebElement editprovider;

	public WebElement geteditprovider() {
		return editprovider;

	}

	@FindBy(xpath = "(//button[normalize-space()='Close'])[1]")
	private WebElement Closecustomedit;

	public WebElement getClosecustomedit() {
		return Closecustomedit;

	}

	@FindBy(xpath = "//button[normalize-space()='Add Provider Availability']")

	private WebElement clickaddprovider;

	public WebElement getclickaddprovider() {
		return clickaddprovider;

	}

	@FindBy(xpath = "//div[@class='add_app_mod1 form-row']//input[@type='text']")

	private WebElement Searchprovider;

	public WebElement getSearchprovider() {
		return Searchprovider;

	}

	@FindBy(xpath = "(//span[@class='text'][normalize-space()='Martin Edward'])[1]")

	private WebElement Selectprovider1;

	public WebElement getSelectprovider1() {

		return Selectprovider1;

	}

	@FindBy(xpath = "(//div[normalize-space()='Office'])[1]")

	private WebElement SelectOffice;

	public WebElement getSelectOffice() {

		return SelectOffice;

	}

	@FindBy(xpath = "//div[@id='4']//span[@class='text']")

	private WebElement Selectoffice1;

	public WebElement getSelectoffice1() {

		return Selectoffice1;

	}

	@FindBy(xpath = "//div[@name='appoint_office']//input[@type='text']")

	private WebElement Selectappointmentcategory;

	public WebElement getSelectappointmentcategory() {

		return Selectappointmentcategory;

	}

	@FindBy(xpath = "//span[normalize-space()='In Office']")

	private WebElement Selectcategory;

	public WebElement getSelectcategory() {

		return Selectcategory;

	}

	@FindBy(xpath = "//div[contains(@name,'appoint_status')]//input[contains(@type,'text')]")

	private WebElement Appointmentstatus;

	public WebElement getAppointmentstatus() {

		return Appointmentstatus;

	}

	@FindBy(xpath = "//div[@title='? No show']")

	private WebElement Appointmentstatusselect;

	public WebElement getAppointmentstatusselect() {

		return Appointmentstatusselect;

	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")

	private WebElement appcalender;

	public WebElement getappcalender() {

		return appcalender;

	}

	@FindBy(xpath = "//input[@type='time']")

	private WebElement apptimer;

	public WebElement getapptimer() {

		return apptimer;

	}

	@FindBy(id = "duration")

	private WebElement duration;

	public WebElement getduration() {

		return duration;

	}

	@FindBy(id = "new-app-repeats-check1")

	private WebElement apprepeat;

	public WebElement getapprepeat() {

		return apprepeat;

	}

	@FindBy(id = "new-app-select1")

	private WebElement appevery;

	public WebElement getappevery() {

		return appevery;

	}

	@FindBy(id = "new-app-select2")

	private WebElement appday;

	public WebElement getappday() {

		return appday;

	}

	@FindBy(id = "new-app-untildate")

	private WebElement appcal;

	public WebElement getappcal() {

		return appcal;

	}

	@FindBy(xpath = "//span[contains(text(),'Days wise')]")

	private WebElement appdaywise;

	public WebElement getappdaywise() {

		return appdaywise;

	}

	@FindBy(id = "new-app-days-wise")

	private WebElement appdaywisedesele;

	public WebElement getappdaywisedesele() {

		return appdaywisedesele;

	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement Appsave;

	public WebElement getAppsave() {

		return Appsave;

	}

	@FindBy(id = "//button[@class='close-btn btn btn-light']")

	private WebElement Appclose;

	public WebElement getAppclose() {

		return Appclose;

	}

////////////////////////////////Appointment Profiles

	@FindBy(xpath = "//a[normalize-space()='Appointment Profiles']")

	private WebElement Appointmentprofile;

	public WebElement getAppointmentprofile() {
		return Appointmentprofile;
	}

	@FindBy(xpath = "//button[@class='billing_pro_frmt_table_btn2 ins-cl-ex m-r-15 mr btn btn-light']")

	private WebElement clicksort;

	public WebElement getclicksort() {
		return clicksort;
	}

	@FindBy(xpath = "//button[@class='billing_pro_frmt_table_btn1 icon-align-btn ins-cl-ex m-l-15 ml btn btn-light']")

	private WebElement clicksortrelease;

	public WebElement getclicksortrelease() {
		return clicksortrelease;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]")

	private WebElement clickfooter;

	public WebElement getclickfooter() {
		return clickfooter;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button[1]/span[1]")

	private WebElement clickdelete;

	public WebElement getclickdelete() {
		return clickdelete;
	}

	@FindBy(xpath = "//button[normalize-space()='Add New Profile']")

	private WebElement addnewprofile;

	public WebElement getaddnewprofile() {

		return addnewprofile;
	}

	@FindBy(xpath = "//div[contains(@class,'col-sm-8')]//input[@id='duration']")

	private WebElement addname;

	public WebElement getaddname() {

		return addname;
	}

	@FindBy(xpath = "//input[@id='resonforvisit']")

	private WebElement addresonforvisit;

	public WebElement getaddresonforvisit() {

		return addresonforvisit;
	}

	@FindBy(xpath = "//input[@type='color']")

	private WebElement addcolor;

	public WebElement getaddcolor() {

		return addcolor;
	}

	@FindBy(xpath = "//div[@class='col-sm-4']//input[@id='duration']")

	private WebElement addduration;

	public WebElement getaddduration() {

		return addduration;
	}

	@FindBy(xpath = "(//select[@name='appoint_office'])[1]")

	private WebElement billingprofile;

	public WebElement getbillingprofile() {

		return billingprofile;
	}

	@FindBy(xpath = "(//select[@name='appoint_office'])[2]")

	private WebElement billingprofile1;

	public WebElement getbillingprofile1() {

		return billingprofile1;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[6]/div[1]/div[1]/select[1]")

	private WebElement clickpaymentprofile;

	public WebElement getclickpaymentprofile() {

		return clickpaymentprofile;
	}

	@FindBy(xpath = "//option[normalize-space()='Cash']")

	private WebElement selectpaymentprofile;

	public WebElement getselectpaymentprofile() {

		return selectpaymentprofile;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement saveap;

	public WebElement getsaveap() {

		return saveap;
	}

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")

	private WebElement Close;

	public WebElement getClose() {

		return Close;
	}

	@FindBy(xpath = "//a[contains(text(),'Billing Profiles')]")

	private WebElement clcikbillingprofile;

	public WebElement getclcikbillingprofile() {

		return clcikbillingprofile;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]/*[1]")

	private WebElement clicksort1;

	public WebElement getclicksort1() {

		return clicksort1;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/*[1]")

	private WebElement clicksort2;

	public WebElement getclicksort2() {

		return clicksort2;
	}

	@FindBy(xpath = "//div[contains(text(),'Add New Profile')]")

	private WebElement clickaddnewprofile;

	public WebElement getclickaddnewprofile() {

		return clickaddnewprofile;
	}

	@FindBy(xpath = "//input[@id='duration']")

	private WebElement profilename;

	public WebElement getprofilename() {

		return profilename;
	}

	@FindBy(xpath = "//input[@placeholder='Find ICD9 Codes']")

	private WebElement sendicd9;

	public WebElement getsendicd9() {

		return sendicd9;
	}

	@FindBy(xpath = "//div[contains(text(),'378.03-- Monocular esotropia with V pattern')]")

	private WebElement clcicksendicd9;

	public WebElement getclcicksendicd9() {

		return clcicksendicd9;
	}
//@FindBy(xpath = "//div[contains(text(),'923.20-- Contusion of hand(s)')]")
//
//private WebElement clickicd9;
//
//public WebElement getclickicd9() {
//
//return clickicd9;
//}

	@FindBy(xpath = "//input[contains(@placeholder,'Find ICD10 Codes')]")

	private WebElement sendicd10;

	public WebElement getsendicd10() {

		return sendicd10;
	}

	@FindBy(xpath = "//div[contains(text(),'H50.07--Alternating esotropia with V pattern')]")

	private WebElement selectsendicd10;

	public WebElement getselectsendicd10() {

		return selectsendicd10;
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Find Diagnosis Codes')]")

	private WebElement clickCpt;

	public WebElement getclickCpt() {

		return clickCpt;
	}

	@FindBy(xpath = "//div[contains(text(),'Vkard--fdfdsfds')]")

	private WebElement selectCpt;

	public WebElement getselectCpt() {

		return selectCpt;
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Find HCPCS Codes')]")

	private WebElement clickHCPCS;

	public WebElement getclickHCPCS() {

		return clickHCPCS;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")

	private WebElement selectHCPCS;

	public WebElement getselectHCPCS() {

		return selectHCPCS;
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Find Custom Codes')]")

	private WebElement clickcustom;

	public WebElement getclickcustom() {

		return clickcustom;
	}

	@FindBy(xpath = "//div[contains(text(),'9090--diseas')]")

	private WebElement selectcustom;

	public WebElement getselectcustom() {

		return selectcustom;
	}

//@FindBy(xpath = "//div[contains(text(),'A7505--Hmes or trach valve housing')]")
//
//private WebElement clickhcpc;
//
//public WebElement getclickhcpc() {
//
//return clickhcpc;
//}
//
//@FindBy(xpath = "//input[@placeholder='Find Custom Codes']")
//
//private WebElement sendcustomcod;
//
//public WebElement getsendcustomcod() {
//
//return sendcustomcod;
//}
//
//@FindBy(xpath = "//div[contains(text(),'123--Test Invoice')]")
//
//private WebElement clickcustom;
//
//public WebElement getclickcustom() {
//
//return clickcustom;
//}

	@FindBy(xpath = "//button[contains(text(),'Save')]")

	private WebElement clicksave;

	public WebElement getclicksave() {

		return clicksave;
	}

}

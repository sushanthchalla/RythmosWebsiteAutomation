package selenium.framework.common;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;




public class CommonMethods extends Reporting {

	static String names = "Moshe, Mccune, Denis, Kemper, Cristobal, Wylie, Oswaldo, Hudgens, Bryon, Craven, Abe, Tackett, Billie, Villegas, Delmer, Shipman, Erich, Callaway, Arnulfo, Barba, Cliff, Craft, Deon, Savoy, Kris, Hooks, Denny, Brantley, Hyman, Hoppe, Bryce, Grice"
			+ "Linwood, Conn, Arden, Lavigne, Avery, Christie, Cleveland, Burroughs, Buck, Damon, Rickie, Weis, Gerry, Conrad, Benito, Katz, Malcom, Tomlinson, Leonardo, Bonner, Trenton, Goodson, Norberto, Dudley, Gino, Kaye, Noble, Betz, Felton, Hawthorne, Murray, Hardwick, Kenton, Mccauley"
			+ "Luciano, Adame, Cleo, Painter, Ashley, Boatwright, Johnathon, Sommer, Bart, Goins, Toney, Womack, Jewel, Bueno, Donn, Rafferty, Solomon, Scarbrough, Adolfo, Isaac, Olen, Word, Isidro, Moe, Lucio, Connelly, Lenard, Stuart, Fritz, Escobar, Maria, Crowley"
			+ "Jarvis, Gable, Douglass, Battaglia, Rupert, Guy, Marcellus, Beasley, Harlan, Burkett, Rory, Cheng, Long, Irwin, Jewell, Cheatham, Geraldo, Mccracken, Lonny, Dupont, Marcelino, Vaughan, Vito, Jernigan, Stevie, Mast, Luigi, Mcadams, Milford, Camp, Wilmer, Peck"
			+ "Josiah, Scoggins, Nickolas, Crutcher, Denver, Orosco, Emory, Broughton, Andrea, Olivo, Jere, Cano, Asa, Mcfadden, Tyree, Falk, Rodrick, Bone, Jamel, Tirado, Odis, Odom, Gil, Newell, Carey, Werner, Ellsworth, Medlock, Demarcus, Bland, Landon, Lipscomb"
			+ "Judson, Chesser, Nathanial, Houle, Del, Apodaca, Chas, Pence, Coleman, Winslow, Rosario, Spivey, Valentine, Burkhart, Hong, Ragsdale, Mohamed, Fort, Jefferson, Strunk, Irwin, Lapointe, Curt, Whitfield, Rigoberto, Skelton, Eldridge, Martell, Chi, Gooden, Rubin, Frias, Hassan, Ahrens, Rudolf, Foust, Jc, Gracia";

	static String citiNstates = "New York : New York, Los Angeles : California, Chicago : Illinois, Houston : Texas, Philadelphia : Pennsylvania, San Diego : California, Dallas : Texas, Jacksonville : Florida, San Francisco : California, Fort Worth : Texas, Charlotte : North Carolina, Detroit : Michigan, Denver : Colorado, Nashville : Tennessee, "
			+ "Baltimore : Maryland, Las Vegas : Nevada, Louisville : Kentucky, Tucson : Arizona, Fresno : California, Kansas City : Missouri, Mesa : Arizona, Omaha : Nebraska, Colorado Springs : Colorado, Oakland : California, Minneapolis : Minnesota, Wichita : Kansas, New Orleans : Louisiana, Tampa : Florida, Aurora : Colorado, Santa Ana : California, "
			+ "Corpus Christi : Texas, Lexington : Kentucky, Pittsburgh : Pennsylvania, Cincinnati : Ohio, Saint Paul : Minnesota, Newark : New Jersey, Plano : Texas, Orlando : Florida, Jersey City : New Jersey, Fort Wayne : Indiana, Chandler : Arizona, Durham : North Carolina, Irvine : California, Lubbock : Texas, Gilbert : Arizona, Reno : Nevada, Hialeah : Florida, "
			+ "Irving : Texas, North Las Vegas : Nevada, Fremont : California, Richmond : Virginia, Birmingham : Alabama, Spokane : Washington, Des Moines : Iowa, Oxnard : California, Fayetteville : North Carolina, Moreno Valley : California, Yonkers : New York, Montgomery : Alabama, Shreveport : Louisiana, Akron : Ohio, Augusta : Georgia, Mobile : Alabama, Huntsville : Alabama, "
			+ "Tallahassee : Florida, Knoxville : Tennessee, Brownsville : Texas, Santa Clarita : California, Providence : Rhode Island, Oceanside : California, Rancho Cucamonga : California, Chattanooga : Tennessee, Tempe : Arizona, Cape Coral : Florida, Ontario : California, Peoria : Arizona, Pembroke Pines : Florida, Salem : Oregon, Corona : California, Palmdale : California,"
			+ " McKinney : Texas, Cary : North Carolina, Hayward : California, Macon : Georgia, Pomona : California, Sunnyvale : California, Lakewood : Colorado, Torrance : California, Hollywood : Florida, Clarksville : Tennessee, Paterson : New Jersey, Mesquite : Texas, Savannah : Georgia, Pasadena : California, Orange : California, Killeen : Texas, Hampton : Virginia, Miramar : Florida, West Valley City : Utah, "
			+ "Sterling Heights : Michigan, Thornton : Colorado, Charleston : South Carolina, Thousand Oaks : California, Elizabeth : New Jersey, Roseville : California, Stamford : Connecticut, Denton : Texas, Concord : California, Topeka : Kansas, Lafayette : Louisiana, Kent : Washington, Victorville : California, Abilene : Texas, Vallejo : California, Athens : Georgia, Norman : Oklahoma, , Beaumont : Texas, Columbia : Missouri, "
			+ "El Monte : California, Peoria : Illinois, Lansing : Michigan, Downey : California, Arvada : Colorado, Round Rock : Texas, Miami Gardens : Florida, Inglewood : California, Fairfield : California, West Jordan : Utah, Manchester : New Hampshire, Cambridge : Massachusetts, Ventura : California, Antioch : California, Billings : Montana, High Point : North Carolina, West Covina : California, Pueblo : Colorado, Norwalk : California, "
			+ "North Charleston : South Carolina, Daly City : California, Palm Bay : Florida, Burbank : California, West Palm Beach : Florida, College Station : Texas, Pearland : Texas, Santa Maria : California, Davenport : Iowa, Lakeland : Florida, Clovis : California, Edison : New Jersey, Woodbridge : New Jersey, Erie : Pennsylvania";

	public String randomNameGenerator() {
		String s;
		String dat= String.valueOf(System.currentTimeMillis());
		String dat1=dat.substring(6, 10);
		String name[] = names.split(",");
		Random random = new Random();
		String s1= name[random.nextInt(name.length)].trim();
		return s1+dat1;
		
	}
	
	public String randomCitiStateNameGenerator() {
		String name[] = citiNstates.split(",");
		Random random = new Random();
		return name[random.nextInt(name.length)].trim();

	}

	public void closeBrowser() {
		WebDriverManager.removeWebDriver();
	}

	public void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String generateRandomName() {
		return randomNameGenerator();
	}

	public String generateRandomtokenExpiresInMinute() {
		return String.valueOf(System.currentTimeMillis());
	}

	public String generateZipcode() {
		String zip = String.valueOf(System.currentTimeMillis());
		String str = zip.substring(0, 5);
		String zipcode = str + "-" + (zip.substring(6, 10)) + "," + (zip.substring(4, 9));
		return zipcode;
	}

	public String generateRandomExpirationHours() {
		String zip = String.valueOf(System.currentTimeMillis());
		String str = zip.substring(5, 10);
		return str;
	}

	public String generateDuplicateZipcode() {
		String zip = String.valueOf(System.currentTimeMillis());
		String str = zip.substring(0, 5);
		String zipcode = str + "-" + (zip.substring(6, 10)) + "," + str + "-" + (zip.substring(6, 10));
		return zipcode;
	}

	public String randomValueOfLengthMorethan100() {
		char data = ' ';
		String dat = "";
		Random ran = new Random();
		for (int i = 0; i <= 250; i++) {
			data = (char) (ran.nextInt(25) + 97);
			dat = data + dat;
		}
		return dat;

	}

	public int generateNumber() {
		Random rand = new Random();
		int n = rand.nextInt(10) + 1;
		return n;
	}

	public String generateRandomNumbers(int length) {
		int data = 0;
		String dat = "";
		Random ran = new Random();
		for (int i = 1; i <= length; i++) {
			data = ran.nextInt(i);
			dat = data + dat;
		}
		return dat;
	}
	public String getCurrentDate(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
		LocalDateTime now = LocalDateTime.now();
		return (dtf.format(now));
	}
	public String getFutureDate(){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		return new SimpleDateFormat("MM/dd/yyyy HH:mm").format(c.getTime());
	}

	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.println(new CommonMethods().randomCitiStateNameGenerator());
		}
	}
}

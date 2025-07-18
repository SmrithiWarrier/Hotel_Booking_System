import java.util.*;
import java.io.*;
import java.text.*;
public class Maldives
{
    static String name="",hotel_choice="",room_choice="",phone="";
    static double tot_amt=0.0, room_pr=0.0, disc=0.0;
    static String islands[]={"COMO COCOA ISLAND","BAROS ISLAND","EMBOODHU FINOLHU ISLAND","MIHIRI ISLAND","HUVAHENDHOO ISLAND","EXIT"};
    static int island_choice=0;
    static String rating[]={"3 stars","4 stars","5 stars","Back to Island Selection"};
    static int rating_choice=0;
    static long no_days=0;

    static Date dt1 = new Date();
    static Date dt2 = new Date();

    static String rooms[]={"Standard Couch (One single Bed)","Twin Sleeper (Two Single Beds)","Lazy Beauty (One double Bed)","Hollywood Twins (Two Double Beds)","Ocean Queen (One queen bed)","Fit for a King (One king-size bed)","Deluxe Suite (Two king-size beds)","Candlewood Duplex (Three king-size beds)","Back to hotel selection"};
    static int ppl_acc[]={1,2,2,4,2,2,4,6};
    static int no_rooms=0, pplno=0, mealopt=0;
    static String food_pack="Not inclusive";
    static double prices3[]={3000.00,5500.00,5550.00,9000.00,9150.00,10000.00,10800.00,11500.00};
    static double prices4[]={3250.00,5900.00,6050.00,9600.00,9750.00,10500.00,10900.00,11700.00};
    static double prices5[]={3900.00,6000.00,6250.00,9900.00,10150.00,10800.00,11000.00,11900.00};

    public static void main()throws IOException
    {
        Intro();
    }

    public static void Intro()throws IOException
    {
        System.out.println("\fWELCOME TO MALDIVES");
        System.out.println("Dear customer,\n\t Welcome to MALDIVES tourism .\tWe hope you have a delightful experience with us... ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your NAME");
        name=sc.nextLine();
        chooseIsland();
    }

    public static void chooseIsland()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        do
        {
            flag=0;
            System.out.println("Please choose the island on which you would like to have your stay...");
            for(int i=0 ; i<6 ; i++)
            {
                System.out.println((i+1)+". "+islands[i]);
            }
            island_choice=sc.nextInt();
            switch(island_choice)
            {
                case 1:
                chooseComoCocoaIslandHotels();
                break;

                case 2:
                chooseBarosIslandHotels();
                break;

                case 3:
                chooseEmboodhuFinolhuIslandHotels();
                break;

                case 4:
                chooseMihiriIslandHotels();
                break;

                case 5:
                chooseHuvahendhooIslandHotels();
                break;

                case 6:
                System.out.println("THANK YOU FOR USING OUR SOFTWARE\nWE HOPE YOU COME BACK AGAIN!!\n\t-Maldives tourism");
                break;

                default:
                System.out.println("Invalid Choice!!Enter again...");
                flag=1;
            }
        }while(flag==1);
    }

    public static void chooseComoCocoaIslandHotels()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fWelcome to Como Cocoa Island!!");
        System.out.println("The COMO Cocoa Island has around 33 water villas, each offering only the best facilities. \nOnce your staycation is sorted,you can take a long stroll on the white powder sand and indulge in spa retreat. \nThe restaurants and food are always top-notch and so are the rejuvenating activities like diving and snorkelling that can be enjoyed at the house reef.\nHope you like it here!!!");

        String CCH_3st[]={"Paradise Plaza","Radisson Blu","Rydges Square","Glenferie Lodge","Adaaran Prestige","Back to Rating Selection"};
        String CCH_4st[]={"Sanmao hotel","Sheraton Fullmoon","Meriton suits","Shangri-La hotel","Novotel","Back to Rating Selection"};
        String CCH_5st[]={"Sky Lounge","Ritz Carlton","Ascot Motor Inn","Jacob's Creek","Le Meridian","Back to Rating Selection"};

        chooseHotelandStar(CCH_3st, CCH_4st, CCH_5st); 
    }

    public static void chooseBarosIslandHotels()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fWelcome to Baros Island!!");
        System.out.println("If you are looking for a place away from the crowd,this is an ideal place to be.Baros is a high rated and popular island in Maldives.\n With sun-kissed beaches and boutique luxury resort, this island is famous for its natural elegance and beautiful corals. \nBaros has a number of water villas as well as island resorts providing deluxe amenities.\nIn Baros, you can dip your feet in the cyan-blue water and relax your muscles in the spa.\nHope you like it here!!!");

        String BIH_3st[]={"Sofitel Wentworth","Metro Mirage","Perous Lodge","Mercure Int'l","Astral Park","Back to Rating Selection"};
        String BIH_4st[]={"Gardenia","Stamford Plaza","The Madelay","Hyde Park","Holiday Inn","Back to Rating Selection"};
        String BIH_5st[]={"Adam's Haven","The Cairns","Mariott","Springfield Resort","Carpe diem","Back to Rating Selection"};

        chooseHotelandStar(BIH_3st, BIH_4st, BIH_5st);
    }

    public static void chooseEmboodhuFinolhuIslandHotels()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fWelcome to Emboodhu Finolhu Island!!");
        System.out.println("One of the best attractions about this island is perhaps the arrangement of the water villas in shape of a flower bud.\n A little rubbernecking can help see this beautiful sight from a seaplane as you land.\n Emboodhu Finolhu Island featuring around 55 water villas, also houses the luxurious Taj Exotica Resort.\nHope you like it here!!!");

        String EFH_3st[]={"Palace of Elizabeth","Fraser Suits","Hilton Rocks","Geneva Diem","Furaveri Resorts","Back to Rating Selection"};
        String EFH_4st[]={"Ayada Maldives","Diamonds Thudufushi","The Westin Resort","The Cosmopolitan Hotel","The Swanston Hotel","Back to Rating Selection"};
        String EFH_5st[]={"Ruffles Lodge","Couran Cove Island Resort","Blue Waters","The Crest","Taj Exotica","Back to Rating Selection"};

        chooseHotelandStar(EFH_3st, EFH_4st, EFH_5st);
    }

    public static void chooseMihiriIslandHotels()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fWelcome to Mihiri Island!!");
        System.out.println("The resorts in Mihiri island are perhaps build for those who love a complete detoxing environment as no television sets are provided. \nThe resort has around 30 water villas and a few island resorts. The island restaurants offer exquisite food over silent dinner.\n However, to partake in some fun activities, the island also has diving and snorkelling water sport options made available..\nHope you like it here!!!");

        String MIH_3st[]={"Harbour Rocks","Park Regis","Garden Lodge","Challis Hotel","Bondai Resort","Back to Rating Selection"};
        String MIH_4st[]={"Paradise Inn","Mihiri Garden Resort","Manta on the view","Ann's Woodland","The Macleay","Back to Rating Selection"};
        String MIH_5st[]={"Cinnamon House","Lisa's Paradise","La Quintia Hotels","Siesta Inn","Zara Tower","Back to Rating Selection"};

        chooseHotelandStar(MIH_3st, MIH_4st, MIH_5st);
    }

    public static void chooseHuvahendhooIslandHotels()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fWelcome to Huvahendhoo Island!!");
        System.out.println("This popular place is where you can rejuvenate amid the lustrous sight of the calm water because, Huvahendhoo has Lily Beach Resort and Spa that serves best facilities for those who come in packs.\nThis is family-oriented resort island that houses deluxe rooms and also restaurants that serve special delicacies for little ones..\nHope you like it here!!!");

        String HIH_3st[]={"The Knickerbocker","Times Square","The Marcel at Gramercy","Millennium Broadway","Candlewood Suites","Back to Rating Selection"};
        String HIH_4st[]={"Dell'Angelo","Hotel Astoria","The Spalentor","Steffani Inns ","Dorint An der Messe Basel","Back to Rating Selection"};
        String HIH_5st[]={"Grange Holborn","The Wesley Euston Hotel","Turin Palace Hotel ","Seda Abreeza","The Pinnacle","Back to Rating Selection"};

        chooseHotelandStar(HIH_3st, HIH_4st, HIH_5st);
    }

    public static void chooseHotelandStar(String HotelNames_3St[], String HotelNames_4St[], String HotelNames_5St[])throws IOException
    {
        int check;
        do
        {
            check=0;
            chooseRating();
            int flag, hotelopt, backtohot;
            System.out.print("\f");
            do
            {
                if(rating_choice>0 && rating_choice<4)
                {
                    System.out.println("Please choose the hotel that you would like to stay in...");
                }
                flag=0; hotelopt=0; backtohot=0;
                double a[]=new double[8];
                switch(rating_choice)
                {
                    case 1:
                    hotelopt = chooseHotel(HotelNames_3St);
                    a = prices3;
                    break;

                    case 2:
                    hotelopt = chooseHotel(HotelNames_4St);
                    a = prices4;
                    break;

                    case 3:
                    hotelopt = chooseHotel(HotelNames_5St);
                    a = prices5;
                    break;

                    case 4:
                    System.out.print("\f");
                    chooseIsland();
                    break;

                    default:
                    System.out.println("Invalid option!! Please enter again...\n");
                    flag=1;
                }
                if(hotelopt<6)
                {
                    backtohot = chooseRoomType(a);
                }
            }while(flag==1||backtohot==1);
            if(hotelopt==6)
                check=1;
        }while(check==1);
    }

    public static void chooseRating()
    {
        Scanner sc=new Scanner(System.in);
        int check;
        do
        {
            check=0;
            System.out.println("\nPlease choose the ratings:");
            for(int i=0 ; i<4 ; i++)
            {
                System.out.println((i+1)+". "+rating[i]);
            }
            rating_choice=sc.nextInt();
            if(rating_choice>4)
            {
                check=1;
                System.out.println("Invalid choice!!\n");
            }
        }while(check==1);
    }

    public static int chooseHotel(String HotelNames_AnySt[])
    {
        Scanner sc=new Scanner(System.in);
        int redo=0, hotelopt=0;
        do
        {
            redo=0;
            for(int i=0 ; i<6 ; i++)
            {
                System.out.println((i+1) + ". " + HotelNames_AnySt[i] );
            }
            hotelopt=sc.nextInt();
            if(hotelopt>0 && hotelopt<6)
            {
                hotel_choice = HotelNames_AnySt[hotelopt-1];
            }
            else if(hotelopt>6)
            {
                System.out.println("Invalid option!! Please enter again...");
                redo=1;
            }
        }while(redo==1);
        return hotelopt;
    }

    public static int chooseRoomType(double prices[])throws IOException
    {
        int check, backtohot=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\f");
        do
        {
            check=0;
            int i;
            System.out.println("Please choose the type of room...(Tax inclusive rates)");
            for(i=0 ; i<8 ; i++)
            {
                System.out.println((i+1) + ". Room :"+ rooms[i] +"\n\tPrice :Rs." + prices[i] + "/-");
            }
            System.out.println((i+1) + ". " + rooms[i]);

            int opt = sc.nextInt();
            if(opt<9)
            {   
                int flag; 
                room_choice = rooms[opt-1];
                int ppl_cap = ppl_acc[opt-1];
                System.out.println("\n Please enter no.of people to stay...");
                pplno = sc.nextInt();
                no_rooms = (int)Math.ceil((double)pplno/(double)ppl_cap);
                room_pr = prices[opt-1];
                tot_amt = room_pr*no_rooms; 
                System.out.println("\nAmenities provided include...\n\t1.Free wifi\n\t2.One complementary spa treatment (Extra spa treatments will be charged for)\n\t3.Complementary recreation package (Includes swimming, trekking, indoor games etc..)");
                chooseMeal();

                System.out.println("\n Do you want to ...\n1.Change room selection \n2.Continue to reservation dates");
                int cont = sc.nextInt();
                check = chooseContinuation(cont);
            }
            else if(opt==9)
                backtohot=1;
            else
            { 
                System.out.println("Invalid choice...Please enter again\n");
                check=1;
            }
        }while(check==1);
        return backtohot;
    }

    public static void chooseMeal()
    {
        int flag;
        Scanner sc=new Scanner(System.in);
        do
        {
            flag=0;
            System.out.println("\nDo you want a meal package along with your stay?...\n\t1.Yes\n\t2.No");
            int meal_choice = sc.nextInt();
            switch(meal_choice)
            {   
                case 1:
                System.out.println("\nDo you prefer a...\n\t1.Vegetarian Cuisine      Rs.1000/-per head \n\t2.Non-Vegetarian cuisine  Rs.1500/-per head");
                int meal_type = sc.nextInt();
                int mealcheck;
                do
                {
                    mealcheck=0;
                    switch(meal_type)
                    {
                        case 1:
                        System.out.println("Thank you for letting us know your preference...");
                        food_pack = "Vegetarian Cuisine";
                        mealopt=1;
                        break;

                        case 2:
                        System.out.println("Thank you for letting us know your preference...");
                        food_pack = "Non-Vegetarian Cuisine";
                        mealopt=2;
                        break;

                        default:
                        System.out.println("Invalid choice!!Please enter again...");
                        mealcheck=1;
                    }
                }while(mealcheck==1);
                break;

                case 2:
                System.out.println("Thank you for letting us know your preference...");
                break;

                default:
                System.out.println("Invalid choice!!Please enter again...");
                flag=1;
            }
        }while(flag==1);
    }

    public static int chooseContinuation(int cont)throws IOException
    {
        int flag, check=0;
        do
        {
            flag=0;
            switch(cont)
            {
                case 1:
                System.out.print("\f");
                check=1;
                break;

                case 2:
                getTravelDetails();
                break;

                default:
                System.out.println("Invalid choice!!Please enter again...");
                flag=1;
            }
        }while(flag==1);
        return check;
    }

    public static void getTravelDetails()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int home=0, flag;
        do
        {
            flag=0;
            System.out.println("\fYour reservation is almost done....!!Just a few more details left...\nThere are a few seasonal discounts!!...\n1.If you stay for upto 3 days you get a 5% discount..\n2.If you stay for 4-10 days you get a 10% discount\n3.If you stay for more than 10 days you get a 20% discount");
            no_days = getNoOfDays();
            switch(mealopt)
            {
                case 1:
                tot_amt = tot_amt + no_days*pplno*1000;
                break;

                case 2:
                tot_amt = tot_amt + no_days*pplno*1500;
                break;
            }

            if(no_days<4 && no_days>0)
            {
                disc = 0.05 * tot_amt;    
                tot_amt=tot_amt-disc;
            }
            else if(no_days<11 && no_days>3)
            {  
                disc = 0.1*tot_amt;
                tot_amt=tot_amt-disc;
            }
            else
            {
                disc = 0.2*tot_amt;
                tot_amt=tot_amt-disc;
            }

            int check;
            do
            {
                check=0;
                System.out.println("\nPlease enter your 10-digit phone number...");
                phone = sc.nextLine();
                if(phone.length()!=10)
                {
                    check=1;
                    System.out.println("Invalid choice!!Enter again...");
                }
            }while(check==1);
            System.out.println("Do you want to..\n\t1.View bill and continue to reservation completion\n\t2.Go to home page\n\t3.Change dates of travel");
            int repchoice;
            do
            {
                repchoice=0;
                switch(sc.nextInt())
                {
                    case 1:
                    home=1;
                    break;

                    case 2:
                    System.out.print("\f");
                    home=2;
                    break;

                    case 3:
                    flag=1;
                    break;

                    default:
                    System.out.println("Invalid choice!!Enter again..");
                    repchoice=1;
                }
            }while(repchoice==1);
        }while(flag==1);
        if(home==1)
            display();
        else if(home==2)
            chooseIsland();
    }

    public static long getNoOfDays()throws IOException
    {
        int check;
        long diff=0;
        do
        {
            check=0;
            System.out.print("\nEnter date of arrival (dd-mm-yyyy) : ");
            dt1 = getDate();

            System.out.print("Enter date of departure (dd-mm-yyyy) : ");
            dt2 = getDate();
            if(dt1.before(dt2))
                diff = (dt2.getTime() - dt1.getTime())/ 1000L / 60L / 60L / 24L;
            else
            {
                System.out.println("Enter dates again...");
                check=1;
            }
        }while(check==1);
        return diff;
    }

    public static Date getDate()throws IOException
    {
        int flag=0;
        Date dt=null;
        do
        {
            try
            {
                BufferedReader br = null;
                br = new BufferedReader(new InputStreamReader(System.in));
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                dt = sdf.parse(br.readLine().trim());
                if (br != null) 
                {
                    br.close();
                }
                flag=0;
            }
            catch(ParseException e)
            {
                System.out.println("Wrong format!!Please enter again");
                flag=1;
            }
        }while(flag==1);
        return dt;
    }

    public static void display()throws IOException
    {
        Scanner sc = new Scanner(System.in);
        bill();
        System.out.println("Do you want to...\n\t1. Continue to payment\n\t2. Restart booking process\n\t3. Exit without saving changes");
        int check;
        do
        {
            check=0;
            switch(sc.nextInt())
            {
                case 1:
                contPay();
                break;

                case 2:
                Intro();
                break;

                case 3:
                System.out.println("\nTHANK YOU FOR USING OUR SOFTWARE\nWE HOPE YOU COME BACK AGAIN!!\n\t-Maldives tourism");
                break;

                default:
                System.out.println("Invalid choice!!Enter again...");
                check=1;
            }
        }while(check==1);
    }

    public static void bill()
    {
        System.out.println("\fThank you for booking your hotel with the Maldives Tourism team!! We hope you enjoyed our service...\n\tHere is your confirmed reservation ticket...it will also be sent via SMS to your mobile..\n");
        System.out.println("Customer name :"+name);
        System.out.println("Customer phone number :"+phone);
        System.out.println("\nHoliday Destination :"+islands[island_choice-1]);
        System.out.println("Vacation Hotel :"+hotel_choice+"\t Rating:"+rating[rating_choice-1]);
        System.out.println("\nNumber of People :"+pplno);
        System.out.println("Room Type :"+room_choice+"\tNumber of Rooms :"+no_rooms+" (Room numbers will be alloted at hotel)");
        System.out.println("Meal Package :"+food_pack);
        System.out.println("\nAmenities...\n\t1.Free wifi\n\t2.One complementary spa treatment (Extra spa treatments will be charged for)\n\t3.Complementary recreation package (Includes swimming, trekking, indoor games etc..)\n");
        System.out.println("Check in time:"+dt1+" 1:00PM    Check out time :"+dt2+" 12:00 noon\nPlease carry necessary identity proof documents for checking in at your hotel..");
        System.out.println("\nTotal cost after discount :Rs."+tot_amt+"/-    Discount applied :Rs."+disc+"/-\n");
        System.out.println("If you have any more questions, you can contact us at: 666-772-1010\nWe apologize for any inconvenience you have encountered while using our software...you can send your feedback to maldivestourism101@gmail.com and we will try to respond as soon as possible... \n");
    }

    public static void contPay()throws IOException
    {
        Scanner sc= new Scanner(System.in);
        String payment[]={"Netbanking","Credit Card","Debit Card","Go back to bill view"};
        System.out.println("\fYour total cost is :Rs."+tot_amt+"/-");
        int flag;
        do
        {
            flag=0;
            System.out.println("\nChoose method of transaction...");
            for(int i=0;i<3;i++)
                System.out.println((i+1) + ". " + payment[i]);
            int payMeth = sc.nextInt();
            String payM = payment[payMeth-1];
            int check;
            do
            {
                check=0;
                switch(payMeth)
                {
                    case 1:
                    flag=NetBanking(payM);
                    break;

                    case 2:
                    case 3:
                    flag=CardPay(payM);
                    break;

                    case 4:
                    display();
                    break;

                    default:
                    System.out.println("\nInvalid choice!!Enter again...");
                    check=1;
                }
            }while(check==1);
        }while(flag==1);
    }

    public static int CardPay(String pay)throws IOException
    {        
        Scanner sc=new Scanner(System.in);
        String cards[]={"Mastercard","Visa","American Express","Discover","Change payment method"}; 
        int chk, flag=0;
        do
        {
            chk=0;
            System.out.println("\nChoose your "+pay+ " type...");
            for(int i = 0; i<5; i++)
                System.out.println((i+1)+". " + cards[i]);
            int cardc=sc.nextInt();
            if(cardc==5)
                flag=1;
            else if(cardc<5)    
            {
                String card_choice = cards[cardc-1];
                int check;
                do
                {
                    check=0;
                    System.out.println("\nEnter "+pay+" number(16-characters)");
                    sc.nextLine();
                    String cust_id = sc.nextLine();
                    int l = cust_id.length();
                    if(l==16)
                    {
                        int check1=0;
                        do
                        {
                            check1=0;
                            System.out.println("Enter OTP (4 characters)");
                            String password = sc.nextLine();
                            if(password.length()>4)
                            {
                                System.out.println("Invalid password!!Enter again...");
                                check1=1;
                            }
                            else
                            {
                                System.out.println("Rs."+tot_amt+"/- has been withdrawn from your "+card_choice+" "+pay+" account successfully...");
                                Final(pay);
                            }
                        }while(check==1);
                    }
                    else
                    {
                        System.out.println("Invalid ID...Enter again");
                        check=1;
                    }
                }while(check==1);
            }
            else
            {
                System.out.println("Invalid choice!!Enter again...");
                chk=1;
            }
        }while(chk==1); 
        return flag;
    }

    public static int NetBanking(String pay)throws IOException
    {        
        Scanner sc=new Scanner(System.in);
        String netbanking[]={"HDFC Bank","citibank","ICICI Bank","SBI","IOB","Change payment method"};
        int chk, flag=0;
        do
        {
            chk=0;
            System.out.println("\nChoose your bank...");
            for(int i = 0; i<6; i++)
                System.out.println((i+1)+". " + netbanking[i]);
            int bankc=sc.nextInt();
            if(bankc==6)
                flag=1;
            else if(bankc<6)    
            {
                String bank_choice = netbanking[bankc-1];
                int check;
                do
                {
                    check=0;
                    System.out.println("\nEnter customer ID(6-characters)");
                    String cust_id = sc.nextLine();
                    if(cust_id.length()==6)
                    {
                        int check1=0;
                        do
                        {
                            check1=0;
                            System.out.println("Enter password (>=7 characters)");
                            String password = sc.nextLine();
                            if(password.length()<7)
                            {
                                System.out.println("Invalid password!!Enter again...");
                                check1=1;
                            }
                            else
                            {
                                System.out.println("Rs."+tot_amt+"/- has been withdrawn from your "+bank_choice+" account successfully...");
                                Final(pay);
                            }
                        }while(check==1);
                    }
                    else
                    {
                        System.out.println("Invalid ID...Enter again");
                        check=1;
                    }
                }while(check==1);
            }
            else
            {
                System.out.println("Invalid choice!!Enter again...");
                chk=1;
            }
        }while(chk==1); 
        return flag;
    }

    public static void Final(String pay)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nThank you for using "+pay+" for the transaction of Rs."+tot_amt+"/-");
        int check;
        do
        {
            check=0;
            System .out.println("Do you want to...\n\t1. Cancel ticket\n\t2. Exit and view ticket\n");
            int opt=sc.nextInt();
            switch(opt)
            {
                case 1:
                System.out.println("Rs.300/- will be charged as cancellation fee...\nRs."+(tot_amt-300.00)+"/- will be refunded to your account...");
                int flag;
                do
                {
                    flag=0;
                    System.out.println("Do you want to...\n\t1. Exit\n\t2. Restart booking process");
                    int choice= sc.nextInt();
                    switch(choice)
                    {
                        case 1:
                        System.out.println("\nTHANK YOU FOR USING OUR SOFTWARE\nWE HOPE YOU COME BACK AGAIN!!\n\t-Maldives tourism");
                        break;

                        case 2:
                        Intro();
                        break;

                        default:
                        System.out.println("Invalid choice!!Enter again...");
                        flag=1;
                    }
                }while(flag==1);
                break;

                case 2:
                bill();
                System.out.println("\nTHANK YOU FOR USING OUR SOFTWARE\nWE HOPE YOU COME BACK AGAIN!!\n\t-Maldives tourism");
                break;

                default:
                System.out.println("Invalid choice!!Enter again..\n");
                check=1;
            }
        }while(check==1);
    }
}
package com.example.tourguide;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
TextView tv;String c;
    ImageView iv;
    TextView place;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        place = findViewById(R.id.place);

        iv=findViewById(R.id.iv);
        Intent intent=getIntent();
        c=intent.getStringExtra("image");
        if(c.equalsIgnoreCase("Dakshineshwar temple")){
            iv.setImageResource(R.drawable.dk);
        place.setText("Dakshineshwar temple");

        }
        else if(c.equals("Akshardham temple")){
            iv.setImageResource(R.drawable.ak);
            place.setText("Akshardham temple");
        }
        else if(c.equalsIgnoreCase("Birla Mandir")){
            iv.setImageResource(R.drawable.birla);
            place.setText("Birla Mandir");
        }

        else if(c.equalsIgnoreCase("Birla planitorium")){
            iv.setImageResource(R.drawable.planitorium);
            place.setText("Birla planitorium");
        }
        else if(c.equalsIgnoreCase("Gateway of India")){
            iv.setImageResource(R.drawable.gateway);
            place.setText("Gateway of India");
        }

        else if(c.equalsIgnoreCase("Lotus Temple")){
            iv.setImageResource(R.drawable.lotus);
            place.setText("Lotus Temple");
        }
        else if(c.equalsIgnoreCase("Howra Bridge")){
            iv.setImageResource(R.drawable.bridge_howra);
            place.setText("Howra Bridge");
        }
        else if(c.equalsIgnoreCase("Charminar")){
            iv.setImageResource(R.drawable.charminar);
            place.setText("Charminar");
        }

        else if(c.equalsIgnoreCase("Public Library")){
            iv.setImageResource(R.drawable.library);
            place.setText("Public Library");
        }
        else if(c.equalsIgnoreCase("Haji Ali")){
            iv.setImageResource(R.drawable.haji);
            place.setText("Haji Ali");
        }

        else if(c.equalsIgnoreCase("India Gate")){
            iv.setImageResource(R.drawable.gate);
            place.setText("India Gate");
        }
        else if(c.equalsIgnoreCase("Science City")){
            iv.setImageResource(R.drawable.science);
            place.setText("Science City");
        }
        else if(c.equalsIgnoreCase("Hussain Sagar")){
            iv.setImageResource(R.drawable.tankbund);
            place.setText("Hussain Sagar");
        }

        else if(c.equalsIgnoreCase("Fort St.George")){
            iv.setImageResource(R.drawable.george);
            place.setText("Fort St.George");
        }
        else if(c.equalsIgnoreCase("Juhu Beach")){
            iv.setImageResource(R.drawable.juhu);
            place.setText("Juhu Beach");
        }
        else if(c.equalsIgnoreCase("Qutab Minar")){
            iv.setImageResource(R.drawable.minar);
            place.setText("Qutab Minar");
        }
        else if(c.equalsIgnoreCase("Tagore House")){
            iv.setImageResource(R.drawable.tagore);
            place.setText("Tagore House");
        }
        else if(c.equalsIgnoreCase("Golconda Fort")){
            iv.setImageResource(R.drawable.gfort);
            place.setText("Golconda Fort");
        }
        else if(c.equalsIgnoreCase("Marina Beach")){
            iv.setImageResource(R.drawable.marina);
            place.setText("Marina Beach");
        }
        else if(c.equalsIgnoreCase("Marine Drive")){
            iv.setImageResource(R.drawable.marinedrive);
            place.setText("Marine Drive");
        }
        else if(c.equalsIgnoreCase("Red fort")){
            iv.setImageResource(R.drawable.redfort);
            place.setText("Red fort");
        }
        else if(c.equalsIgnoreCase("Victoria Memorial")){
            iv.setImageResource(R.drawable.victoria);
            place.setText("Victoria Memorial");
        }
        else if(c.equalsIgnoreCase("Ramoji Film City")){
            iv.setImageResource(R.drawable.ramoji);
            place.setText("Ramoji Film City");
        }
        else if(c.equalsIgnoreCase("Vellankani Shrine")){
            iv.setImageResource(R.drawable.vellankani);
            place.setText("Vellankani Shrine");
        }
        else if(c.equalsIgnoreCase("Worli Seaface")){
            iv.setImageResource(R.drawable.worli);
            place.setText("Worli Seaface");
        }

    }

    public void details(View view) {
        if(place.getText().toString().equalsIgnoreCase("Dakshineshwar temple"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("The temple is loved by every Bengali and is considered to be an abode of Goddess Kali.\n" +
                    " The temple was a dream that Rani Rashmoni dreamt before undertaking a pilgrimage to Varanasi.\n" +
                    "Timing:\n" +
                    "-From 6:00 am to 12:30 (midday),and ,\n" +
                    "-From 3:00 pm to 9:00 pm, every day.\nBest Time to Visit: 6:00AM to 8:00 PM");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

       else if(place.getText().toString().equalsIgnoreCase("Howra Bridge"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("One will be amazed to see the view from the bridge in the evening. The entire river Hoogli seems like an endless lake with the sun going down into the horizon. The suspended bridge ranks 6th amongst the longest bridges in the world.\n" +
                    "Location: Hooghly RIver, Kolkata.\n" +
                    "Best Time To Visit: In the Evening.");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }

        else if(place.getText().toString().equalsIgnoreCase("Science City"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Location: JBS Haldane Avenue, Basanti Hwy, Kolkata, West Bengal 700046.\n" +
                    "Price:\n-INR.60 per person\n-Entry fee for students in group INR 30\n\nTime: 9:00 am every day up to 8:00 pm.\nBest time to visit: During weekdays.");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Tagore House"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Location: 4 Dwarakanath Tagore Lane Jorasanko, Kolkata\n\nPrice: Rs. 10 (entry fee).\n" +
                    "Timing:\n-10:30 am to 4:30 pm, (Tues-Sun), Monday closed.\n\nBest Time to Visit: Weekdays.");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Victoria Memorial"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Location: Victoria Memorial Hall, 1, Queens Way, Maidan, Kolkata\n\n" +
                    "Price:\n-Rs. 30 for Indians,\n" +
                    "-Rs. 100 for citizens of the SAARC countries,\n" +
                    "-Rs. 500 for nationals of all other countries.\n\n" +
                    "\n" +
                    "Timing:\n" +
                    "-From 10 am to 6 pm (Tuesday- Friday)and,\n" +
                    "-From 10 am - 8 pm (Saturday, Sunday).\n" +
                    "\n" +
                    "Best time to visit: October and March.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Akshardham temple"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Akshardham Mandir is quite famous and more charming." +
                    "\n The architectural measures prove that the temple is 141 foot high and 316 foot wide." +
                    " The walls of it are explicitly carved with the images of flora, fauna, musicians, deities etc." +
                    " It has an intricate architectural style of Maharishi Vastu concepts and for the construction of the temple, " +
                    "the pick sandstone from Rajasthan and Carrara marbles from Italy was used.\nAkshardham temple entry timing:\n" +
                    "Entry: 09:30 am to 06:30 pm\n" +
                    "Exhibition: 10:30 am to 06:00 pm and the tickets for the exhibition will be available from 10:00 am");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Lotus Temple"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Lotus Temple entry timings:\n" +
                    "During summer, the entry timing is from 09:00 am to 07:00 pm while in winter it is from 09:00 am to 05:30 pm on all days except Mondays.\n" +
                    "Lotus Temple Entry fee:\n" +
                    "The entry to the temple is free.\n" +
                    "Lotus Temple Location:\n" +
                    "Lotus Temple Rd, Bahapur, Shambhu Dayal Bagh, Kalkaji, New Delhi, Delhi 110019.\n" +
                    "Insider Tips:\n" +
                    "    -Their surrounding area is brimming with beautiful gardens and you can spend time walking around.\n" +
                    "    -Photography is not permitted inside the temple.\n" +
                    "    -Avoid making noises inside the temple when people are meditating.\n" +
                    "    -You can either walk around on your own or with the help of a guide.\n" +
                    "    -There is an information center showing films and regular daily prayer sessions in the hall.\n" +
                    "    -Keep your shoes at the counter before entering the temple.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("India Gate"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("India Gate entry time:\n" +
                    "Anyone can visit India Gate anytime as it is open on all days 24 hours.\n" +
                    "India Gate Entry fee:\n" +
                    "There is no entry fee to visit the structure.\n" +
                    "India Gate location:\n" +
                    "Rajpath Marg, India Gate, New Delhi, Delhi 110001.\n" +
                    "Insider Tips:\n" +
                    "    -The climate during the months from October to March will be favourable for sightseeing tours in Delhi. You can enjoy visiting India Gate with your family and friends peacefully during that time.\n" +
                    "    -It will be fun if you bring cooked or packaged food with you, and have a picnic. You can also go for boating at the Boating Club adjacent to India Gate grounds.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Qutab Minar"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Qutub Minar entry timings:\n" +
                    "The visit to the structure is restricted to the day time between sunrise and sunset on all days.\n" +
                    "Qutub Minar entry fee:\n" +
                    "For Indian citizens: Rs. 30 and for foreign nationals: Rs.500.\n" +
                    "For children up to 15 years, the entry is free.\n" +
                    "Qutub Minar location:\n" +
                    "Qutub Minar Delhi is situated in Mehrauli in South West district of New Delhi, India.\n" +
                    "Insider Tips:\n" +
                    "    -Nearest metro station is Qutub Minar Metro Station.\n" +
                    "    -It is advisable to reach as early as possible – the opening time is 7:00 AM as the complex will be less crowded.\n" +
                    "    -Although there are shaded areas in the complex but it is always good to carry sunscreen or sunglasses especially during summer.\n" +
                    "    -There is a Decorative Light Show every evening from 6:30 to 8:00 pm as well as the Qutub Minar Festival in October/November.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Red fort"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Light and Sound show at the fort starts at 06:00 pm. To watch the Light and Sound Show, adults should pay Rs.80 and children should pay Rs.30.\n" +
                    "Red Fort visiting timing:\n" +
                    "The Fort will be closed on Mondays but will be open on all other days from 09:30 am to 04:30 pm.\n" +
                    "Red Fort Entry Fee:\n" +
                    "Entry fee for Indian citizens is Rs.10 while the same for foreigners is Rs.150.\n" +
                    "Red Fort location:\n" +
                    "Netaji Subhash Marg, Lal Qila, Chandni Chowk, New Delhi, Delhi 110006.\n" +
                    "Insider Tips:\n" +
                    "   -The nearest metro station to the Red Fort is Chawri Bazaar.\n" +
                    "   -It is open from Tuesday to Sunday from 9:30 am to 4:30 pm.\n" +
                    "   -Tickets for international visitors will cover museum entrance fees also.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Birla Mandir"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Revel in several marble carvings depicting Indian mythology in the adjoining 'Mukha Mandapam'. The temple also houses consorts of Venkateswara, Padmavati and Andal as well as has a separate shrine dedicated to Buddha.\n" +
                    "\n" +
                    "Location: south end of Hussain Sagar Lake, Naubat Pahad, Hyderabad\n" +
                    "\n" +
                    "Timings: 7am – 12pm, 2pm – 9pm\n" +
                    "\n" +
                    "Entry fee: NA\n" +
                    "\n" +
                    "Photography: Not Allowed\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Charminar"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Built in 1591 by Muhammad Quli Qutub Shah, it was constructed to commemorate the founding of Hyderabad and also to ward of a deadly epidemic that was rampant then in the Golconda region. Graced by 4 minarets soaring almost 50ft in height, it has a mosque and 45 prayer spaces is amongst the famous places in Hyderabad.\n" +
                    "\n" +
                    "Location: Charminar Rd, Char Kaman, Ghansi Bazaar, Hyderabad, Telangana 500002\n" +
                    "\n" +
                    "Timings: 9am – 5:30pm\n" +
                    "\n" +
                    "Entry fee: INR 5 per person for Indians, INR 100 per person for foreign nationals\n" +
                    "\n" +
                    "Photography: Allowed\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Golconda Fort"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Famous for its acoustics, a unique signalling device that was incorporated in its construction, the structure is known for its palaces, ingenious water supply system and the famous Fateh Rahben, one of the cannons used in the last siege of Golconda by Aurangzeb. The Sound & Light show brings alive the grandeur of one of India’s famous forts.\n" +
                    "\n" +
                    "Location: Khair Complex, Ibrahim Bagh, Hyderabad, Telangana 500008\n" +
                    "\n" +
                    "Timings: 9am – 5:30pm\n" +
                    "\n" +
                    "Entry fee:\n" +
                    "\n" +
                    "INR 5 per person for Indians\n" +
                    "INR 100 per person for foreign nationals\n" +
                    "INR 130 per person for Light & Sound Show\n" +
                    "\n" +
                    "Photography: Allowed, INR 25 per camera for videography.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Hussain Sagar"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Adding to its charm is the monolithic statue of the Buddha installed in the heart of the lake. Several facilities around the lake periphery such as boating and water sports, and the neighbourhood Lumbini Park, an amusement park are add-on attractions.\n" +
                    "\n" +
                    "Location: Tank Bund Rd, Hyderabad, Telangana, 500004\n" +
                    "\n" +
                    "Timings: 1pm – 9pm, all days of the week\n" +
                    "\n" +
                    "Entry fee: INR 10 (boating)\n" +
                    "\n" +
                    "Photography: Allowed\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Ramoji Film City"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("This destination can be enjoyed over a one day trip or one could stay back at this holiday destination. \n" +
                    "\n" +
                    "Location:  Anaspur Village, Hayathnagar Mandal,, Hyderabad, Telangana, 501512\n" +
                    "\n" +
                    "Timings: 9am – 5:30pm\n" +
                    "\n" +
                    "Entry fee:\n" +
                    "\n" +
                    "INR 800 per person for general guided tour for adults without food\n" +
                    "INR 700 per child for general guided tour for children (3-12 years) without food\n" +
                    "INR 1,799 per person for Ramoji Star Experience for adults with food\n" +
                    "INR 1,499 per child for Ramoji Star Experience for children (3-12 years) with food\n" +
                    "\n" +
                    "Photography: Allowed\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Birla planitorium"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Attractions: The planetarium runs regular audio-visual programs on astronomy that amazes its visitors. Apart from this, it also exhibits programs on Solar System, Cycle of Stars, Sky and Seasons, Comets and Man on the Moon.\n" +
                    "Also, Science Park, Traffic Park, and Science on Wheels are the special highlights of the Science Centre which are of special interest for young visitors and hence, it is one of the best things to do in Chennai.\n" +
                    "Timings:10 am to 5:45 pm\n" +
                    "Entry Fee: INR 40 for adults, INR 25 for children\n" +
                    "\n" +
                    "Location: Gandhi Mandapam Road in Kotturpuram, Chennai\n" +
                    "\n" +
                    "Distance: 12.3 km from Chennai Airport\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Public Library"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Attraction: With a collection of over 600,000 books, it is one of Asia’s largest libraries. Be it avid readers or scholars doing research work, one could easily get lost in this enchanting world of books as they immerse themselves in their favourite activity.\n" +
                    "Timings: 9 AM to 7.30 PM\n" +
                    "Entry Fee: None\n" +
                    "\n" +
                    "Location: Museum Compound, Pantheon Road, Egmore, Chennai, Tamil Nadu 600008\n" +
                    "\n" +
                    "Distance: 20 Km from Chennai Airport\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Fort St.George"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Attraction: It has given space to historic monuments of St. Mary's church under its cloud. The Flagstaff at the Fort is one of the tallest structures in the country. \n" +
                    "Timings: 9 am to 5 pm (except Friday)\n" +
                    "Entry Fee: INR 100 for foreign tourists and INR 5 for Indian visitors (only the museum)\n" +
                    "\n" +
                    "Location: Rajaji Rd, Near Legislature and Secretariat, Fort St George, Chennai, Tamil Nadu 600009\n" +
                    "\n" +
                    "Distance:  25 km from Chennai Airport\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Marina Beach"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Attractions: An old lighthouse stands on the southern end of Marina along with several other structures like an aquarium, a swimming pool and a park nearby. The sunrise here is a classy example of breathtaking beauty.\n" +
                    "Activities: Entertaining activities are lined up when you are taking a stroll on the sands. The food stalls serve delicious seafood at optimum prices. At the same time, pony rides, beach games, and kite flying activities are also present to make your evening relaxing.\n" +
                    "Location: Within the city of Chennai\n" +
                    "Best time to visit: November to March\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Vellankani Shrine"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("This grand monument stands off the Elliot's Beach and gives a totally different aura to the whole zone. The pristine white structure of the church having tall towers stands overlooking the Bay of Bengal and is visited by thousands of solace-seekers every day.\n" +
                    "One can also attend the mass prayer conducted both in Tamil and English. AnnaiVailankanni Shrine has a charm unparalleled amongst the surroundings.\n" +
                    "Timings: 5 am to 9 pm\n" +
                    "Entry Fee: None\n" +
                    "\n" +
                    "Location: Velankanni, Nagapattinam, Tamil Nadu\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Gateway of India"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Distance from Mumbai Airport: 25 km\n" +
                    "\n" +
                    "Entrance fee: The entry is free of cost.\n" +
                    "\n" +
                    "Location: Gateway of India is located at Apollo Bandar, Colaba, Mumbai, Maharashtra 400001\n" +
                    "\n" +
                    "Timing: 7:00 AM to 5:30 PM on all days of the week\n" +
                    "\n" +
                    "Insider Tips: This time, while you visit and explore the amazing picnic spot in Mumbai, don’t miss your chance to taste from the local street food which is very popular here. Head out for a stroll near the tall amazing gate and click some memorable pictures with the stunning background as the sunset.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Haji Ali"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Distance from Mumbai Airport: 17 km from Mumbai Airport\n" +
                    "\n" +
                    "Entrance  Fee: No entry fee\n" +
                    "\n" +
                    "Location: Haji Ali is located at Dargah Rd, Haji Ali, Mumbai, Maharashtra\n" +
                    "\n" +
                    "Timings: 5:30 am to 10:00 pm\n" +
                    "\n" +
                    "Insider Tips: Mumbai city has been always a fascination for all. While you are in Mumbai and visiting Haji Ali you will see the Dargah Complex. Lure your taste buds with some Kebabs, Mughlai Biryani, Hyderabadi fast food. Also, don’t miss your chance to witness the stunning sunset from Haji Ali Dargah\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Juhu Beach"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Distance from Mumbai: Juhu Beach is around 5.9 km from Mumbai Airport.\n" +
                    "\n" +
                    "Entrance Fee: No Entry Fee\n" +
                    "\n" +
                    "Location:  Juhu Tara Road, Juhu, Mumbai, Maharashtra, 400049, India\n" +
                    "\n" +
                    "Timings: Always Open\n" +
                    "\n" +
                    "Insider Tips: There is no doubt that Juhu beach is indeed a great hangout spot in Mumbai. While you are spending some awesome time with your friends at this beachhead out to the nearby beach stalls here. Try the exotic ‘PaniPuri', 'BhelPuri' and 'Pav Bhaji' once and you will definitely go for a second time again.  Also, explore the statues of freedom fighters and other important figures here. What’s more, you can always jog along the sand to burn those extra calories.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Marine Drive"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Distance from Mumbai Airport: 22 km\n" +
                    "\n" +
                    "Entrance fee: The entry is free of cost.\n" +
                    "\n" +
                    "Location: Mumbai, Maharashtra, 400004, India\n" +
                    "\n" +
                    "Timing: Always Open\n" +
                    "\n" +
                    "Insider Tips: Marine drive is also one of the best places to explore in Mumbai. This place is known as an inspiration for artists, musicians and poets who come here. Spend some time along with your friends while sipping a cup of tea and staring at the distant sea.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
        else if(place.getText().toString().equalsIgnoreCase("Worli Seaface"))
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setMessage("Highlights: One of the busiest out of all the Mumbai tourist attractions is the promenade at the Seaface. It is ideal for Morning or Evening walks. Amid a tempest, the waves will surge into the terrain making an exciting environment that makes hundreds of people visit this place even during bad weather.\n" +
                    "\n" +
                    "Distance from Mumbai: Worli Seaface is located at a distance of 13.4 km from Mumbai Airport.\n" +
                    "\n" +
                    "Entrance Fee: No Entry Fee\n" +
                    "\n" +
                    "Location: Worli, Mumbai, Maharashtra, 400030, India\n" +
                    "\n" +
                    "Timings: Always open.\n" +
                    "\n" +
                    "Insider Tips: If you are looking for some refreshing jog in the morning then head out to Worli Seaface. This whole place can be best enjoyed during the monsoons.\n");
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    public void logout(View view) {
        Intent intent= new Intent(Details.this,LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();

    }
}

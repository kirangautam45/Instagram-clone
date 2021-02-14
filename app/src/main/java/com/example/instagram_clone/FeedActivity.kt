package com.example.instagram_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FeedActivity : AppCompatActivity() {
    private lateinit var recyclerview: RecyclerView
    private lateinit var recyclerView1: RecyclerView
    var listofprofile = arrayListOf<Profile>()
    var listofpost = arrayListOf<Post>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        listofprofile.add(Profile("https://3.bp.blogspot.com/-V2Q9nWsMNWI/XIDqCg9OqKI/AAAAAAAAADg/LEL7grUPnhgN1e8knQ_INDkEPcCAovRwACLcBGAs/s1600/Hari-bahadur-810.jpg","Hari"))
        listofprofile.add(Profile("https://s3.ap-southeast-1.amazonaws.com/images.asianage.com/images/aa-Cover-ku3lqqj9fos2jcp642icc1ucm3-20170329015828.Medi.jpeg","Shyam"))
        listofprofile.add(Profile("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPbkjLMz13uFhwMT5qvqxFswetzlRN2WsRXA&usqp=CAU","Sita"))
        listofprofile.add(Profile("https://i2.wp.com/godofindia.com/wp-content/uploads/2017/05/ravi-teja.jpg?resize=1024%2C593","Ravi"))
        listofprofile.add(Profile("https://www.spotlightnepal.com/media/images/Moti_ram.2e16d0ba.fill-650x500.jpg","Moti"))
        listofprofile.add(Profile("https://avatars0.githubusercontent.com/u/63307545?s=400&u=8614f6688f2493f9aa6f75ff85e42da92ac3a16b&v=4","Aashish"))
        listofprofile.add(Profile("https://pbs.twimg.com/profile_images/778694462218174464/2dhhdbli.jpg","Bikash"))
        listofprofile.add(Profile("https://scontent.fktm8-1.fna.fbcdn.net/v/t1.0-9/134165894_411339849916477_8172215674399192020_o.jpg?_nc_cat=106&ccb=2&_nc_sid=19026a&_nc_ohc=Jc6no9v58rcAX8i3Cdv&_nc_ht=scontent.fktm8-1.fna&oh=76cd0db803d6e9ca9654e86b0bc6a1fb&oe=601A5A27","Roshan"))
        listofprofile.add(Profile("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTozVQh33N5XGxZrjF6NiIY8DpxVbx8PXuW3Q&usqp=CAU","Manish"))
        listofprofile.add(Profile("https://sm.askmen.com/askmen_in/article/f/facebook-p/facebook-profile-picture-affects-chances-of-gettin_gstt.jpg","Naveen"))


        listofpost.add(Post("https://3.bp.blogspot.com/-V2Q9nWsMNWI/XIDqCg9OqKI/AAAAAAAAADg/LEL7grUPnhgN1e8knQ_INDkEPcCAovRwACLcBGAs/s1600/Hari-bahadur-810.jpg",
                "https://scontent.fktm8-1.fna.fbcdn.net/v/t1.0-9/91414838_3140252589342346_5158818346031906816_n.jpg?_nc_cat=111&ccb=2&_nc_sid=8bfeb9&_nc_ohc=TiQe_ui_6LQAX_b21JP&_nc_ht=scontent.fktm8-1.fna&oh=3b355411a0218c378954a6f15e7286b5&oe=601A3124",
                "Hari"))
        listofpost.add(Post("https://s3.ap-southeast-1.amazonaws.com/images.asianage.com/images/aa-Cover-ku3lqqj9fos2jcp642icc1ucm3-20170329015828.Medi.jpeg","https://static.india.com/wp-content/uploads/2019/07/Shyam-Thapa-IANS.jpg?impolicy=Medium_Resize&w=1200&h=800","Shyam"))
        listofpost.add(Post("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPbkjLMz13uFhwMT5qvqxFswetzlRN2WsRXA&usqp=CAU","https://static.india.com/wp-content/uploads/2017/04/lord-rama-and-sita.jpg","Sita"))
        listofpost.add(Post("https://i2.wp.com/godofindia.com/wp-content/uploads/2017/05/ravi-teja.jpg?resize=1024%2C593","https://files.prokerala.com/downloads/pics/800/ravi-teja-49086.jpg","Ravi"))
        listofpost.add(Post("https://www.spotlightnepal.com/media/images/Moti_ram.2e16d0ba.fill-650x500.jpg","https://i.pinimg.com/originals/93/5a/b2/935ab2fa2d1f16e15476ff1f6fc4549e.jpg","Moti"))
        listofpost.add(Post("https://avatars0.githubusercontent.com/u/63307545?s=400&u=8614f6688f2493f9aa6f75ff85e42da92ac3a16b&v=4","https://www.quoteswishesmsg.com/wp-content/uploads/2019/12/happy-new-year-wishes-26.jpg","Aashish"))
        listofpost.add(Post("https://pbs.twimg.com/profile_images/778694462218174464/2dhhdbli.jpg","https://files.liveworksheets.com/def_files/2020/4/1/4011430193088/4011430193088001.jpg","Bikash"))
        listofpost.add(Post("https://scontent.fktm8-1.fna.fbcdn.net/v/t1.0-9/134165894_411339849916477_8172215674399192020_o.jpg?_nc_cat=106&ccb=2&_nc_sid=19026a&_nc_ohc=Jc6no9v58rcAX8i3Cdv&_nc_ht=scontent.fktm8-1.fna&oh=76cd0db803d6e9ca9654e86b0bc6a1fb&oe=601A5A27","https://i.pinimg.com/originals/c6/84/8a/c6848a92cc3ce5dfbc7dfd8d70ba2aae.jpg","Roshan"))
        listofpost.add(Post("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTozVQh33N5XGxZrjF6NiIY8DpxVbx8PXuW3Q&usqp=CAU","https://i.ebayimg.com/images/g/9vAAAOSwhChZuQ5e/s-l500.jpg","Manish"))
        listofpost.add(Post("https://sm.askmen.com/askmen_in/article/f/facebook-p/facebook-profile-picture-affects-chances-of-gettin_gstt.jpg","https://media.nojoto.com/wallpaper/main/wallpaper-2019-08-26-12-55-33-679efffb167948e3a635b41f2ab7968c.jpg","Naveen"))

        recyclerview = findViewById(R.id.recyclerview)
        recyclerView1=findViewById(R.id.recyclerview1)

        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerview.adapter = ProfileAdapter(this,listofprofile)

        recyclerView1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView1.adapter = PostAdapter(this,listofpost)
    }
}
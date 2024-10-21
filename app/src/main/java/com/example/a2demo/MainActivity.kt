package com.example.a2demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.a2demo.AcademicsActivity
import com.example.a2demo.CertificationsActivity
import com.example.a2demo.FeedbackActivity
import com.example.a2demo.HobbiesActivity
import com.example.a2demo.PhotoGalleryActivity
import com.example.a2demo.ProjectsActivity
import com.example.a2demo.R
import com.example.a2demo.SkillsActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Grid buttons
        findViewById<ImageButton>(R.id.AcadI).setOnClickListener {
            startActivity(Intent(this, AcademicsActivity::class.java))
        }
        findViewById<ImageButton>(R.id.CertI).setOnClickListener {
            startActivity(Intent(this, CertificationsActivity::class.java))
        }
        findViewById<ImageButton>(R.id.HobI).setOnClickListener {
            startActivity(Intent(this, HobbiesActivity::class.java))
        }
        findViewById<ImageButton>(R.id.ProI).setOnClickListener {
            startActivity(Intent(this, ProjectsActivity::class.java))
        }
        findViewById<ImageButton>(R.id.PhotoI).setOnClickListener {
            startActivity(Intent(this, PhotoGalleryActivity::class.java))
        }
        findViewById<ImageButton>(R.id.SkillsI).setOnClickListener {
            startActivity(Intent(this, SkillsActivity::class.java))
        }

        val t = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(t)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_email -> {
                val emailIntent = Intent(Intent.ACTION_SENDTO)
                emailIntent.data = Uri.parse("mailto:harshita.pathania03@gmail.com")
                startActivity(emailIntent)
                return true
            }
            R.id.menu_contact -> {

                val callIntent = Intent(Intent.ACTION_DIAL)
                callIntent.data = Uri.parse("tel:+918130604956")
                startActivity(callIntent)
                return true
            }
            R.id.menu_feedback -> {
                startActivity(Intent(this, FeedbackActivity::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
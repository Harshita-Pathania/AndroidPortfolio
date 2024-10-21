package com.example.a2demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)

        // Project 1 GitHub Button
        findViewById<Button>(R.id.githubBtnProject1).setOnClickListener {
            openLink("https://github.com/Harshita-Pathania/Network-Anomaly-Detection/")
        }

        // Project 2 GitHub Button
        findViewById<Button>(R.id.githubBtnProject2).setOnClickListener {
            openLink("https://github.com/Harshita-Pathania/Stock-Price-Prediction")
        }

        // Project 3 GitHub Button
        findViewById<Button>(R.id.githubBtnProject3).setOnClickListener {
            openLink("https://github.com/Harshita-Pathania/Tic-Tac-Toe")
        }

        // Project 4 GitHub Button
        findViewById<Button>(R.id.githubBtnProject4).setOnClickListener {
            openLink("https://github.com/your-github-username/e-commerce-website")
        }

        // Project 5 GitHub Button
        findViewById<Button>(R.id.githubBtnProject5).setOnClickListener {
            openLink("https://github.com/Harshita-Pathania/Image-Captioning-and-Text-Extraction")
        }

        // Back to Main Page Button
        findViewById<Button>(R.id.backBtn).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}

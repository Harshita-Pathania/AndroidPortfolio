package com.example.a2demo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {

    private lateinit var stars: Array<ImageButton> // Array to store star buttons
    private var selectedRating = 0 // Track the selected rating

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        // Initializing views
        val submitButton: Button = findViewById(R.id.submitButton)
        val nameInput: EditText = findViewById(R.id.feedbackName)
        val subjectInput: EditText = findViewById(R.id.feedbackSubject)
        val descriptionInput: EditText = findViewById(R.id.feedbackDescription)

        // Initialize stars array
        stars = arrayOf(
            findViewById(R.id.star1),
            findViewById(R.id.star2),
            findViewById(R.id.star3),
            findViewById(R.id.star4),
            findViewById(R.id.star5)
        )

        // Set click listeners for each star
        stars.forEachIndexed { index, star ->
            star.setOnClickListener {
                updateStarRating(index + 1) // Update the rating when clicked
            }
        }

        // Handle submit button click
        submitButton.setOnClickListener {
            val name = nameInput.text.toString()
            val subject = subjectInput.text.toString()
            val description = descriptionInput.text.toString()

            if (name.isEmpty() || subject.isEmpty() || description.isEmpty()) {
                Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this,
                    "Feedback submitted! Rating: $selectedRating stars",
                    Toast.LENGTH_LONG
                ).show()
                val i = Intent(this, MainActivity :: class.java)
                startActivity(i)
            }
        }
    }

    // Update star ratings based on user selection
    private fun updateStarRating(rating: Int) {
        selectedRating = rating
        for (i in stars.indices) {
            if (i < rating) {
                stars[i].setImageResource(R.drawable.ic_star_filled) // Filled star
            } else {
                stars[i].setImageResource(R.drawable.ic_star_outline) // Outline star
            }
        }
    }
}

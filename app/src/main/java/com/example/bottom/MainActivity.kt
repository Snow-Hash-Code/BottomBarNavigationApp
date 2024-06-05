package com.example.bottom

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var selectedTab = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeLayout = findViewById<LinearLayout>(R.id.homeLayout)
        val likeLayout = findViewById<LinearLayout>(R.id.likeLayout)
        val notificationLayout = findViewById<LinearLayout>(R.id.noticationLayout)
        val profileLayout = findViewById<LinearLayout>(R.id.profileLayout)

        val homeImage = findViewById<ImageView>(R.id.homeImage)
        val likeImage = findViewById<ImageView>(R.id.likeImage)
        val notificationImage = findViewById<ImageView>(R.id.notificationImage)
        val profileImage = findViewById<ImageView>(R.id.profileImage)

        val homeTxt = findViewById<TextView>(R.id.homeTxt)
        val likeTxt = findViewById<TextView>(R.id.likeTxt)
        val notificationTxt = findViewById<TextView>(R.id.notificationTxt)
        val profileTxt = findViewById<TextView>(R.id.profileTxt)

        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
            .commit()

        homeLayout.setOnClickListener {
            if (selectedTab != 1) {
                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
                    .commit()
                likeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE
                likeImage.setImageResource(R.drawable.like_icon)
                notificationImage.setImageResource(R.drawable.notifications_icon)
                profileImage.setImageResource(R.drawable.profile_icon)
                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                homeTxt.visibility = View.VISIBLE
                homeImage.setImageResource(R.drawable.home_selected_icon)
                homeLayout.setBackgroundResource(R.drawable.round_back_home_100)
                val scaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                scaleAnimation.duration = 200
                scaleAnimation.fillAfter = true
                homeLayout.startAnimation(scaleAnimation)
                selectedTab = 1
            }
        }

        likeLayout.setOnClickListener {
            if (selectedTab != 2) {
                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, LikesFragment::class.java, null)
                    .commit()
                homeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE
                homeImage.setImageResource(R.drawable.home_icon)
                notificationImage.setImageResource(R.drawable.notifications_icon)
                profileImage.setImageResource(R.drawable.profile_icon)
                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                likeTxt.visibility = View.VISIBLE
                likeImage.setImageResource(R.drawable.like_selected_icon)
                likeLayout.setBackgroundResource(R.drawable.round_back_like_100)
                val scaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    1.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                scaleAnimation.duration = 200
                scaleAnimation.fillAfter = true
                likeLayout.startAnimation(scaleAnimation)
                selectedTab = 2
            }
        }

        notificationLayout.setOnClickListener {
            if (selectedTab != 3) {
                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, NotificationFragment::class.java, null)
                    .commit()
                homeTxt.visibility = View.GONE
                likeTxt.visibility = View.GONE
                profileTxt.visibility = View.GONE
                homeImage.setImageResource(R.drawable.home_icon)
                likeImage.setImageResource(R.drawable.like_icon)
                profileImage.setImageResource(R.drawable.profile_icon)
                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationTxt.visibility = View.VISIBLE
                notificationImage.setImageResource(R.drawable.notifications_selected_icon)
                notificationLayout.setBackgroundResource(R.drawable.round_back_notification_100)
                val scaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                scaleAnimation.duration = 200
                scaleAnimation.fillAfter = true
                notificationLayout.startAnimation(scaleAnimation)
                selectedTab = 3
            }
        }

        profileLayout.setOnClickListener {
            if (selectedTab != 4) {
                supportFragmentManager.beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmentContainer, ProfileFragment::class.java, null)
                    .commit()
                homeTxt.visibility = View.GONE
                likeTxt.visibility = View.GONE
                notificationTxt.visibility = View.GONE
                homeImage.setImageResource(R.drawable.home_icon)
                likeImage.setImageResource(R.drawable.like_icon)
                notificationImage.setImageResource(R.drawable.notifications_icon)
                homeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                likeLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                notificationLayout.setBackgroundColor(resources.getColor(android.R.color.transparent))
                profileTxt.visibility = View.VISIBLE
                profileImage.setImageResource(R.drawable.profile_selected_icon)
                profileLayout.setBackgroundResource(R.drawable.round_back_profile_100)
                val scaleAnimation = ScaleAnimation(
                    0.8f,
                    1.0f,
                    1f,
                    1f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f,
                    Animation.RELATIVE_TO_SELF,
                    0.0f
                )
                scaleAnimation.duration = 200
                scaleAnimation.fillAfter = true
                profileLayout.startAnimation(scaleAnimation)
                selectedTab = 4
            }
        }

    }
}

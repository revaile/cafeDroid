package com.example.cafedroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.cafedroid.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Donut image click listener
        view.findViewById<ImageView>(R.id.donut).setOnClickListener {
            displayToast("You ordered a Donut")
        }

        // Ice cream image click listener
        view.findViewById<ImageView>(R.id.ice_cream).setOnClickListener {
            displayToast("You ordered Ice Cream")
        }

        // Froyo image click listener
        view.findViewById<ImageView>(R.id.froyo).setOnClickListener {
            displayToast("You ordered Froyo")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Function to display toast message
    private fun displayToast(message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
    }
}

package net.psistemas.livecycle.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import net.psistemas.livecycle.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val viewModel by activityViewModels<MainViewModel>()

    //private lateinit var viewModel: MainViewModel //by viewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewModel = ViewModelProvider(activity as AppCompatActivity).get()

        viewModel.counter.observe(viewLifecycleOwner){counter ->
            binding.counter.text = counter.toString()
        }

        binding.buttonSecond.setOnClickListener {
            //findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
            viewModel.increment()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.wisewords.quotify.ui

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.wisewords.quotify.adaptor.AllCategoryRecyclerViewAdaptor
import com.wisewords.quotify.adaptor.ExceptAllCategoryRecyclerViewAdaptor
import com.wisewords.quotify.databinding.FragmentHomeBinding
import com.wisewords.quotify.endpoints.GetCategory
import com.wisewords.quotify.repository.RetrofitInstance
import com.wisewords.quotify.repository.all.AllCategory
import com.wisewords.quotify.repository.exceptall.ExceptAllCategory
import okhttp3.internal.toImmutableList
import retrofit2.Response

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var retAllCategory: GetCategory
    private lateinit var retExceptAllCategory: GetCategory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container, false)
        retAllCategory = RetrofitInstance.getRetrofitInstance().create(GetCategory::class.java)
        retExceptAllCategory = RetrofitInstance.getRetrofitInstance().create(GetCategory::class.java)

        val recyclerView = binding.quoteRecylerView
        recyclerView.setBackgroundColor(Color.TRANSPARENT)
        recyclerView.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.HORIZONTAL,
            false
        )

        binding.root.postDelayed(Runnable {
            binding.catAll.performClick()
        },
            100)

        binding.catAll.setOnClickListener {
            val responseLiveData: LiveData<Response<AllCategory>> = liveData {
                val response = retAllCategory.getAllQuotes("all",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val allCategoryList = it.body()?.toList()
                if (allCategoryList != null) {
                    recyclerView.adapter = AllCategoryRecyclerViewAdaptor(allCategoryList, context!!)
                }
            })
        }
        binding.catAge.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("age",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catAlone.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("alone",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catAmazing.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("amazing",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catAnger.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("anger",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catAnniversary.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("anniversary",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catArchitecture.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("architecture",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catArt.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("art",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catAttitude.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("attitude",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catBeauty.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("beauty",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catBest.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("best",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catBirthday.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("birthday",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catBusiness.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("business",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catCar.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("car",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catChange.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("change",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catCommunication.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("communication",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catComputer.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("computers",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catCool.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("cool",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catCourage.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("courage",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catDad.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("dad",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catDating.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("dating",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catDeath.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("death",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catDesign.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("design",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catDiet.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("diet",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }
        binding.catDreams.setOnClickListener {
            val responseLiveData: LiveData<Response<ExceptAllCategory>> = liveData {
                val response = retExceptAllCategory.getExceptAllQuotes("dreams",1000)
                emit(response)
            }
            responseLiveData.observe(this, Observer {
                val expectAllCategoryList = it.body()?.toImmutableList()
                if (expectAllCategoryList != null) {
                    recyclerView.adapter = ExceptAllCategoryRecyclerViewAdaptor(expectAllCategoryList, context!!)
                }
            })
        }


        return binding.root
    }

}
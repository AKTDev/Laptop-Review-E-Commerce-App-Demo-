package com.nilsproject.laptopreview

data class LaptopData(var title : String,
                      var img : Int,
                      var rs : String,
                      var org_rate : String,
                      var dis : String,
                      var discri : String,
                      var arr : ArrayList<Int>)



object supplier
{
    var HP = arrayListOf(R.drawable.hp1,R.drawable.hp2,R.drawable.hp3)
    var Asus = arrayListOf(R.drawable.asus,R.drawable.asua2,R.drawable.asus3)
    var MS = arrayListOf(R.drawable.ms1,R.drawable.ms2,R.drawable.ms3)
    var Dell = arrayListOf(R.drawable.dell1,R.drawable.dell2,R.drawable.dell1)
    var Lenovo = arrayListOf(R.drawable.lenovo1,R.drawable.lenovo2,R.drawable.lenovo3)
    var Dell2 = arrayListOf(R.drawable.alien1,R.drawable.alien2,R.drawable.alien3)
    var ROG = arrayListOf(R.drawable.asusrog1,R.drawable.asusrog2,R.drawable.asusrog2)

    var laptops = listOf<LaptopData>(LaptopData("HP Pavilion 15-bc408TX",R.drawable.hp1,
            "88,990.00","1,06,999","30% off","8th Gen Intel Core i7-8750H | 8GB DDR4 RAM | 1 TB 5400 rpm SATA | NVIDIA GeForce GTX 1050 (4 GB GDDR5) | Windows 10 Home | 15.6 Inch Full HD",HP),
            LaptopData("Asus VivoBook Pro",R.drawable.asus,"122,814.22","122,814.22","0% off",
                    "8th Gen Intel Core i7-8750H | 8GB DDR4 RAM | 1 TB 5400 rpm SATA | NVIDIA GeForce GTX 1050 (4 GB GDDR5) | Windows 10 Home | 15.6 Inch Full HD", Asus),
            LaptopData("Microsoft Surface Book 2",R.drawable.ms1,"479,999.00","499,999","10% off","8th Gen Intel Core i7-8750H | 8GB DDR4 RAM | 1 TB 5400 rpm SATA | NVIDIA GeForce GTX 1050 (4 GB GDDR5) | Windows 10 Home | 15.6 Inch Full HD", MS),
            LaptopData("Dell Alienware 15",R.drawable.alien1,"142,283.00","142,283","30% off","8th Gen Intel Core i7-8750H | 8GB DDR4 RAM | 1 TB 5400 rpm SATA | NVIDIA GeForce GTX 1050 (4 GB GDDR5) | Windows 10 Home | 15.6 Inch Full HD", Dell2),
            LaptopData("Lenovo Ideapad 330",R.drawable.lenovo1,"41,999.00","51999 Rs","10% off","8th Gen Intel Core i7-8750H | 8GB DDR4 RAM | 1 TB 5400 rpm SATA | NVIDIA GeForce GTX 1050 (4 GB GDDR5) | Windows 10 Home | 15.6 Inch Full HD", Lenovo),
            LaptopData("Dell Inspiron 5570",R.drawable.dell1,"84,999.00","1,00,000","25% off","GHz intel i7-8550U processor\n" +
                    "8GB DDR4 RAM RAM\n" +
                    "2TB hard drive\n" +
                    "15.6-inch, AMD Radeon 530 4GB Graphics\n" +
                    "Windows 10 OS", Dell),
            LaptopData("Asus ROG Zephyrus",R.drawable.asusrog1,"86.000.00","106999","30% off","8th Gen Intel Core i7-8750H | 8GB DDR4 RAM | 1 TB 5400 rpm SATA | NVIDIA GeForce GTX 1050 (4 GB GDDR5) | Windows 10 Home | 15.6 Inch Full HD",ROG)
    )

}
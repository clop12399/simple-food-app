package com.example.myproject

object DataFood {
    private val names = arrayOf(
        "BBQ Beef Pizza",
        "Pepperoni Pizza",
        "Tuna Pizza",
        "Beef Burger",
        "Chicken Burger",
        "Salmon Burger",
        "Lasagna",
        "Spaghetti Bolognese",
        "Spaghetti Aglio Olio",
        "Mac and Cheese"
    )

    private val descs = arrayOf(
        "Pizza with BBQ sauce and ground beef on top",
        "Pizza with big, thick slices of pepperoni on top",
        "Pizza with tuna mixture",
        "Juicy cooked beef patty, placed inside bun with lettuce, tomato, grilled pineapple, BBQ sauce and sliced cheese as condiment",
        "Juicy cooked chicken patty, placed inside bun with chilli sauce, homemade ranch dressing, lettuce and sliced cheese as condiment",
        "Homemade salmon patty",
        "Homemade lasagna sheet, layered with bolognese sauce and bechamel sauce sprinkled with parsley and parmesan cheese",
        "Homemade spaghetti with hearty homemade bolognese sauce",
        "Homemade spaghetti with garlic sauce with hint of truffle on top",
        "Baked Macaroni with three types of cheese and toasted bread crumbs on top"
    )

    private val imgs = intArrayOf(
        R.drawable.bbq_beef_pizza,
        R.drawable.pepperoni_pizza,
        R.drawable.tuna_pizza,
        R.drawable.beef_burger,
        R.drawable.chicken_burger,
        R.drawable.salmon_burger,
        R.drawable.lasagna,
        R.drawable.spaghetti_bolognese,
        R.drawable.spaghetti_aglio_olio,
        R.drawable.mac_n_cheese
    )

    val listData: ArrayList<Food>
    get() {
        val list = arrayListOf<Food>()
        for (pos in names.indices) {
            val food = Food(names[pos], descs[pos], imgs[pos])
            list.add(food)
        }
        return list
    }
}
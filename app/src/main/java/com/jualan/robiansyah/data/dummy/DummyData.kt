package com.jualan.robiansyah.data.dummy

import com.jualan.robiansyah.data.model.Category
import com.jualan.robiansyah.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Semua", description = "Semua Makanan lokal", products_count = 12),
        Category(id = 2, name = "Makanan", description = "Makanan Segar", products_count = 10),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 10)
    )

    val products = listOf(
        Product(id = 1, category_id = 1, category = categories[0], name = "Kue Nopia", description = "Kue khas Purbalingga", price = 12000.0, stock = 10, img = "dummy_product"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Sapu Glagah", description = "Sapu Glagah Asli", price = 15000.0, stock = 10, img = "dummy_product"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Batik Purbalingga", description = "Batik Tulis khas", price = 250000.0, stock = 10, img = "dummy_product"),
        Product(id = 4, category_id = 2, category = categories[1], name = "Kue Nopia", description = "Kue khas Purbalingga", price = 12000.0, stock = 10, img = "dummy_product"),
        Product(id = 5, category_id = 2, category = categories[1], name = "Mendoan", description = "Mendoan hangat", price = 5000.0, stock = 10, img = "dummy_product"),
        Product(id = 6, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu Glagah Asli", price = 15000.0, stock = 10, img = "dummy_product"),
        Product(id = 7, category_id = 3, category = categories[2], name = "Batik Purbalingga", description = "Batik Tulis khas", price = 250000.0, stock = 10, img = "dummy_product")
    )
}

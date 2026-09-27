package com.jualan.robiansyah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jualan.robiansyah.ui.screen.DaftarProdukScreen
import com.jualan.robiansyah.ui.screen.DetailProductScreen
import com.jualan.robiansyah.ui.screen.HubungiKamiScreen
import com.jualan.robiansyah.ui.theme.JualanTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JualanTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "daftar_produk"
                ) {
                    // Rute 1: Daftar Produk Utama
                    composable(route = "daftar_produk") {
                        DaftarProdukScreen(navController = navController)
                    }

                    // Rute 2: Detail Produk (Menerima Argumen Integer)
                    composable(
                        route = "detail/{productId}",
                        arguments = listOf(
                            navArgument(name = "productId") {
                                type = NavType.IntType
                            }
                        )
                    ) { backStackEntry ->
                        val productId = backStackEntry.arguments?.getInt("productId") ?: 0
                        DetailProductScreen(
                            productId = productId,
                            navController = navController
                        )
                    }

                    // Rute 3: Form Hubungi Kami
                    composable(route = "hubungi_kami") {
                        HubungiKamiScreen(navController = navController)
                    }
                }
            }
        }
    }
}

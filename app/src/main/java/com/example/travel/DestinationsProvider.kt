package com.example.travel

class DestinationsProvider {
    companion object {
        val destinationsList = listOf<Destinations>(
            Destinations(
                "londres",
                "BOG-LDN",
                "20%off",
                "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcQdICb_YNsi0t0OOJ014tRdG3AiU1hRQ5Wbt4wgGRQV3oyj5usCyTB26flnOKn24kw9LGkc_gOvbJN1ob35q7Bc8zwXWpTsKDCCK_itGw"
            ),
            Destinations(
                "New York",
                "BOG-NYC",
                "20%off",
                "https://encrypted-tbn1.gstatic.com/licensed-image?q=tbn:ANd9GcT2PHF333DuEw9OYrPAJgfOpGB2w8ror6ZsJKnzMCjSnuk54RRb40ryEqK1nEi8nr2Eip9dUsiwe9qZbUFWLMk7NpAXSs89llh_TP8ZXA"
            ),
            Destinations(
                "Hong Kong",
                "BOG-HKG",
                "90%off",
                "https://lh5.googleusercontent.com/p/AF1QipNdqXoQuMB1jblQvZy2MdmD3rk9jbo7v36pbssL=w540-h312-n-k-no"
            ),
            Destinations(
                "Paris",
                "BOG-FR",
                "15%off",
                "https://lh6.googleusercontent.com/proxy/VSDBMeOlHFia1rVgjtrzdD42kC-HsycxOoAOJ_VCsdrf1eGyS8-438Q3d5ZNb2nr8rNFxLRn6010qqIibO88yCK8tSWGlI9c4nZ4SpC3OuHk_771MhIgkGMUPNdhXZ3ytMcfVc54246Fipdt8_4UvcyhIAcAkKg=w540-h312-n-k-no"
            )

        )
    }
}
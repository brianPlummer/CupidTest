package friendlyrobot.nyc.cupidtest

import com.squareup.moshi.Moshi
import org.junit.Test

import com.google.common.truth.Truth.assertThat
import friendlyrobot.nyc.cupidtest.model.DataModel

class ModelTest {

    private val moshi = Moshi.Builder().build()
    val matchResponse by lazy { moshi.adapter<DataModel>(DataModel::class.java).fromJson(SAMPLE_JSON) }

    @Test
    fun `can we parse our data model from sample json?`() {

        assertThat(matchResponse).isNotNull()
        assertThat(matchResponse?.data?.size).isEqualTo(18)
        val firstMatch = matchResponse?.data?.getOrNull(0)
        assertThat(firstMatch).isNotNull()
        assertThat(firstMatch?.photo?.paths?.medium)
            .isEqualTo("https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/36x36/684x684/0/15743311334557165678.jpg")
        assertThat(firstMatch?.match).isEqualTo(8715)
        assertThat(firstMatch?.username).isEqualTo("bklyn2356")
        assertThat(firstMatch?.cityName).isEqualTo("Brooklyn")
        assertThat(firstMatch?.stateCode).isEqualTo("NY")
        assertThat(firstMatch?.age).isEqualTo(27)
    }
}

val SAMPLE_JSON = "{\"total_matches\":1000,\"data\":[{\"enemy\":834,\"relative\":0,\"last_login\":1437583808,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Brooklyn\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"5592586755333955055\",\"match\":8715,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/36x36/684x684/0/15743311334557165678.jpg\",\"small\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/36x36/684x684/0/15743311334557165678.jpg\",\"medium\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/36x36/684x684/0/15743311334557165678.jpg\",\"original\":\"https://k2.okccdn.com/php/load_okc_image.php/images/36x36/684x684/0/15743311334557165678.jpg\"},\"base_path\":\"36x36/684x684/2/15743311334557165678.jpg\",\"original_size\":{\"width\":720,\"height\":720},\"ordinal\":0,\"id\":\"15743311334557165678\",\"crop_rect\":{\"height\":648,\"y\":36,\"width\":648,\"x\":36},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/36x36/684x684/2/15743311334557165678.jpg\",\"desktop_match\":\"https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/36x36/684x684/2/15743311334557165678.jpg\",\"small\":\"https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/36x36/684x684/2/15743311334557165678.jpg\",\"medium\":\"https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/36x36/684x684/2/15743311334557165678.jpg\"}},\"state_name\":\"New York\",\"age\":27,\"country_code\":\"US\",\"friend\":8099,\"is_online\":0,\"username\":\"bklyn2356\",\"city_name\":\"Brooklyn\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":326,\"relative\":3944461840,\"last_login\":1437577735,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"New York\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"14198951291558879718\",\"match\":8278,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/104x25/536x457/0/10178684053924437512.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/104x25/536x457/0/10178684053924437512.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/104x25/536x457/0/10178684053924437512.jpg\",\"original\":\"https://k3.okccdn.com/php/load_okc_image.php/images/104x25/536x457/0/10178684053924437512.jpg\"},\"base_path\":\"104x25/536x457/2/10178684053924437512.jpg\",\"original_size\":{\"width\":640,\"height\":480},\"ordinal\":0,\"id\":\"10178684053924437512\",\"crop_rect\":{\"height\":432,\"y\":25,\"width\":432,\"x\":104},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/104x25/536x457/2/10178684053924437512.jpg\",\"desktop_match\":\"https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/104x25/536x457/2/10178684053924437512.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/104x25/536x457/2/10178684053924437512.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/104x25/536x457/2/10178684053924437512.jpg\"}},\"state_name\":\"New York\",\"age\":24,\"country_code\":\"US\",\"friend\":0,\"is_online\":0,\"username\":\"strwbrryasaurus\",\"city_name\":\"New York\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1379,\"relative\":50,\"last_login\":1437542875,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Brooklyn\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"647377517720666689\",\"match\":9046,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/0x0/640x560/200x277/539x616/0/18270683582928918373.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/0x0/60x60/200x277/539x616/0/18270683582928918373.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/0x0/120x120/200x277/539x616/0/18270683582928918373.jpg\",\"original\":\"https://k1.okccdn.com/php/load_okc_image.php/images/200x277/539x616/0/18270683582928918373.jpg\"},\"base_path\":\"200x277/539x616/2/18270683582928918373.jpg\",\"original_size\":{\"width\":540,\"height\":960},\"ordinal\":0,\"id\":\"18270683582928918373\",\"crop_rect\":{\"height\":339,\"y\":277,\"width\":339,\"x\":200},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/640x560/640x560/200x277/539x616/2/18270683582928918373.jpg\",\"desktop_match\":\"https://k3.okccdn.com/php/load_okc_image.php/images/400x400/400x400/200x277/539x616/2/18270683582928918373.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/60x60/60x60/200x277/539x616/2/18270683582928918373.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/120x120/120x120/200x277/539x616/2/18270683582928918373.jpg\"}},\"state_name\":\"New York\",\"age\":29,\"country_code\":\"US\",\"friend\":7177,\"is_online\":0,\"username\":\"samam15\",\"city_name\":\"Brooklyn\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1326,\"relative\":50,\"last_login\":1437454459,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Astoria\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"13695319409968531382\",\"match\":9341,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x183/1124x1308/0/14329908652703642980.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x183/1124x1308/0/14329908652703642980.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x183/1124x1308/0/14329908652703642980.jpg\",\"original\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x183/1124x1308/0/14329908652703642980.jpg\"},\"base_path\":\"0x183/1124x1308/2/14329908652703642980.jpg\",\"original_size\":{\"width\":1125,\"height\":1500},\"ordinal\":0,\"id\":\"14329908652703642980\",\"crop_rect\":{\"height\":1125,\"y\":183,\"width\":1124,\"x\":0},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x183/1124x1308/2/14329908652703642980.jpg\",\"desktop_match\":\"https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x183/1124x1308/2/14329908652703642980.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x183/1124x1308/2/14329908652703642980.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x183/1124x1308/2/14329908652703642980.jpg\"}},\"state_name\":\"New York\",\"age\":35,\"country_code\":\"US\",\"friend\":7713,\"is_online\":0,\"username\":\"Vanessa1245\",\"city_name\":\"Astoria\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1294,\"relative\":50,\"last_login\":1437579109,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Brooklyn\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"13823341183278947251\",\"match\":7612,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":3,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x0/960x960/0/13053897257851448454.jpg\",\"small\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x0/960x960/0/13053897257851448454.jpg\",\"medium\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x0/960x960/0/13053897257851448454.jpg\",\"original\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/960x960/0/13053897257851448454.jpg\"},\"base_path\":\"0x0/960x960/2/13053897257851448454.jpg\",\"original_size\":{\"width\":960,\"height\":960},\"ordinal\":0,\"id\":\"13053897257851448454\",\"crop_rect\":{\"height\":960,\"y\":0,\"width\":960,\"x\":0},\"caption\":\"My baby. I sleep and dine with this baby.\",\"thumb_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x0/960x960/2/13053897257851448454.jpg\",\"desktop_match\":\"https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x0/960x960/2/13053897257851448454.jpg\",\"small\":\"https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x0/960x960/2/13053897257851448454.jpg\",\"medium\":\"https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x0/960x960/2/13053897257851448454.jpg\"}},\"state_name\":\"New York\",\"age\":24,\"country_code\":\"US\",\"friend\":7820,\"is_online\":0,\"username\":\"mathildapurr\",\"city_name\":\"Brooklyn\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":554,\"relative\":350125729,\"last_login\":1437442703,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"New York\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"211776112024388806\",\"match\":8933,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/424x162/817x555/0/5166655670501885761.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/424x162/817x555/0/5166655670501885761.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/424x162/817x555/0/5166655670501885761.jpg\",\"original\":\"https://k3.okccdn.com/php/load_okc_image.php/images/424x162/817x555/0/5166655670501885761.jpg\"},\"base_path\":\"424x162/817x555/2/5166655670501885761.jpg\",\"original_size\":{\"width\":960,\"height\":720},\"ordinal\":0,\"id\":\"5166655670501885761\",\"crop_rect\":{\"height\":393,\"y\":162,\"width\":393,\"x\":424},\"caption\":\"my sister. we look nothing alike! what do you think?\",\"thumb_paths\":{\"large\":\"https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/424x162/817x555/2/5166655670501885761.jpg\",\"desktop_match\":\"https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/424x162/817x555/2/5166655670501885761.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/424x162/817x555/2/5166655670501885761.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/424x162/817x555/2/5166655670501885761.jpg\"}},\"state_name\":\"New York\",\"age\":27,\"country_code\":\"US\",\"friend\":7384,\"is_online\":0,\"username\":\"vugen221\",\"city_name\":\"New York\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":630,\"relative\":5082668,\"last_login\":1437449049,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Brooklyn\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"3674519450479413927\",\"match\":8064,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k1.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x186/1124x1311/0/3987406159091418898.jpg\",\"small\":\"https://k0.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x186/1124x1311/0/3987406159091418898.jpg\",\"medium\":\"https://k0.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x186/1124x1311/0/3987406159091418898.jpg\",\"original\":\"https://k0.okccdn.com/php/load_okc_image.php/images/0x186/1124x1311/0/3987406159091418898.jpg\"},\"base_path\":\"0x186/1124x1311/2/3987406159091418898.jpg\",\"original_size\":{\"width\":1125,\"height\":1500},\"ordinal\":0,\"id\":\"3987406159091418898\",\"crop_rect\":{\"height\":1125,\"y\":186,\"width\":1124,\"x\":0},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k2.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x186/1124x1311/2/3987406159091418898.jpg\",\"desktop_match\":\"https://k2.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x186/1124x1311/2/3987406159091418898.jpg\",\"small\":\"https://k2.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x186/1124x1311/2/3987406159091418898.jpg\",\"medium\":\"https://k2.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x186/1124x1311/2/3987406159091418898.jpg\"}},\"state_name\":\"New York\",\"age\":31,\"country_code\":\"US\",\"friend\":7317,\"is_online\":0,\"username\":\"KW706\",\"city_name\":\"Brooklyn\",\"stoplight_color\":\"green\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1833,\"relative\":3839550144,\"last_login\":1437500741,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Washington\",\"country_name\":\"United States\",\"state_name\":\"District of Columbia\",\"state_code\":\"DC\"},\"userid\":\"10554146310980829648\",\"match\":8089,\"gender_tags\":[],\"liked\":false,\"state_code\":\"DC\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x0/0x0/0/17436090354355705210.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x0/0x0/0/17436090354355705210.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x0/0x0/0/17436090354355705210.jpg\",\"original\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/0x0/0/17436090354355705210.jpg\"},\"base_path\":\"0x0/0x0/2/17436090354355705210.jpg\",\"original_size\":{\"width\":960,\"height\":1280},\"ordinal\":0,\"id\":\"17436090354355705210\",\"crop_rect\":{\"height\":0,\"y\":0,\"width\":0,\"x\":0},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x0/0x0/2/17436090354355705210.jpg\",\"desktop_match\":\"https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x0/0x0/2/17436090354355705210.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x0/0x0/2/17436090354355705210.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x0/0x0/2/17436090354355705210.jpg\"}},\"state_name\":\"District of Columbia\",\"age\":26,\"country_code\":\"US\",\"friend\":6315,\"is_online\":0,\"username\":\"LaurenMindy\",\"city_name\":\"Washington\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":854,\"relative\":50,\"last_login\":1437572337,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"New York\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"8847347935728113448\",\"match\":8653,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/0x0/640x560/435x359/918x842/0/11470314729907865979.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/0x0/60x60/435x359/918x842/0/11470314729907865979.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/0x0/120x120/435x359/918x842/0/11470314729907865979.jpg\",\"original\":\"https://k1.okccdn.com/php/load_okc_image.php/images/435x359/918x842/0/11470314729907865979.jpg\"},\"base_path\":\"435x359/918x842/2/11470314729907865979.jpg\",\"original_size\":{\"width\":1161,\"height\":890},\"ordinal\":0,\"id\":\"11470314729907865979\",\"crop_rect\":{\"height\":483,\"y\":359,\"width\":483,\"x\":435},\"caption\":\"With friends, heading to a wedding\",\"thumb_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/640x560/640x560/435x359/918x842/2/11470314729907865979.jpg\",\"desktop_match\":\"https://k3.okccdn.com/php/load_okc_image.php/images/400x400/400x400/435x359/918x842/2/11470314729907865979.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/60x60/60x60/435x359/918x842/2/11470314729907865979.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/120x120/120x120/435x359/918x842/2/11470314729907865979.jpg\"}},\"state_name\":\"New York\",\"age\":34,\"country_code\":\"US\",\"friend\":8078,\"is_online\":0,\"username\":\"laurier444\",\"city_name\":\"New York\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":0,\"relative\":50,\"last_login\":1437581743,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"New York\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"6133639666967585715\",\"match\":8299,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x74/963x1036/0/3778412267611062505.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x74/963x1036/0/3778412267611062505.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x74/963x1036/0/3778412267611062505.jpg\",\"original\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x74/963x1036/0/3778412267611062505.jpg\"},\"base_path\":\"0x74/963x1036/2/3778412267611062505.jpg\",\"original_size\":{\"width\":960,\"height\":1280},\"ordinal\":0,\"id\":\"3778412267611062505\",\"crop_rect\":{\"height\":962,\"y\":74,\"width\":963,\"x\":0},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x74/963x1036/2/3778412267611062505.jpg\",\"desktop_match\":\"https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x74/963x1036/2/3778412267611062505.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x74/963x1036/2/3778412267611062505.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x74/963x1036/2/3778412267611062505.jpg\"}},\"state_name\":\"New York\",\"age\":30,\"country_code\":\"US\",\"friend\":8572,\"is_online\":0,\"username\":\"dogsrthebest2\",\"city_name\":\"New York\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1462,\"relative\":50,\"last_login\":1437587475,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Hoboken\",\"country_name\":\"United States\",\"state_name\":\"New Jersey\",\"state_code\":\"NJ\"},\"userid\":\"3014804675445885806\",\"match\":7842,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NJ\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/30x0/480x480/0/10762055864469013108.jpg\",\"small\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/30x0/480x480/0/10762055864469013108.jpg\",\"medium\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/30x0/480x480/0/10762055864469013108.jpg\",\"original\":\"https://k2.okccdn.com/php/load_okc_image.php/images/30x0/480x480/0/10762055864469013108.jpg\"},\"base_path\":\"30x0/480x480/2/10762055864469013108.jpg\",\"original_size\":{\"width\":480,\"height\":640},\"ordinal\":0,\"id\":\"10762055864469013108\",\"crop_rect\":{\"height\":480,\"y\":0,\"width\":450,\"x\":30},\"caption\":\"After my brothers wedding! 5/11/14\",\"thumb_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/30x0/480x480/2/10762055864469013108.jpg\",\"desktop_match\":\"https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/30x0/480x480/2/10762055864469013108.jpg\",\"small\":\"https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/30x0/480x480/2/10762055864469013108.jpg\",\"medium\":\"https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/30x0/480x480/2/10762055864469013108.jpg\"}},\"state_name\":\"New Jersey\",\"age\":28,\"country_code\":\"US\",\"friend\":7476,\"is_online\":1,\"username\":\"IMTelacrazy\",\"city_name\":\"Hoboken\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1356,\"relative\":50,\"last_login\":1437578534,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Cambridge\",\"country_name\":\"United States\",\"state_name\":\"Massachusetts\",\"state_code\":\"MA\"},\"userid\":\"8915649909105402866\",\"match\":8470,\"gender_tags\":[],\"liked\":false,\"state_code\":\"MA\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x16/540x556/0/13967617213372248498.jpg\",\"small\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x16/540x556/0/13967617213372248498.jpg\",\"medium\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x16/540x556/0/13967617213372248498.jpg\",\"original\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x16/540x556/0/13967617213372248498.jpg\"},\"base_path\":\"0x16/540x556/2/13967617213372248498.jpg\",\"original_size\":{\"width\":540,\"height\":720},\"ordinal\":0,\"id\":\"13967617213372248498\",\"crop_rect\":{\"height\":540,\"y\":16,\"width\":540,\"x\":0},\"caption\":\"I clean up alright every now and then\",\"thumb_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x16/540x556/2/13967617213372248498.jpg\",\"desktop_match\":\"https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x16/540x556/2/13967617213372248498.jpg\",\"small\":\"https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x16/540x556/2/13967617213372248498.jpg\",\"medium\":\"https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x16/540x556/2/13967617213372248498.jpg\"}},\"state_name\":\"Massachusetts\",\"age\":31,\"country_code\":\"US\",\"friend\":7337,\"is_online\":0,\"username\":\"elcirocks\",\"city_name\":\"Cambridge\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1345,\"relative\":50,\"last_login\":1437564568,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"New York\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"5692975307008002981\",\"match\":8281,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/360x203/720x563/0/6415677886685415332.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/360x203/720x563/0/6415677886685415332.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/360x203/720x563/0/6415677886685415332.jpg\",\"original\":\"https://k3.okccdn.com/php/load_okc_image.php/images/360x203/720x563/0/6415677886685415332.jpg\"},\"base_path\":\"360x203/720x563/2/6415677886685415332.jpg\",\"original_size\":{\"width\":720,\"height\":960},\"ordinal\":0,\"id\":\"6415677886685415332\",\"crop_rect\":{\"height\":360,\"y\":203,\"width\":360,\"x\":360},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/360x203/720x563/2/6415677886685415332.jpg\",\"desktop_match\":\"https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/360x203/720x563/2/6415677886685415332.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/360x203/720x563/2/6415677886685415332.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/360x203/720x563/2/6415677886685415332.jpg\"}},\"state_name\":\"New York\",\"age\":33,\"country_code\":\"US\",\"friend\":8202,\"is_online\":0,\"username\":\"NHLDucksFan\",\"city_name\":\"New York\",\"stoplight_color\":\"yellow\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":254,\"relative\":50,\"last_login\":1437171704,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Bronx\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"3995468722806991988\",\"match\":7255,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x78/843x921/0/4730617363509892489.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x78/843x921/0/4730617363509892489.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x78/843x921/0/4730617363509892489.jpg\",\"original\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x78/843x921/0/4730617363509892489.jpg\"},\"base_path\":\"0x78/843x921/2/4730617363509892489.jpg\",\"original_size\":{\"width\":843,\"height\":1500},\"ordinal\":0,\"id\":\"4730617363509892489\",\"crop_rect\":{\"height\":843,\"y\":78,\"width\":843,\"x\":0},\"caption\":\"posing for the camera acting silly.\",\"thumb_paths\":{\"large\":\"https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x78/843x921/2/4730617363509892489.jpg\",\"desktop_match\":\"https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x78/843x921/2/4730617363509892489.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x78/843x921/2/4730617363509892489.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x78/843x921/2/4730617363509892489.jpg\"}},\"state_name\":\"New York\",\"age\":30,\"country_code\":\"US\",\"friend\":4708,\"is_online\":0,\"username\":\"rudegurl-tammy\",\"city_name\":\"Bronx\",\"stoplight_color\":\"green\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1536,\"relative\":706855871,\"last_login\":1437488408,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"New York\",\"country_name\":\"United States\",\"state_name\":\"New York\",\"state_code\":\"NY\"},\"userid\":\"9826720976793645487\",\"match\":7367,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NY\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/65x23/486x443/0/4546273286148734224.jpg\",\"small\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/65x23/486x443/0/4546273286148734224.jpg\",\"medium\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/65x23/486x443/0/4546273286148734224.jpg\",\"original\":\"https://k2.okccdn.com/php/load_okc_image.php/images/65x23/486x443/0/4546273286148734224.jpg\"},\"base_path\":\"65x23/486x443/2/4546273286148734224.jpg\",\"original_size\":{\"width\":527,\"height\":443},\"ordinal\":0,\"id\":\"4546273286148734224\",\"crop_rect\":{\"height\":420,\"y\":23,\"width\":421,\"x\":65},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/65x23/486x443/2/4546273286148734224.jpg\",\"desktop_match\":\"https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/65x23/486x443/2/4546273286148734224.jpg\",\"small\":\"https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/65x23/486x443/2/4546273286148734224.jpg\",\"medium\":\"https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/65x23/486x443/2/4546273286148734224.jpg\"}},\"state_name\":\"New York\",\"age\":25,\"country_code\":\"US\",\"friend\":6608,\"is_online\":0,\"username\":\"maci083\",\"city_name\":\"New York\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1960,\"relative\":805942023,\"last_login\":1437587040,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Jersey City\",\"country_name\":\"United States\",\"state_name\":\"New Jersey\",\"state_code\":\"NJ\"},\"userid\":\"14054430997472145611\",\"match\":9102,\"gender_tags\":[],\"liked\":false,\"state_code\":\"NJ\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x161/960x1122/0/3870224250724088721.jpg\",\"small\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x161/960x1122/0/3870224250724088721.jpg\",\"medium\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x161/960x1122/0/3870224250724088721.jpg\",\"original\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x161/960x1122/0/3870224250724088721.jpg\"},\"base_path\":\"0x161/960x1122/2/3870224250724088721.jpg\",\"original_size\":{\"width\":960,\"height\":1280},\"ordinal\":0,\"id\":\"3870224250724088721\",\"crop_rect\":{\"height\":961,\"y\":161,\"width\":960,\"x\":0},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x161/960x1122/2/3870224250724088721.jpg\",\"desktop_match\":\"https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x161/960x1122/2/3870224250724088721.jpg\",\"small\":\"https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x161/960x1122/2/3870224250724088721.jpg\",\"medium\":\"https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x161/960x1122/2/3870224250724088721.jpg\"}},\"state_name\":\"New Jersey\",\"age\":29,\"country_code\":\"US\",\"friend\":7071,\"is_online\":1,\"username\":\"AK_1030\",\"city_name\":\"Jersey City\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1194,\"relative\":50,\"last_login\":1437576193,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Washington\",\"country_name\":\"United States\",\"state_name\":\"District of Columbia\",\"state_code\":\"DC\"},\"userid\":\"8040121007494931842\",\"match\":7790,\"gender_tags\":[],\"liked\":false,\"state_code\":\"DC\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x0/960x639/0/16049954187583106633.jpg\",\"small\":\"https://k1.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x0/960x639/0/16049954187583106633.jpg\",\"medium\":\"https://k1.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x0/960x639/0/16049954187583106633.jpg\",\"original\":\"https://k1.okccdn.com/php/load_okc_image.php/images/0x0/960x639/0/16049954187583106633.jpg\"},\"base_path\":\"0x0/960x639/2/16049954187583106633.jpg\",\"original_size\":{\"width\":960,\"height\":640},\"ordinal\":0,\"id\":\"16049954187583106633\",\"crop_rect\":{\"height\":639,\"y\":0,\"width\":960,\"x\":0},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x0/960x639/2/16049954187583106633.jpg\",\"desktop_match\":\"https://k3.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x0/960x639/2/16049954187583106633.jpg\",\"small\":\"https://k3.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x0/960x639/2/16049954187583106633.jpg\",\"medium\":\"https://k3.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x0/960x639/2/16049954187583106633.jpg\"}},\"state_name\":\"District of Columbia\",\"age\":33,\"country_code\":\"US\",\"friend\":5282,\"is_online\":0,\"username\":\"MayFlowers33\",\"city_name\":\"Washington\",\"stoplight_color\":\"yellow\",\"last_contact_time\":[0,0],\"orientation_tags\":[]},{\"enemy\":1518,\"relative\":20514,\"last_login\":1437182259,\"gender\":2,\"location\":{\"country_code\":\"US\",\"city_name\":\"Boston\",\"country_name\":\"United States\",\"state_name\":\"Massachusetts\",\"state_code\":\"MA\"},\"userid\":\"17937300709998810278\",\"match\":7476,\"gender_tags\":[],\"liked\":false,\"state_code\":\"MA\",\"orientation\":1,\"country_name\":\"United States\",\"photo\":{\"full_paths\":{\"large\":\"https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/32x0/584x552/0/16732725548097323342.jpg\",\"small\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/32x0/584x552/0/16732725548097323342.jpg\",\"medium\":\"https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/32x0/584x552/0/16732725548097323342.jpg\",\"original\":\"https://k2.okccdn.com/php/load_okc_image.php/images/32x0/584x552/0/16732725548097323342.jpg\"},\"base_path\":\"32x0/584x552/2/16732725548097323342.jpg\",\"original_size\":{\"width\":640,\"height\":552},\"ordinal\":0,\"id\":\"16732725548097323342\",\"crop_rect\":{\"height\":552,\"y\":0,\"width\":552,\"x\":32},\"caption\":\"\",\"thumb_paths\":{\"large\":\"https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/32x0/584x552/2/16732725548097323342.jpg\",\"desktop_match\":\"https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/32x0/584x552/2/16732725548097323342.jpg\",\"small\":\"https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/32x0/584x552/2/16732725548097323342.jpg\",\"medium\":\"https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/32x0/584x552/2/16732725548097323342.jpg\"}},\"state_name\":\"Massachusetts\",\"age\":29,\"country_code\":\"US\",\"friend\":8255,\"is_online\":0,\"username\":\"_The_Seaward_\",\"city_name\":\"Boston\",\"stoplight_color\":\"red\",\"last_contact_time\":[0,0],\"orientation_tags\":[]}],\"paging\":{\"cursors\":{\"before\":\"MTI4MDI2NTA1OTUyODQ1NDM5MywwLDE4\",\"current\":\"MTI4MDI2NTA1OTUyODQ1NDM5MywwLDE4\",\"after\":\"MTI4MDI2NTA1OTUyODQ1NDM5MywxOCwxOA==\"}}}"

/*
{
  "total_matches": 1000,
  "data": [
    {
      "enemy": 834,
      "relative": 0,
      "last_login": 1437583808,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Brooklyn",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "5592586755333955055",
      "match": 8715,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/36x36/684x684/0/15743311334557165678.jpg",
          "small": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/36x36/684x684/0/15743311334557165678.jpg",
          "medium": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/36x36/684x684/0/15743311334557165678.jpg",
          "original": "https://k2.okccdn.com/php/load_okc_image.php/images/36x36/684x684/0/15743311334557165678.jpg"
        },
        "base_path": "36x36/684x684/2/15743311334557165678.jpg",
        "original_size": {
          "width": 720,
          "height": 720
        },
        "ordinal": 0,
        "id": "15743311334557165678",
        "crop_rect": {
          "height": 648,
          "y": 36,
          "width": 648,
          "x": 36
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/36x36/684x684/2/15743311334557165678.jpg",
          "desktop_match": "https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/36x36/684x684/2/15743311334557165678.jpg",
          "small": "https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/36x36/684x684/2/15743311334557165678.jpg",
          "medium": "https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/36x36/684x684/2/15743311334557165678.jpg"
        }
      },
      "state_name": "New York",
      "age": 27,
      "country_code": "US",
      "friend": 8099,
      "is_online": 0,
      "username": "bklyn2356",
      "city_name": "Brooklyn",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 326,
      "relative": 3944461840,
      "last_login": 1437577735,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "New York",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "14198951291558879718",
      "match": 8278,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/104x25/536x457/0/10178684053924437512.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/104x25/536x457/0/10178684053924437512.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/104x25/536x457/0/10178684053924437512.jpg",
          "original": "https://k3.okccdn.com/php/load_okc_image.php/images/104x25/536x457/0/10178684053924437512.jpg"
        },
        "base_path": "104x25/536x457/2/10178684053924437512.jpg",
        "original_size": {
          "width": 640,
          "height": 480
        },
        "ordinal": 0,
        "id": "10178684053924437512",
        "crop_rect": {
          "height": 432,
          "y": 25,
          "width": 432,
          "x": 104
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/104x25/536x457/2/10178684053924437512.jpg",
          "desktop_match": "https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/104x25/536x457/2/10178684053924437512.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/104x25/536x457/2/10178684053924437512.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/104x25/536x457/2/10178684053924437512.jpg"
        }
      },
      "state_name": "New York",
      "age": 24,
      "country_code": "US",
      "friend": 0,
      "is_online": 0,
      "username": "strwbrryasaurus",
      "city_name": "New York",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1379,
      "relative": 50,
      "last_login": 1437542875,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Brooklyn",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "647377517720666689",
      "match": 9046,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/0x0/640x560/200x277/539x616/0/18270683582928918373.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/0x0/60x60/200x277/539x616/0/18270683582928918373.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/0x0/120x120/200x277/539x616/0/18270683582928918373.jpg",
          "original": "https://k1.okccdn.com/php/load_okc_image.php/images/200x277/539x616/0/18270683582928918373.jpg"
        },
        "base_path": "200x277/539x616/2/18270683582928918373.jpg",
        "original_size": {
          "width": 540,
          "height": 960
        },
        "ordinal": 0,
        "id": "18270683582928918373",
        "crop_rect": {
          "height": 339,
          "y": 277,
          "width": 339,
          "x": 200
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/640x560/640x560/200x277/539x616/2/18270683582928918373.jpg",
          "desktop_match": "https://k3.okccdn.com/php/load_okc_image.php/images/400x400/400x400/200x277/539x616/2/18270683582928918373.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/60x60/60x60/200x277/539x616/2/18270683582928918373.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/120x120/120x120/200x277/539x616/2/18270683582928918373.jpg"
        }
      },
      "state_name": "New York",
      "age": 29,
      "country_code": "US",
      "friend": 7177,
      "is_online": 0,
      "username": "samam15",
      "city_name": "Brooklyn",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1326,
      "relative": 50,
      "last_login": 1437454459,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Astoria",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "13695319409968531382",
      "match": 9341,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x183/1124x1308/0/14329908652703642980.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x183/1124x1308/0/14329908652703642980.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x183/1124x1308/0/14329908652703642980.jpg",
          "original": "https://k3.okccdn.com/php/load_okc_image.php/images/0x183/1124x1308/0/14329908652703642980.jpg"
        },
        "base_path": "0x183/1124x1308/2/14329908652703642980.jpg",
        "original_size": {
          "width": 1125,
          "height": 1500
        },
        "ordinal": 0,
        "id": "14329908652703642980",
        "crop_rect": {
          "height": 1125,
          "y": 183,
          "width": 1124,
          "x": 0
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x183/1124x1308/2/14329908652703642980.jpg",
          "desktop_match": "https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x183/1124x1308/2/14329908652703642980.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x183/1124x1308/2/14329908652703642980.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x183/1124x1308/2/14329908652703642980.jpg"
        }
      },
      "state_name": "New York",
      "age": 35,
      "country_code": "US",
      "friend": 7713,
      "is_online": 0,
      "username": "Vanessa1245",
      "city_name": "Astoria",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1294,
      "relative": 50,
      "last_login": 1437579109,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Brooklyn",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "13823341183278947251",
      "match": 7612,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 3,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x0/960x960/0/13053897257851448454.jpg",
          "small": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x0/960x960/0/13053897257851448454.jpg",
          "medium": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x0/960x960/0/13053897257851448454.jpg",
          "original": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/960x960/0/13053897257851448454.jpg"
        },
        "base_path": "0x0/960x960/2/13053897257851448454.jpg",
        "original_size": {
          "width": 960,
          "height": 960
        },
        "ordinal": 0,
        "id": "13053897257851448454",
        "crop_rect": {
          "height": 960,
          "y": 0,
          "width": 960,
          "x": 0
        },
        "caption": "My baby. I sleep and dine with this baby.",
        "thumb_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x0/960x960/2/13053897257851448454.jpg",
          "desktop_match": "https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x0/960x960/2/13053897257851448454.jpg",
          "small": "https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x0/960x960/2/13053897257851448454.jpg",
          "medium": "https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x0/960x960/2/13053897257851448454.jpg"
        }
      },
      "state_name": "New York",
      "age": 24,
      "country_code": "US",
      "friend": 7820,
      "is_online": 0,
      "username": "mathildapurr",
      "city_name": "Brooklyn",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 554,
      "relative": 350125729,
      "last_login": 1437442703,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "New York",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "211776112024388806",
      "match": 8933,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/424x162/817x555/0/5166655670501885761.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/424x162/817x555/0/5166655670501885761.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/424x162/817x555/0/5166655670501885761.jpg",
          "original": "https://k3.okccdn.com/php/load_okc_image.php/images/424x162/817x555/0/5166655670501885761.jpg"
        },
        "base_path": "424x162/817x555/2/5166655670501885761.jpg",
        "original_size": {
          "width": 960,
          "height": 720
        },
        "ordinal": 0,
        "id": "5166655670501885761",
        "crop_rect": {
          "height": 393,
          "y": 162,
          "width": 393,
          "x": 424
        },
        "caption": "my sister. we look nothing alike! what do you think?",
        "thumb_paths": {
          "large": "https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/424x162/817x555/2/5166655670501885761.jpg",
          "desktop_match": "https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/424x162/817x555/2/5166655670501885761.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/424x162/817x555/2/5166655670501885761.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/424x162/817x555/2/5166655670501885761.jpg"
        }
      },
      "state_name": "New York",
      "age": 27,
      "country_code": "US",
      "friend": 7384,
      "is_online": 0,
      "username": "vugen221",
      "city_name": "New York",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 630,
      "relative": 5082668,
      "last_login": 1437449049,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Brooklyn",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "3674519450479413927",
      "match": 8064,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k1.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x186/1124x1311/0/3987406159091418898.jpg",
          "small": "https://k0.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x186/1124x1311/0/3987406159091418898.jpg",
          "medium": "https://k0.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x186/1124x1311/0/3987406159091418898.jpg",
          "original": "https://k0.okccdn.com/php/load_okc_image.php/images/0x186/1124x1311/0/3987406159091418898.jpg"
        },
        "base_path": "0x186/1124x1311/2/3987406159091418898.jpg",
        "original_size": {
          "width": 1125,
          "height": 1500
        },
        "ordinal": 0,
        "id": "3987406159091418898",
        "crop_rect": {
          "height": 1125,
          "y": 186,
          "width": 1124,
          "x": 0
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k2.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x186/1124x1311/2/3987406159091418898.jpg",
          "desktop_match": "https://k2.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x186/1124x1311/2/3987406159091418898.jpg",
          "small": "https://k2.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x186/1124x1311/2/3987406159091418898.jpg",
          "medium": "https://k2.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x186/1124x1311/2/3987406159091418898.jpg"
        }
      },
      "state_name": "New York",
      "age": 31,
      "country_code": "US",
      "friend": 7317,
      "is_online": 0,
      "username": "KW706",
      "city_name": "Brooklyn",
      "stoplight_color": "green",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1833,
      "relative": 3839550144,
      "last_login": 1437500741,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Washington",
        "country_name": "United States",
        "state_name": "District of Columbia",
        "state_code": "DC"
      },
      "userid": "10554146310980829648",
      "match": 8089,
      "gender_tags": [],
      "liked": false,
      "state_code": "DC",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x0/0x0/0/17436090354355705210.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x0/0x0/0/17436090354355705210.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x0/0x0/0/17436090354355705210.jpg",
          "original": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/0x0/0/17436090354355705210.jpg"
        },
        "base_path": "0x0/0x0/2/17436090354355705210.jpg",
        "original_size": {
          "width": 960,
          "height": 1280
        },
        "ordinal": 0,
        "id": "17436090354355705210",
        "crop_rect": {
          "height": 0,
          "y": 0,
          "width": 0,
          "x": 0
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x0/0x0/2/17436090354355705210.jpg",
          "desktop_match": "https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x0/0x0/2/17436090354355705210.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x0/0x0/2/17436090354355705210.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x0/0x0/2/17436090354355705210.jpg"
        }
      },
      "state_name": "District of Columbia",
      "age": 26,
      "country_code": "US",
      "friend": 6315,
      "is_online": 0,
      "username": "LaurenMindy",
      "city_name": "Washington",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 854,
      "relative": 50,
      "last_login": 1437572337,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "New York",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "8847347935728113448",
      "match": 8653,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/0x0/640x560/435x359/918x842/0/11470314729907865979.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/0x0/60x60/435x359/918x842/0/11470314729907865979.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/0x0/120x120/435x359/918x842/0/11470314729907865979.jpg",
          "original": "https://k1.okccdn.com/php/load_okc_image.php/images/435x359/918x842/0/11470314729907865979.jpg"
        },
        "base_path": "435x359/918x842/2/11470314729907865979.jpg",
        "original_size": {
          "width": 1161,
          "height": 890
        },
        "ordinal": 0,
        "id": "11470314729907865979",
        "crop_rect": {
          "height": 483,
          "y": 359,
          "width": 483,
          "x": 435
        },
        "caption": "With friends, heading to a wedding",
        "thumb_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/640x560/640x560/435x359/918x842/2/11470314729907865979.jpg",
          "desktop_match": "https://k3.okccdn.com/php/load_okc_image.php/images/400x400/400x400/435x359/918x842/2/11470314729907865979.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/60x60/60x60/435x359/918x842/2/11470314729907865979.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/120x120/120x120/435x359/918x842/2/11470314729907865979.jpg"
        }
      },
      "state_name": "New York",
      "age": 34,
      "country_code": "US",
      "friend": 8078,
      "is_online": 0,
      "username": "laurier444",
      "city_name": "New York",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 0,
      "relative": 50,
      "last_login": 1437581743,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "New York",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "6133639666967585715",
      "match": 8299,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x74/963x1036/0/3778412267611062505.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x74/963x1036/0/3778412267611062505.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x74/963x1036/0/3778412267611062505.jpg",
          "original": "https://k3.okccdn.com/php/load_okc_image.php/images/0x74/963x1036/0/3778412267611062505.jpg"
        },
        "base_path": "0x74/963x1036/2/3778412267611062505.jpg",
        "original_size": {
          "width": 960,
          "height": 1280
        },
        "ordinal": 0,
        "id": "3778412267611062505",
        "crop_rect": {
          "height": 962,
          "y": 74,
          "width": 963,
          "x": 0
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x74/963x1036/2/3778412267611062505.jpg",
          "desktop_match": "https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x74/963x1036/2/3778412267611062505.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x74/963x1036/2/3778412267611062505.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x74/963x1036/2/3778412267611062505.jpg"
        }
      },
      "state_name": "New York",
      "age": 30,
      "country_code": "US",
      "friend": 8572,
      "is_online": 0,
      "username": "dogsrthebest2",
      "city_name": "New York",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1462,
      "relative": 50,
      "last_login": 1437587475,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Hoboken",
        "country_name": "United States",
        "state_name": "New Jersey",
        "state_code": "NJ"
      },
      "userid": "3014804675445885806",
      "match": 7842,
      "gender_tags": [],
      "liked": false,
      "state_code": "NJ",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/30x0/480x480/0/10762055864469013108.jpg",
          "small": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/30x0/480x480/0/10762055864469013108.jpg",
          "medium": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/30x0/480x480/0/10762055864469013108.jpg",
          "original": "https://k2.okccdn.com/php/load_okc_image.php/images/30x0/480x480/0/10762055864469013108.jpg"
        },
        "base_path": "30x0/480x480/2/10762055864469013108.jpg",
        "original_size": {
          "width": 480,
          "height": 640
        },
        "ordinal": 0,
        "id": "10762055864469013108",
        "crop_rect": {
          "height": 480,
          "y": 0,
          "width": 450,
          "x": 30
        },
        "caption": "After my brothers wedding! 5/11/14",
        "thumb_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/30x0/480x480/2/10762055864469013108.jpg",
          "desktop_match": "https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/30x0/480x480/2/10762055864469013108.jpg",
          "small": "https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/30x0/480x480/2/10762055864469013108.jpg",
          "medium": "https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/30x0/480x480/2/10762055864469013108.jpg"
        }
      },
      "state_name": "New Jersey",
      "age": 28,
      "country_code": "US",
      "friend": 7476,
      "is_online": 1,
      "username": "IMTelacrazy",
      "city_name": "Hoboken",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1356,
      "relative": 50,
      "last_login": 1437578534,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Cambridge",
        "country_name": "United States",
        "state_name": "Massachusetts",
        "state_code": "MA"
      },
      "userid": "8915649909105402866",
      "match": 8470,
      "gender_tags": [],
      "liked": false,
      "state_code": "MA",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x16/540x556/0/13967617213372248498.jpg",
          "small": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x16/540x556/0/13967617213372248498.jpg",
          "medium": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x16/540x556/0/13967617213372248498.jpg",
          "original": "https://k2.okccdn.com/php/load_okc_image.php/images/0x16/540x556/0/13967617213372248498.jpg"
        },
        "base_path": "0x16/540x556/2/13967617213372248498.jpg",
        "original_size": {
          "width": 540,
          "height": 720
        },
        "ordinal": 0,
        "id": "13967617213372248498",
        "crop_rect": {
          "height": 540,
          "y": 16,
          "width": 540,
          "x": 0
        },
        "caption": "I clean up alright every now and then",
        "thumb_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x16/540x556/2/13967617213372248498.jpg",
          "desktop_match": "https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x16/540x556/2/13967617213372248498.jpg",
          "small": "https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x16/540x556/2/13967617213372248498.jpg",
          "medium": "https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x16/540x556/2/13967617213372248498.jpg"
        }
      },
      "state_name": "Massachusetts",
      "age": 31,
      "country_code": "US",
      "friend": 7337,
      "is_online": 0,
      "username": "elcirocks",
      "city_name": "Cambridge",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1345,
      "relative": 50,
      "last_login": 1437564568,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "New York",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "5692975307008002981",
      "match": 8281,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/360x203/720x563/0/6415677886685415332.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/360x203/720x563/0/6415677886685415332.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/360x203/720x563/0/6415677886685415332.jpg",
          "original": "https://k3.okccdn.com/php/load_okc_image.php/images/360x203/720x563/0/6415677886685415332.jpg"
        },
        "base_path": "360x203/720x563/2/6415677886685415332.jpg",
        "original_size": {
          "width": 720,
          "height": 960
        },
        "ordinal": 0,
        "id": "6415677886685415332",
        "crop_rect": {
          "height": 360,
          "y": 203,
          "width": 360,
          "x": 360
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/360x203/720x563/2/6415677886685415332.jpg",
          "desktop_match": "https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/360x203/720x563/2/6415677886685415332.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/360x203/720x563/2/6415677886685415332.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/360x203/720x563/2/6415677886685415332.jpg"
        }
      },
      "state_name": "New York",
      "age": 33,
      "country_code": "US",
      "friend": 8202,
      "is_online": 0,
      "username": "NHLDucksFan",
      "city_name": "New York",
      "stoplight_color": "yellow",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 254,
      "relative": 50,
      "last_login": 1437171704,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Bronx",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "3995468722806991988",
      "match": 7255,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x78/843x921/0/4730617363509892489.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x78/843x921/0/4730617363509892489.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x78/843x921/0/4730617363509892489.jpg",
          "original": "https://k3.okccdn.com/php/load_okc_image.php/images/0x78/843x921/0/4730617363509892489.jpg"
        },
        "base_path": "0x78/843x921/2/4730617363509892489.jpg",
        "original_size": {
          "width": 843,
          "height": 1500
        },
        "ordinal": 0,
        "id": "4730617363509892489",
        "crop_rect": {
          "height": 843,
          "y": 78,
          "width": 843,
          "x": 0
        },
        "caption": "posing for the camera acting silly.",
        "thumb_paths": {
          "large": "https://k1.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x78/843x921/2/4730617363509892489.jpg",
          "desktop_match": "https://k1.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x78/843x921/2/4730617363509892489.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x78/843x921/2/4730617363509892489.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x78/843x921/2/4730617363509892489.jpg"
        }
      },
      "state_name": "New York",
      "age": 30,
      "country_code": "US",
      "friend": 4708,
      "is_online": 0,
      "username": "rudegurl-tammy",
      "city_name": "Bronx",
      "stoplight_color": "green",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1536,
      "relative": 706855871,
      "last_login": 1437488408,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "New York",
        "country_name": "United States",
        "state_name": "New York",
        "state_code": "NY"
      },
      "userid": "9826720976793645487",
      "match": 7367,
      "gender_tags": [],
      "liked": false,
      "state_code": "NY",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/65x23/486x443/0/4546273286148734224.jpg",
          "small": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/65x23/486x443/0/4546273286148734224.jpg",
          "medium": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/65x23/486x443/0/4546273286148734224.jpg",
          "original": "https://k2.okccdn.com/php/load_okc_image.php/images/65x23/486x443/0/4546273286148734224.jpg"
        },
        "base_path": "65x23/486x443/2/4546273286148734224.jpg",
        "original_size": {
          "width": 527,
          "height": 443
        },
        "ordinal": 0,
        "id": "4546273286148734224",
        "crop_rect": {
          "height": 420,
          "y": 23,
          "width": 421,
          "x": 65
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/65x23/486x443/2/4546273286148734224.jpg",
          "desktop_match": "https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/65x23/486x443/2/4546273286148734224.jpg",
          "small": "https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/65x23/486x443/2/4546273286148734224.jpg",
          "medium": "https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/65x23/486x443/2/4546273286148734224.jpg"
        }
      },
      "state_name": "New York",
      "age": 25,
      "country_code": "US",
      "friend": 6608,
      "is_online": 0,
      "username": "maci083",
      "city_name": "New York",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1960,
      "relative": 805942023,
      "last_login": 1437587040,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Jersey City",
        "country_name": "United States",
        "state_name": "New Jersey",
        "state_code": "NJ"
      },
      "userid": "14054430997472145611",
      "match": 9102,
      "gender_tags": [],
      "liked": false,
      "state_code": "NJ",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x161/960x1122/0/3870224250724088721.jpg",
          "small": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x161/960x1122/0/3870224250724088721.jpg",
          "medium": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x161/960x1122/0/3870224250724088721.jpg",
          "original": "https://k2.okccdn.com/php/load_okc_image.php/images/0x161/960x1122/0/3870224250724088721.jpg"
        },
        "base_path": "0x161/960x1122/2/3870224250724088721.jpg",
        "original_size": {
          "width": 960,
          "height": 1280
        },
        "ordinal": 0,
        "id": "3870224250724088721",
        "crop_rect": {
          "height": 961,
          "y": 161,
          "width": 960,
          "x": 0
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x161/960x1122/2/3870224250724088721.jpg",
          "desktop_match": "https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x161/960x1122/2/3870224250724088721.jpg",
          "small": "https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x161/960x1122/2/3870224250724088721.jpg",
          "medium": "https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x161/960x1122/2/3870224250724088721.jpg"
        }
      },
      "state_name": "New Jersey",
      "age": 29,
      "country_code": "US",
      "friend": 7071,
      "is_online": 1,
      "username": "AK_1030",
      "city_name": "Jersey City",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1194,
      "relative": 50,
      "last_login": 1437576193,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Washington",
        "country_name": "United States",
        "state_name": "District of Columbia",
        "state_code": "DC"
      },
      "userid": "8040121007494931842",
      "match": 7790,
      "gender_tags": [],
      "liked": false,
      "state_code": "DC",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/0x0/640x560/0x0/960x639/0/16049954187583106633.jpg",
          "small": "https://k1.okccdn.com/php/load_okc_image.php/images/0x0/60x60/0x0/960x639/0/16049954187583106633.jpg",
          "medium": "https://k1.okccdn.com/php/load_okc_image.php/images/0x0/120x120/0x0/960x639/0/16049954187583106633.jpg",
          "original": "https://k1.okccdn.com/php/load_okc_image.php/images/0x0/960x639/0/16049954187583106633.jpg"
        },
        "base_path": "0x0/960x639/2/16049954187583106633.jpg",
        "original_size": {
          "width": 960,
          "height": 640
        },
        "ordinal": 0,
        "id": "16049954187583106633",
        "crop_rect": {
          "height": 639,
          "y": 0,
          "width": 960,
          "x": 0
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/640x560/640x560/0x0/960x639/2/16049954187583106633.jpg",
          "desktop_match": "https://k3.okccdn.com/php/load_okc_image.php/images/400x400/400x400/0x0/960x639/2/16049954187583106633.jpg",
          "small": "https://k3.okccdn.com/php/load_okc_image.php/images/60x60/60x60/0x0/960x639/2/16049954187583106633.jpg",
          "medium": "https://k3.okccdn.com/php/load_okc_image.php/images/120x120/120x120/0x0/960x639/2/16049954187583106633.jpg"
        }
      },
      "state_name": "District of Columbia",
      "age": 33,
      "country_code": "US",
      "friend": 5282,
      "is_online": 0,
      "username": "MayFlowers33",
      "city_name": "Washington",
      "stoplight_color": "yellow",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    },
    {
      "enemy": 1518,
      "relative": 20514,
      "last_login": 1437182259,
      "gender": 2,
      "location": {
        "country_code": "US",
        "city_name": "Boston",
        "country_name": "United States",
        "state_name": "Massachusetts",
        "state_code": "MA"
      },
      "userid": "17937300709998810278",
      "match": 7476,
      "gender_tags": [],
      "liked": false,
      "state_code": "MA",
      "orientation": 1,
      "country_name": "United States",
      "photo": {
        "full_paths": {
          "large": "https://k3.okccdn.com/php/load_okc_image.php/images/0x0/640x560/32x0/584x552/0/16732725548097323342.jpg",
          "small": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/60x60/32x0/584x552/0/16732725548097323342.jpg",
          "medium": "https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/32x0/584x552/0/16732725548097323342.jpg",
          "original": "https://k2.okccdn.com/php/load_okc_image.php/images/32x0/584x552/0/16732725548097323342.jpg"
        },
        "base_path": "32x0/584x552/2/16732725548097323342.jpg",
        "original_size": {
          "width": 640,
          "height": 552
        },
        "ordinal": 0,
        "id": "16732725548097323342",
        "crop_rect": {
          "height": 552,
          "y": 0,
          "width": 552,
          "x": 32
        },
        "caption": "",
        "thumb_paths": {
          "large": "https://k0.okccdn.com/php/load_okc_image.php/images/640x560/640x560/32x0/584x552/2/16732725548097323342.jpg",
          "desktop_match": "https://k0.okccdn.com/php/load_okc_image.php/images/400x400/400x400/32x0/584x552/2/16732725548097323342.jpg",
          "small": "https://k0.okccdn.com/php/load_okc_image.php/images/60x60/60x60/32x0/584x552/2/16732725548097323342.jpg",
          "medium": "https://k0.okccdn.com/php/load_okc_image.php/images/120x120/120x120/32x0/584x552/2/16732725548097323342.jpg"
        }
      },
      "state_name": "Massachusetts",
      "age": 29,
      "country_code": "US",
      "friend": 8255,
      "is_online": 0,
      "username": "_The_Seaward_",
      "city_name": "Boston",
      "stoplight_color": "red",
      "last_contact_time": [
        0,
        0
      ],
      "orientation_tags": []
    }
  ],
  "paging": {
    "cursors": {
      "before": "MTI4MDI2NTA1OTUyODQ1NDM5MywwLDE4",
      "current": "MTI4MDI2NTA1OTUyODQ1NDM5MywwLDE4",
      "after": "MTI4MDI2NTA1OTUyODQ1NDM5MywxOCwxOA=="
    }
  }
}
 */
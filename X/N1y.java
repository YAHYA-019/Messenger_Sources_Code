package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Currency;

/* loaded from: N1y.class */
public abstract class N1y {
    public static final ImmutableMap A00;
    public static final ImmutableList A01;

    static {
        String[] strArr = new String[38];
        System.arraycopy(new String[]{"SEK", "CHF", "TWD", "THB", "TRY", "AED", "USD", "UYU", "VEF", "VND", "IQD"}, 1BK.A1W(new String[]{"EUR", "GTQ", "HNL", "HKD", "HUF", "ISK", "INR", "IDR", "ILS", "JPY", "KRW", "MOP", "MYR", "MXN", "NZD", "NIO", "NOK", "PYG", "PEN", "PHP", "PLN", "QAR", "RON", "RUB", "SAR", "SGD", "ZAR"}, strArr) ? 1 : 0, strArr, 27, 11);
        A01 = ImmutableList.of("ARS", "AUD", "BOB", "BRL", "GBP", "CAD", "CLP", "CNY", "COP", "CRC", "CZK", "DKK", strArr);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("ARS", ImmutableMap.of((Object) "iso", (Object) "ARS", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Argentine Peso"));
        builder.put("AUD", ImmutableMap.of((Object) "iso", (Object) "AUD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Australian Dollar"));
        builder.put("BHD", ImmutableMap.of((Object) "iso", (Object) "BHD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "د.ب.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Bahraini Dinar"));
        builder.put("BDT", ImmutableMap.of((Object) "iso", (Object) "BDT", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "৳", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) ""));
        builder.put("BOB", ImmutableMap.of((Object) "iso", (Object) "BOB", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Bs.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Bolivian Boliviano"));
        builder.put("BGN", ImmutableMap.of((Object) "iso", (Object) "BGN", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "лв.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Bulgarian Lev"));
        builder.put("BRL", ImmutableMap.of((Object) "iso", (Object) "BRL", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "R$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Brazilian Real"));
        builder.put("GBP", ImmutableMap.of((Object) "iso", (Object) "GBP", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "£", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "British Pound"));
        builder.put("CAD", ImmutableMap.of((Object) "iso", (Object) "CAD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Canadian Dollar"));
        builder.put("CLP", ImmutableMap.of((Object) "iso", (Object) "CLP", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Chilean Peso"));
        builder.put("CNY", ImmutableMap.of((Object) "iso", (Object) "CNY", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "￥", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Chinese Yuan"));
        builder.put("COP", ImmutableMap.of((Object) "iso", (Object) "COP", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Colombian Peso"));
        builder.put("CRC", ImmutableMap.of((Object) "iso", (Object) "CRC", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "₡", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Costa Rican Colon"));
        builder.put("HRK", ImmutableMap.of((Object) "iso", (Object) "HRK", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "kn", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Croatian Kuna"));
        builder.put("CZK", ImmutableMap.of((Object) "iso", (Object) "CZK", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Kč", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Czech Koruna"));
        builder.put("DKK", ImmutableMap.of((Object) "iso", (Object) "DKK", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "kr.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Danish Krone"));
        builder.put("EGP", ImmutableMap.of((Object) "iso", (Object) "EGP", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "ج.م.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Egyptian Pound"));
        builder.put("EUR", ImmutableMap.of((Object) "iso", (Object) "EUR", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "€", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Euro"));
        builder.put("GTQ", ImmutableMap.of((Object) "iso", (Object) "GTQ", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Q", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Guatemalan Quetzal"));
        builder.put("HNL", ImmutableMap.of((Object) "iso", (Object) "HNL", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "L.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Honduran Lempira"));
        builder.put("HKD", ImmutableMap.of((Object) "iso", (Object) "HKD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Hong Kong Dollar"));
        builder.put("HUF", ImmutableMap.of((Object) "iso", (Object) "HUF", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Ft", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Hungarian Forint"));
        builder.put("ISK", ImmutableMap.of((Object) "iso", (Object) "ISK", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "kr.", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Iceland Krona"));
        builder.put("INR", ImmutableMap.of((Object) "iso", (Object) "INR", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "₹", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Indian Rupee"));
        builder.put("IDR", ImmutableMap.of((Object) "iso", (Object) "IDR", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Rp", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Indonesian Rupiah"));
        builder.put("ILS", ImmutableMap.of((Object) "iso", (Object) "ILS", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "₪", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Israeli New Shekel"));
        builder.put("JPY", ImmutableMap.of((Object) "iso", (Object) "JPY", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "¥", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Japanese Yen"));
        builder.put("JOD", ImmutableMap.of((Object) "iso", (Object) "JOD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "د.ا.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Jordanian Dinar"));
        builder.put("KRW", ImmutableMap.of((Object) "iso", (Object) "KRW", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "₩", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Korean Won"));
        builder.put("LVL", ImmutableMap.of((Object) "iso", (Object) "LVL", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Ls", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Latvian Lats"));
        builder.put("LTL", ImmutableMap.of((Object) "iso", (Object) "LTL", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Lt", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Lithuanian Litas"));
        builder.put("MOP", ImmutableMap.of((Object) "iso", (Object) "MOP", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "MOP", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Macau Patacas"));
        builder.put("MYR", ImmutableMap.of((Object) "iso", (Object) "MYR", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "RM", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Malaysian Ringgit"));
        builder.put("MXN", ImmutableMap.of((Object) "iso", (Object) "MXN", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Mexican Peso"));
        builder.put("NZD", ImmutableMap.of((Object) "iso", (Object) "NZD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "New Zealand Dollar"));
        builder.put("NIO", ImmutableMap.of((Object) "iso", (Object) "NIO", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "C$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Nicaraguan Cordoba"));
        builder.put("NOK", ImmutableMap.of((Object) "iso", (Object) "NOK", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "kr", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Norwegian Krone"));
        builder.put("PYG", ImmutableMap.of((Object) "iso", (Object) "PYG", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "₲", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Paraguayan Guarani"));
        builder.put("PEN", ImmutableMap.of((Object) "iso", (Object) "PEN", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "S/", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Peruvian Nuevo Sol"));
        builder.put("PHP", ImmutableMap.of((Object) "iso", (Object) "PHP", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "₱", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Philippine Peso"));
        builder.put("PLN", ImmutableMap.of((Object) "iso", (Object) "PLN", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "zł", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Polish Zloty"));
        builder.put("QAR", ImmutableMap.of((Object) "iso", (Object) "QAR", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "ر.ق.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Qatari Rials"));
        builder.put("RON", ImmutableMap.of((Object) "iso", (Object) "RON", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "lei", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Romanian Leu"));
        builder.put("RUB", ImmutableMap.of((Object) "iso", (Object) "RUB", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "p.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Russian Ruble"));
        builder.put("SAR", ImmutableMap.of((Object) "iso", (Object) "SAR", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "ر.س.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Saudi Arabian Riyal"));
        builder.put("RSD", ImmutableMap.of((Object) "iso", (Object) "RSD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "RSD", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Serbian Dinar"));
        builder.put("SGD", ImmutableMap.of((Object) "iso", (Object) "SGD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Singapore Dollar"));
        builder.put("SKK", ImmutableMap.of((Object) "iso", (Object) "SKK", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Sk", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Slovak Koruna"));
        builder.put("ZAR", ImmutableMap.of((Object) "iso", (Object) "ZAR", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "R", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "South African Rand"));
        builder.put("SEK", ImmutableMap.of((Object) "iso", (Object) "SEK", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "kr", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Swedish Krona"));
        builder.put("CHF", ImmutableMap.of((Object) "iso", (Object) "CHF", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Fr.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Swiss Franc"));
        builder.put("TZS", ImmutableMap.of((Object) "iso", (Object) "TZS", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "TZS", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) ""));
        builder.put("TWD", ImmutableMap.of((Object) "iso", (Object) "TWD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "NT$", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Taiwan Dollar"));
        builder.put("THB", ImmutableMap.of((Object) "iso", (Object) "THB", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "฿", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Thai Baht"));
        builder.put("TRY", ImmutableMap.of((Object) "iso", (Object) "TRY", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "TL", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Turkish Lira"));
        builder.put("AED", ImmutableMap.of((Object) "iso", (Object) "AED", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "د.إ.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "UAE Dirham"));
        builder.put("UAH", ImmutableMap.of((Object) "iso", (Object) "UAH", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "грн.", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Ukrainian Hryvnia"));
        builder.put("USD", ImmutableMap.of((Object) "iso", (Object) "USD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "US Dollars"));
        builder.put("UYU", ImmutableMap.of((Object) "iso", (Object) "UYU", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$U", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Uruguay Peso"));
        builder.put("VEF", ImmutableMap.of((Object) "iso", (Object) "VEF", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Bs", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Venezuelan Bolivar"));
        builder.put("VND", ImmutableMap.of((Object) "iso", (Object) "VND", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "₫", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Vietnamese Dong"));
        builder.put("FBZ", ImmutableMap.of((Object) "iso", (Object) "FBZ", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "C", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "credits"));
        builder.put("IQD", ImmutableMap.of((Object) "iso", (Object) "IQD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "د.ع", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Iraqi Dinar"));
        builder.put("TND", ImmutableMap.of((Object) "iso", (Object) "TND", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "د.ت.", (Object) "offset", (Object) "1000", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Tunisian dinar"));
        builder.put("MMK", ImmutableMap.of((Object) "iso", (Object) "MMK", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Ks", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Burmese Kyat"));
        builder.put("NTD", ImmutableMap.of((Object) "iso", (Object) "NTD", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "$", (Object) "offset", (Object) ConstantsKt.CAMERA_ID_BACK, (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "New Taiwan Dollar"));
        builder.put("VEB", ImmutableMap.of((Object) "iso", (Object) "VEB", (Object) "format", (Object) "{CurrencyConstant.symbol}{amount}", (Object) "symbol", (Object) "Bs", (Object) "offset", (Object) "100", (Object) PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (Object) "Venezuelan Bolivar"));
        A00 = builder.build();
    }

    public static String A00(String str) {
        ImmutableMap immutableMap = A00;
        return (immutableMap != null && immutableMap.containsKey(str) && ((ImmutableMap) immutableMap.get(str)).containsKey("symbol")) ? (String) ((ImmutableMap) immutableMap.get(str)).get("symbol") : Currency.getInstance(str).getSymbol();
    }
}
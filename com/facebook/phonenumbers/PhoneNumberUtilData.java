package com.facebook.phonenumbers;

import com.facebook.acra.constants.ActionId;
import com.facebook.forker.Process;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: PhoneNumberUtilData.class */
public final class PhoneNumberUtilData {
    public final CountryCallingCodeToRegionCodeTable mCountryCallingCodeToRegionCodeTable = new Object();
    public final RegionCodeToCountryCallingCodeMap mRegionCodeToCountryCallingCodeMap = new Object();
    public Map mRegionCodeToCountryCallingCodeMapAddendum;

    /* loaded from: PhoneNumberUtilData$CountryCallingCodeToRegionCodeTable.class */
    public final class CountryCallingCodeToRegionCodeTable {
        public static final short[] COUNTRY_CALLING_CODE_KEY_COLUMN = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 7, 20, 27, 30, 31, 32, 33, 34, 36, 39, 40, 41, 43, 44, 44, 44, 44, 45, 46, 47, 47, 48, 49, 51, 52, 53, 54, 55, 56, 57, 58, 60, 61, 61, 61, 62, 63, 64, 65, 66, 81, 82, 84, 86, 90, 91, 92, 93, 94, 95, 98, 211, 212, 212, 213, 216, 218, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 260, 261, 262, 262, 263, 264, 265, 266, 267, 268, 269, 290, 290, 291, 297, 298, 299, 350, 351, 352, 353, 354, 355, 356, 357, 358, 358, 359, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 385, 386, 387, 389, 420, 421, 423, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 590, 590, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 599, 670, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 685, 686, 687, 688, 689, 690, 691, 692, 800, 808, 850, 852, 853, 855, 856, 870, 878, 880, 881, 882, 883, 886, 888, 960, 961, 962, 963, 964, 965, 966, 967, 968, 970, 971, 972, 973, 974, 975, 976, 977, 979, 992, 993, 994, 995, 996, 998};
        public static final String[] REGION_CODE_VALUE_COLUMN;

        static {
            String[] strArr = new String[Process.SD_BLACK_HOLE];
            System.arraycopy(new String[]{"US", "AG", "AI", "AS", "BB", "BM", "BS", "CA", "DM", "DO", "GD", "GU", "JM", "KN", "KY", "LC", "MP", "MS", "PR", "SX", "TC", "TT", "VC", "VG", "VI", "RU", "KZ"}, 0, strArr, 0, 27);
            System.arraycopy(new String[]{"EG", "ZA", "GR", "NL", "BE", "FR", "ES", "HU", "IT", "RO", "CH", "AT", "GB", "GG", "IM", "JE", "DK", "SE", "NO", "SJ", "PL", "DE", "PE", "MX", "CU", "AR", "BR"}, 0, strArr, 27, 27);
            System.arraycopy(new String[]{"CL", "CO", "VE", "MY", "AU", "CC", "CX", "ID", "PH", "NZ", "SG", "TH", "JP", "KR", "VN", "CN", "TR", "IN", "PK", "AF", "LK", "MM", "IR", "SS", "MA", "EH", "DZ"}, 0, strArr, 54, 27);
            System.arraycopy(new String[]{"TN", "LY", "GM", "SN", "MR", "ML", "GN", "CI", "BF", "NE", "TG", "BJ", "MU", "LR", "SL", "GH", "NG", "TD", "CF", "CM", "CV", "ST", "GQ", "GA", "CG", "CD", "AO"}, 0, strArr, 81, 27);
            System.arraycopy(new String[]{"GW", "IO", "AC", "SC", "SD", "RW", "ET", "SO", "DJ", "KE", "TZ", "UG", "BI", "MZ", "ZM", "MG", "RE", "YT", "ZW", "NA", "MW", "LS", "BW", "SZ", "KM", "SH", "TA"}, 0, strArr, 108, 27);
            System.arraycopy(new String[]{"ER", "AW", "FO", "GL", "GI", "PT", "LU", "IE", "IS", "AL", "MT", "CY", "FI", "AX", "BG", "LT", "LV", "EE", "MD", "AM", "BY", "AD", "MC", "SM", "VA", "UA", "RS"}, 0, strArr, ActionId.MQTT_CONNECTING, 27);
            System.arraycopy(new String[]{"ME", "HR", "SI", "BA", "MK", "CZ", "SK", "LI", "FK", "BZ", "GT", "SV", "HN", "NI", "CR", "PA", "PM", "HT", "GP", "BL", "MF", "BO", "GY", "EC", "GF", "PY", "MQ"}, 0, strArr, ActionId.ASYNC_FAIL, 27);
            System.arraycopy(new String[]{"SR", "UY", "CW", "BQ", "TL", "NF", "BN", "NR", "PG", "TO", "SB", "VU", "FJ", "PW", "WF", "CK", "NU", "WS", "KI", "NC", "TV", "PF", "TK", "FM", "MH", "001", "001"}, 0, strArr, 189, 27);
            System.arraycopy(new String[]{"KP", "HK", "MO", "KH", "LA", "001", "001", "BD", "001", "001", "001", "TW", "001", "MV", "LB", "JO", "SY", "IQ", "KW", "SA", "YE", "OM", "PS", "AE", "IL", "BH", "QA"}, 0, strArr, 216, 27);
            System.arraycopy(new String[]{"BT", "MN", "NP", "001", "TJ", "TM", "AZ", "GE", "KG", "UZ"}, 0, strArr, 243, 10);
            REGION_CODE_VALUE_COLUMN = strArr;
        }
    }

    /* loaded from: PhoneNumberUtilData$RegionCodeToCountryCallingCodeMap.class */
    public final class RegionCodeToCountryCallingCodeMap {
        public static final short[] COUNTRY_CALLING_CODE_VALUE_COLUMN;
        public static final String[] REGION_CODE_KEY_COLUMN;

        static {
            String[] strArr = new String[244];
            System.arraycopy(new String[]{"AC", "AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AR", "AS", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM"}, 0, strArr, 0, 27);
            System.arraycopy(new String[]{"BN", "BO", "BQ", "BR", "BS", "BT", "BW", "BY", "BZ", "CA", "CC", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CU", "CV", "CW", "CX", "CY"}, 0, strArr, 27, 27);
            System.arraycopy(new String[]{"CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FM", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH"}, 0, strArr, 54, 27);
            System.arraycopy(new String[]{"GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GT", "GU", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IR", "IS", "IT", "JE"}, 0, strArr, 81, 27);
            System.arraycopy(new String[]{"JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KP", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC"}, 0, strArr, 108, 27);
            System.arraycopy(new String[]{"MD", "ME", "MF", "MG", "MH", "MK", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI"}, 0, strArr, ActionId.MQTT_CONNECTING, 27);
            System.arraycopy(new String[]{"NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PR", "PS", "PT", "PW", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA"}, 0, strArr, ActionId.ASYNC_FAIL, 27);
            System.arraycopy(new String[]{"SB", "SC", "SD", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SY", "SZ", "TA", "TC", "TD", "TG", "TH", "TJ", "TK"}, 0, strArr, 189, 27);
            System.arraycopy(new String[]{"TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VI", "VN", "VU", "WF", "WS", "YE", "YT", "ZA", "ZM"}, 0, strArr, 216, 27);
            System.arraycopy(new String[]{"ZW"}, 0, strArr, 243, 1);
            REGION_CODE_KEY_COLUMN = strArr;
            COUNTRY_CALLING_CODE_VALUE_COLUMN = new short[]{247, 376, 971, 93, 1, 1, 355, 374, 244, 54, 1, 43, 61, 297, 358, 994, 387, 1, 880, 32, 226, 359, 973, 257, 229, 590, 1, 673, 591, 599, 55, 1, 975, 267, 375, 501, 1, 61, 243, 236, 242, 41, 225, 682, 56, 237, 86, 57, 506, 53, 238, 599, 61, 357, 420, 49, 253, 45, 1, 1, 213, 593, 372, 20, 212, 291, 34, 251, 358, 679, 500, 691, 298, 33, 241, 44, 1, 995, 594, 44, 233, 350, 299, 220, 224, 590, 240, 30, 502, 1, 245, 592, 852, 504, 385, 509, 36, 62, 353, 972, 44, 91, 246, 964, 98, 354, 39, 44, 1, 962, 81, 254, 996, 855, 686, 269, 1, 850, 82, 965, 1, 7, 856, 961, 1, 423, 94, 231, 266, 370, 352, 371, 218, 212, 377, 373, 382, 590, 261, 692, 389, 223, 95, 976, 853, 1, 596, 222, 1, 356, 230, 960, 265, 52, 60, 258, 264, 687, 227, 672, 234, 505, 31, 47, 977, 674, 683, 64, 968, 507, 51, 689, 675, 63, 92, 48, 508, 1, 970, 351, 680, 595, 974, 262, 40, 381, 7, 250, 966, 677, 248, 249, 46, 65, 290, 386, 47, 421, 232, 378, 221, 252, 597, 211, 239, 503, 1, 963, 268, 290, 1, 235, 228, 66, 992, 690, 670, 993, 216, 676, 90, 1, 688, 886, 255, 380, 256, 1, 598, 998, 379, 1, 58, 1, 1, 84, 678, 681, 685, 967, 262, 27, 260, 263};
        }
    }

    public int getCountryCallingCodeForRegionCode(String str, int i) {
        int i2 = -1;
        int binarySearch = Arrays.binarySearch(RegionCodeToCountryCallingCodeMap.REGION_CODE_KEY_COLUMN, str);
        if (binarySearch >= 0) {
            return RegionCodeToCountryCallingCodeMap.COUNTRY_CALLING_CODE_VALUE_COLUMN[binarySearch];
        }
        synchronized (this) {
            Map map = this.mRegionCodeToCountryCallingCodeMapAddendum;
            if (map != null) {
                Integer num = (Integer) map.get(str);
                if (num != null) {
                    i2 = num.intValue();
                }
            }
        }
        return i2;
    }

    public String getRegionCodeForCountryCallingCode(int i) {
        short[] sArr = CountryCallingCodeToRegionCodeTable.COUNTRY_CALLING_CODE_KEY_COLUMN;
        int binarySearch = Arrays.binarySearch(sArr, (short) i);
        if (binarySearch < 0) {
            return "ZZ";
        }
        while (sArr[binarySearch] == i) {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        }
        int i2 = binarySearch + 1;
        return i2 >= 0 ? CountryCallingCodeToRegionCodeTable.REGION_CODE_VALUE_COLUMN[i2] : "ZZ";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r305 < 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r307 = r305 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r307 < 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r306 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r307 >= 253) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r0[r307] != r302) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r306.add(com.facebook.phonenumbers.PhoneNumberUtilData.CountryCallingCodeToRegionCodeTable.REGION_CODE_VALUE_COLUMN[r307]);
        r307 = r307 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0010, code lost:
    
        if (r305 < 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0013, code lost:
    
        r306 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        return r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r0[r305] != r302) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r305 = r305 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List getRegionCodesForCountryCallingCode(int r302) {
        /*
            r301 = this;
            short[] r0 = com.facebook.phonenumbers.PhoneNumberUtilData.CountryCallingCodeToRegionCodeTable.COUNTRY_CALLING_CODE_KEY_COLUMN
            r303 = r0
            r0 = r302
            short r0 = (short) r0
            r304 = r0
            r0 = r303
            r1 = r304
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            r305 = r0
            r0 = r305
            if (r0 >= 0) goto L1e
        L13:
            r0 = 0
            r306 = r0
        L16:
            r0 = r306
            return r0
        L19:
            r0 = r305
            if (r0 < 0) goto L31
        L1e:
            r0 = r303
            r1 = r305
            short r0 = r0[r1]
            r304 = r0
            r0 = r304
            r1 = r302
            if (r0 != r1) goto L31
            r0 = r305
            r1 = -1
            int r0 = r0 + r1
            r305 = r0
            goto L19
        L31:
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            r0 = r307
            if (r0 < 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            r306 = r0
            r0 = r306
            r0.<init>()
            r0 = 253(0xfd, float:3.55E-43)
            r305 = r0
        L4b:
            r0 = r307
            r1 = r305
            if (r0 >= r1) goto L16
            r0 = r303
            r1 = r307
            short r0 = r0[r1]
            r304 = r0
            r0 = r304
            r1 = r302
            if (r0 != r1) goto L16
            java.lang.String[] r0 = com.facebook.phonenumbers.PhoneNumberUtilData.CountryCallingCodeToRegionCodeTable.REGION_CODE_VALUE_COLUMN
            r1 = r307
            r0 = r0[r1]
            r308 = r0
            r0 = r306
            r1 = r308
            boolean r0 = r0.add(r1)
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phonenumbers.PhoneNumberUtilData.getRegionCodesForCountryCallingCode(int):java.util.List");
    }

    public boolean isValidRegionCode(String str) {
        int countryCallingCodeForRegionCode;
        List regionCodesForCountryCallingCode;
        if (str == null || (countryCallingCodeForRegionCode = getCountryCallingCodeForRegionCode(str, -1)) == -1 || (regionCodesForCountryCallingCode = getRegionCodesForCountryCallingCode(countryCallingCodeForRegionCode)) == null) {
            return false;
        }
        return (regionCodesForCountryCallingCode.size() == 1 && "001".equals(regionCodesForCountryCallingCode.get(0))) ? false : true;
    }
}

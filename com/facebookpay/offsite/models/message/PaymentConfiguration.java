package com.facebookpay.offsite.models.message;

import X.11T;
import X.1BK;
import X.7zT;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PaymentConfiguration.class */
public final class PaymentConfiguration {
    public final String acquirerCountryCode;
    public final String containerContext;
    public final String eventId;
    public final String externalId;
    public final String merchantName;
    public final PaymentMode mode;
    public final String partnerId;
    public final String partnerMerchantId;
    public final String pixelId;
    public final String requestId;
    public final SessionUsageType sessionUsage;
    public final String shopName;
    public final Map supportedContainers;
    public final Set uxFlags;

    public PaymentConfiguration(String str, String str2, String str3, Map map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set set, SessionUsageType sessionUsageType, String str8, String str9, String str10) {
        7zT.A1W(str, str2, str3, map);
        11T.A0F(str7, 9);
        this.requestId = str;
        this.partnerId = str2;
        this.partnerMerchantId = str3;
        this.supportedContainers = map;
        this.mode = paymentMode;
        this.shopName = str4;
        this.acquirerCountryCode = str5;
        this.merchantName = str6;
        this.containerContext = str7;
        this.uxFlags = set;
        this.sessionUsage = sessionUsageType;
        this.eventId = str8;
        this.pixelId = str9;
        this.externalId = str10;
    }

    public /* synthetic */ PaymentConfiguration(String str, String str2, String str3, Map map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set set, SessionUsageType sessionUsageType, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, map, paymentMode, str4, str5, (i & 128) != 0 ? null : str6, str7, (i & 512) != 0 ? null : set, (i & 1024) != 0 ? null : sessionUsageType, (i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 ? null : str8, (i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0 ? null : str9, (i & 8192) != 0 ? null : str10);
    }

    public static /* synthetic */ PaymentConfiguration createCopy$default(PaymentConfiguration paymentConfiguration, String str, String str2, String str3, Map map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set set, SessionUsageType sessionUsageType, String str8, String str9, String str10, int i, Object obj) {
        String str11 = str2;
        String str12 = str3;
        Map map2 = map;
        PaymentMode paymentMode2 = paymentMode;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        Set set2 = set;
        SessionUsageType sessionUsageType2 = sessionUsageType;
        String str17 = str8;
        String str18 = str9;
        String str19 = str10;
        if ((i & 1) != 0) {
            str = paymentConfiguration.requestId;
        }
        if ((i & 2) != 0) {
            str11 = paymentConfiguration.partnerId;
        }
        if ((i & 4) != 0) {
            str12 = paymentConfiguration.partnerMerchantId;
        }
        if ((i & 8) != 0) {
            map2 = paymentConfiguration.supportedContainers;
        }
        if ((i & 16) != 0) {
            paymentMode2 = paymentConfiguration.mode;
        }
        if ((i & 32) != 0) {
            str13 = paymentConfiguration.shopName;
        }
        if ((i & 64) != 0) {
            str14 = paymentConfiguration.acquirerCountryCode;
        }
        if ((i & 128) != 0) {
            str15 = paymentConfiguration.merchantName;
        }
        if ((i & 256) != 0) {
            str16 = paymentConfiguration.containerContext;
        }
        if ((i & 512) != 0) {
            set2 = paymentConfiguration.uxFlags;
        }
        if ((i & 1024) != 0) {
            sessionUsageType2 = paymentConfiguration.sessionUsage;
        }
        if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            str17 = paymentConfiguration.eventId;
        }
        if ((i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
            str18 = paymentConfiguration.pixelId;
        }
        if ((i & 8192) != 0) {
            str19 = paymentConfiguration.externalId;
        }
        return paymentConfiguration.createCopy(str, str11, str12, map2, paymentMode2, str13, str14, str15, str16, set2, sessionUsageType2, str17, str18, str19);
    }

    public final PaymentConfiguration createCopy(String str, String str2, String str3, Map map, PaymentMode paymentMode, String str4, String str5, String str6, String str7, Set set, SessionUsageType sessionUsageType, String str8, String str9, String str10) {
        7zT.A1S(str, str2, str3);
        1BK.A1L(map, 3, str7);
        return new PaymentConfiguration(str, str2, str3, map, paymentMode, str4, str5, str6, str7, set, sessionUsageType, str8, str9, str10);
    }

    public final String getAcquirerCountryCode() {
        return this.acquirerCountryCode;
    }

    public final String getContainerContext() {
        return this.containerContext;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final PaymentMode getMode() {
        return this.mode;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPartnerMerchantId() {
        return this.partnerMerchantId;
    }

    public final String getPixelId() {
        return this.pixelId;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final SessionUsageType getSessionUsage() {
        return this.sessionUsage;
    }

    public final String getShopName() {
        return this.shopName;
    }

    public final Map getSupportedContainers() {
        return this.supportedContainers;
    }

    public final Set getUxFlags() {
        return this.uxFlags;
    }
}

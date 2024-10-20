package com.facebook.smartcapture.logging;

import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1CO;
import X.1De;
import X.1Lo;
import X.4YU;
import X.5hT;
import X.C06w;
import X.C06z;
import X.HXq;
import X.JQz;
import X.Jud;
import X.KX9;
import X.LXY;
import X.Lpe;
import X.QqL;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.papaya.store.PapayaStore;
import com.facebook.papaya.store.Property;
import com.facebook.smartcapture.logging.MC;
import com.google.common.collect.ImmutableMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CardDataLogger.class */
public final class CardDataLogger {
    public static final long CARD_EXPIRY_KEY = 200003;
    public static final long CARD_NAME_KEY = 200004;
    public static final long CARD_NUMBER_KEY = 200002;
    public static final String CARD_PAPAYA_STORE_NAME = "FB_CARD_SCANNER_FA";
    public static final long CARD_SESSION_ID_KEY = 200001;
    public static final long DIGIT_OCR_RESULT_KEY = 200008;
    public static final long IS_USER_EDITED_KEY = 200006;
    public static final long MERGED_OCR_RESULT_KEY = 200010;
    public static final long OCR_RESULT_KEY = 200007;
    public static final long PROCESSING_TIME_KEY = 200005;
    public static final long RECORD_ID = 200000;
    public static final long TEXT_OCR_RESULT_KEY = 200009;
    public final 1De kinjector;
    public final 1Br mobileConfig$delegate;
    public final 1Br papayaUtil$delegate;
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(CardDataLogger.class, "papayaUtil", "getPapayaUtil()Lcom/facebook/smartcapture/federatedanalytics/PapayaUtil;", 0), new C06w(CardDataLogger.class, "mobileConfig", "getMobileConfig()Lcom/facebook/mobileconfig/factory/MobileConfig;", 0)};
    public static final Companion Companion = new Object();

    /* loaded from: CardDataLogger$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public CardDataLogger(1De r302) {
        11T.A0F(r302, 1);
        this.kinjector = r302;
        this.papayaUtil$delegate = 1Bu.A03(r302.A00, 116428);
        this.mobileConfig$delegate = 1BK.A0C();
    }

    private final 1CO getMobileConfig() {
        return (1CO) 1Br.A0B(this.mobileConfig$delegate);
    }

    private final HXq getPapayaUtil() {
        return (HXq) 1Br.A0B(this.papayaUtil$delegate);
    }

    public final void logFederatedAnalyticsCardData(FbUserSession fbUserSession, FederatedAnalyticsCardData federatedAnalyticsCardData) {
        11T.A0H(fbUserSession, federatedAnalyticsCardData);
        boolean AZk = getMobileConfig().AZk(MC.android_payment.log_card_scanner_fl_fa);
        long Auy = getMobileConfig().Auy(MC.android_payment.ecp_card_data_storage_time_hrs);
        boolean AZk2 = getMobileConfig().AZk(MC.android_payment.enable_card_scanner_papaya);
        if (AZk) {
            long j = 0;
            if (Auy > 0) {
                ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
                ImmutableMap.Builder builder2 = new ImmutableMap.Builder(4);
                ImmutableMap.Builder builder3 = new ImmutableMap.Builder(4);
                ImmutableMap.Builder builder4 = new ImmutableMap.Builder(4);
                ImmutableMap.Builder builder5 = new ImmutableMap.Builder(4);
                ImmutableMap.Builder builder6 = new ImmutableMap.Builder(4);
                ImmutableMap.Builder builder7 = new ImmutableMap.Builder(4);
                Long valueOf = Long.valueOf(RECORD_ID);
                String str = federatedAnalyticsCardData.sessionId;
                if (str != null) {
                    JQz.A1H(builder4, str, CARD_SESSION_ID_KEY);
                }
                String str2 = federatedAnalyticsCardData.cardNumber;
                if (str2 != null) {
                    JQz.A1H(builder4, str2, CARD_NUMBER_KEY);
                }
                String str3 = federatedAnalyticsCardData.expiryDate;
                if (str3 != null) {
                    JQz.A1H(builder4, str3, CARD_EXPIRY_KEY);
                }
                String str4 = federatedAnalyticsCardData.name;
                if (str4 != null) {
                    JQz.A1H(builder4, str4, CARD_NAME_KEY);
                }
                builder3.put(Long.valueOf(PROCESSING_TIME_KEY), Long.valueOf(federatedAnalyticsCardData.processingTime));
                if (federatedAnalyticsCardData.isUserEdited) {
                    j = 1;
                }
                builder3.put(Long.valueOf(IS_USER_EDITED_KEY), Long.valueOf(j));
                String str5 = federatedAnalyticsCardData.ocrResult;
                if (str5 != null) {
                    JQz.A1H(builder4, str5, OCR_RESULT_KEY);
                }
                String str6 = federatedAnalyticsCardData.digitOcrResult;
                if (str6 != null) {
                    JQz.A1H(builder4, str6, DIGIT_OCR_RESULT_KEY);
                }
                String str7 = federatedAnalyticsCardData.textOcrResult;
                if (str7 != null) {
                    JQz.A1H(builder4, str7, TEXT_OCR_RESULT_KEY);
                }
                String str8 = federatedAnalyticsCardData.mergedOcrResult;
                if (str8 != null) {
                    JQz.A1H(builder4, str8, MERGED_OCR_RESULT_KEY);
                }
                ImmutableMap build = builder2.build();
                long j2 = -10;
                builder.put(Long.valueOf(j2), new Property(j2, build, QqL.A0A));
                ImmutableMap build2 = builder3.build();
                long j3 = -9;
                builder.put(Long.valueOf(j3), new Property(j3, build2, QqL.A0C));
                ImmutableMap build3 = builder4.build();
                long j4 = -11;
                builder.put(Long.valueOf(j4), new Property(j4, build3, QqL.A0E));
                ImmutableMap build4 = builder5.build();
                long j5 = -14;
                builder.put(Long.valueOf(j5), new Property(j5, build4, QqL.A0B));
                ImmutableMap build5 = builder6.build();
                long j6 = -13;
                builder.put(Long.valueOf(j6), new Property(j6, build5, QqL.A0D));
                ImmutableMap build6 = builder7.build();
                long j7 = -15;
                builder.put(Long.valueOf(j7), new Property(j7, build6, QqL.A0F));
                ImmutableMap immutableMap = Jud.A00;
                valueOf.getClass();
                KX9.A00((PapayaStore) 1Lo.A09(fbUserSession, this.kinjector.A00, 131162), Jud.A00, builder.build(), CARD_PAPAYA_STORE_NAME, RECORD_ID, TimeUnit.HOURS.toMillis(Auy));
                if (AZk2) {
                    1BY r0 = getPapayaUtil().A00.A00;
                    5hT r02 = (5hT) 1Lo.A09(fbUserSession, r0, 49818);
                    r02.A03.execute(new Lpe((LXY) 1Bn.A0E((Context) null, r0, 131158), r02, 4YU.A0j()));
                }
            }
        }
    }
}

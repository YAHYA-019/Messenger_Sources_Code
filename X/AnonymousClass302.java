package X;

import android.content.Context;
import com.facebook.common.dextricks.Constants;
import com.facebook.inject.FbInjector;
import com.facebook.proxygen.FizzSettings;
import com.facebook.proxygen.HTTPClient;
import com.facebook.proxygen.PersistentSSLCacheSettings;
import com.facebook.proxygen.QuicSettings;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Locale;

/* renamed from: X.302, reason: invalid class name */
/* loaded from: 302.class */
public abstract class AnonymousClass302 {
    public AnonymousClass302() {
        throw 0Q8.createAndThrow();
    }

    public static final HTTPClient.Builder A00() {
        boolean z;
        ArrayList A0s;
        String str;
        AnonymousClass046 anonymousClass046 = (AnonymousClass046) 1Bn.A0E((Context) null, (1BY) null, 16669);
        2yD r0 = (2yD) 1Bi.A03(16385);
        1Bi.A03(99938);
        1Bi.A03(66865);
        Context A00 = FbInjector.A00();
        0dC r02 = (0dC) 1Bn.A0E((Context) null, (1BY) null, 43);
        2A1 r03 = (2A1) 1Bi.A03(84630);
        1Bi.A03(33013);
        2AH r04 = (2AH) 1Bi.A03(66757);
        C01s A0I = 1BL.A0I();
        1Pe r05 = (1Pe) 1Bn.A0E((Context) null, (1BY) null, 66392);
        HTTPClient.Builder builder = new HTTPClient.Builder(new 2AI(anonymousClass046));
        PersistentSSLCacheSettings persistentSSLCacheSettings = new PersistentSSLCacheSettings(AnonymousClass001.A0D(A00.getFilesDir(), "fbtlsx.store").toString(), 50, 150, true);
        persistentSSLCacheSettings.syncInterval = 150;
        builder.mPersistentSSLCacheSettings = persistentSSLCacheSettings;
        boolean z2 = r03.A00;
        builder.setIsSandbox(z2);
        builder.mIsHTTPSEnforced = !z2;
        builder.setMaxIdleHTTP2Sessions(2);
        PersistentSSLCacheSettings persistentSSLCacheSettings2 = new PersistentSSLCacheSettings(AnonymousClass001.A0D(A00.getFilesDir(), "fbdns.store").toString(), 200, 150, false);
        persistentSSLCacheSettings2.syncInterval = 150;
        builder.mPersistentDNSCacheSettings = persistentSSLCacheSettings2;
        builder.mDnsCacheEnabled = true;
        builder.mAppBuildTime = 0dC.A00(r02, r02.A01).A00 / 1000;
        builder.mEnableLigerPreconnect = false;
        2yD r06 = (2yD) 1Bi.A03(16385);
        boolean z3 = !r05.A01();
        PersistentSSLCacheSettings persistentSSLCacheSettings3 = null;
        boolean AZk = r06.AZk(36310684317320105L);
        boolean AZl = r06.AZl(2342153693537436591L, false);
        String BCz = r06.BCz(36873634279391363L, "zstd");
        boolean AZl2 = r06.AZl(36310684326495154L, false);
        int Auz = (int) r06.Auz(36592159302812115L, -1);
        int Auz2 = (int) r06.Auz(36592159312052700L, 0L);
        boolean AZl3 = r06.AZl(36310684337177548L, false);
        String BCz2 = r06.BCz(36873634291056781L, "");
        int Auz3 = (int) r06.Auz(36592159314936292L, 0L);
        boolean AZk2 = r06.AZk(36310684338619349L);
        if (z3) {
            z = true;
            persistentSSLCacheSettings3 = new PersistentSSLCacheSettings(AnonymousClass001.A0D(A00.getFilesDir(), "fbfizz.store").toString(), 30, 150, false);
        } else {
            z = false;
        }
        builder.mFizzSettings = new FizzSettings(z3, 0, z, persistentSSLCacheSettings3, AZk, true, 5, false, AZl, BCz, Auz, AZl2, Auz2, AZl3, BCz2, Auz3, AZk2);
        2yD r07 = (2yD) 1Bi.A03(16385);
        builder.mQuicFizzSettings = new FizzSettings(true, 0, true, new PersistentSSLCacheSettings(AnonymousClass001.A0D(A00.getFilesDir(), "fbquic-fizz.store").toString(), 30, 150, false), r07.AZk(2342153693536322477L), false, 5, false, r07.AZl(2342153693544645561L, true), r07.BCz(36873634279391363L, "zstd"), -1, false, 0, false, null, (int) r07.Auz(36592159314936292L, 0L), r07.AZk(36310684338619349L));
        2yD r08 = (2yD) 1Bi.A03(16385);
        String BCz3 = r08.BCz(36873634278146178L, "graph.facebook.com,graph.alpha.facebook.com");
        String BCz4 = r08.BCz(36873634282143876L, "");
        String BCz5 = r08.BCz(36873634291581071L, "");
        long j = 36873634287124617L;
        if (r08.BCz(36873634287124617L, "").isEmpty()) {
            j = 36873634286993544L;
        }
        String BCz6 = r08.BCz(j, "");
        String BCz7 = r08.BCz(36873634291843216L, "");
        boolean z4 = false;
        boolean AZl4 = r08.AZl(36310684334752703L, false);
        int Auz4 = (int) r08.Auz(36592159314412003L, 0L);
        boolean AZl5 = r08.AZl(36310684337767375L, false);
        boolean AZl6 = r08.AZl(36310684337832912L, false);
        boolean AZl7 = r08.AZl(36310684338095057L, false);
        PersistentSSLCacheSettings persistentSSLCacheSettings4 = null;
        boolean AZl8 = r08.AZl(36310684333507517L, false);
        String A0z = 0Pz.A0z(BCz3, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, BCz4, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, BCz5);
        boolean AZl9 = r08.AZl(36310684333114299L, true);
        boolean AZk3 = r08.AZk(2342153693545431994L);
        int Auz5 = (int) r08.Auz(36592159298159058L, 200L);
        int i = Auz5;
        if (30000 < Auz5) {
            i = 30000;
        }
        boolean AZk4 = r08.AZk(36310684336653258L);
        boolean AZl10 = r08.AZl(36310684322366380L, false);
        String BCz8 = r08.BCz(36873634284306567L, "cubic");
        int Auz6 = (int) r08.Auz(36592159298027984L, 6291456L);
        int i2 = Auz6;
        if (65536 > Auz6) {
            i2 = 65536;
        }
        int A002 = 2yD.A00(r08, 36592159298093521L);
        int Auz7 = (int) r08.Auz(36592159303991767L, 32);
        int i3 = Auz7;
        if (1000 < Auz7) {
            i3 = 1000;
        }
        int Auz8 = (int) r08.Auz(36592159303729621L, 2);
        int i4 = Auz8;
        if (1000 < Auz8) {
            i4 = 1000;
        }
        int Auz9 = (int) r08.Auz(36592159303664084L, 10);
        if (1000 < Auz9) {
            Auz9 = 1000;
        }
        int Auz10 = (int) r08.Auz(36592159303860694L, 100);
        boolean AZl11 = r08.AZl(2342153693542351797L, true);
        String BCz9 = r08.BCz(36873634282733701L, "");
        boolean AZl12 = r08.AZl(36310684333441980L, false);
        int Auz11 = (int) r08.Auz(36592159311331802L, 0L);
        boolean AZl13 = r08.AZl(36310684335080384L, false);
        boolean AZl14 = r08.AZl(36310684335604676L, false);
        int Auz12 = (int) r08.Auz(36592159312380381L, 0L);
        int Auz13 = (int) r08.Auz(36592159312445918L, 3);
        int Auz14 = (int) r08.Auz(36592159313166815L, 10);
        String BCz10 = r08.BCz(36873634289680523L, "");
        boolean AZl15 = r08.AZl(36310684336391112L, false);
        int Auz15 = (int) r08.Auz(36592159313691105L, 0L);
        int Auz16 = (int) r08.Auz(36592159313756642L, 1L);
        boolean AZl16 = r08.AZl(36310684337570766L, false);
        if (Auz4 > 0) {
            z4 = true;
        }
        boolean AZl17 = r08.AZl(2342153693551985618L, true);
        boolean AZk5 = r08.AZk(36310684338684886L);
        if (AZl4) {
            persistentSSLCacheSettings4 = new PersistentSSLCacheSettings(AnonymousClass001.A0D(A00.getFilesDir(), "fbquic-token.store").toString(), 50, 150, false);
        }
        builder.mQuicSettings = new QuicSettings(BCz6, AZl8, A0z, AZl9, false, false, 1452, false, 11, AZk3, i2, A002, i, AZk4, 2000, 30, AZl10, 5, BCz8, i3, i4, Auz9, Auz10, false, false, 2, AZl11, BCz9, (-1) >>> 1, false, "", AZl12, true, Auz11, null, persistentSSLCacheSettings4, AZl4, AZl13, AZl14, Auz12, Auz13, Auz14, BCz10, AZl15, Auz15, Auz16, BCz7, AZl16, z4, Auz4, AZl5, AZl6, AZl7, AZl17, AZk5);
        builder.mQuicVersion = r0.Auy(36592159305499096L);
        builder.useMNSCertificateVerifier(r0.AZk(36310684329378742L));
        builder.mAttemptEarlyDataInQuicPreconnect = r0.AZk(36310684324004784L);
        builder.mInlinePersistenceLoading = false;
        builder.mSupportH2PubSub = false;
        builder.mH2PubSubHostnames = "localhost";
        builder.setFlowControl(r0.AZk(2342153693540254643L), 163840, 163840);
        builder.mPreConnects = "";
        builder.mEnableZstd = r0.AZk(36313007889978821L);
        builder.mEnableDzCompression = r0.AZk(36310684326364081L);
        builder.mStaleAnswersEnabled = r0.AZk(2342153693548905409L);
        builder.setDnsCacheTtlSecs(2yD.A00(r0, 36592159311987163L));
        builder.mDnsCacheTtlEnabledHosts = r0.BCy(36873634288959626L);
        builder.mCloseConnectionOnDnsChange = r0.AZk(36310684336063429L);
        builder.mDoNotForceShutdownClosePendingSessions = r0.AZk(36310684336194503L);
        builder.mLeaveClosePendingQuicSessionsAlone = r0.AZk(36310684336587721L);
        builder.setCloseStaleSessionsDelayMs(2yD.A00(r0, 36592159313232352L));
        builder.mPreemptBeforeCloseStaleSessions = r0.AZk(36310684336849867L);
        if (r0.AZk(36310684323283886L)) {
            String BD0 = 1Br.A09(r05.A00).BD0(1Pf.A08);
            if (BD0 != null && !BD0.isEmpty()) {
                str = BD0.toLowerCase(Locale.ROOT);
                if (!str.matches("^[a-z]{3}([0-9]+-[0-9]+)?$") && !str.matches("^fna:f[a-z]{3}[0-9]+-[0-9]+$")) {
                    if (str.matches("^f[a-z]{3}[0-9]+-[0-9]+$")) {
                        str = 0Pz.A0W("fna:", str);
                    }
                }
                builder.mCdnOverride = str;
            }
            str = null;
            builder.mCdnOverride = str;
        }
        builder.mRootCACallbacks = new 2AY(A0I, r04);
        if (r05.A00()) {
            synchronized (2AH.class) {
                A0s = AnonymousClass001.A0s();
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                    keyStore.load(null, null);
                    Enumeration<String> aliases = keyStore.aliases();
                    while (aliases.hasMoreElements()) {
                        String nextElement = aliases.nextElement();
                        if (nextElement.startsWith("user:")) {
                            try {
                                Certificate certificate = keyStore.getCertificate(nextElement);
                                if (certificate instanceof X509Certificate) {
                                    A0s.add((X509Certificate) certificate);
                                }
                            } catch (KeyStoreException e) {
                                0fH.A0K(2AH.class, "Failed to get user Root CA", e);
                            }
                        }
                    }
                } catch (Throwable th) {
                    0fH.A0K(2AH.class, "Failed to load AndroidCAStore", th);
                }
            }
            builder.mUserInstalledCertificates = 2AH.A00(A0s);
        }
        builder.setTcpNotsentLowat(Constants.LOAD_RESULT_PGO);
        builder.setSessionManagerConnectTimeoutExtra(2yD.A00(r0, 36592159308644825L));
        builder.mEnableClientConnectionUuidHeader = r0.AZk(36310684338488275L);
        return builder;
    }
}

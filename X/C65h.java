package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.dma.initparams.metadataprovider.model.DmaConsentMetadata;
import com.facebook.messaging.extensions.common.ExtensionIconModel;
import com.facebook.messaging.games.extension.discovery.GamesDiscoveryExtensionParams;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.secure.secrettypes.SecretString;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.65h, reason: invalid class name */
/* loaded from: 65h.class */
public final class C65h {
    public static final C65h A04 = new Object();
    public static final 1Br A02 = 1Bq.A00(16385);
    public static final 1CO A05 = (1CO) 1Bi.A03(16387);
    public static final 1Br A01 = 1Bq.A00(16822);
    public static final 1Br A00 = 1Bq.A00(66067);
    public static final 1Br A03 = 1Bu.A00(85204);

    public static final boolean A00(C65h c65h, ThreadKey threadKey, HeterogeneousMap heterogeneousMap, String str, boolean z) {
        2yD r307;
        long j;
        AnonymousClass207 anonymousClass207 = DmaConsentMetadata.A04;
        DmaConsentMetadata dmaConsentMetadata = (DmaConsentMetadata) heterogeneousMap.A00(anonymousClass207);
        boolean z2 = true;
        if (dmaConsentMetadata != null && dmaConsentMetadata.A00) {
            return false;
        }
        DmaConsentMetadata dmaConsentMetadata2 = (DmaConsentMetadata) heterogeneousMap.A00(anonymousClass207);
        if (dmaConsentMetadata2 != null && dmaConsentMetadata2.A01) {
            return false;
        }
        if (!c65h.A03(str, z)) {
            if (!((C22a) ((C1q7) A01.A00.get()).A01.get()).BXB(str) || !A02(str) || !A02(str)) {
                return false;
            }
            z2 = false;
            if (!c65h.A04(z)) {
                if (threadKey.A0z()) {
                    r307 = (2yD) A02.A00.get();
                    j = 36322001552753665L;
                } else if (threadKey.A1N()) {
                    r307 = (2yD) A02.A00.get();
                    j = 36322001552819202L;
                }
                if (!z) {
                    return r307.AZk(j);
                }
                z2 = 2yD.A03(r307, j);
            }
        }
        return z2;
    }

    public static final boolean A01(C65h c65h, ThreadSummary threadSummary, AnonymousClass622 anonymousClass622, boolean z) {
        SecretString secretString;
        String str;
        String str2 = threadSummary.A1z;
        boolean z2 = false;
        if (!5WB.A01(threadSummary, str2) && !5WB.A03(threadSummary, str2) && (secretString = anonymousClass622.A09) != null && (str = secretString.A00) != null) {
            if (c65h.A03(str, z)) {
                z2 = true;
            } else {
                C1q7 c1q7 = (C1q7) A01.A00.get();
                Message message = anonymousClass622.A03;
                if (message.A04() == C1q8.A0N) {
                    if (((C22a) c1q7.A01.get()).BXB(message.A0F().A00) && !C1q7.A0E(message) && A02(str)) {
                        if (c65h.A04(z)) {
                            return false;
                        }
                        2yD r0 = (2yD) A02.A00.get();
                        return z ? r0.AZr(1GD.A07, 36322001552688128L) : r0.AZk(36322001552688128L);
                    }
                }
            }
        }
        return z2;
    }

    public static final boolean A02(String str) {
        boolean z = true;
        if (str.length() == 0) {
            return false;
        }
        1CO r0 = A05;
        if (!r0.AZk(72339558641763791L)) {
            if (!r0.AZk(72339558641894865L)) {
                if (r0.AZk(72339558641829328L)) {
                    return !4YU.A19(2yD.A02(r0, 72902508595118165L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0).contains(str);
                }
                return false;
            }
            z = 4YU.A19(2yD.A02(r0, 72902508594987091L), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0).contains(str);
        }
        return z;
    }

    private final boolean A03(String str, boolean z) {
        boolean z2 = false;
        if (A05(str) != null && !A04(z)) {
            2yD r0 = (2yD) A02.A00.get();
            if (!z) {
                return r0.AZk(36322001553277961L);
            }
            z2 = r0.AZr(1GD.A07, 36322001553277961L);
        }
        return z2;
    }

    private final boolean A04(boolean z) {
        2yD r0 = (2yD) ((5Wz) A03.A00.get()).A00.A00.get();
        return z ? r0.AZr(1GD.A07, 36318471088517781L) : r0.AZk(36318471088517781L);
    }

    public final Integer A05(String str) {
        Emoji emoji;
        boolean z = false;
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            return null;
        }
        List A0M = 0CU.A0M(str, new String[]{"\n"}, 0);
        if (A0M.size() != 3) {
            return null;
        }
        C00i c00i = A00.A00;
        List AjV = ((C22a) c00i.get()).AjV((String) A0M.get(0));
        11T.A0A(AjV);
        if (AjV.isEmpty() || (emoji = (Emoji) 0QD.A0D(AjV)) == null) {
            return null;
        }
        String A07 = emoji.A07();
        11T.A0A(A07);
        if (!A02(A07)) {
            return null;
        }
        List AjV2 = ((C22a) c00i.get()).AjV((String) A0M.get(1));
        11T.A0A(AjV2);
        List AjV3 = ((C22a) c00i.get()).AjV((String) A0M.get(2));
        11T.A0A(AjV3);
        if (AjV.size() != AjV2.size() || AjV.size() != AjV3.size()) {
            return null;
        }
        Iterator it = AjV.iterator();
        while (it.hasNext()) {
            if (!11T.A0O(it.next(), emoji)) {
                return null;
            }
        }
        if (!AjV.equals(AjV3) || !11T.A0O(0QD.A0D(AjV2), emoji) || !11T.A0O(0QD.A0F(AjV2), emoji) || AjV2.size() < 3) {
            return null;
        }
        List subList = AjV2.subList(1, AjV2.size() - 1);
        if (subList.size() < 1) {
            return null;
        }
        Iterator it2 = subList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            String A072 = ((Emoji) it2.next()).A07();
            11T.A0A(A072);
            if (!0CU.A0T(A072, "️⃣", false)) {
                return null;
            }
            i = (i * 10) + (A072.codePointAt(0) - 48);
        }
        if (i > 999 || i < 0) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public final String A06(int i, String str) {
        11T.A0F(str, 1);
        if (i > 999) {
            i = 999;
        } else if (i < 0) {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        int length = valueOf.length();
        StringBuilder A0k = AnonymousClass001.A0k();
        int i2 = length + 2;
        A0k.append(0CV.A0V(str, i2));
        A0k.append('\n');
        A0k.append(str);
        String str2 = "";
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= length) {
                A0k.append(str2);
                A0k.append(str);
                A0k.append('\n');
                return AnonymousClass001.A0d(0CV.A0V(str, i2), A0k);
            }
            str2 = 0Pz.A0Y(str2, "️⃣", valueOf.charAt(i4));
            i3 = i4 + 1;
        }
    }

    public final String A07(String str) {
        if (str.length() == 0) {
            str = null;
        } else if (!((C22a) ((C1q7) 1Br.A0B(A01)).A01.get()).BXB(str)) {
            String str2 = null;
            List A19 = 4YU.A19(str, "\n", 0);
            if (A19.size() == 3) {
                List AjV = ((C22a) 1Br.A0B(A00)).AjV(1BK.A14(A19, 0));
                11T.A0A(AjV);
                if (!AjV.isEmpty()) {
                    str2 = ((Emoji) 0QD.A0D(AjV)).A07();
                }
            }
            return str2;
        }
        return str;
    }

    public final void A08(FbUserSession fbUserSession, ThreadSummary threadSummary, 64W r304, MigColorScheme migColorScheme) {
        boolean z;
        boolean z2;
        11T.A0F(fbUserSession, 2);
        if (r304 != null) {
            ThreadKey threadKey = threadSummary != null ? threadSummary.A0n : null;
            boolean z3 = false;
            if (!1BL.A0Q().AZk(36313905542995160L) || threadSummary == null) {
                z = false;
                if (threadSummary == null) {
                    z2 = false;
                    r304.AGQ(7Z5.A00(new GamesDiscoveryExtensionParams(threadKey, z3, z2, z), new ExtensionIconModel(2MQ.A1X, null, migColorScheme.AvJ())));
                }
            } else {
                z3 = 5WB.A01(threadSummary, ((1G1) fbUserSession).A02);
            }
            String str = ((1G1) fbUserSession).A02;
            z2 = 5WB.A02(threadSummary, str);
            z = 5WB.A03(threadSummary, str);
            r304.AGQ(7Z5.A00(new GamesDiscoveryExtensionParams(threadKey, z3, z2, z), new ExtensionIconModel(2MQ.A1X, null, migColorScheme.AvJ())));
        }
    }

    public final boolean A09() {
        return ((2yD) ((5Wz) A03.A00.get()).A00.A00.get()).AZk(36318471088583318L);
    }

    public final boolean A0A(String str) {
        boolean z = false;
        11T.A0F(str, 0);
        if (((2yD) A02.A00.get()).AZr(1GD.A07, 36322001553146887L) && A05(str) != null) {
            z = true;
        }
        return z;
    }

    public final boolean A0B(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (!z && z2) {
            2yD r0 = (2yD) ((5Wz) A03.A00.get()).A00.A00.get();
            1GD r02 = 1GD.A07;
            if (!r0.AZr(r02, 36318471088517781L)) {
                z4 = ((2yD) A02.A00.get()).AZr(r02, z3 ? 36322001553212424L : 36322001553146887L);
            }
        }
        return z4;
    }
}

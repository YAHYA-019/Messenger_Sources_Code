package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.plugins.channelinvite.copylinkomnipickercomponent.CopyLinkOmnipickerComponentImplementation;
import com.facebook.messaging.communitymessaging.plugins.channelinvite.suggestedgroupsomnipickercomponent.SuggestedGroupsOmnipickerComponentImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ccm.class */
public final class Ccm implements DEV {
    public CopyLinkOmnipickerComponentImplementation A01;
    public SuggestedGroupsOmnipickerComponentImplementation A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Context A06;
    public final FbUserSession A07;
    public final 1Iw A08;
    public final BME A09;
    public final Bcn A0A;
    public final ThreadKey A0B;
    public final ThreadSummary A0C;
    public final MigColorScheme A0E;
    public final ParcelableSecondaryData A0F;
    public final ImmutableList A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public int A00 = -1;
    public final 1YC A0D = 1YC.A03;

    public Ccm(Context context, FbUserSession fbUserSession, 1Iw r304, BME bme, Bcn bcn, ThreadKey threadKey, ThreadSummary threadSummary, MigColorScheme migColorScheme, ParcelableSecondaryData parcelableSecondaryData, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, int i) {
        this.A06 = context;
        this.A0A = bcn;
        this.A0H = str;
        this.A0I = str2;
        this.A0K = str3;
        this.A0L = str4;
        this.A0E = migColorScheme;
        this.A08 = r304;
        this.A09 = bme;
        this.A0C = threadSummary;
        this.A0B = threadKey;
        this.A07 = fbUserSession;
        this.A0G = immutableList;
        this.A0F = parcelableSecondaryData;
        this.A0J = str5;
        this.A05 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[Catch: Exception -> 0x00f8, all -> 0x0106, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f8, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0075, B:16:0x007b, B:17:0x0081, B:19:0x0089, B:20:0x008d, B:20:0x008d, B:22:0x0092, B:24:0x009b, B:29:0x00b6, B:30:0x00bc, B:31:0x00c2, B:32:0x00c8, B:33:0x00ce, B:35:0x00e1, B:36:0x00e7, B:37:0x00ec, B:37:0x00ec, B:40:0x00f1, B:43:0x00af, B:45:0x0069), top: B:4:0x0043, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccm.A00():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079 A[Catch: all -> 0x016c, Exception -> 0x0173, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0173, all -> 0x016c, blocks: (B:5:0x0048, B:6:0x004d, B:9:0x0059, B:12:0x0061, B:15:0x0079, B:17:0x0086, B:19:0x008c, B:20:0x0090, B:21:0x0096, B:24:0x00a0, B:27:0x00ac, B:29:0x00b4, B:31:0x00bc, B:33:0x00c4, B:35:0x00cc, B:36:0x00d2, B:37:0x00d8, B:38:0x00de, B:39:0x00e4, B:40:0x00ea, B:41:0x00f0, B:42:0x00f6, B:43:0x00fb, B:44:0x0101, B:46:0x014a, B:47:0x0150, B:48:0x0154, B:48:0x0154, B:51:0x0159, B:53:0x0160, B:55:0x0165, B:57:0x006d), top: B:4:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ccm.A01():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r311v0 */
    /* JADX WARN: Type inference failed for: r311v2 */
    public ArrayList B9P() {
        String str;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        r0.A08("com.facebook.messaging.omnipicker.plugins.interfaces.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", "messaging.omnipicker.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", "getSecondaryOmnipickerComponent", andIncrement);
        try {
            ?? r311 = this.A00;
            boolean z = r311;
            if (r311 == -1) {
                boolean A00 = A00();
                boolean z2 = A00;
                if (A01()) {
                    z2 = (A00 ? 1 : 0) + 1;
                }
                this.A00 = z2 ? 1 : 0;
                z = z2;
            }
            ArrayList A0t = AnonymousClass001.A0t(z);
            try {
                if (A00()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.communitymessaging.channelinvite.copylinkomnipickercomponent.CopyLinkOmnipickerComponentImplementation";
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.channelinvite.copylinkomnipickercomponent.CopyLinkOmnipickerComponentImplementation", str, "com.facebook.messaging.omnipicker.plugins.interfaces.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", i, "messaging.omnipicker.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.channelinvite.CommunitymessagingChannelinviteKillSwitch", "getSecondaryOmnipickerComponent");
                    try {
                        CopyLinkOmnipickerComponentImplementation copyLinkOmnipickerComponentImplementation = this.A01;
                        C1u2 A0I = 4YV.A0I();
                        ImmutableList.Builder A0h = 4YU.A0h();
                        1Iw r02 = copyLinkOmnipickerComponentImplementation.A00;
                        Resources A0E = 4YU.A0E(r02);
                        String A0t2 = 4YU.A0t(A0E, 2131955135);
                        MigColorScheme migColorScheme = copyLinkOmnipickerComponentImplementation.A06;
                        A0h.m11011add((Object) CBK.A00(copyLinkOmnipickerComponentImplementation.A05, migColorScheme, A0t2));
                        2cM A002 = 2cK.A00(r02);
                        55N A003 = 55M.A00(r02);
                        AnonymousClass557 A0V = 7zU.A0V(migColorScheme);
                        A0V.A04(AnonymousClass558.MEDIUM);
                        AbH.A1I(A0E, A0V, 2131958458);
                        A0V.A07(copyLinkOmnipickerComponentImplementation.A07);
                        A0V.A05 = AbK.A0d(migColorScheme, A0I.A03(C1u3.A44));
                        A0V.A06(A0h.build());
                        A0t.add(7zL.A0V(A002, 7zU.A0U(A003, A0V)));
                        r0.A09(str, "messaging.omnipicker.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", "getSecondaryOmnipickerComponent", i);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                if (A01()) {
                    i = atomicInteger.getAndIncrement();
                    str = "messaging.communitymessaging.channelinvite.suggestedgroupsomnipickercomponent.SuggestedGroupsOmnipickerComponentImplementation";
                    r0.A0A("com.facebook.messaging.communitymessaging.plugins.channelinvite.suggestedgroupsomnipickercomponent.SuggestedGroupsOmnipickerComponentImplementation", str, "com.facebook.messaging.omnipicker.plugins.interfaces.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", i, "messaging.omnipicker.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.channelinvite.CommunitymessagingChannelinviteKillSwitch", "getSecondaryOmnipickerComponent");
                    A0t.add(this.A02.A00());
                    r0.A09(str, "messaging.omnipicker.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", "getSecondaryOmnipickerComponent", i);
                }
                while (true) {
                    int size = A0t.size();
                    ?? r3112 = this.A00;
                    boolean z3 = r3112;
                    if (r3112 == -1) {
                        boolean A004 = A00();
                        boolean z4 = A004;
                        if (A01()) {
                            z4 = (A004 ? 1 : 0) + 1;
                        }
                        this.A00 = z4 ? 1 : 0;
                        z3 = z4;
                    }
                    if (size >= z3) {
                        r0.A02((Exception) null, "messaging.omnipicker.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", "getSecondaryOmnipickerComponent", andIncrement);
                        return A0t;
                    }
                    A0t.add(null);
                }
            } catch (Throwable th) {
                r0.A04((Exception) null, str, "messaging.omnipicker.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", "getSecondaryOmnipickerComponent", i);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.omnipicker.secondaryomnipickercomponent.SecondaryOmnipickerComponentInterfaceSpec", "getSecondaryOmnipickerComponent", andIncrement);
            throw th2;
        }
    }
}

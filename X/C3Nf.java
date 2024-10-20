package X;

import com.facebook.messaging.communitymessaging.plugins.communitypreview.stickyfooter.FoldersStickyFooterImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Nf, reason: invalid class name */
/* loaded from: 3Nf.class */
public final class C3Nf {
    public final /* synthetic */ 2Om A00;

    public C3Nf(2Om r302) {
        this.A00 = r302;
    }

    public void A00() {
        2Om r0 = this.A00;
        3Fc r02 = r0.A0G;
        if (r02 != null) {
            final MigColorScheme migColorScheme = (MigColorScheme) 1Bn.A0E(r0.A05.getContext(), (1BY) null, 16979);
            11T.A0F(migColorScheme, 0);
            3JQ r03 = r02.A00;
            if (r03 == null) {
                11T.A0L("foldersStickyFooterInterfaceSpec");
                throw 0Q8.createAndThrow();
            }
            C3Qb c3Qb = r03.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r04 = c3Qb.A02;
            r04.A08("com.facebook.messaging.inboxfolders.plugins.interfaces.stickyfooter.FoldersStickyFooterInterfaceSpec", "messaging.inboxfolders.stickyfooter.FoldersStickyFooterInterfaceSpec", "getComponent", andIncrement);
            2cL r302 = null;
            try {
                if (C3Qb.A00(c3Qb)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    try {
                        r04.A0A("com.facebook.messaging.communitymessaging.plugins.communitypreview.stickyfooter.FoldersStickyFooterImplementation", "messaging.communitymessaging.communitypreview.stickyfooter.FoldersStickyFooterImplementation", "com.facebook.messaging.inboxfolders.plugins.interfaces.stickyfooter.FoldersStickyFooterInterfaceSpec", andIncrement2, "messaging.inboxfolders.stickyfooter.FoldersStickyFooterInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitypreview.CommunitymessagingCommunitypreviewKillSwitch", "getComponent");
                        try {
                            FoldersStickyFooterImplementation foldersStickyFooterImplementation = c3Qb.A00;
                            String str = foldersStickyFooterImplementation.A01;
                            String str2 = foldersStickyFooterImplementation.A00;
                            if (foldersStickyFooterImplementation.A09 == 0S2.A00) {
                                new 1LH(migColorScheme) { // from class: X.36p
                                    public final MigColorScheme A00;

                                    {
                                        this.A00 = migColorScheme;
                                    }
                                };
                            } else if (str == null || str2 == null) {
                                r302 = 2cK.A01(foldersStickyFooterImplementation.A05.A09, (String) null, 0).A00;
                            } else {
                                new 8aW(foldersStickyFooterImplementation.A03, new 9NR(foldersStickyFooterImplementation, migColorScheme), migColorScheme, str, str2);
                            }
                            r04.A09("messaging.communitymessaging.communitypreview.stickyfooter.FoldersStickyFooterImplementation", "messaging.inboxfolders.stickyfooter.FoldersStickyFooterInterfaceSpec", "getComponent", andIncrement2);
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        r04.A04((Exception) null, "messaging.communitymessaging.communitypreview.stickyfooter.FoldersStickyFooterImplementation", "messaging.inboxfolders.stickyfooter.FoldersStickyFooterInterfaceSpec", "getComponent", andIncrement2);
                        throw th;
                    }
                }
                r04.A02((Exception) null, "messaging.inboxfolders.stickyfooter.FoldersStickyFooterInterfaceSpec", "getComponent", andIncrement);
                r0.A04 = r302;
            } catch (Throwable th2) {
                r04.A02((Exception) null, "messaging.inboxfolders.stickyfooter.FoldersStickyFooterInterfaceSpec", "getComponent", andIncrement);
                throw th2;
            }
        }
        2Om.A0E(r0, r0.A0A.A00().A01, true);
    }
}

package com.facebook.messenger.app;

import X.0RF;
import X.0nD;
import X.1Bi;
import X.1Bn;
import X.AnonymousClass053;
import X.C00i;
import X.C15h;
import X.C2ib;
import com.facebook.appuserstatus.BaseAppUserStatusDelegate;
import com.facebook.auth.viewercontext.ViewerContext;

/* loaded from: MessengerLoggedInUserProvider.class */
public class MessengerLoggedInUserProvider extends 0RF {

    /* loaded from: MessengerLoggedInUserProvider$Impl.class */
    public final class Impl extends BaseAppUserStatusDelegate {
        public C15h A00;
        public C15h A01;
        public C15h A02;
        public final C00i A03;
        public final C00i A04;
        public final C00i A05;
        public final C00i A06;

        public Impl(0RF r302) {
            super(r302);
            this.A03 = 1Bn.A07(this, 17010);
            this.A05 = 1Bi.A00(67262);
            this.A06 = 1Bn.A07(this, 65920);
            this.A04 = 1Bi.A00(17077);
        }

        @Override // com.facebook.appuserstatus.BaseAppUserStatusDelegate, com.facebook.secure.content.DeferredInitAbstractContentProviderDelegate
        public void A0b() {
            super.A0b();
            this.A00 = new 0nD(this, 3);
            this.A02 = new 0nD(this, 4);
            this.A01 = new 0nD(this, 5);
        }

        @Override // com.facebook.appuserstatus.BaseAppUserStatusDelegate
        public String A0e() {
            ViewerContext viewerContext = (ViewerContext) this.A01.get();
            if (viewerContext != null) {
                return viewerContext.A01();
            }
            return null;
        }

        @Override // com.facebook.appuserstatus.BaseAppUserStatusDelegate
        public boolean A0f() {
            return ((C2ib) this.A04.get()).A09();
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
        
            if (((X.1Rv) r301.A05.get()).A0B() == false) goto L6;
         */
        @Override // com.facebook.appuserstatus.BaseAppUserStatusDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean A0g() {
            /*
                r301 = this;
                r0 = 49388(0xc0ec, float:6.9207E-41)
                r302 = r0
                r0 = r301
                X.0RF r0 = r0.A00
                android.content.Context r0 = r0.getContext()
                r1 = r302
                java.lang.Object r0 = X.1Bn.A0D(r0, r1)
                com.facebook.messaging.growth.logging.MsgrGrowthChatHeadsEnabledLogger r0 = (com.facebook.messaging.growth.logging.MsgrGrowthChatHeadsEnabledLogger) r0
                r0.A01()
                r0 = r301
                X.15h r0 = r0.A02
                java.lang.Object r0 = r0.get()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r303 = r0
                r0 = r303
                boolean r0 = r0.booleanValue()
                r304 = r0
                r0 = r304
                if (r0 == 0) goto L42
                r0 = r301
                X.00i r0 = r0.A05
                java.lang.Object r0 = r0.get()
                X.1Rv r0 = (X.1Rv) r0
                r303 = r0
                r0 = r303
                boolean r0 = r0.A0B()
                r302 = r0
                r0 = 1
                r304 = r0
                r0 = r302
                if (r0 != 0) goto L46
            L42:
                r0 = 0
                r304 = r0
                r0 = 0
                r303 = r0
            L46:
                r0 = r304
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.app.MessengerLoggedInUserProvider.Impl.A0g():boolean");
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
        
            if (((X.2Pi) r301.A06.get()).A03() == false) goto L6;
         */
        @Override // com.facebook.appuserstatus.BaseAppUserStatusDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean A0h() {
            /*
                r301 = this;
                r0 = r301
                X.00i r0 = r0.A03
                java.lang.Object r0 = r0.get()
                X.2Ph r0 = (X.2Ph) r0
                com.facebook.messaging.model.threads.NotificationSetting r0 = r0.A00()
                r302 = r0
                r0 = r302
                boolean r0 = r0.A02()
                r303 = r0
                r0 = r303
                if (r0 == 0) goto L31
                r0 = r301
                X.00i r0 = r0.A06
                java.lang.Object r0 = r0.get()
                X.2Pi r0 = (X.2Pi) r0
                r302 = r0
                r0 = r302
                boolean r0 = r0.A03()
                r304 = r0
                r0 = 1
                r303 = r0
                r0 = r304
                if (r0 != 0) goto L35
            L31:
                r0 = 0
                r303 = r0
                r0 = 0
                r302 = r0
            L35:
                r0 = r303
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.app.MessengerLoggedInUserProvider.Impl.A0h():boolean");
        }
    }

    public AnonymousClass053 A09() {
        return new Impl(this);
    }
}

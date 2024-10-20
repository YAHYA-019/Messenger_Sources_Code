package com.facebook.common.fury.reliability.sapienz;

import X.0eA;
import X.24X;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass244;
import X.C0jk;
import X.C26O;
import X.C27T;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: CustomEventDeserializer.class */
public class CustomEventDeserializer extends JsonDeserializer {
    public static final AnonymousClass244 A00;

    static {
        AnonymousClass244 anonymousClass244 = new AnonymousClass244();
        anonymousClass244.A0X(C26O.A0F);
        A00 = anonymousClass244;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v144, types: [java.util.Map] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        24X A1N = abstractC01033pi.A1N();
        24X A0D = A1N.A0D("time");
        A0D.getClass();
        24X A0D2 = A1N.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0D2.getClass();
        24X A0D3 = A1N.A0D("reqContext");
        A0D3.getClass();
        24X A0D4 = A0D3.A0D(FalcoACSProvider.TAG);
        A0D4.getClass();
        String A0H = A0D4.A0H();
        24X A0D5 = A0D3.A0D("currentTid");
        A0D5.getClass();
        long A07 = A0D5.A07();
        24X A0D6 = A0D3.A0D("currentSeqId");
        A0D6.getClass();
        int A03 = A0D6.A03();
        24X A0D7 = A0D3.A0D("parentTid");
        A0D7.getClass();
        long A072 = A0D7.A07();
        24X A0D8 = A0D3.A0D("parentSeqId");
        A0D8.getClass();
        int A032 = A0D8.A03();
        24X A0D9 = A0D3.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0D9.getClass();
        int A033 = A0D9.A03();
        HashMap A0u = AnonymousClass001.A0u();
        HashMap A0u2 = AnonymousClass001.A0u();
        if (A0D3.A0D("reqChainPropsMap") != null) {
            AnonymousClass244 anonymousClass244 = A00;
            if (anonymousClass244.A0P(A0D3.A0D("reqChainPropsMap"), Map.class) != null) {
                A0u = (Map) anonymousClass244.A0P(A0D3.A0D("reqChainPropsMap"), Map.class);
            }
        }
        if (A0D3.A0D("reqContextPropsMap") != null) {
            AnonymousClass244 anonymousClass2442 = A00;
            if (anonymousClass2442.A0P(A0D3.A0D("reqContextPropsMap"), Map.class) != null) {
                A0u2 = (Map) anonymousClass2442.A0P(A0D3.A0D("reqContextPropsMap"), Map.class);
            }
        }
        0eA r0 = new 0eA(A0H, A0u, A0u2, A03, A032, A033, A07, A072);
        24X A0D10 = A1N.A0D("reason");
        A0D10.getClass();
        24X A0D11 = A1N.A0D("threadName");
        String A0H2 = A0D11 == null ? "DefaultThreadName" : A0D11.A0H();
        24X A0D12 = A1N.A0D("threadId");
        long A073 = A0D12 == null ? -1 : A0D12.A07();
        24X A0D13 = A1N.A0D("throwable");
        A0D13.getClass();
        24X A0D14 = A0D13.A0D("stackTrace");
        Throwable th = new Throwable();
        if (A0D14 != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = A0D14.iterator();
            while (it.hasNext()) {
                A0s.add(A00.A0P((24X) it.next(), StackTraceElement.class));
            }
            th.setStackTrace((StackTraceElement[]) A0s.toArray(new StackTraceElement[A0s.size()]));
        }
        return new C0jk(r0, A0H2, th, A0D2.A03(), A0D10.A03(), A0D.A07(), A073);
    }
}

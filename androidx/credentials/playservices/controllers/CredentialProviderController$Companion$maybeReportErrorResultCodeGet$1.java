package androidx.credentials.playservices.controllers;

import X.04S;
import X.0CL;
import X.C00m;
import X.C00q;
import kotlin.jvm.functions.Function1;

/* loaded from: CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1.class */
public final class CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1 extends C00q implements C00m {
    public final /* synthetic */ 0CL $exception;
    public final /* synthetic */ Function1 $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(Function1 function1, 0CL r303) {
        super(0);
        this.$onError = function1;
        this.$exception = r303;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        m5395invoke();
        return 04S.A00;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5395invoke() {
        this.$onError.invoke(this.$exception.element);
    }
}

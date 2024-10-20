package com.facebook.messaging.customthreads.threadsettings.picker.customtheme.fragment;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.AnonymousClass001;
import X.C44k;
import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import com.facebook.resources.ui.FbLinearLayout;
import kotlin.jvm.functions.Function2;

/* loaded from: GeneratedThemeCreationFragment$showLoadingStateView$2.class */
public final class GeneratedThemeCreationFragment$showLoadingStateView$2 extends 0DO implements Function2 {
    public final /* synthetic */ RuntimeShader $loadingStateBackgroundShader;
    public final /* synthetic */ FbLinearLayout $loadingStateShaderView;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneratedThemeCreationFragment$showLoadingStateView$2(RuntimeShader runtimeShader, FbLinearLayout fbLinearLayout, 0DR r304) {
        super(2, r304);
        this.$loadingStateBackgroundShader = runtimeShader;
        this.$loadingStateShaderView = fbLinearLayout;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new GeneratedThemeCreationFragment$showLoadingStateView$2(this.$loadingStateBackgroundShader, this.$loadingStateShaderView, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        do {
            this.$loadingStateBackgroundShader.setFloatUniform("iTime", ((float) (System.currentTimeMillis() % 100000)) / 1000.0f);
            this.$loadingStateShaderView.setRenderEffect(RenderEffect.createRuntimeShaderEffect(this.$loadingStateBackgroundShader, "background"));
            this.label = 1;
        } while (C44k.A01(this, 10) != r0);
        return r0;
    }
}

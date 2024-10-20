package com.facebook.messaging.media.editing;

import X.2EU;
import X.2IA;
import X.2Wo;
import X.C2532Ggf;
import X.C2rD;
import X.DKC;
import X.HRb;
import X.HTX;
import X.HaN;
import X.Hrs;
import X.IDq;
import X.IlT;
import X.InterfaceC07034in;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.photos.editing.layer.Layer;

/* loaded from: MultimediaEditorPhotoImageViewer.class */
public final class MultimediaEditorPhotoImageViewer extends Layer implements CallerContextable {
    public static final CallerContext A0B = CallerContext.A06(MultimediaEditorPhotoImageViewer.class);
    public Uri A01;
    public View.OnLayoutChangeListener A02;
    public 2EU A03;
    public Hrs A04;
    public HRb A05;
    public HTX A06;
    public IDq A07;
    public final 2Wo A0A;
    public boolean A09 = false;
    public boolean A08 = false;
    public int A00 = -1;

    public MultimediaEditorPhotoImageViewer(2Wo r302) {
        this.A0A = r302;
        IlT.A00(r302, this, 2);
    }

    public void A0A() {
        2Wo r0 = this.A0A;
        if (r0.A00 != null) {
            r0.A02();
            ((ImageView) r0.A01()).setImageBitmap(null);
            2EU r02 = this.A03;
            if (r02 != null) {
                r02.close();
                this.A03 = null;
            }
        }
    }

    public void A0B(Bitmap bitmap, HaN haN) {
        2Wo r0 = this.A0A;
        r0.A03();
        ((ImageView) r0.A01()).setImageBitmap(bitmap);
        Hrs hrs = this.A04;
        if (hrs != null) {
            hrs.A01(haN.A00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0C(Uri uri, HaN haN) {
        uri.getClass();
        this.A01 = uri;
        2Wo r0 = this.A0A;
        r0.A03();
        ImageView imageView = (ImageView) r0.A01();
        Context context = imageView.getContext();
        if (imageView instanceof MultimediaEditorDraweeView) {
            if (this.A00 != -1) {
                ViewGroup.MarginLayoutParams A0I = DKC.A0I(imageView);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(this.A00);
                A0I.setMargins(dimensionPixelSize, 0, dimensionPixelSize, dimensionPixelSize * 2);
                imageView.setLayoutParams(A0I);
            }
            MultimediaEditorDraweeView multimediaEditorDraweeView = (MultimediaEditorDraweeView) imageView;
            CallerContext callerContext = A0B;
            multimediaEditorDraweeView.A0M(InterfaceC07034in.A04);
            2IA A01 = 2IA.A01(uri);
            A01.A07 = new C2rD(0, false);
            multimediaEditorDraweeView.A0J(callerContext, multimediaEditorDraweeView.A02, A01.A04(), true);
            if (this.A08) {
                context.getDrawable(2132345090).A03(new C2532Ggf(context, multimediaEditorDraweeView, this));
            }
        } else {
            imageView.setImageURI(uri);
        }
        Hrs hrs = this.A04;
        if (hrs != null) {
            hrs.A01(haN.A00);
        }
    }
}

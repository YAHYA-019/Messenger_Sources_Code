package com.facebook.tigon.video;

import X.02W;
import X.11T;
import X.43O;
import X.6D3;
import X.6DY;
import X.6DZ;
import X.C0A2;
import X.C42M;
import X.C42N;
import X.C42c;
import X.C42d;
import X.C42g;
import X.C6D4;
import android.net.Uri;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.tigon.TigonCallbacks;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;
import com.facebook.tigon.iface.TigonRequest;
import com.google.common.base.Preconditions;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.apache.http.HttpResponse;

/* loaded from: TigonAttempt$TigonAttemptCallback.class */
public class TigonAttempt$TigonAttemptCallback implements TigonCallbacks {
    public final C6D4 mRequestStartListener;
    public boolean mResponseSet = false;
    public final /* synthetic */ 6DY this$0;

    public TigonAttempt$TigonAttemptCallback(6DY r302, C6D4 c6d4, LigerSamplePolicy ligerSamplePolicy) {
        this.this$0 = r302;
        this.mRequestStartListener = c6d4;
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onBody(ByteBuffer byteBuffer) {
        this.this$0.A06.A05(byteBuffer);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public /* synthetic */ void onBodyExperimental(byte[] bArr) {
        11T.A0F(bArr, 1);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        11T.A0D(wrap);
        onBody(wrap);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onEOM(C42g c42g) {
        this.this$0.A06.A03();
        this.this$0.A03 = (C42d) c42g.AtR(43O.A0A);
        this.this$0.A02 = (C42c) c42g.AtR(43O.A04);
        6DY.A00(this.this$0).onEOM(c42g);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onError(TigonError tigonError, C42g c42g) {
        TigonErrorException tigonErrorException = new TigonErrorException(tigonError);
        this.this$0.A06.A04(tigonErrorException);
        if (!this.mResponseSet) {
            6DZ r0 = this.this$0.A09;
            synchronized (r0) {
                boolean z = false;
                if (!r0.A02) {
                    z = true;
                }
                02W.A05(z);
                tigonErrorException.getClass();
                r0.A00 = tigonErrorException;
                r0.A02 = true;
                r0.notifyAll();
            }
        }
        6DY.A00(this.this$0).onError(c42g, tigonErrorException);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onFirstByteFlushed(long j) {
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onHeaderBytesReceived(long j, long j2) {
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onLastByteAcked(long j, long j2) {
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onResponse(C42M c42m) {
        this.mResponseSet = true;
        6DZ r0 = this.this$0.A09;
        synchronized (r0) {
            boolean z = false;
            if (!r0.A02) {
                z = true;
            }
            02W.A05(z);
            r0.A01 = c42m;
            r0.A02 = true;
            r0.notifyAll();
        }
        HttpResponse A01 = C42N.A01(c42m);
        6DY r02 = this.this$0;
        InputStream interceptResponseStream = 6DY.A00(r02).interceptResponseStream(r02.A06);
        if (interceptResponseStream != null) {
            A01.setEntity(C42N.A00(c42m, interceptResponseStream));
        }
        6DY.A00(this.this$0).onResponse(A01);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onStarted(TigonRequest tigonRequest) {
        6D3 r0 = this.mRequestStartListener;
        if (r0 != null) {
            r0.A00.CH4();
        }
        6DY r02 = this.this$0;
        Uri A03 = C0A2.A03(tigonRequest.url());
        synchronized (r02) {
            r02.A01 = A03;
        }
        6DY.A00(this.this$0).onStarted(tigonRequest);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onUploadProgress(long j, long j2) {
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public void onWillRetry(TigonError tigonError, C42g c42g) {
        Preconditions.checkState(!this.mResponseSet);
        6DY r0 = this.this$0;
        6DY.A00(r0).onWillRetry(tigonError, c42g, r0.A00);
        this.this$0.A00++;
    }
}

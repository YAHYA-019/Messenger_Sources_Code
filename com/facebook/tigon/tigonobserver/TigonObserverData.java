package com.facebook.tigon.tigonobserver;

import X.42E;
import X.42F;
import X.4OD;
import X.C42M;
import X.C42g;
import android.os.SystemClock;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonRequest;

/* loaded from: TigonObserverData.class */
public class TigonObserverData implements TigonRequestErrored {
    public int mAttempts;
    public long mCreationTime = SystemClock.uptimeMillis();
    public TigonError mError;
    public long mRequestId;
    public C42M mResponse;
    public TigonRequest mSentRequest;
    public TigonRequest mSubmittedRequest;
    public C42g mSummary;

    public TigonObserverData(long j, TigonRequest tigonRequest, byte[] bArr, int i) {
        this.mRequestId = j;
        this.mSubmittedRequest = tigonRequest == null ? 42E.A03(bArr, i) : tigonRequest;
    }

    private void onEom(byte[] bArr, int i) {
        this.mError = null;
        this.mSummary = 42E.A01(bArr, i);
    }

    private void onError(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.mError = 42E.A00(bArr, i);
        this.mSummary = 42E.A01(bArr2, i2);
    }

    private void onResponse(byte[] bArr, int i) {
        42F r0 = new 42F(bArr, i);
        this.mResponse = new C42M(4OD.A00(r0), 42E.A00.A03(r0));
    }

    private void onStarted(int i, byte[] bArr, int i2) {
        this.mAttempts = i;
        this.mSentRequest = 42E.A03(bArr, i2);
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestStarted
    public int attempts() {
        return this.mAttempts;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestAdded
    public long creationTime() {
        return this.mCreationTime;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestErrored
    public TigonError error() {
        return this.mError;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestAdded
    public long requestId() {
        return this.mRequestId;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestResponse
    public C42M response() {
        return this.mResponse;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestAdded
    public TigonRequest submittedRequest() {
        return this.mSubmittedRequest;
    }

    @Override // com.facebook.tigon.tigonobserver.TigonRequestSucceeded
    public C42g summary() {
        return this.mSummary;
    }
}

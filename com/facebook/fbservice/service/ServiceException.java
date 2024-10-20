package com.facebook.fbservice.service;

import X.29B;
import X.C2xc;
import X.C3Oo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* loaded from: ServiceException.class */
public final class ServiceException extends Exception implements Parcelable, Serializable {
    public static final ServiceException A00 = new ServiceException(OperationResult.A00);
    public static final Parcelable.Creator CREATOR = new C2xc(8);
    public static final long serialVersionUID = 1;
    public 29B errorCode;
    public OperationResult result;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ServiceException(com.facebook.fbservice.service.OperationResult r302) {
        /*
            r301 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r303 = r0
            r0 = r303
            r0.<init>()
            r0 = r302
            X.29B r0 = r0.errorCode
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r303
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r302
            java.lang.String r0 = r0.errorDescription
            r304 = r0
            r0 = r303
            r1 = r304
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r303
            java.lang.String r0 = r0.toString()
            r303 = r0
            r0 = r302
            java.lang.Throwable r0 = r0.errorThrowable
            r304 = r0
            r0 = r301
            r1 = r303
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r302
            X.29B r0 = r0.errorCode
            r304 = r0
            r0 = r301
            r1 = r304
            r0.errorCode = r1
            r0 = r301
            r1 = r302
            r0.result = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbservice.service.ServiceException.<init>(com.facebook.fbservice.service.OperationResult):void");
    }

    public static ServiceException A00(Throwable th) {
        if (th instanceof ServiceException) {
            return (ServiceException) th;
        }
        29B A01 = C3Oo.A01(th);
        Bundle A002 = C3Oo.A00(th);
        A002.putInt("resultType", 1);
        return new ServiceException(new OperationResult(A002, A01, A01.toString(), th));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.errorCode = (29B) objectInputStream.readObject();
        this.result = (OperationResult) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.errorCode);
        objectOutputStream.writeObject(this.result);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return StringFormatUtil.formatStrLocaleSafe("ServiceException errorCode=%s, result=%s", this.errorCode.name(), this.result.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.errorCode);
        parcel.writeParcelable(this.result, i);
    }
}

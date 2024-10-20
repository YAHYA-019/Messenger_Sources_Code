package com.facebook.messaging.nativepagereply.faq.data.model;

import X.11T;
import X.4YV;
import X.82M;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AutomatedResponseCustomQuestionDetailsModel.class */
public final class AutomatedResponseCustomQuestionDetailsModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(70);
    public final AutomatedResponseCustomQuestionListModel A00;
    public final AutomatedResponseCustomQuestionSettingModel A01;

    public AutomatedResponseCustomQuestionDetailsModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        AutomatedResponseCustomQuestionSettingModel automatedResponseCustomQuestionSettingModel = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (AutomatedResponseCustomQuestionListModel) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readInt() != 0 ? (AutomatedResponseCustomQuestionSettingModel) parcel.readParcelable(A0e) : automatedResponseCustomQuestionSettingModel;
    }

    public AutomatedResponseCustomQuestionDetailsModel(AutomatedResponseCustomQuestionListModel automatedResponseCustomQuestionListModel, AutomatedResponseCustomQuestionSettingModel automatedResponseCustomQuestionSettingModel) {
        this.A00 = automatedResponseCustomQuestionListModel;
        this.A01 = automatedResponseCustomQuestionSettingModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AutomatedResponseCustomQuestionDetailsModel)) {
                return false;
            }
            AutomatedResponseCustomQuestionDetailsModel automatedResponseCustomQuestionDetailsModel = (AutomatedResponseCustomQuestionDetailsModel) obj;
            if (!11T.A0O(this.A00, automatedResponseCustomQuestionDetailsModel.A00) || !11T.A0O(this.A01, automatedResponseCustomQuestionDetailsModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
    }
}

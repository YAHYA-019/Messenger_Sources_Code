package com.facebook.phonenumbers;

import X.1BK;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: Phonemetadata$NumberFormat.class */
public class Phonemetadata$NumberFormat implements Externalizable {
    public static final long serialVersionUID = 1;
    public boolean hasDomesticCarrierCodeFormattingRule;
    public boolean hasFormat;
    public boolean hasNationalPrefixFormattingRule;
    public boolean hasNationalPrefixOptionalWhenFormatting;
    public boolean hasPattern;
    public String pattern_ = "";
    public String format_ = "";
    public List leadingDigitsPattern_ = new ArrayList();
    public String nationalPrefixFormattingRule_ = "";
    public boolean nationalPrefixOptionalWhenFormatting_ = false;
    public String domesticCarrierCodeFormattingRule_ = "";

    public Phonemetadata$NumberFormat mergeFrom(Phonemetadata$NumberFormat phonemetadata$NumberFormat) {
        if (phonemetadata$NumberFormat.hasPattern) {
            String str = phonemetadata$NumberFormat.pattern_;
            this.hasPattern = true;
            this.pattern_ = str;
        }
        if (phonemetadata$NumberFormat.hasFormat) {
            String str2 = phonemetadata$NumberFormat.format_;
            this.hasFormat = true;
            this.format_ = str2;
        }
        int size = phonemetadata$NumberFormat.leadingDigitsPattern_.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            Object obj = phonemetadata$NumberFormat.leadingDigitsPattern_.get(i2);
            obj.getClass();
            this.leadingDigitsPattern_.add(obj);
            i = i2 + 1;
        }
        if (phonemetadata$NumberFormat.hasNationalPrefixFormattingRule) {
            String str3 = phonemetadata$NumberFormat.nationalPrefixFormattingRule_;
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = str3;
        }
        if (phonemetadata$NumberFormat.hasDomesticCarrierCodeFormattingRule) {
            String str4 = phonemetadata$NumberFormat.domesticCarrierCodeFormattingRule_;
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = str4;
        }
        boolean z = phonemetadata$NumberFormat.nationalPrefixOptionalWhenFormatting_;
        this.hasNationalPrefixOptionalWhenFormatting = true;
        this.nationalPrefixOptionalWhenFormatting_ = z;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        String readUTF = objectInput.readUTF();
        this.hasPattern = true;
        this.pattern_ = readUTF;
        String readUTF2 = objectInput.readUTF();
        this.hasFormat = true;
        this.format_ = readUTF2;
        int readInt = objectInput.readInt();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                break;
            }
            this.leadingDigitsPattern_.add(objectInput.readUTF());
            i = i2 + 1;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = readUTF4;
        }
        boolean readBoolean = objectInput.readBoolean();
        this.hasNationalPrefixOptionalWhenFormatting = true;
        this.nationalPrefixOptionalWhenFormatting_ = readBoolean;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.pattern_);
        objectOutput.writeUTF(this.format_);
        int size = this.leadingDigitsPattern_.size();
        objectOutput.writeInt(size);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            objectOutput.writeUTF(1BK.A14(this.leadingDigitsPattern_, i2));
            i = i2 + 1;
        }
        objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
        if (this.hasNationalPrefixFormattingRule) {
            objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
        }
        objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
        if (this.hasDomesticCarrierCodeFormattingRule) {
            objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
        }
        objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
    }
}

package com.facebook.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* loaded from: Phonemetadata$PhoneMetadata.class */
public class Phonemetadata$PhoneMetadata implements Externalizable {
    public static final long serialVersionUID = 1;
    public boolean hasCarrierSpecific;
    public boolean hasCountryCode;
    public boolean hasEmergency;
    public boolean hasFixedLine;
    public boolean hasGeneralDesc;
    public boolean hasId;
    public boolean hasInternationalPrefix;
    public boolean hasLeadingDigits;
    public boolean hasLeadingZeroPossible;
    public boolean hasMainCountryForCode;
    public boolean hasMobile;
    public boolean hasMobileNumberPortableRegion;
    public boolean hasNationalPrefix;
    public boolean hasNationalPrefixForParsing;
    public boolean hasNationalPrefixTransformRule;
    public boolean hasNoInternationalDialling;
    public boolean hasPager;
    public boolean hasPersonalNumber;
    public boolean hasPreferredExtnPrefix;
    public boolean hasPreferredInternationalPrefix;
    public boolean hasPremiumRate;
    public boolean hasSameMobileAndFixedLinePattern;
    public boolean hasSharedCost;
    public boolean hasShortCode;
    public boolean hasStandardRate;
    public boolean hasTollFree;
    public boolean hasUan;
    public boolean hasVoicemail;
    public boolean hasVoip;
    public Phonemetadata$PhoneNumberDesc generalDesc_ = null;
    public Phonemetadata$PhoneNumberDesc fixedLine_ = null;
    public Phonemetadata$PhoneNumberDesc mobile_ = null;
    public Phonemetadata$PhoneNumberDesc tollFree_ = null;
    public Phonemetadata$PhoneNumberDesc premiumRate_ = null;
    public Phonemetadata$PhoneNumberDesc sharedCost_ = null;
    public Phonemetadata$PhoneNumberDesc personalNumber_ = null;
    public Phonemetadata$PhoneNumberDesc voip_ = null;
    public Phonemetadata$PhoneNumberDesc pager_ = null;
    public Phonemetadata$PhoneNumberDesc uan_ = null;
    public Phonemetadata$PhoneNumberDesc emergency_ = null;
    public Phonemetadata$PhoneNumberDesc voicemail_ = null;
    public Phonemetadata$PhoneNumberDesc shortCode_ = null;
    public Phonemetadata$PhoneNumberDesc standardRate_ = null;
    public Phonemetadata$PhoneNumberDesc carrierSpecific_ = null;
    public Phonemetadata$PhoneNumberDesc noInternationalDialling_ = null;
    public String id_ = "";
    public int countryCode_ = 0;
    public String internationalPrefix_ = "";
    public String preferredInternationalPrefix_ = "";
    public String nationalPrefix_ = "";
    public String preferredExtnPrefix_ = "";
    public String nationalPrefixForParsing_ = "";
    public String nationalPrefixTransformRule_ = "";
    public boolean sameMobileAndFixedLinePattern_ = false;
    public List numberFormat_ = new ArrayList();
    public List intlNumberFormat_ = new ArrayList();
    public boolean mainCountryForCode_ = false;
    public String leadingDigits_ = "";
    public boolean leadingZeroPossible_ = false;
    public boolean mobileNumberPortableRegion_ = false;

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc.readExternal(objectInput);
            this.hasGeneralDesc = true;
            this.generalDesc_ = phonemetadata$PhoneNumberDesc;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc2 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc2.readExternal(objectInput);
            this.hasFixedLine = true;
            this.fixedLine_ = phonemetadata$PhoneNumberDesc2;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc3 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc3.readExternal(objectInput);
            this.hasMobile = true;
            this.mobile_ = phonemetadata$PhoneNumberDesc3;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc4 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc4.readExternal(objectInput);
            this.hasTollFree = true;
            this.tollFree_ = phonemetadata$PhoneNumberDesc4;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc5 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc5.readExternal(objectInput);
            this.hasPremiumRate = true;
            this.premiumRate_ = phonemetadata$PhoneNumberDesc5;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc6 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc6.readExternal(objectInput);
            this.hasSharedCost = true;
            this.sharedCost_ = phonemetadata$PhoneNumberDesc6;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc7 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc7.readExternal(objectInput);
            this.hasPersonalNumber = true;
            this.personalNumber_ = phonemetadata$PhoneNumberDesc7;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc8 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc8.readExternal(objectInput);
            this.hasVoip = true;
            this.voip_ = phonemetadata$PhoneNumberDesc8;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc9 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc9.readExternal(objectInput);
            this.hasPager = true;
            this.pager_ = phonemetadata$PhoneNumberDesc9;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc10 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc10.readExternal(objectInput);
            this.hasUan = true;
            this.uan_ = phonemetadata$PhoneNumberDesc10;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc11 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc11.readExternal(objectInput);
            this.hasEmergency = true;
            this.emergency_ = phonemetadata$PhoneNumberDesc11;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc12 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc12.readExternal(objectInput);
            this.hasVoicemail = true;
            this.voicemail_ = phonemetadata$PhoneNumberDesc12;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc13 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc13.readExternal(objectInput);
            this.hasShortCode = true;
            this.shortCode_ = phonemetadata$PhoneNumberDesc13;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc14 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc14.readExternal(objectInput);
            this.hasStandardRate = true;
            this.standardRate_ = phonemetadata$PhoneNumberDesc14;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc15 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc15.readExternal(objectInput);
            this.hasCarrierSpecific = true;
            this.carrierSpecific_ = phonemetadata$PhoneNumberDesc15;
        }
        if (objectInput.readBoolean()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc16 = new Phonemetadata$PhoneNumberDesc();
            phonemetadata$PhoneNumberDesc16.readExternal(objectInput);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = phonemetadata$PhoneNumberDesc16;
        }
        String readUTF = objectInput.readUTF();
        this.hasId = true;
        this.id_ = readUTF;
        int readInt = objectInput.readInt();
        this.hasCountryCode = true;
        this.countryCode_ = readInt;
        String readUTF2 = objectInput.readUTF();
        this.hasInternationalPrefix = true;
        this.internationalPrefix_ = readUTF2;
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = readUTF5;
        }
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = readUTF6;
        }
        if (objectInput.readBoolean()) {
            String readUTF7 = objectInput.readUTF();
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = readUTF7;
        }
        boolean readBoolean = objectInput.readBoolean();
        this.hasSameMobileAndFixedLinePattern = true;
        this.sameMobileAndFixedLinePattern_ = readBoolean;
        int readInt2 = objectInput.readInt();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt2) {
                break;
            }
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat.readExternal(objectInput);
            this.numberFormat_.add(phonemetadata$NumberFormat);
            i = i2 + 1;
        }
        int readInt3 = objectInput.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat2 = new Phonemetadata$NumberFormat();
            phonemetadata$NumberFormat2.readExternal(objectInput);
            this.intlNumberFormat_.add(phonemetadata$NumberFormat2);
        }
        boolean readBoolean2 = objectInput.readBoolean();
        this.hasMainCountryForCode = true;
        this.mainCountryForCode_ = readBoolean2;
        if (objectInput.readBoolean()) {
            String readUTF8 = objectInput.readUTF();
            this.hasLeadingDigits = true;
            this.leadingDigits_ = readUTF8;
        }
        boolean readBoolean3 = objectInput.readBoolean();
        this.hasLeadingZeroPossible = true;
        this.leadingZeroPossible_ = readBoolean3;
        boolean readBoolean4 = objectInput.readBoolean();
        this.hasMobileNumberPortableRegion = true;
        this.mobileNumberPortableRegion_ = readBoolean4;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.hasGeneralDesc);
        if (this.hasGeneralDesc) {
            this.generalDesc_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasFixedLine);
        if (this.hasFixedLine) {
            this.fixedLine_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasMobile);
        if (this.hasMobile) {
            this.mobile_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasTollFree);
        if (this.hasTollFree) {
            this.tollFree_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPremiumRate);
        if (this.hasPremiumRate) {
            this.premiumRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSharedCost);
        if (this.hasSharedCost) {
            this.sharedCost_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPersonalNumber);
        if (this.hasPersonalNumber) {
            this.personalNumber_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoip);
        if (this.hasVoip) {
            this.voip_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPager);
        if (this.hasPager) {
            this.pager_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasUan);
        if (this.hasUan) {
            this.uan_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasEmergency);
        if (this.hasEmergency) {
            this.emergency_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoicemail);
        if (this.hasVoicemail) {
            this.voicemail_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasShortCode);
        if (this.hasShortCode) {
            this.shortCode_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasStandardRate);
        if (this.hasStandardRate) {
            this.standardRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasCarrierSpecific);
        if (this.hasCarrierSpecific) {
            this.carrierSpecific_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasNoInternationalDialling);
        if (this.hasNoInternationalDialling) {
            this.noInternationalDialling_.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.id_);
        objectOutput.writeInt(this.countryCode_);
        objectOutput.writeUTF(this.internationalPrefix_);
        objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
        if (this.hasPreferredInternationalPrefix) {
            objectOutput.writeUTF(this.preferredInternationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefix);
        if (this.hasNationalPrefix) {
            objectOutput.writeUTF(this.nationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
        if (this.hasPreferredExtnPrefix) {
            objectOutput.writeUTF(this.preferredExtnPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
        if (this.hasNationalPrefixForParsing) {
            objectOutput.writeUTF(this.nationalPrefixForParsing_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
        if (this.hasNationalPrefixTransformRule) {
            objectOutput.writeUTF(this.nationalPrefixTransformRule_);
        }
        objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
        int size = this.numberFormat_.size();
        objectOutput.writeInt(size);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            ((Phonemetadata$NumberFormat) this.numberFormat_.get(i2)).writeExternal(objectOutput);
            i = i2 + 1;
        }
        int size2 = this.intlNumberFormat_.size();
        objectOutput.writeInt(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            ((Phonemetadata$NumberFormat) this.intlNumberFormat_.get(i3)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.mainCountryForCode_);
        objectOutput.writeBoolean(this.hasLeadingDigits);
        if (this.hasLeadingDigits) {
            objectOutput.writeUTF(this.leadingDigits_);
        }
        objectOutput.writeBoolean(this.leadingZeroPossible_);
        objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
    }
}

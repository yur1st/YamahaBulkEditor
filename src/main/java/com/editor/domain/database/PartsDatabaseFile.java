
package com.editor.domain.database;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastEditing">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Date" type="{}Wstring" />
 *                 &lt;attribute name="Time" type="{}Wstring" />
 *                 &lt;attribute name="VersionNo" type="{}Wstring" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Part" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Part_001">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PartsName" type="{}Wstring" />
 *                           &lt;attribute name="Comment" type="{}Wstring" />
 *                           &lt;attribute name="DatabaseNo" type="{}Wstring" />
 *                           &lt;attribute name="LibraryUse" type="{}Wstring" />
 *                           &lt;attribute name="LibraryFolder" type="{}Wstring" />
 *                           &lt;attribute name="LibraryPath" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_002">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ShapeType" type="{}Wstring" />
 *                           &lt;attribute name="Package" type="{}Wstring" />
 *                           &lt;attribute name="FdrType" type="{}Wstring" />
 *                           &lt;attribute name="ReelDiameter" type="{}Wstring" />
 *                           &lt;attribute name="BitFlags" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_003">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Setno" type="{}Wstring" />
 *                           &lt;attribute name="Definition" type="{}Wstring" />
 *                           &lt;attribute name="XPos" type="{}Wstring" />
 *                           &lt;attribute name="YPos" type="{}Wstring" />
 *                           &lt;attribute name="FdrIdxStep" type="{}Wstring" />
 *                           &lt;attribute name="FdrIdxSpeed" type="{}Wstring" />
 *                           &lt;attribute name="FeederTimerOffset" type="{}Wstring" />
 *                           &lt;attribute name="Optimize" type="{}Wstring" />
 *                           &lt;attribute name="PartsGroupNo" type="{}Wstring" />
 *                           &lt;attribute name="FixCmp" type="{}Wstring" />
 *                           &lt;attribute name="SwFdr" type="{}Wstring" />
 *                           &lt;attribute name="PitchEffect" type="{}Wstring" />
 *                           &lt;attribute name="Correct3A" type="{}Wstring" />
 *                           &lt;attribute name="UnitNo" type="{}Wstring" />
 *                           &lt;attribute name="PickPosCheck" type="{}Wstring" />
 *                           &lt;attribute name="PickToleranceX" type="{}Wstring" />
 *                           &lt;attribute name="PickToleranceY" type="{}Wstring" />
 *                           &lt;attribute name="BoardDataTuning" type="{}Wstring" />
 *                           &lt;attribute name="ToleranceTuning" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_012">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BodyX" type="{}Wstring" />
 *                           &lt;attribute name="BodyY" type="{}Wstring" />
 *                           &lt;attribute name="BodyZ" type="{}Wstring" />
 *                           &lt;attribute name="MoldX" type="{}Wstring" />
 *                           &lt;attribute name="MoldY" type="{}Wstring" />
 *                           &lt;attribute name="MoldZ" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_028">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetE" type="{}Wstring" />
 *                           &lt;attribute name="RlrWidth" type="{}Wstring" />
 *                           &lt;attribute name="LeadNumE" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchE" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthE" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthE" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_070">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Alignment" type="{}Wstring" />
 *                           &lt;attribute name="AlignRefSubMlt" type="{}Wstring" />
 *                           &lt;attribute name="AlignRefSubSgl" type="{}Wstring" />
 *                           &lt;attribute name="AlignRefSubScan" type="{}Wstring" />
 *                           &lt;attribute name="AutoThreshold" type="{}Wstring" />
 *                           &lt;attribute name="Threshold" type="{}Wstring" />
 *                           &lt;attribute name="Tolerance" type="{}Wstring" />
 *                           &lt;attribute name="SearchArea" type="{}Wstring" />
 *                           &lt;attribute name="DatumAngle" type="{}Wstring" />
 *                           &lt;attribute name="MultiMACS" type="{}Wstring" />
 *                           &lt;attribute name="OffsetRec" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_072">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LightSetting" type="{}Wstring" />
 *                           &lt;attribute name="LightLevel" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_074">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CoplaLevel" type="{}Wstring" />
 *                           &lt;attribute name="CoplaThreshold" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_076">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LightMode" type="{}Wstring" />
 *                           &lt;attribute name="MainLightLevel" type="{}Wstring" />
 *                           &lt;attribute name="CoaxsLightLevel" type="{}Wstring" />
 *                           &lt;attribute name="SideLightLevel" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_310">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="DDDExecPass" type="{}Wstring" />
 *                           &lt;attribute name="DDDThreNmlCam" type="{}Wstring" />
 *                           &lt;attribute name="DDDThreSlantCam" type="{}Wstring" />
 *                           &lt;attribute name="DDDLightCoaxNmlCam" type="{}Wstring" />
 *                           &lt;attribute name="DDDLightCoaxSlantCam" type="{}Wstring" />
 *                           &lt;attribute name="DDDLightMainSlantCam" type="{}Wstring" />
 *                           &lt;attribute name="DDDLightSideSlantCam" type="{}Wstring" />
 *                           &lt;attribute name="DDDBrightAreaNmlCam" type="{}Wstring" />
 *                           &lt;attribute name="DDDBrightAreaSlantCam" type="{}Wstring" />
 *                           &lt;attribute name="DDDPermitTol" type="{}Wstring" />
 *                           &lt;attribute name="DDDHeightCheck" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_080">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Nozzle" type="{}Wstring" />
 *                           &lt;attribute name="XYSpeed" type="{}Wstring" />
 *                           &lt;attribute name="ConvYSpeed" type="{}Wstring" />
 *                           &lt;attribute name="FdrAngle" type="{}Wstring" />
 *                           &lt;attribute name="VacChk" type="{}Wstring" />
 *                           &lt;attribute name="CorrectPos" type="{}Wstring" />
 *                           &lt;attribute name="Action" type="{}Wstring" />
 *                           &lt;attribute name="PickStart" type="{}Wstring" />
 *                           &lt;attribute name="Dump" type="{}Wstring" />
 *                           &lt;attribute name="Retry" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_081">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PckHeight" type="{}Wstring" />
 *                           &lt;attribute name="PckTimer" type="{}Wstring" />
 *                           &lt;attribute name="PckSpeed" type="{}Wstring" />
 *                           &lt;attribute name="PckVLevel" type="{}Wstring" />
 *                           &lt;attribute name="PckSingleDir" type="{}Wstring" />
 *                           &lt;attribute name="PckCtrlDown" type="{}Wstring" />
 *                           &lt;attribute name="PckCtrlUp" type="{}Wstring" />
 *                           &lt;attribute name="NozzleTouchHeight" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_083">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="MntHeight" type="{}Wstring" />
 *                           &lt;attribute name="MntTimer" type="{}Wstring" />
 *                           &lt;attribute name="MntSpeed" type="{}Wstring" />
 *                           &lt;attribute name="MntPLevel" type="{}Wstring" />
 *                           &lt;attribute name="MntSingleDir" type="{}Wstring" />
 *                           &lt;attribute name="MntCtrlDown" type="{}Wstring" />
 *                           &lt;attribute name="MntCtrlUp" type="{}Wstring" />
 *                           &lt;attribute name="MntInsertLength" type="{}Wstring" />
 *                           &lt;attribute name="MntInsertShortDistance" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_300">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Pck2ndSrvDown" type="{}Wstring" />
 *                           &lt;attribute name="Pck2ndSrvUp" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_301">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Mnt2ndSrvDown" type="{}Wstring" />
 *                           &lt;attribute name="Mnt2ndSrvUp" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_302">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PckForceExist" type="{}Wstring" />
 *                           &lt;attribute name="PckForceTarget" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_303">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="MntForceExist" type="{}Wstring" />
 *                           &lt;attribute name="MntForceTarget" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_200">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="DspCType" type="{}Wstring" />
 *                           &lt;attribute name="DNozzle" type="{}Wstring" />
 *                           &lt;attribute name="Dtimer" type="{}Wstring" />
 *                           &lt;attribute name="DXpos" type="{}Wstring" />
 *                           &lt;attribute name="DYpos" type="{}Wstring" />
 *                           &lt;attribute name="DspAngle" type="{}Wstring" />
 *                           &lt;attribute name="DXpt" type="{}Wstring" />
 *                           &lt;attribute name="DYpt" type="{}Wstring" />
 *                           &lt;attribute name="DXtime" type="{}Wstring" />
 *                           &lt;attribute name="DYtime" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_500">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Category" type="{}Wstring" />
 *                           &lt;attribute name="DipAct" type="{}Wstring" />
 *                           &lt;attribute name="StampAct" type="{}Wstring" />
 *                           &lt;attribute name="Marking" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_501">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Option1StationNo" type="{}Wstring" />
 *                           &lt;attribute name="Option1WaitVision" type="{}Wstring" />
 *                           &lt;attribute name="Option1DownSequenceAir" type="{}Wstring" />
 *                           &lt;attribute name="Option12ndSrvDown" type="{}Wstring" />
 *                           &lt;attribute name="Option1DownSpeed" type="{}Wstring" />
 *                           &lt;attribute name="Option1LowendHeight" type="{}Wstring" />
 *                           &lt;attribute name="Option1LowendTimer" type="{}Wstring" />
 *                           &lt;attribute name="Option1UpSequenceAir" type="{}Wstring" />
 *                           &lt;attribute name="Option12ndSrvUp" type="{}Wstring" />
 *                           &lt;attribute name="Option1UpSpeed" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_502">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Option1ForceExist" type="{}Wstring" />
 *                           &lt;attribute name="Option1ForceTarget" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_520">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SVUse" type="{}Wstring" />
 *                           &lt;attribute name="SVBringBack" type="{}Wstring" />
 *                           &lt;attribute name="SVBodyLimit" type="{}Wstring" />
 *                           &lt;attribute name="SVReverseCheck" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_103">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TrayYiSize" type="{}Wstring" />
 *                           &lt;attribute name="CountStp" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_107">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TrayYiCur" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_016">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BodyX" type="{}Wstring" />
 *                           &lt;attribute name="BodyY" type="{}Wstring" />
 *                           &lt;attribute name="BodyZ" type="{}Wstring" />
 *                           &lt;attribute name="OffsetX" type="{}Wstring" />
 *                           &lt;attribute name="OffsetY" type="{}Wstring" />
 *                           &lt;attribute name="OffsetR" type="{}Wstring" />
 *                           &lt;attribute name="MoldX" type="{}Wstring" />
 *                           &lt;attribute name="MoldY" type="{}Wstring" />
 *                           &lt;attribute name="MoldZ" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_023">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffset" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidth" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_062">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Algorithm" type="{}Wstring" />
 *                           &lt;attribute name="BaseVType" type="{}Wstring" />
 *                           &lt;attribute name="Option1" type="{}Wstring" />
 *                           &lt;attribute name="Option2" type="{}Wstring" />
 *                           &lt;attribute name="Option3" type="{}Wstring" />
 *                           &lt;attribute name="Option4" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_013">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BodyX" type="{}Wstring" />
 *                           &lt;attribute name="BodyY" type="{}Wstring" />
 *                           &lt;attribute name="BodyZ" type="{}Wstring" />
 *                           &lt;attribute name="MoldX" type="{}Wstring" />
 *                           &lt;attribute name="MoldY" type="{}Wstring" />
 *                           &lt;attribute name="MoldZ" type="{}Wstring" />
 *                           &lt;attribute name="Thicknesschk" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_021">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffset" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_071">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Alignment" type="{}Wstring" />
 *                           &lt;attribute name="AlignRefSubMlt" type="{}Wstring" />
 *                           &lt;attribute name="AlignRefSubSgl" type="{}Wstring" />
 *                           &lt;attribute name="AlignRefSubScan" type="{}Wstring" />
 *                           &lt;attribute name="AutoThreshold" type="{}Wstring" />
 *                           &lt;attribute name="Threshold" type="{}Wstring" />
 *                           &lt;attribute name="Tolerance" type="{}Wstring" />
 *                           &lt;attribute name="SearchArea" type="{}Wstring" />
 *                           &lt;attribute name="DatumAngle" type="{}Wstring" />
 *                           &lt;attribute name="CompIntensity" type="{}Wstring" />
 *                           &lt;attribute name="MultiMACS" type="{}Wstring" />
 *                           &lt;attribute name="OffsetRec" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_025">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffset" type="{}Wstring" />
 *                           &lt;attribute name="RlrWidth" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidth" type="{}Wstring" />
 *                           &lt;attribute name="LeadLength" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_033">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumN" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchN" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_034">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumS" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchS" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_029">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumN" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_031">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumE" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_026">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffset" type="{}Wstring" />
 *                           &lt;attribute name="RlrWidth" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitch" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidth" type="{}Wstring" />
 *                           &lt;attribute name="LeadLength" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_064">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Recognition" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_073">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LightSetting" type="{}Wstring" />
 *                           &lt;attribute name="LightLevel" type="{}Wstring" />
 *                           &lt;attribute name="AllLightOn" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_027">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffset" type="{}Wstring" />
 *                           &lt;attribute name="RlrWidth" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitch" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidth" type="{}Wstring" />
 *                           &lt;attribute name="LeadLength" type="{}Wstring" />
 *                           &lt;attribute name="BumpMask" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_082">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PckTimer" type="{}Wstring" />
 *                           &lt;attribute name="PckSpeed" type="{}Wstring" />
 *                           &lt;attribute name="PckVLevel" type="{}Wstring" />
 *                           &lt;attribute name="PckSingleDir" type="{}Wstring" />
 *                           &lt;attribute name="PckCtrlDown" type="{}Wstring" />
 *                           &lt;attribute name="PckCtrlUp" type="{}Wstring" />
 *                           &lt;attribute name="NozzleTouchHeight" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_101">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TrayXSize" type="{}Wstring" />
 *                           &lt;attribute name="TrayYSize" type="{}Wstring" />
 *                           &lt;attribute name="TrayXpt" type="{}Wstring" />
 *                           &lt;attribute name="TrayYpt" type="{}Wstring" />
 *                           &lt;attribute name="TrayZpt" type="{}Wstring" />
 *                           &lt;attribute name="TrayThickness" type="{}Wstring" />
 *                           &lt;attribute name="TraySt" type="{}Wstring" />
 *                           &lt;attribute name="TrayEn" type="{}Wstring" />
 *                           &lt;attribute name="TrayXiSize" type="{}Wstring" />
 *                           &lt;attribute name="TrayYiSize" type="{}Wstring" />
 *                           &lt;attribute name="TrayXipt" type="{}Wstring" />
 *                           &lt;attribute name="TrayYipt" type="{}Wstring" />
 *                           &lt;attribute name="CountStp" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_106">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TrayXCur" type="{}Wstring" />
 *                           &lt;attribute name="TrayYCur" type="{}Wstring" />
 *                           &lt;attribute name="TrayCur" type="{}Wstring" />
 *                           &lt;attribute name="TrayXiCur" type="{}Wstring" />
 *                           &lt;attribute name="TrayYiCur" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_108">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LhAccel" type="{}Wstring" />
 *                           &lt;attribute name="LtAccel" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_014">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BodyX" type="{}Wstring" />
 *                           &lt;attribute name="BodyY" type="{}Wstring" />
 *                           &lt;attribute name="BodyZ" type="{}Wstring" />
 *                           &lt;attribute name="OffsetX" type="{}Wstring" />
 *                           &lt;attribute name="OffsetY" type="{}Wstring" />
 *                           &lt;attribute name="MoldX" type="{}Wstring" />
 *                           &lt;attribute name="MoldY" type="{}Wstring" />
 *                           &lt;attribute name="MoldZ" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_022">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrWidth" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_036">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetN" type="{}Wstring" />
 *                           &lt;attribute name="LeadNumN" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchN" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthN" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthN" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_037">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetS" type="{}Wstring" />
 *                           &lt;attribute name="LeadNumS" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchS" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthS" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthS" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_040">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetN" type="{}Wstring" />
 *                           &lt;attribute name="LeadNumN" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchN" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthN" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthN" type="{}Wstring" />
 *                           &lt;attribute name="OffLeadStartN" type="{}Wstring" />
 *                           &lt;attribute name="OffLeadEndN" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_041">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetS" type="{}Wstring" />
 *                           &lt;attribute name="LeadNumS" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchS" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthS" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthS" type="{}Wstring" />
 *                           &lt;attribute name="OffLeadStartS" type="{}Wstring" />
 *                           &lt;attribute name="OffLeadEndS" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_042">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetE" type="{}Wstring" />
 *                           &lt;attribute name="LeadNumE" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchE" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthE" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthE" type="{}Wstring" />
 *                           &lt;attribute name="OffLeadStartE" type="{}Wstring" />
 *                           &lt;attribute name="OffLeadEndE" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_043">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetW" type="{}Wstring" />
 *                           &lt;attribute name="LeadNumW" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchW" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthW" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthW" type="{}Wstring" />
 *                           &lt;attribute name="OffLeadStartW" type="{}Wstring" />
 *                           &lt;attribute name="OffLeadEndW" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_078">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LightSetting" type="{}Wstring" />
 *                           &lt;attribute name="LightLevel" type="{}Wstring" />
 *                           &lt;attribute name="AllLightOn" type="{}Wstring" />
 *                           &lt;attribute name="ExcPinCheck" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_017">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BodyDiameter" type="{}Wstring" />
 *                           &lt;attribute name="BodyZ" type="{}Wstring" />
 *                           &lt;attribute name="MoldDiameter" type="{}Wstring" />
 *                           &lt;attribute name="MoldZ" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_038">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetE" type="{}Wstring" />
 *                           &lt;attribute name="LeadNumE" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchE" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthE" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthE" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_039">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetW" type="{}Wstring" />
 *                           &lt;attribute name="LeadNumW" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchW" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthW" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthW" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_015">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BodyX" type="{}Wstring" />
 *                           &lt;attribute name="BodyY" type="{}Wstring" />
 *                           &lt;attribute name="BodyZ" type="{}Wstring" />
 *                           &lt;attribute name="OffsetX" type="{}Wstring" />
 *                           &lt;attribute name="OffsetY" type="{}Wstring" />
 *                           &lt;attribute name="OffsetR" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_032">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumW" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_055">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumW2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchW2" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthW2" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthW2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosXW2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosYW2" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_057">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BgaAmount" type="{}Wstring" />
 *                           &lt;attribute name="BgaDotNumN" type="{}Wstring" />
 *                           &lt;attribute name="BgaDotNumE" type="{}Wstring" />
 *                           &lt;attribute name="BgaPitchN" type="{}Wstring" />
 *                           &lt;attribute name="BgaPitchE" type="{}Wstring" />
 *                           &lt;attribute name="BgaDiameter" type="{}Wstring" />
 *                           &lt;attribute name="BinaryLevel" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_077">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LightSetting" type="{}Wstring" />
 *                           &lt;attribute name="LightLevel" type="{}Wstring" />
 *                           &lt;attribute name="ExcBallCheck" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BallSize">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="HSize" type="{}Wstring" />
 *                           &lt;attribute name="VSize" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Ball">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Data.01" type="{}Wstring" />
 *                           &lt;attribute name="Data.02" type="{}Wstring" />
 *                           &lt;attribute name="Data.03" type="{}Wstring" />
 *                           &lt;attribute name="Data.04" type="{}Wstring" />
 *                           &lt;attribute name="Data.05" type="{}Wstring" />
 *                           &lt;attribute name="Data.06" type="{}Wstring" />
 *                           &lt;attribute name="Data.07" type="{}Wstring" />
 *                           &lt;attribute name="Data.08" type="{}Wstring" />
 *                           &lt;attribute name="Data.09" type="{}Wstring" />
 *                           &lt;attribute name="Data.10" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_010">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BodyX" type="{}Wstring" />
 *                           &lt;attribute name="BodyY" type="{}Wstring" />
 *                           &lt;attribute name="BodyZ" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_056">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BgaAmount" type="{}Wstring" />
 *                           &lt;attribute name="BgaDotNumN" type="{}Wstring" />
 *                           &lt;attribute name="BgaDotNumE" type="{}Wstring" />
 *                           &lt;attribute name="BgaPitch" type="{}Wstring" />
 *                           &lt;attribute name="BgaDiameter" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_011">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="BodyX" type="{}Wstring" />
 *                           &lt;attribute name="BodyY" type="{}Wstring" />
 *                           &lt;attribute name="BodyZ" type="{}Wstring" />
 *                           &lt;attribute name="MoldX" type="{}Wstring" />
 *                           &lt;attribute name="MoldY" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_024">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffset" type="{}Wstring" />
 *                           &lt;attribute name="LeadLength" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_044">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetN" type="{}Wstring" />
 *                           &lt;attribute name="LeadGroupN" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_045">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetS" type="{}Wstring" />
 *                           &lt;attribute name="LeadGroupS" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_046">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetE" type="{}Wstring" />
 *                           &lt;attribute name="LeadGroupE" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_047">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RlrOffsetW" type="{}Wstring" />
 *                           &lt;attribute name="LeadGroupW" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_048">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumN1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchN1" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthN1" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthN1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosXN1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosYN1" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_049">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumN2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchN2" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthN2" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthN2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosXN2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosYN2" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_050">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumS1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchS1" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthS1" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthS1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosXS1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosYS1" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_051">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumS2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchS2" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthS2" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthS2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosXS2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosYS2" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_052">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumE1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchE1" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthE1" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthE1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosXE1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosYE1" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_053">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumE2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchE2" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthE2" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthE2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosXE2" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosYE2" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_054">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumW1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPitchW1" type="{}Wstring" />
 *                           &lt;attribute name="LeadWidthW1" type="{}Wstring" />
 *                           &lt;attribute name="LeadLengthW1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosXW1" type="{}Wstring" />
 *                           &lt;attribute name="LeadPosYW1" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_100">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TrayXSize" type="{}Wstring" />
 *                           &lt;attribute name="TrayYSize" type="{}Wstring" />
 *                           &lt;attribute name="TrayXpt" type="{}Wstring" />
 *                           &lt;attribute name="TrayYpt" type="{}Wstring" />
 *                           &lt;attribute name="TrayThickness" type="{}Wstring" />
 *                           &lt;attribute name="TrayXiSize" type="{}Wstring" />
 *                           &lt;attribute name="TrayYiSize" type="{}Wstring" />
 *                           &lt;attribute name="TrayXipt" type="{}Wstring" />
 *                           &lt;attribute name="TrayYipt" type="{}Wstring" />
 *                           &lt;attribute name="CountStp" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_104">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="WastedSpaceL" type="{}Wstring" />
 *                           &lt;attribute name="WastedSpaceR" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_105">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="TrayXCur" type="{}Wstring" />
 *                           &lt;attribute name="TrayYCur" type="{}Wstring" />
 *                           &lt;attribute name="TrayXiCur" type="{}Wstring" />
 *                           &lt;attribute name="TrayYiCur" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_063">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SurfaceType" type="{}Wstring" />
 *                           &lt;attribute name="CutOuterNoise" type="{}Wstring" />
 *                           &lt;attribute name="CutInnerNoise" type="{}Wstring" />
 *                           &lt;attribute name="NoiseCutOrder" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_030">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LeadNumS" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_004">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="FreeSpace1" type="{}Wstring" />
 *                           &lt;attribute name="FreeSpace2" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_018">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="PolMark" type="{}Wstring" />
 *                           &lt;attribute name="PolMarkPos" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ExLights">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ExLight" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="No" type="{}Wstring" />
 *                                     &lt;attribute name="ExLightLevel" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_109">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LhAccel" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_079">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Alignment" type="{}Wstring" />
 *                           &lt;attribute name="AlignRefSubMlt" type="{}Wstring" />
 *                           &lt;attribute name="AlignRefSubSgl" type="{}Wstring" />
 *                           &lt;attribute name="AlignRefSubScan" type="{}Wstring" />
 *                           &lt;attribute name="AutoThreshold" type="{}Wstring" />
 *                           &lt;attribute name="Threshold" type="{}Wstring" />
 *                           &lt;attribute name="Tolerance" type="{}Wstring" />
 *                           &lt;attribute name="SearchArea" type="{}Wstring" />
 *                           &lt;attribute name="DatumAngle" type="{}Wstring" />
 *                           &lt;attribute name="EdgeThreshold" type="{}Wstring" />
 *                           &lt;attribute name="MinMatchLevel" type="{}Wstring" />
 *                           &lt;attribute name="AngleSearchArea" type="{}Wstring" />
 *                           &lt;attribute name="MultiMACS" type="{}Wstring" />
 *                           &lt;attribute name="OffsetRec" type="{}Wstring" />
 *                           &lt;attribute name="RecognitionOffsetZ" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SmartRecognition">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Data.001" type="{}Wstring" />
 *                           &lt;attribute name="Data.002" type="{}Wstring" />
 *                           &lt;attribute name="Data.003" type="{}Wstring" />
 *                           &lt;attribute name="Data.004" type="{}Wstring" />
 *                           &lt;attribute name="Data.005" type="{}Wstring" />
 *                           &lt;attribute name="Data.006" type="{}Wstring" />
 *                           &lt;attribute name="Data.007" type="{}Wstring" />
 *                           &lt;attribute name="Data.008" type="{}Wstring" />
 *                           &lt;attribute name="Data.009" type="{}Wstring" />
 *                           &lt;attribute name="Data.010" type="{}Wstring" />
 *                           &lt;attribute name="Data.011" type="{}Wstring" />
 *                           &lt;attribute name="Data.012" type="{}Wstring" />
 *                           &lt;attribute name="Data.013" type="{}Wstring" />
 *                           &lt;attribute name="Data.014" type="{}Wstring" />
 *                           &lt;attribute name="Data.015" type="{}Wstring" />
 *                           &lt;attribute name="Data.016" type="{}Wstring" />
 *                           &lt;attribute name="Data.017" type="{}Wstring" />
 *                           &lt;attribute name="Data.018" type="{}Wstring" />
 *                           &lt;attribute name="Data.019" type="{}Wstring" />
 *                           &lt;attribute name="Data.020" type="{}Wstring" />
 *                           &lt;attribute name="Data.021" type="{}Wstring" />
 *                           &lt;attribute name="Data.022" type="{}Wstring" />
 *                           &lt;attribute name="Data.023" type="{}Wstring" />
 *                           &lt;attribute name="Data.024" type="{}Wstring" />
 *                           &lt;attribute name="Data.025" type="{}Wstring" />
 *                           &lt;attribute name="Data.026" type="{}Wstring" />
 *                           &lt;attribute name="Data.027" type="{}Wstring" />
 *                           &lt;attribute name="Data.028" type="{}Wstring" />
 *                           &lt;attribute name="Data.029" type="{}Wstring" />
 *                           &lt;attribute name="Data.030" type="{}Wstring" />
 *                           &lt;attribute name="Data.031" type="{}Wstring" />
 *                           &lt;attribute name="Data.032" type="{}Wstring" />
 *                           &lt;attribute name="Data.033" type="{}Wstring" />
 *                           &lt;attribute name="Data.034" type="{}Wstring" />
 *                           &lt;attribute name="Data.035" type="{}Wstring" />
 *                           &lt;attribute name="Data.036" type="{}Wstring" />
 *                           &lt;attribute name="Data.037" type="{}Wstring" />
 *                           &lt;attribute name="Data.038" type="{}Wstring" />
 *                           &lt;attribute name="Data.039" type="{}Wstring" />
 *                           &lt;attribute name="Data.040" type="{}Wstring" />
 *                           &lt;attribute name="Data.041" type="{}Wstring" />
 *                           &lt;attribute name="Data.042" type="{}Wstring" />
 *                           &lt;attribute name="Data.043" type="{}Wstring" />
 *                           &lt;attribute name="Data.044" type="{}Wstring" />
 *                           &lt;attribute name="Data.045" type="{}Wstring" />
 *                           &lt;attribute name="Data.046" type="{}Wstring" />
 *                           &lt;attribute name="Data.047" type="{}Wstring" />
 *                           &lt;attribute name="Data.048" type="{}Wstring" />
 *                           &lt;attribute name="Data.049" type="{}Wstring" />
 *                           &lt;attribute name="Data.050" type="{}Wstring" />
 *                           &lt;attribute name="Data.051" type="{}Wstring" />
 *                           &lt;attribute name="Data.052" type="{}Wstring" />
 *                           &lt;attribute name="Data.053" type="{}Wstring" />
 *                           &lt;attribute name="Data.054" type="{}Wstring" />
 *                           &lt;attribute name="Data.055" type="{}Wstring" />
 *                           &lt;attribute name="Data.056" type="{}Wstring" />
 *                           &lt;attribute name="Data.057" type="{}Wstring" />
 *                           &lt;attribute name="Data.058" type="{}Wstring" />
 *                           &lt;attribute name="Data.059" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="No" type="{}Wstring" />
 *                 &lt;attribute name="DateTime" type="{}Wstring" />
 *                 &lt;attribute name="Operator" type="{}Wstring" />
 *                 &lt;attribute name="Serial" type="{}Wstring" />
 *                 &lt;attribute name="Application" type="{}Wstring" />
 *                 &lt;attribute name="Comment" type="{}Wstring" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "lastEditing",
        "part"
})
@XmlRootElement(name = "PartsDatabaseFile")
public class PartsDatabaseFile {

    @XmlElement(name = "LastEditing", required = true)
    protected PartsDatabaseFile.LastEditing lastEditing;
    @XmlElement(name = "Part", required = true)
    protected List<PartsDatabaseFile.Part> part;

    /**
     * Gets the value of the lastEditing property.
     *
     * @return possible object is
     * {@link PartsDatabaseFile.LastEditing }
     */
    public PartsDatabaseFile.LastEditing getLastEditing() {
        return lastEditing;
    }

    /**
     * Sets the value of the lastEditing property.
     *
     * @param value
     *     allowed object is
     *     {@link PartsDatabaseFile.LastEditing }
     *
     */
    public void setLastEditing(PartsDatabaseFile.LastEditing value) {
        this.lastEditing = value;
    }

    /**
     * Gets the value of the part property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartsDatabaseFile.Part }
     *
     *
     */
    public List<PartsDatabaseFile.Part> getPart() {
        if (part == null) {
            part = new ArrayList<PartsDatabaseFile.Part>();
        }
        return this.part;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="Date" type="{}Wstring" />
     *       &lt;attribute name="Time" type="{}Wstring" />
     *       &lt;attribute name="VersionNo" type="{}Wstring" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LastEditing {

        @XmlAttribute(name = "Date")
        protected String date;
        @XmlAttribute(name = "Time")
        protected String time;
        @XmlAttribute(name = "VersionNo")
        protected String versionNo;

        /**
         * Gets the value of the date property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the time property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTime(String value) {
            this.time = value;
        }

        /**
         * Gets the value of the versionNo property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVersionNo() {
            return versionNo;
        }

        /**
         * Sets the value of the versionNo property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVersionNo(String value) {
            this.versionNo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Part_001">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PartsName" type="{}Wstring" />
     *                 &lt;attribute name="Comment" type="{}Wstring" />
     *                 &lt;attribute name="DatabaseNo" type="{}Wstring" />
     *                 &lt;attribute name="LibraryUse" type="{}Wstring" />
     *                 &lt;attribute name="LibraryFolder" type="{}Wstring" />
     *                 &lt;attribute name="LibraryPath" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_002">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ShapeType" type="{}Wstring" />
     *                 &lt;attribute name="Package" type="{}Wstring" />
     *                 &lt;attribute name="FdrType" type="{}Wstring" />
     *                 &lt;attribute name="ReelDiameter" type="{}Wstring" />
     *                 &lt;attribute name="BitFlags" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_003">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Setno" type="{}Wstring" />
     *                 &lt;attribute name="Definition" type="{}Wstring" />
     *                 &lt;attribute name="XPos" type="{}Wstring" />
     *                 &lt;attribute name="YPos" type="{}Wstring" />
     *                 &lt;attribute name="FdrIdxStep" type="{}Wstring" />
     *                 &lt;attribute name="FdrIdxSpeed" type="{}Wstring" />
     *                 &lt;attribute name="FeederTimerOffset" type="{}Wstring" />
     *                 &lt;attribute name="Optimize" type="{}Wstring" />
     *                 &lt;attribute name="PartsGroupNo" type="{}Wstring" />
     *                 &lt;attribute name="FixCmp" type="{}Wstring" />
     *                 &lt;attribute name="SwFdr" type="{}Wstring" />
     *                 &lt;attribute name="PitchEffect" type="{}Wstring" />
     *                 &lt;attribute name="Correct3A" type="{}Wstring" />
     *                 &lt;attribute name="UnitNo" type="{}Wstring" />
     *                 &lt;attribute name="PickPosCheck" type="{}Wstring" />
     *                 &lt;attribute name="PickToleranceX" type="{}Wstring" />
     *                 &lt;attribute name="PickToleranceY" type="{}Wstring" />
     *                 &lt;attribute name="BoardDataTuning" type="{}Wstring" />
     *                 &lt;attribute name="ToleranceTuning" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_012">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BodyX" type="{}Wstring" />
     *                 &lt;attribute name="BodyY" type="{}Wstring" />
     *                 &lt;attribute name="BodyZ" type="{}Wstring" />
     *                 &lt;attribute name="MoldX" type="{}Wstring" />
     *                 &lt;attribute name="MoldY" type="{}Wstring" />
     *                 &lt;attribute name="MoldZ" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_028">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetE" type="{}Wstring" />
     *                 &lt;attribute name="RlrWidth" type="{}Wstring" />
     *                 &lt;attribute name="LeadNumE" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchE" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthE" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthE" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_070">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Alignment" type="{}Wstring" />
     *                 &lt;attribute name="AlignRefSubMlt" type="{}Wstring" />
     *                 &lt;attribute name="AlignRefSubSgl" type="{}Wstring" />
     *                 &lt;attribute name="AlignRefSubScan" type="{}Wstring" />
     *                 &lt;attribute name="AutoThreshold" type="{}Wstring" />
     *                 &lt;attribute name="Threshold" type="{}Wstring" />
     *                 &lt;attribute name="Tolerance" type="{}Wstring" />
     *                 &lt;attribute name="SearchArea" type="{}Wstring" />
     *                 &lt;attribute name="DatumAngle" type="{}Wstring" />
     *                 &lt;attribute name="MultiMACS" type="{}Wstring" />
     *                 &lt;attribute name="OffsetRec" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_072">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LightSetting" type="{}Wstring" />
     *                 &lt;attribute name="LightLevel" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_074">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CoplaLevel" type="{}Wstring" />
     *                 &lt;attribute name="CoplaThreshold" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_076">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LightMode" type="{}Wstring" />
     *                 &lt;attribute name="MainLightLevel" type="{}Wstring" />
     *                 &lt;attribute name="CoaxsLightLevel" type="{}Wstring" />
     *                 &lt;attribute name="SideLightLevel" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_310">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="DDDExecPass" type="{}Wstring" />
     *                 &lt;attribute name="DDDThreNmlCam" type="{}Wstring" />
     *                 &lt;attribute name="DDDThreSlantCam" type="{}Wstring" />
     *                 &lt;attribute name="DDDLightCoaxNmlCam" type="{}Wstring" />
     *                 &lt;attribute name="DDDLightCoaxSlantCam" type="{}Wstring" />
     *                 &lt;attribute name="DDDLightMainSlantCam" type="{}Wstring" />
     *                 &lt;attribute name="DDDLightSideSlantCam" type="{}Wstring" />
     *                 &lt;attribute name="DDDBrightAreaNmlCam" type="{}Wstring" />
     *                 &lt;attribute name="DDDBrightAreaSlantCam" type="{}Wstring" />
     *                 &lt;attribute name="DDDPermitTol" type="{}Wstring" />
     *                 &lt;attribute name="DDDHeightCheck" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_080">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Nozzle" type="{}Wstring" />
     *                 &lt;attribute name="XYSpeed" type="{}Wstring" />
     *                 &lt;attribute name="ConvYSpeed" type="{}Wstring" />
     *                 &lt;attribute name="FdrAngle" type="{}Wstring" />
     *                 &lt;attribute name="VacChk" type="{}Wstring" />
     *                 &lt;attribute name="CorrectPos" type="{}Wstring" />
     *                 &lt;attribute name="Action" type="{}Wstring" />
     *                 &lt;attribute name="PickStart" type="{}Wstring" />
     *                 &lt;attribute name="Dump" type="{}Wstring" />
     *                 &lt;attribute name="Retry" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_081">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PckHeight" type="{}Wstring" />
     *                 &lt;attribute name="PckTimer" type="{}Wstring" />
     *                 &lt;attribute name="PckSpeed" type="{}Wstring" />
     *                 &lt;attribute name="PckVLevel" type="{}Wstring" />
     *                 &lt;attribute name="PckSingleDir" type="{}Wstring" />
     *                 &lt;attribute name="PckCtrlDown" type="{}Wstring" />
     *                 &lt;attribute name="PckCtrlUp" type="{}Wstring" />
     *                 &lt;attribute name="NozzleTouchHeight" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_083">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="MntHeight" type="{}Wstring" />
     *                 &lt;attribute name="MntTimer" type="{}Wstring" />
     *                 &lt;attribute name="MntSpeed" type="{}Wstring" />
     *                 &lt;attribute name="MntPLevel" type="{}Wstring" />
     *                 &lt;attribute name="MntSingleDir" type="{}Wstring" />
     *                 &lt;attribute name="MntCtrlDown" type="{}Wstring" />
     *                 &lt;attribute name="MntCtrlUp" type="{}Wstring" />
     *                 &lt;attribute name="MntInsertLength" type="{}Wstring" />
     *                 &lt;attribute name="MntInsertShortDistance" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_300">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Pck2ndSrvDown" type="{}Wstring" />
     *                 &lt;attribute name="Pck2ndSrvUp" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_301">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Mnt2ndSrvDown" type="{}Wstring" />
     *                 &lt;attribute name="Mnt2ndSrvUp" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_302">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PckForceExist" type="{}Wstring" />
     *                 &lt;attribute name="PckForceTarget" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_303">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="MntForceExist" type="{}Wstring" />
     *                 &lt;attribute name="MntForceTarget" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_200">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="DspCType" type="{}Wstring" />
     *                 &lt;attribute name="DNozzle" type="{}Wstring" />
     *                 &lt;attribute name="Dtimer" type="{}Wstring" />
     *                 &lt;attribute name="DXpos" type="{}Wstring" />
     *                 &lt;attribute name="DYpos" type="{}Wstring" />
     *                 &lt;attribute name="DspAngle" type="{}Wstring" />
     *                 &lt;attribute name="DXpt" type="{}Wstring" />
     *                 &lt;attribute name="DYpt" type="{}Wstring" />
     *                 &lt;attribute name="DXtime" type="{}Wstring" />
     *                 &lt;attribute name="DYtime" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_500">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Category" type="{}Wstring" />
     *                 &lt;attribute name="DipAct" type="{}Wstring" />
     *                 &lt;attribute name="StampAct" type="{}Wstring" />
     *                 &lt;attribute name="Marking" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_501">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Option1StationNo" type="{}Wstring" />
     *                 &lt;attribute name="Option1WaitVision" type="{}Wstring" />
     *                 &lt;attribute name="Option1DownSequenceAir" type="{}Wstring" />
     *                 &lt;attribute name="Option12ndSrvDown" type="{}Wstring" />
     *                 &lt;attribute name="Option1DownSpeed" type="{}Wstring" />
     *                 &lt;attribute name="Option1LowendHeight" type="{}Wstring" />
     *                 &lt;attribute name="Option1LowendTimer" type="{}Wstring" />
     *                 &lt;attribute name="Option1UpSequenceAir" type="{}Wstring" />
     *                 &lt;attribute name="Option12ndSrvUp" type="{}Wstring" />
     *                 &lt;attribute name="Option1UpSpeed" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_502">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Option1ForceExist" type="{}Wstring" />
     *                 &lt;attribute name="Option1ForceTarget" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_520">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SVUse" type="{}Wstring" />
     *                 &lt;attribute name="SVBringBack" type="{}Wstring" />
     *                 &lt;attribute name="SVBodyLimit" type="{}Wstring" />
     *                 &lt;attribute name="SVReverseCheck" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_103">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TrayYiSize" type="{}Wstring" />
     *                 &lt;attribute name="CountStp" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_107">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TrayYiCur" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_016">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BodyX" type="{}Wstring" />
     *                 &lt;attribute name="BodyY" type="{}Wstring" />
     *                 &lt;attribute name="BodyZ" type="{}Wstring" />
     *                 &lt;attribute name="OffsetX" type="{}Wstring" />
     *                 &lt;attribute name="OffsetY" type="{}Wstring" />
     *                 &lt;attribute name="OffsetR" type="{}Wstring" />
     *                 &lt;attribute name="MoldX" type="{}Wstring" />
     *                 &lt;attribute name="MoldY" type="{}Wstring" />
     *                 &lt;attribute name="MoldZ" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_023">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffset" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidth" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_062">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Algorithm" type="{}Wstring" />
     *                 &lt;attribute name="BaseVType" type="{}Wstring" />
     *                 &lt;attribute name="Option1" type="{}Wstring" />
     *                 &lt;attribute name="Option2" type="{}Wstring" />
     *                 &lt;attribute name="Option3" type="{}Wstring" />
     *                 &lt;attribute name="Option4" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_013">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BodyX" type="{}Wstring" />
     *                 &lt;attribute name="BodyY" type="{}Wstring" />
     *                 &lt;attribute name="BodyZ" type="{}Wstring" />
     *                 &lt;attribute name="MoldX" type="{}Wstring" />
     *                 &lt;attribute name="MoldY" type="{}Wstring" />
     *                 &lt;attribute name="MoldZ" type="{}Wstring" />
     *                 &lt;attribute name="Thicknesschk" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_021">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffset" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_071">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Alignment" type="{}Wstring" />
     *                 &lt;attribute name="AlignRefSubMlt" type="{}Wstring" />
     *                 &lt;attribute name="AlignRefSubSgl" type="{}Wstring" />
     *                 &lt;attribute name="AlignRefSubScan" type="{}Wstring" />
     *                 &lt;attribute name="AutoThreshold" type="{}Wstring" />
     *                 &lt;attribute name="Threshold" type="{}Wstring" />
     *                 &lt;attribute name="Tolerance" type="{}Wstring" />
     *                 &lt;attribute name="SearchArea" type="{}Wstring" />
     *                 &lt;attribute name="DatumAngle" type="{}Wstring" />
     *                 &lt;attribute name="CompIntensity" type="{}Wstring" />
     *                 &lt;attribute name="MultiMACS" type="{}Wstring" />
     *                 &lt;attribute name="OffsetRec" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_025">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffset" type="{}Wstring" />
     *                 &lt;attribute name="RlrWidth" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidth" type="{}Wstring" />
     *                 &lt;attribute name="LeadLength" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_033">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumN" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchN" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_034">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumS" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchS" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_029">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumN" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_031">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumE" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_026">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffset" type="{}Wstring" />
     *                 &lt;attribute name="RlrWidth" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitch" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidth" type="{}Wstring" />
     *                 &lt;attribute name="LeadLength" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_064">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Recognition" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_073">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LightSetting" type="{}Wstring" />
     *                 &lt;attribute name="LightLevel" type="{}Wstring" />
     *                 &lt;attribute name="AllLightOn" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_027">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffset" type="{}Wstring" />
     *                 &lt;attribute name="RlrWidth" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitch" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidth" type="{}Wstring" />
     *                 &lt;attribute name="LeadLength" type="{}Wstring" />
     *                 &lt;attribute name="BumpMask" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_082">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PckTimer" type="{}Wstring" />
     *                 &lt;attribute name="PckSpeed" type="{}Wstring" />
     *                 &lt;attribute name="PckVLevel" type="{}Wstring" />
     *                 &lt;attribute name="PckSingleDir" type="{}Wstring" />
     *                 &lt;attribute name="PckCtrlDown" type="{}Wstring" />
     *                 &lt;attribute name="PckCtrlUp" type="{}Wstring" />
     *                 &lt;attribute name="NozzleTouchHeight" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_101">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TrayXSize" type="{}Wstring" />
     *                 &lt;attribute name="TrayYSize" type="{}Wstring" />
     *                 &lt;attribute name="TrayXpt" type="{}Wstring" />
     *                 &lt;attribute name="TrayYpt" type="{}Wstring" />
     *                 &lt;attribute name="TrayZpt" type="{}Wstring" />
     *                 &lt;attribute name="TrayThickness" type="{}Wstring" />
     *                 &lt;attribute name="TraySt" type="{}Wstring" />
     *                 &lt;attribute name="TrayEn" type="{}Wstring" />
     *                 &lt;attribute name="TrayXiSize" type="{}Wstring" />
     *                 &lt;attribute name="TrayYiSize" type="{}Wstring" />
     *                 &lt;attribute name="TrayXipt" type="{}Wstring" />
     *                 &lt;attribute name="TrayYipt" type="{}Wstring" />
     *                 &lt;attribute name="CountStp" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_106">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TrayXCur" type="{}Wstring" />
     *                 &lt;attribute name="TrayYCur" type="{}Wstring" />
     *                 &lt;attribute name="TrayCur" type="{}Wstring" />
     *                 &lt;attribute name="TrayXiCur" type="{}Wstring" />
     *                 &lt;attribute name="TrayYiCur" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_108">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LhAccel" type="{}Wstring" />
     *                 &lt;attribute name="LtAccel" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_014">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BodyX" type="{}Wstring" />
     *                 &lt;attribute name="BodyY" type="{}Wstring" />
     *                 &lt;attribute name="BodyZ" type="{}Wstring" />
     *                 &lt;attribute name="OffsetX" type="{}Wstring" />
     *                 &lt;attribute name="OffsetY" type="{}Wstring" />
     *                 &lt;attribute name="MoldX" type="{}Wstring" />
     *                 &lt;attribute name="MoldY" type="{}Wstring" />
     *                 &lt;attribute name="MoldZ" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_022">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrWidth" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_036">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetN" type="{}Wstring" />
     *                 &lt;attribute name="LeadNumN" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchN" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthN" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthN" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_037">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetS" type="{}Wstring" />
     *                 &lt;attribute name="LeadNumS" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchS" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthS" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthS" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_040">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetN" type="{}Wstring" />
     *                 &lt;attribute name="LeadNumN" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchN" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthN" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthN" type="{}Wstring" />
     *                 &lt;attribute name="OffLeadStartN" type="{}Wstring" />
     *                 &lt;attribute name="OffLeadEndN" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_041">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetS" type="{}Wstring" />
     *                 &lt;attribute name="LeadNumS" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchS" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthS" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthS" type="{}Wstring" />
     *                 &lt;attribute name="OffLeadStartS" type="{}Wstring" />
     *                 &lt;attribute name="OffLeadEndS" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_042">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetE" type="{}Wstring" />
     *                 &lt;attribute name="LeadNumE" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchE" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthE" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthE" type="{}Wstring" />
     *                 &lt;attribute name="OffLeadStartE" type="{}Wstring" />
     *                 &lt;attribute name="OffLeadEndE" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_043">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetW" type="{}Wstring" />
     *                 &lt;attribute name="LeadNumW" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchW" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthW" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthW" type="{}Wstring" />
     *                 &lt;attribute name="OffLeadStartW" type="{}Wstring" />
     *                 &lt;attribute name="OffLeadEndW" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_078">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LightSetting" type="{}Wstring" />
     *                 &lt;attribute name="LightLevel" type="{}Wstring" />
     *                 &lt;attribute name="AllLightOn" type="{}Wstring" />
     *                 &lt;attribute name="ExcPinCheck" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_017">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BodyDiameter" type="{}Wstring" />
     *                 &lt;attribute name="BodyZ" type="{}Wstring" />
     *                 &lt;attribute name="MoldDiameter" type="{}Wstring" />
     *                 &lt;attribute name="MoldZ" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_038">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetE" type="{}Wstring" />
     *                 &lt;attribute name="LeadNumE" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchE" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthE" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthE" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_039">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetW" type="{}Wstring" />
     *                 &lt;attribute name="LeadNumW" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchW" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthW" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthW" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_015">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BodyX" type="{}Wstring" />
     *                 &lt;attribute name="BodyY" type="{}Wstring" />
     *                 &lt;attribute name="BodyZ" type="{}Wstring" />
     *                 &lt;attribute name="OffsetX" type="{}Wstring" />
     *                 &lt;attribute name="OffsetY" type="{}Wstring" />
     *                 &lt;attribute name="OffsetR" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_032">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumW" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_055">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumW2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchW2" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthW2" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthW2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosXW2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosYW2" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_057">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BgaAmount" type="{}Wstring" />
     *                 &lt;attribute name="BgaDotNumN" type="{}Wstring" />
     *                 &lt;attribute name="BgaDotNumE" type="{}Wstring" />
     *                 &lt;attribute name="BgaPitchN" type="{}Wstring" />
     *                 &lt;attribute name="BgaPitchE" type="{}Wstring" />
     *                 &lt;attribute name="BgaDiameter" type="{}Wstring" />
     *                 &lt;attribute name="BinaryLevel" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_077">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LightSetting" type="{}Wstring" />
     *                 &lt;attribute name="LightLevel" type="{}Wstring" />
     *                 &lt;attribute name="ExcBallCheck" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BallSize">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="HSize" type="{}Wstring" />
     *                 &lt;attribute name="VSize" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Ball">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Data.01" type="{}Wstring" />
     *                 &lt;attribute name="Data.02" type="{}Wstring" />
     *                 &lt;attribute name="Data.03" type="{}Wstring" />
     *                 &lt;attribute name="Data.04" type="{}Wstring" />
     *                 &lt;attribute name="Data.05" type="{}Wstring" />
     *                 &lt;attribute name="Data.06" type="{}Wstring" />
     *                 &lt;attribute name="Data.07" type="{}Wstring" />
     *                 &lt;attribute name="Data.08" type="{}Wstring" />
     *                 &lt;attribute name="Data.09" type="{}Wstring" />
     *                 &lt;attribute name="Data.10" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_010">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BodyX" type="{}Wstring" />
     *                 &lt;attribute name="BodyY" type="{}Wstring" />
     *                 &lt;attribute name="BodyZ" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_056">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BgaAmount" type="{}Wstring" />
     *                 &lt;attribute name="BgaDotNumN" type="{}Wstring" />
     *                 &lt;attribute name="BgaDotNumE" type="{}Wstring" />
     *                 &lt;attribute name="BgaPitch" type="{}Wstring" />
     *                 &lt;attribute name="BgaDiameter" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_011">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="BodyX" type="{}Wstring" />
     *                 &lt;attribute name="BodyY" type="{}Wstring" />
     *                 &lt;attribute name="BodyZ" type="{}Wstring" />
     *                 &lt;attribute name="MoldX" type="{}Wstring" />
     *                 &lt;attribute name="MoldY" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_024">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffset" type="{}Wstring" />
     *                 &lt;attribute name="LeadLength" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_044">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetN" type="{}Wstring" />
     *                 &lt;attribute name="LeadGroupN" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_045">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetS" type="{}Wstring" />
     *                 &lt;attribute name="LeadGroupS" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_046">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetE" type="{}Wstring" />
     *                 &lt;attribute name="LeadGroupE" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_047">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RlrOffsetW" type="{}Wstring" />
     *                 &lt;attribute name="LeadGroupW" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_048">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumN1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchN1" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthN1" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthN1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosXN1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosYN1" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_049">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumN2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchN2" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthN2" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthN2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosXN2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosYN2" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_050">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumS1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchS1" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthS1" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthS1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosXS1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosYS1" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_051">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumS2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchS2" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthS2" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthS2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosXS2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosYS2" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_052">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumE1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchE1" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthE1" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthE1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosXE1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosYE1" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_053">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumE2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchE2" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthE2" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthE2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosXE2" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosYE2" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_054">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumW1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPitchW1" type="{}Wstring" />
     *                 &lt;attribute name="LeadWidthW1" type="{}Wstring" />
     *                 &lt;attribute name="LeadLengthW1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosXW1" type="{}Wstring" />
     *                 &lt;attribute name="LeadPosYW1" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_100">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TrayXSize" type="{}Wstring" />
     *                 &lt;attribute name="TrayYSize" type="{}Wstring" />
     *                 &lt;attribute name="TrayXpt" type="{}Wstring" />
     *                 &lt;attribute name="TrayYpt" type="{}Wstring" />
     *                 &lt;attribute name="TrayThickness" type="{}Wstring" />
     *                 &lt;attribute name="TrayXiSize" type="{}Wstring" />
     *                 &lt;attribute name="TrayYiSize" type="{}Wstring" />
     *                 &lt;attribute name="TrayXipt" type="{}Wstring" />
     *                 &lt;attribute name="TrayYipt" type="{}Wstring" />
     *                 &lt;attribute name="CountStp" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_104">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="WastedSpaceL" type="{}Wstring" />
     *                 &lt;attribute name="WastedSpaceR" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_105">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="TrayXCur" type="{}Wstring" />
     *                 &lt;attribute name="TrayYCur" type="{}Wstring" />
     *                 &lt;attribute name="TrayXiCur" type="{}Wstring" />
     *                 &lt;attribute name="TrayYiCur" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_063">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SurfaceType" type="{}Wstring" />
     *                 &lt;attribute name="CutOuterNoise" type="{}Wstring" />
     *                 &lt;attribute name="CutInnerNoise" type="{}Wstring" />
     *                 &lt;attribute name="NoiseCutOrder" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_030">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LeadNumS" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_004">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="FreeSpace1" type="{}Wstring" />
     *                 &lt;attribute name="FreeSpace2" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_018">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="PolMark" type="{}Wstring" />
     *                 &lt;attribute name="PolMarkPos" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ExLights">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ExLight" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                           &lt;/sequence>
     *                           &lt;attribute name="No" type="{}Wstring" />
     *                           &lt;attribute name="ExLightLevel" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_109">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LhAccel" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_079">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Alignment" type="{}Wstring" />
     *                 &lt;attribute name="AlignRefSubMlt" type="{}Wstring" />
     *                 &lt;attribute name="AlignRefSubSgl" type="{}Wstring" />
     *                 &lt;attribute name="AlignRefSubScan" type="{}Wstring" />
     *                 &lt;attribute name="AutoThreshold" type="{}Wstring" />
     *                 &lt;attribute name="Threshold" type="{}Wstring" />
     *                 &lt;attribute name="Tolerance" type="{}Wstring" />
     *                 &lt;attribute name="SearchArea" type="{}Wstring" />
     *                 &lt;attribute name="DatumAngle" type="{}Wstring" />
     *                 &lt;attribute name="EdgeThreshold" type="{}Wstring" />
     *                 &lt;attribute name="MinMatchLevel" type="{}Wstring" />
     *                 &lt;attribute name="AngleSearchArea" type="{}Wstring" />
     *                 &lt;attribute name="MultiMACS" type="{}Wstring" />
     *                 &lt;attribute name="OffsetRec" type="{}Wstring" />
     *                 &lt;attribute name="RecognitionOffsetZ" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SmartRecognition">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Data.001" type="{}Wstring" />
     *                 &lt;attribute name="Data.002" type="{}Wstring" />
     *                 &lt;attribute name="Data.003" type="{}Wstring" />
     *                 &lt;attribute name="Data.004" type="{}Wstring" />
     *                 &lt;attribute name="Data.005" type="{}Wstring" />
     *                 &lt;attribute name="Data.006" type="{}Wstring" />
     *                 &lt;attribute name="Data.007" type="{}Wstring" />
     *                 &lt;attribute name="Data.008" type="{}Wstring" />
     *                 &lt;attribute name="Data.009" type="{}Wstring" />
     *                 &lt;attribute name="Data.010" type="{}Wstring" />
     *                 &lt;attribute name="Data.011" type="{}Wstring" />
     *                 &lt;attribute name="Data.012" type="{}Wstring" />
     *                 &lt;attribute name="Data.013" type="{}Wstring" />
     *                 &lt;attribute name="Data.014" type="{}Wstring" />
     *                 &lt;attribute name="Data.015" type="{}Wstring" />
     *                 &lt;attribute name="Data.016" type="{}Wstring" />
     *                 &lt;attribute name="Data.017" type="{}Wstring" />
     *                 &lt;attribute name="Data.018" type="{}Wstring" />
     *                 &lt;attribute name="Data.019" type="{}Wstring" />
     *                 &lt;attribute name="Data.020" type="{}Wstring" />
     *                 &lt;attribute name="Data.021" type="{}Wstring" />
     *                 &lt;attribute name="Data.022" type="{}Wstring" />
     *                 &lt;attribute name="Data.023" type="{}Wstring" />
     *                 &lt;attribute name="Data.024" type="{}Wstring" />
     *                 &lt;attribute name="Data.025" type="{}Wstring" />
     *                 &lt;attribute name="Data.026" type="{}Wstring" />
     *                 &lt;attribute name="Data.027" type="{}Wstring" />
     *                 &lt;attribute name="Data.028" type="{}Wstring" />
     *                 &lt;attribute name="Data.029" type="{}Wstring" />
     *                 &lt;attribute name="Data.030" type="{}Wstring" />
     *                 &lt;attribute name="Data.031" type="{}Wstring" />
     *                 &lt;attribute name="Data.032" type="{}Wstring" />
     *                 &lt;attribute name="Data.033" type="{}Wstring" />
     *                 &lt;attribute name="Data.034" type="{}Wstring" />
     *                 &lt;attribute name="Data.035" type="{}Wstring" />
     *                 &lt;attribute name="Data.036" type="{}Wstring" />
     *                 &lt;attribute name="Data.037" type="{}Wstring" />
     *                 &lt;attribute name="Data.038" type="{}Wstring" />
     *                 &lt;attribute name="Data.039" type="{}Wstring" />
     *                 &lt;attribute name="Data.040" type="{}Wstring" />
     *                 &lt;attribute name="Data.041" type="{}Wstring" />
     *                 &lt;attribute name="Data.042" type="{}Wstring" />
     *                 &lt;attribute name="Data.043" type="{}Wstring" />
     *                 &lt;attribute name="Data.044" type="{}Wstring" />
     *                 &lt;attribute name="Data.045" type="{}Wstring" />
     *                 &lt;attribute name="Data.046" type="{}Wstring" />
     *                 &lt;attribute name="Data.047" type="{}Wstring" />
     *                 &lt;attribute name="Data.048" type="{}Wstring" />
     *                 &lt;attribute name="Data.049" type="{}Wstring" />
     *                 &lt;attribute name="Data.050" type="{}Wstring" />
     *                 &lt;attribute name="Data.051" type="{}Wstring" />
     *                 &lt;attribute name="Data.052" type="{}Wstring" />
     *                 &lt;attribute name="Data.053" type="{}Wstring" />
     *                 &lt;attribute name="Data.054" type="{}Wstring" />
     *                 &lt;attribute name="Data.055" type="{}Wstring" />
     *                 &lt;attribute name="Data.056" type="{}Wstring" />
     *                 &lt;attribute name="Data.057" type="{}Wstring" />
     *                 &lt;attribute name="Data.058" type="{}Wstring" />
     *                 &lt;attribute name="Data.059" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="No" type="{}Wstring" />
     *       &lt;attribute name="DateTime" type="{}Wstring" />
     *       &lt;attribute name="Operator" type="{}Wstring" />
     *       &lt;attribute name="Serial" type="{}Wstring" />
     *       &lt;attribute name="Application" type="{}Wstring" />
     *       &lt;attribute name="Comment" type="{}Wstring" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "part001",
            "part002",
            "part003",
            "part012",
            "part028",
            "part070",
            "part072",
            "part074",
            "part076",
            "part310",
            "part080",
            "part081",
            "part083",
            "part300",
            "part301",
            "part302",
            "part303",
            "part200",
            "part500",
            "part501",
            "part502",
            "part520",
            "part103",
            "part107",
            "part016",
            "part023",
            "part062",
            "part013",
            "part021",
            "part071",
            "part025",
            "part033",
            "part034",
            "part029",
            "part031",
            "part026",
            "part064",
            "part073",
            "part027",
            "part082",
            "part101",
            "part106",
            "part108",
            "part014",
            "part022",
            "part036",
            "part037",
            "part040",
            "part041",
            "part042",
            "part043",
            "part078",
            "part017",
            "part038",
            "part039",
            "part015",
            "part032",
            "part055",
            "part057",
            "part077",
            "ballSize",
            "ball",
            "part010",
            "part056",
            "part011",
            "part024",
            "part044",
            "part045",
            "part046",
            "part047",
            "part048",
            "part049",
            "part050",
            "part051",
            "part052",
            "part053",
            "part054",
            "part100",
            "part104",
            "part105",
            "part063",
            "part030",
            "part004",
            "part018",
            "exLights",
            "part109",
            "part079",
            "smartRecognition"
    })
    public static class Part {

        @XmlElement(name = "Part_001", required = true)
        protected PartsDatabaseFile.Part.Part001 part001;
        @XmlElement(name = "Part_002", required = true)
        protected PartsDatabaseFile.Part.Part002 part002;
        @XmlElement(name = "Part_003", required = true)
        protected PartsDatabaseFile.Part.Part003 part003;
        @XmlElement(name = "Part_012", required = true)
        protected PartsDatabaseFile.Part.Part012 part012;
        @XmlElement(name = "Part_028", required = true)
        protected PartsDatabaseFile.Part.Part028 part028;
        @XmlElement(name = "Part_070", required = true)
        protected PartsDatabaseFile.Part.Part070 part070;
        @XmlElement(name = "Part_072", required = true)
        protected PartsDatabaseFile.Part.Part072 part072;
        @XmlElement(name = "Part_074", required = true)
        protected PartsDatabaseFile.Part.Part074 part074;
        @XmlElement(name = "Part_076", required = true)
        protected PartsDatabaseFile.Part.Part076 part076;
        @XmlElement(name = "Part_310", required = true)
        protected PartsDatabaseFile.Part.Part310 part310;
        @XmlElement(name = "Part_080", required = true)
        protected PartsDatabaseFile.Part.Part080 part080;
        @XmlElement(name = "Part_081", required = true)
        protected PartsDatabaseFile.Part.Part081 part081;
        @XmlElement(name = "Part_083", required = true)
        protected PartsDatabaseFile.Part.Part083 part083;
        @XmlElement(name = "Part_300", required = true)
        protected PartsDatabaseFile.Part.Part300 part300;
        @XmlElement(name = "Part_301", required = true)
        protected PartsDatabaseFile.Part.Part301 part301;
        @XmlElement(name = "Part_302", required = true)
        protected PartsDatabaseFile.Part.Part302 part302;
        @XmlElement(name = "Part_303", required = true)
        protected PartsDatabaseFile.Part.Part303 part303;
        @XmlElement(name = "Part_200", required = true)
        protected PartsDatabaseFile.Part.Part200 part200;
        @XmlElement(name = "Part_500", required = true)
        protected PartsDatabaseFile.Part.Part500 part500;
        @XmlElement(name = "Part_501", required = true)
        protected PartsDatabaseFile.Part.Part501 part501;
        @XmlElement(name = "Part_502", required = true)
        protected PartsDatabaseFile.Part.Part502 part502;
        @XmlElement(name = "Part_520", required = true)
        protected PartsDatabaseFile.Part.Part520 part520;
        @XmlElement(name = "Part_103", required = true)
        protected PartsDatabaseFile.Part.Part103 part103;
        @XmlElement(name = "Part_107", required = true)
        protected PartsDatabaseFile.Part.Part107 part107;
        @XmlElement(name = "Part_016", required = true)
        protected PartsDatabaseFile.Part.Part016 part016;
        @XmlElement(name = "Part_023", required = true)
        protected PartsDatabaseFile.Part.Part023 part023;
        @XmlElement(name = "Part_062", required = true)
        protected PartsDatabaseFile.Part.Part062 part062;
        @XmlElement(name = "Part_013", required = true)
        protected PartsDatabaseFile.Part.Part013 part013;
        @XmlElement(name = "Part_021", required = true)
        protected PartsDatabaseFile.Part.Part021 part021;
        @XmlElement(name = "Part_071", required = true)
        protected PartsDatabaseFile.Part.Part071 part071;
        @XmlElement(name = "Part_025", required = true)
        protected PartsDatabaseFile.Part.Part025 part025;
        @XmlElement(name = "Part_033", required = true)
        protected PartsDatabaseFile.Part.Part033 part033;
        @XmlElement(name = "Part_034", required = true)
        protected PartsDatabaseFile.Part.Part034 part034;
        @XmlElement(name = "Part_029", required = true)
        protected PartsDatabaseFile.Part.Part029 part029;
        @XmlElement(name = "Part_031", required = true)
        protected PartsDatabaseFile.Part.Part031 part031;
        @XmlElement(name = "Part_026", required = true)
        protected PartsDatabaseFile.Part.Part026 part026;
        @XmlElement(name = "Part_064", required = true)
        protected PartsDatabaseFile.Part.Part064 part064;
        @XmlElement(name = "Part_073", required = true)
        protected PartsDatabaseFile.Part.Part073 part073;
        @XmlElement(name = "Part_027", required = true)
        protected PartsDatabaseFile.Part.Part027 part027;
        @XmlElement(name = "Part_082", required = true)
        protected PartsDatabaseFile.Part.Part082 part082;
        @XmlElement(name = "Part_101", required = true)
        protected PartsDatabaseFile.Part.Part101 part101;
        @XmlElement(name = "Part_106", required = true)
        protected PartsDatabaseFile.Part.Part106 part106;
        @XmlElement(name = "Part_108", required = true)
        protected PartsDatabaseFile.Part.Part108 part108;
        @XmlElement(name = "Part_014", required = true)
        protected PartsDatabaseFile.Part.Part014 part014;
        @XmlElement(name = "Part_022", required = true)
        protected PartsDatabaseFile.Part.Part022 part022;
        @XmlElement(name = "Part_036", required = true)
        protected PartsDatabaseFile.Part.Part036 part036;
        @XmlElement(name = "Part_037", required = true)
        protected PartsDatabaseFile.Part.Part037 part037;
        @XmlElement(name = "Part_040", required = true)
        protected PartsDatabaseFile.Part.Part040 part040;
        @XmlElement(name = "Part_041", required = true)
        protected PartsDatabaseFile.Part.Part041 part041;
        @XmlElement(name = "Part_042", required = true)
        protected PartsDatabaseFile.Part.Part042 part042;
        @XmlElement(name = "Part_043", required = true)
        protected PartsDatabaseFile.Part.Part043 part043;
        @XmlElement(name = "Part_078", required = true)
        protected PartsDatabaseFile.Part.Part078 part078;
        @XmlElement(name = "Part_017", required = true)
        protected PartsDatabaseFile.Part.Part017 part017;
        @XmlElement(name = "Part_038", required = true)
        protected PartsDatabaseFile.Part.Part038 part038;
        @XmlElement(name = "Part_039", required = true)
        protected PartsDatabaseFile.Part.Part039 part039;
        @XmlElement(name = "Part_015", required = true)
        protected PartsDatabaseFile.Part.Part015 part015;
        @XmlElement(name = "Part_032", required = true)
        protected PartsDatabaseFile.Part.Part032 part032;
        @XmlElement(name = "Part_055", required = true)
        protected PartsDatabaseFile.Part.Part055 part055;
        @XmlElement(name = "Part_057", required = true)
        protected PartsDatabaseFile.Part.Part057 part057;
        @XmlElement(name = "Part_077", required = true)
        protected PartsDatabaseFile.Part.Part077 part077;
        @XmlElement(name = "BallSize", required = true)
        protected PartsDatabaseFile.Part.BallSize ballSize;
        @XmlElement(name = "Ball", required = true)
        protected PartsDatabaseFile.Part.Ball ball;
        @XmlElement(name = "Part_010", required = true)
        protected PartsDatabaseFile.Part.Part010 part010;
        @XmlElement(name = "Part_056", required = true)
        protected PartsDatabaseFile.Part.Part056 part056;
        @XmlElement(name = "Part_011", required = true)
        protected PartsDatabaseFile.Part.Part011 part011;
        @XmlElement(name = "Part_024", required = true)
        protected PartsDatabaseFile.Part.Part024 part024;
        @XmlElement(name = "Part_044", required = true)
        protected PartsDatabaseFile.Part.Part044 part044;
        @XmlElement(name = "Part_045", required = true)
        protected PartsDatabaseFile.Part.Part045 part045;
        @XmlElement(name = "Part_046", required = true)
        protected PartsDatabaseFile.Part.Part046 part046;
        @XmlElement(name = "Part_047", required = true)
        protected PartsDatabaseFile.Part.Part047 part047;
        @XmlElement(name = "Part_048", required = true)
        protected PartsDatabaseFile.Part.Part048 part048;
        @XmlElement(name = "Part_049", required = true)
        protected PartsDatabaseFile.Part.Part049 part049;
        @XmlElement(name = "Part_050", required = true)
        protected PartsDatabaseFile.Part.Part050 part050;
        @XmlElement(name = "Part_051", required = true)
        protected PartsDatabaseFile.Part.Part051 part051;
        @XmlElement(name = "Part_052", required = true)
        protected PartsDatabaseFile.Part.Part052 part052;
        @XmlElement(name = "Part_053", required = true)
        protected PartsDatabaseFile.Part.Part053 part053;
        @XmlElement(name = "Part_054", required = true)
        protected PartsDatabaseFile.Part.Part054 part054;
        @XmlElement(name = "Part_100", required = true)
        protected PartsDatabaseFile.Part.Part100 part100;
        @XmlElement(name = "Part_104", required = true)
        protected PartsDatabaseFile.Part.Part104 part104;
        @XmlElement(name = "Part_105", required = true)
        protected PartsDatabaseFile.Part.Part105 part105;
        @XmlElement(name = "Part_063", required = true)
        protected PartsDatabaseFile.Part.Part063 part063;
        @XmlElement(name = "Part_030", required = true)
        protected PartsDatabaseFile.Part.Part030 part030;
        @XmlElement(name = "Part_004", required = true)
        protected PartsDatabaseFile.Part.Part004 part004;
        @XmlElement(name = "Part_018", required = true)
        protected PartsDatabaseFile.Part.Part018 part018;
        @XmlElement(name = "ExLights", required = true)
        protected PartsDatabaseFile.Part.ExLights exLights;
        @XmlElement(name = "Part_109", required = true)
        protected PartsDatabaseFile.Part.Part109 part109;
        @XmlElement(name = "Part_079", required = true)
        protected PartsDatabaseFile.Part.Part079 part079;
        @XmlElement(name = "SmartRecognition", required = true)
        protected PartsDatabaseFile.Part.SmartRecognition smartRecognition;
        @XmlAttribute(name = "No")
        protected String no;
        @XmlAttribute(name = "DateTime")
        protected String dateTime;
        @XmlAttribute(name = "Operator")
        protected String operator;
        @XmlAttribute(name = "Serial")
        protected String serial;
        @XmlAttribute(name = "Application")
        protected String application;
        @XmlAttribute(name = "Comment")
        protected String comment;

        /**
         * Gets the value of the part001 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part001 }
         */
        public PartsDatabaseFile.Part.Part001 getPart001() {
            return part001;
        }

        /**
         * Sets the value of the part001 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part001 }
         *
         */
        public void setPart001(PartsDatabaseFile.Part.Part001 value) {
            this.part001 = value;
        }

        /**
         * Gets the value of the part002 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part002 }
         *
         */
        public PartsDatabaseFile.Part.Part002 getPart002() {
            return part002;
        }

        /**
         * Sets the value of the part002 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part002 }
         *
         */
        public void setPart002(PartsDatabaseFile.Part.Part002 value) {
            this.part002 = value;
        }

        /**
         * Gets the value of the part003 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part003 }
         *
         */
        public PartsDatabaseFile.Part.Part003 getPart003() {
            return part003;
        }

        /**
         * Sets the value of the part003 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part003 }
         *
         */
        public void setPart003(PartsDatabaseFile.Part.Part003 value) {
            this.part003 = value;
        }

        /**
         * Gets the value of the part012 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part012 }
         *
         */
        public PartsDatabaseFile.Part.Part012 getPart012() {
            return part012;
        }

        /**
         * Sets the value of the part012 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part012 }
         *
         */
        public void setPart012(PartsDatabaseFile.Part.Part012 value) {
            this.part012 = value;
        }

        /**
         * Gets the value of the part028 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part028 }
         *
         */
        public PartsDatabaseFile.Part.Part028 getPart028() {
            return part028;
        }

        /**
         * Sets the value of the part028 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part028 }
         *
         */
        public void setPart028(PartsDatabaseFile.Part.Part028 value) {
            this.part028 = value;
        }

        /**
         * Gets the value of the part070 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part070 }
         *
         */
        public PartsDatabaseFile.Part.Part070 getPart070() {
            return part070;
        }

        /**
         * Sets the value of the part070 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part070 }
         *
         */
        public void setPart070(PartsDatabaseFile.Part.Part070 value) {
            this.part070 = value;
        }

        /**
         * Gets the value of the part072 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part072 }
         *
         */
        public PartsDatabaseFile.Part.Part072 getPart072() {
            return part072;
        }

        /**
         * Sets the value of the part072 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part072 }
         *
         */
        public void setPart072(PartsDatabaseFile.Part.Part072 value) {
            this.part072 = value;
        }

        /**
         * Gets the value of the part074 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part074 }
         *
         */
        public PartsDatabaseFile.Part.Part074 getPart074() {
            return part074;
        }

        /**
         * Sets the value of the part074 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part074 }
         *
         */
        public void setPart074(PartsDatabaseFile.Part.Part074 value) {
            this.part074 = value;
        }

        /**
         * Gets the value of the part076 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part076 }
         *
         */
        public PartsDatabaseFile.Part.Part076 getPart076() {
            return part076;
        }

        /**
         * Sets the value of the part076 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part076 }
         *
         */
        public void setPart076(PartsDatabaseFile.Part.Part076 value) {
            this.part076 = value;
        }

        /**
         * Gets the value of the part310 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part310 }
         *
         */
        public PartsDatabaseFile.Part.Part310 getPart310() {
            return part310;
        }

        /**
         * Sets the value of the part310 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part310 }
         *
         */
        public void setPart310(PartsDatabaseFile.Part.Part310 value) {
            this.part310 = value;
        }

        /**
         * Gets the value of the part080 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part080 }
         *
         */
        public PartsDatabaseFile.Part.Part080 getPart080() {
            return part080;
        }

        /**
         * Sets the value of the part080 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part080 }
         *
         */
        public void setPart080(PartsDatabaseFile.Part.Part080 value) {
            this.part080 = value;
        }

        /**
         * Gets the value of the part081 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part081 }
         *
         */
        public PartsDatabaseFile.Part.Part081 getPart081() {
            return part081;
        }

        /**
         * Sets the value of the part081 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part081 }
         *
         */
        public void setPart081(PartsDatabaseFile.Part.Part081 value) {
            this.part081 = value;
        }

        /**
         * Gets the value of the part083 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part083 }
         *
         */
        public PartsDatabaseFile.Part.Part083 getPart083() {
            return part083;
        }

        /**
         * Sets the value of the part083 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part083 }
         *
         */
        public void setPart083(PartsDatabaseFile.Part.Part083 value) {
            this.part083 = value;
        }

        /**
         * Gets the value of the part300 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part300 }
         *
         */
        public PartsDatabaseFile.Part.Part300 getPart300() {
            return part300;
        }

        /**
         * Sets the value of the part300 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part300 }
         *
         */
        public void setPart300(PartsDatabaseFile.Part.Part300 value) {
            this.part300 = value;
        }

        /**
         * Gets the value of the part301 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part301 }
         *
         */
        public PartsDatabaseFile.Part.Part301 getPart301() {
            return part301;
        }

        /**
         * Sets the value of the part301 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part301 }
         *
         */
        public void setPart301(PartsDatabaseFile.Part.Part301 value) {
            this.part301 = value;
        }

        /**
         * Gets the value of the part302 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part302 }
         *
         */
        public PartsDatabaseFile.Part.Part302 getPart302() {
            return part302;
        }

        /**
         * Sets the value of the part302 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part302 }
         *
         */
        public void setPart302(PartsDatabaseFile.Part.Part302 value) {
            this.part302 = value;
        }

        /**
         * Gets the value of the part303 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part303 }
         *
         */
        public PartsDatabaseFile.Part.Part303 getPart303() {
            return part303;
        }

        /**
         * Sets the value of the part303 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part303 }
         *
         */
        public void setPart303(PartsDatabaseFile.Part.Part303 value) {
            this.part303 = value;
        }

        /**
         * Gets the value of the part200 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part200 }
         *
         */
        public PartsDatabaseFile.Part.Part200 getPart200() {
            return part200;
        }

        /**
         * Sets the value of the part200 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part200 }
         *
         */
        public void setPart200(PartsDatabaseFile.Part.Part200 value) {
            this.part200 = value;
        }

        /**
         * Gets the value of the part500 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part500 }
         *
         */
        public PartsDatabaseFile.Part.Part500 getPart500() {
            return part500;
        }

        /**
         * Sets the value of the part500 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part500 }
         *
         */
        public void setPart500(PartsDatabaseFile.Part.Part500 value) {
            this.part500 = value;
        }

        /**
         * Gets the value of the part501 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part501 }
         *
         */
        public PartsDatabaseFile.Part.Part501 getPart501() {
            return part501;
        }

        /**
         * Sets the value of the part501 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part501 }
         *
         */
        public void setPart501(PartsDatabaseFile.Part.Part501 value) {
            this.part501 = value;
        }

        /**
         * Gets the value of the part502 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part502 }
         *
         */
        public PartsDatabaseFile.Part.Part502 getPart502() {
            return part502;
        }

        /**
         * Sets the value of the part502 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part502 }
         *
         */
        public void setPart502(PartsDatabaseFile.Part.Part502 value) {
            this.part502 = value;
        }

        /**
         * Gets the value of the part520 property.
         *
         * @return
         *     possible object is
         *     {@link PartsDatabaseFile.Part.Part520 }
         *
         */
        public PartsDatabaseFile.Part.Part520 getPart520() {
            return part520;
        }

        /**
         * Sets the value of the part520 property.
         *
         * @param value
         *     allowed object is
         *     {@link PartsDatabaseFile.Part.Part520 }
         *
         */
        public void setPart520(PartsDatabaseFile.Part.Part520 value) {
            this.part520 = value;
        }

        /**
         * Gets the value of the part103 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part103 }
         */
        public PartsDatabaseFile.Part.Part103 getPart103() {
            return part103;
        }

        /**
         * Sets the value of the part103 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part103 }
         */
        public void setPart103(PartsDatabaseFile.Part.Part103 value) {
            this.part103 = value;
        }

        /**
         * Gets the value of the part107 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part107 }
         */
        public PartsDatabaseFile.Part.Part107 getPart107() {
            return part107;
        }

        /**
         * Sets the value of the part107 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part107 }
         */
        public void setPart107(PartsDatabaseFile.Part.Part107 value) {
            this.part107 = value;
        }

        /**
         * Gets the value of the part016 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part016 }
         */
        public PartsDatabaseFile.Part.Part016 getPart016() {
            return part016;
        }

        /**
         * Sets the value of the part016 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part016 }
         */
        public void setPart016(PartsDatabaseFile.Part.Part016 value) {
            this.part016 = value;
        }

        /**
         * Gets the value of the part023 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part023 }
         */
        public PartsDatabaseFile.Part.Part023 getPart023() {
            return part023;
        }

        /**
         * Sets the value of the part023 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part023 }
         */
        public void setPart023(PartsDatabaseFile.Part.Part023 value) {
            this.part023 = value;
        }

        /**
         * Gets the value of the part062 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part062 }
         */
        public PartsDatabaseFile.Part.Part062 getPart062() {
            return part062;
        }

        /**
         * Sets the value of the part062 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part062 }
         */
        public void setPart062(PartsDatabaseFile.Part.Part062 value) {
            this.part062 = value;
        }

        /**
         * Gets the value of the part013 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part013 }
         */
        public PartsDatabaseFile.Part.Part013 getPart013() {
            return part013;
        }

        /**
         * Sets the value of the part013 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part013 }
         */
        public void setPart013(PartsDatabaseFile.Part.Part013 value) {
            this.part013 = value;
        }

        /**
         * Gets the value of the part021 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part021 }
         */
        public PartsDatabaseFile.Part.Part021 getPart021() {
            return part021;
        }

        /**
         * Sets the value of the part021 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part021 }
         */
        public void setPart021(PartsDatabaseFile.Part.Part021 value) {
            this.part021 = value;
        }

        /**
         * Gets the value of the part071 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part071 }
         */
        public PartsDatabaseFile.Part.Part071 getPart071() {
            return part071;
        }

        /**
         * Sets the value of the part071 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part071 }
         */
        public void setPart071(PartsDatabaseFile.Part.Part071 value) {
            this.part071 = value;
        }

        /**
         * Gets the value of the part025 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part025 }
         */
        public PartsDatabaseFile.Part.Part025 getPart025() {
            return part025;
        }

        /**
         * Sets the value of the part025 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part025 }
         */
        public void setPart025(PartsDatabaseFile.Part.Part025 value) {
            this.part025 = value;
        }

        /**
         * Gets the value of the part033 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part033 }
         */
        public PartsDatabaseFile.Part.Part033 getPart033() {
            return part033;
        }

        /**
         * Sets the value of the part033 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part033 }
         */
        public void setPart033(PartsDatabaseFile.Part.Part033 value) {
            this.part033 = value;
        }

        /**
         * Gets the value of the part034 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part034 }
         */
        public PartsDatabaseFile.Part.Part034 getPart034() {
            return part034;
        }

        /**
         * Sets the value of the part034 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part034 }
         */
        public void setPart034(PartsDatabaseFile.Part.Part034 value) {
            this.part034 = value;
        }

        /**
         * Gets the value of the part029 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part029 }
         */
        public PartsDatabaseFile.Part.Part029 getPart029() {
            return part029;
        }

        /**
         * Sets the value of the part029 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part029 }
         */
        public void setPart029(PartsDatabaseFile.Part.Part029 value) {
            this.part029 = value;
        }

        /**
         * Gets the value of the part031 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part031 }
         */
        public PartsDatabaseFile.Part.Part031 getPart031() {
            return part031;
        }

        /**
         * Sets the value of the part031 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part031 }
         */
        public void setPart031(PartsDatabaseFile.Part.Part031 value) {
            this.part031 = value;
        }

        /**
         * Gets the value of the part026 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part026 }
         */
        public PartsDatabaseFile.Part.Part026 getPart026() {
            return part026;
        }

        /**
         * Sets the value of the part026 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part026 }
         */
        public void setPart026(PartsDatabaseFile.Part.Part026 value) {
            this.part026 = value;
        }

        /**
         * Gets the value of the part064 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part064 }
         */
        public PartsDatabaseFile.Part.Part064 getPart064() {
            return part064;
        }

        /**
         * Sets the value of the part064 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part064 }
         */
        public void setPart064(PartsDatabaseFile.Part.Part064 value) {
            this.part064 = value;
        }

        /**
         * Gets the value of the part073 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part073 }
         */
        public PartsDatabaseFile.Part.Part073 getPart073() {
            return part073;
        }

        /**
         * Sets the value of the part073 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part073 }
         */
        public void setPart073(PartsDatabaseFile.Part.Part073 value) {
            this.part073 = value;
        }

        /**
         * Gets the value of the part027 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part027 }
         */
        public PartsDatabaseFile.Part.Part027 getPart027() {
            return part027;
        }

        /**
         * Sets the value of the part027 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part027 }
         */
        public void setPart027(PartsDatabaseFile.Part.Part027 value) {
            this.part027 = value;
        }

        /**
         * Gets the value of the part082 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part082 }
         */
        public PartsDatabaseFile.Part.Part082 getPart082() {
            return part082;
        }

        /**
         * Sets the value of the part082 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part082 }
         */
        public void setPart082(PartsDatabaseFile.Part.Part082 value) {
            this.part082 = value;
        }

        /**
         * Gets the value of the part101 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part101 }
         */
        public PartsDatabaseFile.Part.Part101 getPart101() {
            return part101;
        }

        /**
         * Sets the value of the part101 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part101 }
         */
        public void setPart101(PartsDatabaseFile.Part.Part101 value) {
            this.part101 = value;
        }

        /**
         * Gets the value of the part106 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part106 }
         */
        public PartsDatabaseFile.Part.Part106 getPart106() {
            return part106;
        }

        /**
         * Sets the value of the part106 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part106 }
         */
        public void setPart106(PartsDatabaseFile.Part.Part106 value) {
            this.part106 = value;
        }

        /**
         * Gets the value of the part108 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part108 }
         */
        public PartsDatabaseFile.Part.Part108 getPart108() {
            return part108;
        }

        /**
         * Sets the value of the part108 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part108 }
         */
        public void setPart108(PartsDatabaseFile.Part.Part108 value) {
            this.part108 = value;
        }

        /**
         * Gets the value of the part014 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part014 }
         */
        public PartsDatabaseFile.Part.Part014 getPart014() {
            return part014;
        }

        /**
         * Sets the value of the part014 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part014 }
         */
        public void setPart014(PartsDatabaseFile.Part.Part014 value) {
            this.part014 = value;
        }

        /**
         * Gets the value of the part022 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part022 }
         */
        public PartsDatabaseFile.Part.Part022 getPart022() {
            return part022;
        }

        /**
         * Sets the value of the part022 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part022 }
         */
        public void setPart022(PartsDatabaseFile.Part.Part022 value) {
            this.part022 = value;
        }

        /**
         * Gets the value of the part036 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part036 }
         */
        public PartsDatabaseFile.Part.Part036 getPart036() {
            return part036;
        }

        /**
         * Sets the value of the part036 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part036 }
         */
        public void setPart036(PartsDatabaseFile.Part.Part036 value) {
            this.part036 = value;
        }

        /**
         * Gets the value of the part037 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part037 }
         */
        public PartsDatabaseFile.Part.Part037 getPart037() {
            return part037;
        }

        /**
         * Sets the value of the part037 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part037 }
         */
        public void setPart037(PartsDatabaseFile.Part.Part037 value) {
            this.part037 = value;
        }

        /**
         * Gets the value of the part040 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part040 }
         */
        public PartsDatabaseFile.Part.Part040 getPart040() {
            return part040;
        }

        /**
         * Sets the value of the part040 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part040 }
         */
        public void setPart040(PartsDatabaseFile.Part.Part040 value) {
            this.part040 = value;
        }

        /**
         * Gets the value of the part041 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part041 }
         */
        public PartsDatabaseFile.Part.Part041 getPart041() {
            return part041;
        }

        /**
         * Sets the value of the part041 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part041 }
         */
        public void setPart041(PartsDatabaseFile.Part.Part041 value) {
            this.part041 = value;
        }

        /**
         * Gets the value of the part042 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part042 }
         */
        public PartsDatabaseFile.Part.Part042 getPart042() {
            return part042;
        }

        /**
         * Sets the value of the part042 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part042 }
         */
        public void setPart042(PartsDatabaseFile.Part.Part042 value) {
            this.part042 = value;
        }

        /**
         * Gets the value of the part043 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part043 }
         */
        public PartsDatabaseFile.Part.Part043 getPart043() {
            return part043;
        }

        /**
         * Sets the value of the part043 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part043 }
         */
        public void setPart043(PartsDatabaseFile.Part.Part043 value) {
            this.part043 = value;
        }

        /**
         * Gets the value of the part078 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part078 }
         */
        public PartsDatabaseFile.Part.Part078 getPart078() {
            return part078;
        }

        /**
         * Sets the value of the part078 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part078 }
         */
        public void setPart078(PartsDatabaseFile.Part.Part078 value) {
            this.part078 = value;
        }

        /**
         * Gets the value of the part017 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part017 }
         */
        public PartsDatabaseFile.Part.Part017 getPart017() {
            return part017;
        }

        /**
         * Sets the value of the part017 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part017 }
         */
        public void setPart017(PartsDatabaseFile.Part.Part017 value) {
            this.part017 = value;
        }

        /**
         * Gets the value of the part038 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part038 }
         */
        public PartsDatabaseFile.Part.Part038 getPart038() {
            return part038;
        }

        /**
         * Sets the value of the part038 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part038 }
         */
        public void setPart038(PartsDatabaseFile.Part.Part038 value) {
            this.part038 = value;
        }

        /**
         * Gets the value of the part039 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part039 }
         */
        public PartsDatabaseFile.Part.Part039 getPart039() {
            return part039;
        }

        /**
         * Sets the value of the part039 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part039 }
         */
        public void setPart039(PartsDatabaseFile.Part.Part039 value) {
            this.part039 = value;
        }

        /**
         * Gets the value of the part015 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part015 }
         */
        public PartsDatabaseFile.Part.Part015 getPart015() {
            return part015;
        }

        /**
         * Sets the value of the part015 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part015 }
         */
        public void setPart015(PartsDatabaseFile.Part.Part015 value) {
            this.part015 = value;
        }

        /**
         * Gets the value of the part032 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part032 }
         */
        public PartsDatabaseFile.Part.Part032 getPart032() {
            return part032;
        }

        /**
         * Sets the value of the part032 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part032 }
         */
        public void setPart032(PartsDatabaseFile.Part.Part032 value) {
            this.part032 = value;
        }

        /**
         * Gets the value of the part055 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part055 }
         */
        public PartsDatabaseFile.Part.Part055 getPart055() {
            return part055;
        }

        /**
         * Sets the value of the part055 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part055 }
         */
        public void setPart055(PartsDatabaseFile.Part.Part055 value) {
            this.part055 = value;
        }

        /**
         * Gets the value of the part057 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part057 }
         */
        public PartsDatabaseFile.Part.Part057 getPart057() {
            return part057;
        }

        /**
         * Sets the value of the part057 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part057 }
         */
        public void setPart057(PartsDatabaseFile.Part.Part057 value) {
            this.part057 = value;
        }

        /**
         * Gets the value of the part077 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part077 }
         */
        public PartsDatabaseFile.Part.Part077 getPart077() {
            return part077;
        }

        /**
         * Sets the value of the part077 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part077 }
         */
        public void setPart077(PartsDatabaseFile.Part.Part077 value) {
            this.part077 = value;
        }

        /**
         * Gets the value of the ballSize property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.BallSize }
         */
        public PartsDatabaseFile.Part.BallSize getBallSize() {
            return ballSize;
        }

        /**
         * Sets the value of the ballSize property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.BallSize }
         */
        public void setBallSize(PartsDatabaseFile.Part.BallSize value) {
            this.ballSize = value;
        }

        /**
         * Gets the value of the ball property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Ball }
         */
        public PartsDatabaseFile.Part.Ball getBall() {
            return ball;
        }

        /**
         * Sets the value of the ball property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Ball }
         */
        public void setBall(PartsDatabaseFile.Part.Ball value) {
            this.ball = value;
        }

        /**
         * Gets the value of the part010 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part010 }
         */
        public PartsDatabaseFile.Part.Part010 getPart010() {
            return part010;
        }

        /**
         * Sets the value of the part010 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part010 }
         */
        public void setPart010(PartsDatabaseFile.Part.Part010 value) {
            this.part010 = value;
        }

        /**
         * Gets the value of the part056 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part056 }
         */
        public PartsDatabaseFile.Part.Part056 getPart056() {
            return part056;
        }

        /**
         * Sets the value of the part056 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part056 }
         */
        public void setPart056(PartsDatabaseFile.Part.Part056 value) {
            this.part056 = value;
        }

        /**
         * Gets the value of the part011 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part011 }
         */
        public PartsDatabaseFile.Part.Part011 getPart011() {
            return part011;
        }

        /**
         * Sets the value of the part011 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part011 }
         */
        public void setPart011(PartsDatabaseFile.Part.Part011 value) {
            this.part011 = value;
        }

        /**
         * Gets the value of the part024 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part024 }
         */
        public PartsDatabaseFile.Part.Part024 getPart024() {
            return part024;
        }

        /**
         * Sets the value of the part024 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part024 }
         */
        public void setPart024(PartsDatabaseFile.Part.Part024 value) {
            this.part024 = value;
        }

        /**
         * Gets the value of the part044 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part044 }
         */
        public PartsDatabaseFile.Part.Part044 getPart044() {
            return part044;
        }

        /**
         * Sets the value of the part044 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part044 }
         */
        public void setPart044(PartsDatabaseFile.Part.Part044 value) {
            this.part044 = value;
        }

        /**
         * Gets the value of the part045 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part045 }
         */
        public PartsDatabaseFile.Part.Part045 getPart045() {
            return part045;
        }

        /**
         * Sets the value of the part045 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part045 }
         */
        public void setPart045(PartsDatabaseFile.Part.Part045 value) {
            this.part045 = value;
        }

        /**
         * Gets the value of the part046 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part046 }
         */
        public PartsDatabaseFile.Part.Part046 getPart046() {
            return part046;
        }

        /**
         * Sets the value of the part046 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part046 }
         */
        public void setPart046(PartsDatabaseFile.Part.Part046 value) {
            this.part046 = value;
        }

        /**
         * Gets the value of the part047 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part047 }
         */
        public PartsDatabaseFile.Part.Part047 getPart047() {
            return part047;
        }

        /**
         * Sets the value of the part047 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part047 }
         */
        public void setPart047(PartsDatabaseFile.Part.Part047 value) {
            this.part047 = value;
        }

        /**
         * Gets the value of the part048 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part048 }
         */
        public PartsDatabaseFile.Part.Part048 getPart048() {
            return part048;
        }

        /**
         * Sets the value of the part048 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part048 }
         */
        public void setPart048(PartsDatabaseFile.Part.Part048 value) {
            this.part048 = value;
        }

        /**
         * Gets the value of the part049 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part049 }
         */
        public PartsDatabaseFile.Part.Part049 getPart049() {
            return part049;
        }

        /**
         * Sets the value of the part049 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part049 }
         */
        public void setPart049(PartsDatabaseFile.Part.Part049 value) {
            this.part049 = value;
        }

        /**
         * Gets the value of the part050 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part050 }
         */
        public PartsDatabaseFile.Part.Part050 getPart050() {
            return part050;
        }

        /**
         * Sets the value of the part050 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part050 }
         */
        public void setPart050(PartsDatabaseFile.Part.Part050 value) {
            this.part050 = value;
        }

        /**
         * Gets the value of the part051 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part051 }
         */
        public PartsDatabaseFile.Part.Part051 getPart051() {
            return part051;
        }

        /**
         * Sets the value of the part051 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part051 }
         */
        public void setPart051(PartsDatabaseFile.Part.Part051 value) {
            this.part051 = value;
        }

        /**
         * Gets the value of the part052 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part052 }
         */
        public PartsDatabaseFile.Part.Part052 getPart052() {
            return part052;
        }

        /**
         * Sets the value of the part052 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part052 }
         */
        public void setPart052(PartsDatabaseFile.Part.Part052 value) {
            this.part052 = value;
        }

        /**
         * Gets the value of the part053 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part053 }
         */
        public PartsDatabaseFile.Part.Part053 getPart053() {
            return part053;
        }

        /**
         * Sets the value of the part053 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part053 }
         */
        public void setPart053(PartsDatabaseFile.Part.Part053 value) {
            this.part053 = value;
        }

        /**
         * Gets the value of the part054 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part054 }
         */
        public PartsDatabaseFile.Part.Part054 getPart054() {
            return part054;
        }

        /**
         * Sets the value of the part054 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part054 }
         */
        public void setPart054(PartsDatabaseFile.Part.Part054 value) {
            this.part054 = value;
        }

        /**
         * Gets the value of the part100 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part100 }
         */
        public PartsDatabaseFile.Part.Part100 getPart100() {
            return part100;
        }

        /**
         * Sets the value of the part100 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part100 }
         */
        public void setPart100(PartsDatabaseFile.Part.Part100 value) {
            this.part100 = value;
        }

        /**
         * Gets the value of the part104 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part104 }
         */
        public PartsDatabaseFile.Part.Part104 getPart104() {
            return part104;
        }

        /**
         * Sets the value of the part104 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part104 }
         */
        public void setPart104(PartsDatabaseFile.Part.Part104 value) {
            this.part104 = value;
        }

        /**
         * Gets the value of the part105 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part105 }
         */
        public PartsDatabaseFile.Part.Part105 getPart105() {
            return part105;
        }

        /**
         * Sets the value of the part105 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part105 }
         */
        public void setPart105(PartsDatabaseFile.Part.Part105 value) {
            this.part105 = value;
        }

        /**
         * Gets the value of the part063 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part063 }
         */
        public PartsDatabaseFile.Part.Part063 getPart063() {
            return part063;
        }

        /**
         * Sets the value of the part063 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part063 }
         */
        public void setPart063(PartsDatabaseFile.Part.Part063 value) {
            this.part063 = value;
        }

        /**
         * Gets the value of the part030 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part030 }
         */
        public PartsDatabaseFile.Part.Part030 getPart030() {
            return part030;
        }

        /**
         * Sets the value of the part030 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part030 }
         */
        public void setPart030(PartsDatabaseFile.Part.Part030 value) {
            this.part030 = value;
        }

        /**
         * Gets the value of the part004 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part004 }
         */
        public PartsDatabaseFile.Part.Part004 getPart004() {
            return part004;
        }

        /**
         * Sets the value of the part004 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part004 }
         */
        public void setPart004(PartsDatabaseFile.Part.Part004 value) {
            this.part004 = value;
        }

        /**
         * Gets the value of the part018 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part018 }
         */
        public PartsDatabaseFile.Part.Part018 getPart018() {
            return part018;
        }

        /**
         * Sets the value of the part018 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part018 }
         */
        public void setPart018(PartsDatabaseFile.Part.Part018 value) {
            this.part018 = value;
        }

        /**
         * Gets the value of the exLights property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.ExLights }
         */
        public PartsDatabaseFile.Part.ExLights getExLights() {
            return exLights;
        }

        /**
         * Sets the value of the exLights property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.ExLights }
         */
        public void setExLights(PartsDatabaseFile.Part.ExLights value) {
            this.exLights = value;
        }

        /**
         * Gets the value of the part109 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part109 }
         */
        public PartsDatabaseFile.Part.Part109 getPart109() {
            return part109;
        }

        /**
         * Sets the value of the part109 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part109 }
         */
        public void setPart109(PartsDatabaseFile.Part.Part109 value) {
            this.part109 = value;
        }

        /**
         * Gets the value of the part079 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part079 }
         */
        public PartsDatabaseFile.Part.Part079 getPart079() {
            return part079;
        }

        /**
         * Sets the value of the part079 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part079 }
         */
        public void setPart079(PartsDatabaseFile.Part.Part079 value) {
            this.part079 = value;
        }

        /**
         * Gets the value of the smartRecognition property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.SmartRecognition }
         */
        public PartsDatabaseFile.Part.SmartRecognition getSmartRecognition() {
            return smartRecognition;
        }

        /**
         * Sets the value of the smartRecognition property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.SmartRecognition }
         */
        public void setSmartRecognition(PartsDatabaseFile.Part.SmartRecognition value) {
            this.smartRecognition = value;
        }

        /**
         * Gets the value of the no property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getNo() {
            return no;
        }

        /**
         * Sets the value of the no property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNo(String value) {
            this.no = value;
        }

        /**
         * Gets the value of the dateTime property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getDateTime() {
            return dateTime;
        }

        /**
         * Sets the value of the dateTime property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setDateTime(String value) {
            this.dateTime = value;
        }

        /**
         * Gets the value of the operator property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getOperator() {
            return operator;
        }

        /**
         * Sets the value of the operator property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setOperator(String value) {
            this.operator = value;
        }

        /**
         * Gets the value of the serial property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getSerial() {
            return serial;
        }

        /**
         * Sets the value of the serial property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSerial(String value) {
            this.serial = value;
        }

        /**
         * Gets the value of the application property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setApplication(String value) {
            this.application = value;
        }

        /**
         * Gets the value of the comment property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setComment(String value) {
            this.comment = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Data.01" type="{}Wstring" />
         *       &lt;attribute name="Data.02" type="{}Wstring" />
         *       &lt;attribute name="Data.03" type="{}Wstring" />
         *       &lt;attribute name="Data.04" type="{}Wstring" />
         *       &lt;attribute name="Data.05" type="{}Wstring" />
         *       &lt;attribute name="Data.06" type="{}Wstring" />
         *       &lt;attribute name="Data.07" type="{}Wstring" />
         *       &lt;attribute name="Data.08" type="{}Wstring" />
         *       &lt;attribute name="Data.09" type="{}Wstring" />
         *       &lt;attribute name="Data.10" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Ball {

            @XmlAttribute(name = "Data.01")
            protected String data01;
            @XmlAttribute(name = "Data.02")
            protected String data02;
            @XmlAttribute(name = "Data.03")
            protected String data03;
            @XmlAttribute(name = "Data.04")
            protected String data04;
            @XmlAttribute(name = "Data.05")
            protected String data05;
            @XmlAttribute(name = "Data.06")
            protected String data06;
            @XmlAttribute(name = "Data.07")
            protected String data07;
            @XmlAttribute(name = "Data.08")
            protected String data08;
            @XmlAttribute(name = "Data.09")
            protected String data09;
            @XmlAttribute(name = "Data.10")
            protected String data10;

            /**
             * Gets the value of the data01 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData01() {
                return data01;
            }

            /**
             * Sets the value of the data01 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData01(String value) {
                this.data01 = value;
            }

            /**
             * Gets the value of the data02 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData02() {
                return data02;
            }

            /**
             * Sets the value of the data02 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData02(String value) {
                this.data02 = value;
            }

            /**
             * Gets the value of the data03 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData03() {
                return data03;
            }

            /**
             * Sets the value of the data03 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData03(String value) {
                this.data03 = value;
            }

            /**
             * Gets the value of the data04 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData04() {
                return data04;
            }

            /**
             * Sets the value of the data04 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData04(String value) {
                this.data04 = value;
            }

            /**
             * Gets the value of the data05 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData05() {
                return data05;
            }

            /**
             * Sets the value of the data05 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData05(String value) {
                this.data05 = value;
            }

            /**
             * Gets the value of the data06 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData06() {
                return data06;
            }

            /**
             * Sets the value of the data06 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData06(String value) {
                this.data06 = value;
            }

            /**
             * Gets the value of the data07 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData07() {
                return data07;
            }

            /**
             * Sets the value of the data07 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData07(String value) {
                this.data07 = value;
            }

            /**
             * Gets the value of the data08 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData08() {
                return data08;
            }

            /**
             * Sets the value of the data08 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData08(String value) {
                this.data08 = value;
            }

            /**
             * Gets the value of the data09 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData09() {
                return data09;
            }

            /**
             * Sets the value of the data09 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData09(String value) {
                this.data09 = value;
            }

            /**
             * Gets the value of the data10 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData10() {
                return data10;
            }

            /**
             * Sets the value of the data10 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData10(String value) {
                this.data10 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="HSize" type="{}Wstring" />
         *       &lt;attribute name="VSize" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BallSize {

            @XmlAttribute(name = "HSize")
            protected String hSize;
            @XmlAttribute(name = "VSize")
            protected String vSize;

            /**
             * Gets the value of the hSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getHSize() {
                return hSize;
            }

            /**
             * Sets the value of the hSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setHSize(String value) {
                this.hSize = value;
            }

            /**
             * Gets the value of the vSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVSize() {
                return vSize;
            }

            /**
             * Sets the value of the vSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVSize(String value) {
                this.vSize = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ExLight" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                 &lt;/sequence>
         *                 &lt;attribute name="No" type="{}Wstring" />
         *                 &lt;attribute name="ExLightLevel" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "exLight"
        })
        public static class ExLights {

            @XmlElement(name = "ExLight", required = true)
            protected List<PartsDatabaseFile.Part.ExLights.ExLight> exLight;

            /**
             * Gets the value of the exLight property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the exLight property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExLight().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PartsDatabaseFile.Part.ExLights.ExLight }
             */
            public List<PartsDatabaseFile.Part.ExLights.ExLight> getExLight() {
                if (exLight == null) {
                    exLight = new ArrayList<PartsDatabaseFile.Part.ExLights.ExLight>();
                }
                return this.exLight;
            }


            /**
             * <p>Java class for anonymous complex type.
             *
             * <p>The following schema fragment specifies the expected content contained within this class.
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *       &lt;/sequence>
             *       &lt;attribute name="No" type="{}Wstring" />
             *       &lt;attribute name="ExLightLevel" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ExLight {

                @XmlAttribute(name = "No")
                protected String no;
                @XmlAttribute(name = "ExLightLevel")
                protected String exLightLevel;

                /**
                 * Gets the value of the no property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getNo() {
                    return no;
                }

                /**
                 * Sets the value of the no property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setNo(String value) {
                    this.no = value;
                }

                /**
                 * Gets the value of the exLightLevel property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getExLightLevel() {
                    return exLightLevel;
                }

                /**
                 * Sets the value of the exLightLevel property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setExLightLevel(String value) {
                    this.exLightLevel = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="PartsName" type="{}Wstring" />
         *       &lt;attribute name="Comment" type="{}Wstring" />
         *       &lt;attribute name="DatabaseNo" type="{}Wstring" />
         *       &lt;attribute name="LibraryUse" type="{}Wstring" />
         *       &lt;attribute name="LibraryFolder" type="{}Wstring" />
         *       &lt;attribute name="LibraryPath" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part001 {

            @XmlAttribute(name = "PartsName")
            protected String partsName;
            @XmlAttribute(name = "Comment")
            protected String comment;
            @XmlAttribute(name = "DatabaseNo")
            protected String databaseNo;
            @XmlAttribute(name = "LibraryUse")
            protected String libraryUse;
            @XmlAttribute(name = "LibraryFolder")
            protected String libraryFolder;
            @XmlAttribute(name = "LibraryPath")
            protected String libraryPath;

            /**
             * Gets the value of the partsName property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPartsName() {
                return partsName;
            }

            /**
             * Sets the value of the partsName property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPartsName(String value) {
                this.partsName = value;
            }

            /**
             * Gets the value of the comment property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getComment() {
                return comment;
            }

            /**
             * Sets the value of the comment property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setComment(String value) {
                this.comment = value;
            }

            /**
             * Gets the value of the databaseNo property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDatabaseNo() {
                return databaseNo;
            }

            /**
             * Sets the value of the databaseNo property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDatabaseNo(String value) {
                this.databaseNo = value;
            }

            /**
             * Gets the value of the libraryUse property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLibraryUse() {
                return libraryUse;
            }

            /**
             * Sets the value of the libraryUse property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLibraryUse(String value) {
                this.libraryUse = value;
            }

            /**
             * Gets the value of the libraryFolder property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLibraryFolder() {
                return libraryFolder;
            }

            /**
             * Sets the value of the libraryFolder property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLibraryFolder(String value) {
                this.libraryFolder = value;
            }

            /**
             * Gets the value of the libraryPath property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLibraryPath() {
                return libraryPath;
            }

            /**
             * Sets the value of the libraryPath property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLibraryPath(String value) {
                this.libraryPath = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="ShapeType" type="{}Wstring" />
         *       &lt;attribute name="Package" type="{}Wstring" />
         *       &lt;attribute name="FdrType" type="{}Wstring" />
         *       &lt;attribute name="ReelDiameter" type="{}Wstring" />
         *       &lt;attribute name="BitFlags" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part002 {

            @XmlAttribute(name = "ShapeType")
            protected String shapeType;
            @XmlAttribute(name = "Package")
            protected String _package;
            @XmlAttribute(name = "FdrType")
            protected String fdrType;
            @XmlAttribute(name = "ReelDiameter")
            protected String reelDiameter;
            @XmlAttribute(name = "BitFlags")
            protected String bitFlags;

            /**
             * Gets the value of the shapeType property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getShapeType() {
                return shapeType;
            }

            /**
             * Sets the value of the shapeType property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setShapeType(String value) {
                this.shapeType = value;
            }

            /**
             * Gets the value of the package property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPackage() {
                return _package;
            }

            /**
             * Sets the value of the package property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPackage(String value) {
                this._package = value;
            }

            /**
             * Gets the value of the fdrType property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFdrType() {
                return fdrType;
            }

            /**
             * Sets the value of the fdrType property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFdrType(String value) {
                this.fdrType = value;
            }

            /**
             * Gets the value of the reelDiameter property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getReelDiameter() {
                return reelDiameter;
            }

            /**
             * Sets the value of the reelDiameter property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setReelDiameter(String value) {
                this.reelDiameter = value;
            }

            /**
             * Gets the value of the bitFlags property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBitFlags() {
                return bitFlags;
            }

            /**
             * Sets the value of the bitFlags property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBitFlags(String value) {
                this.bitFlags = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Setno" type="{}Wstring" />
         *       &lt;attribute name="Definition" type="{}Wstring" />
         *       &lt;attribute name="XPos" type="{}Wstring" />
         *       &lt;attribute name="YPos" type="{}Wstring" />
         *       &lt;attribute name="FdrIdxStep" type="{}Wstring" />
         *       &lt;attribute name="FdrIdxSpeed" type="{}Wstring" />
         *       &lt;attribute name="FeederTimerOffset" type="{}Wstring" />
         *       &lt;attribute name="Optimize" type="{}Wstring" />
         *       &lt;attribute name="PartsGroupNo" type="{}Wstring" />
         *       &lt;attribute name="FixCmp" type="{}Wstring" />
         *       &lt;attribute name="SwFdr" type="{}Wstring" />
         *       &lt;attribute name="PitchEffect" type="{}Wstring" />
         *       &lt;attribute name="Correct3A" type="{}Wstring" />
         *       &lt;attribute name="UnitNo" type="{}Wstring" />
         *       &lt;attribute name="PickPosCheck" type="{}Wstring" />
         *       &lt;attribute name="PickToleranceX" type="{}Wstring" />
         *       &lt;attribute name="PickToleranceY" type="{}Wstring" />
         *       &lt;attribute name="BoardDataTuning" type="{}Wstring" />
         *       &lt;attribute name="ToleranceTuning" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part003 {

            @XmlAttribute(name = "Setno")
            protected String setno;
            @XmlAttribute(name = "Definition")
            protected String definition;
            @XmlAttribute(name = "XPos")
            protected String xPos;
            @XmlAttribute(name = "YPos")
            protected String yPos;
            @XmlAttribute(name = "FdrIdxStep")
            protected String fdrIdxStep;
            @XmlAttribute(name = "FdrIdxSpeed")
            protected String fdrIdxSpeed;
            @XmlAttribute(name = "FeederTimerOffset")
            protected String feederTimerOffset;
            @XmlAttribute(name = "Optimize")
            protected String optimize;
            @XmlAttribute(name = "PartsGroupNo")
            protected String partsGroupNo;
            @XmlAttribute(name = "FixCmp")
            protected String fixCmp;
            @XmlAttribute(name = "SwFdr")
            protected String swFdr;
            @XmlAttribute(name = "PitchEffect")
            protected String pitchEffect;
            @XmlAttribute(name = "Correct3A")
            protected String correct3A;
            @XmlAttribute(name = "UnitNo")
            protected String unitNo;
            @XmlAttribute(name = "PickPosCheck")
            protected String pickPosCheck;
            @XmlAttribute(name = "PickToleranceX")
            protected String pickToleranceX;
            @XmlAttribute(name = "PickToleranceY")
            protected String pickToleranceY;
            @XmlAttribute(name = "BoardDataTuning")
            protected String boardDataTuning;
            @XmlAttribute(name = "ToleranceTuning")
            protected String toleranceTuning;

            /**
             * Gets the value of the setno property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSetno() {
                return setno;
            }

            /**
             * Sets the value of the setno property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSetno(String value) {
                this.setno = value;
            }

            /**
             * Gets the value of the definition property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDefinition() {
                return definition;
            }

            /**
             * Sets the value of the definition property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDefinition(String value) {
                this.definition = value;
            }

            /**
             * Gets the value of the xPos property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getXPos() {
                return xPos;
            }

            /**
             * Sets the value of the xPos property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXPos(String value) {
                this.xPos = value;
            }

            /**
             * Gets the value of the yPos property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getYPos() {
                return yPos;
            }

            /**
             * Sets the value of the yPos property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setYPos(String value) {
                this.yPos = value;
            }

            /**
             * Gets the value of the fdrIdxStep property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFdrIdxStep() {
                return fdrIdxStep;
            }

            /**
             * Sets the value of the fdrIdxStep property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFdrIdxStep(String value) {
                this.fdrIdxStep = value;
            }

            /**
             * Gets the value of the fdrIdxSpeed property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFdrIdxSpeed() {
                return fdrIdxSpeed;
            }

            /**
             * Sets the value of the fdrIdxSpeed property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFdrIdxSpeed(String value) {
                this.fdrIdxSpeed = value;
            }

            /**
             * Gets the value of the feederTimerOffset property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFeederTimerOffset() {
                return feederTimerOffset;
            }

            /**
             * Sets the value of the feederTimerOffset property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFeederTimerOffset(String value) {
                this.feederTimerOffset = value;
            }

            /**
             * Gets the value of the optimize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOptimize() {
                return optimize;
            }

            /**
             * Sets the value of the optimize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOptimize(String value) {
                this.optimize = value;
            }

            /**
             * Gets the value of the partsGroupNo property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPartsGroupNo() {
                return partsGroupNo;
            }

            /**
             * Sets the value of the partsGroupNo property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPartsGroupNo(String value) {
                this.partsGroupNo = value;
            }

            /**
             * Gets the value of the fixCmp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFixCmp() {
                return fixCmp;
            }

            /**
             * Sets the value of the fixCmp property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFixCmp(String value) {
                this.fixCmp = value;
            }

            /**
             * Gets the value of the swFdr property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSwFdr() {
                return swFdr;
            }

            /**
             * Sets the value of the swFdr property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSwFdr(String value) {
                this.swFdr = value;
            }

            /**
             * Gets the value of the pitchEffect property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPitchEffect() {
                return pitchEffect;
            }

            /**
             * Sets the value of the pitchEffect property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPitchEffect(String value) {
                this.pitchEffect = value;
            }

            /**
             * Gets the value of the correct3A property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCorrect3A() {
                return correct3A;
            }

            /**
             * Sets the value of the correct3A property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCorrect3A(String value) {
                this.correct3A = value;
            }

            /**
             * Gets the value of the unitNo property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getUnitNo() {
                return unitNo;
            }

            /**
             * Sets the value of the unitNo property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setUnitNo(String value) {
                this.unitNo = value;
            }

            /**
             * Gets the value of the pickPosCheck property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPickPosCheck() {
                return pickPosCheck;
            }

            /**
             * Sets the value of the pickPosCheck property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPickPosCheck(String value) {
                this.pickPosCheck = value;
            }

            /**
             * Gets the value of the pickToleranceX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPickToleranceX() {
                return pickToleranceX;
            }

            /**
             * Sets the value of the pickToleranceX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPickToleranceX(String value) {
                this.pickToleranceX = value;
            }

            /**
             * Gets the value of the pickToleranceY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPickToleranceY() {
                return pickToleranceY;
            }

            /**
             * Sets the value of the pickToleranceY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPickToleranceY(String value) {
                this.pickToleranceY = value;
            }

            /**
             * Gets the value of the boardDataTuning property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBoardDataTuning() {
                return boardDataTuning;
            }

            /**
             * Sets the value of the boardDataTuning property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBoardDataTuning(String value) {
                this.boardDataTuning = value;
            }

            /**
             * Gets the value of the toleranceTuning property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getToleranceTuning() {
                return toleranceTuning;
            }

            /**
             * Sets the value of the toleranceTuning property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setToleranceTuning(String value) {
                this.toleranceTuning = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="FreeSpace1" type="{}Wstring" />
         *       &lt;attribute name="FreeSpace2" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part004 {

            @XmlAttribute(name = "FreeSpace1")
            protected String freeSpace1;
            @XmlAttribute(name = "FreeSpace2")
            protected String freeSpace2;

            /**
             * Gets the value of the freeSpace1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFreeSpace1() {
                return freeSpace1;
            }

            /**
             * Sets the value of the freeSpace1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFreeSpace1(String value) {
                this.freeSpace1 = value;
            }

            /**
             * Gets the value of the freeSpace2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getFreeSpace2() {
                return freeSpace2;
            }

            /**
             * Sets the value of the freeSpace2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFreeSpace2(String value) {
                this.freeSpace2 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BodyX" type="{}Wstring" />
         *       &lt;attribute name="BodyY" type="{}Wstring" />
         *       &lt;attribute name="BodyZ" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part010 {

            @XmlAttribute(name = "BodyX")
            protected String bodyX;
            @XmlAttribute(name = "BodyY")
            protected String bodyY;
            @XmlAttribute(name = "BodyZ")
            protected String bodyZ;

            /**
             * Gets the value of the bodyX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyX() {
                return bodyX;
            }

            /**
             * Sets the value of the bodyX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyX(String value) {
                this.bodyX = value;
            }

            /**
             * Gets the value of the bodyY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyY() {
                return bodyY;
            }

            /**
             * Sets the value of the bodyY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyY(String value) {
                this.bodyY = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyZ(String value) {
                this.bodyZ = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BodyX" type="{}Wstring" />
         *       &lt;attribute name="BodyY" type="{}Wstring" />
         *       &lt;attribute name="BodyZ" type="{}Wstring" />
         *       &lt;attribute name="MoldX" type="{}Wstring" />
         *       &lt;attribute name="MoldY" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part011 {

            @XmlAttribute(name = "BodyX")
            protected String bodyX;
            @XmlAttribute(name = "BodyY")
            protected String bodyY;
            @XmlAttribute(name = "BodyZ")
            protected String bodyZ;
            @XmlAttribute(name = "MoldX")
            protected String moldX;
            @XmlAttribute(name = "MoldY")
            protected String moldY;

            /**
             * Gets the value of the bodyX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyX() {
                return bodyX;
            }

            /**
             * Sets the value of the bodyX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyX(String value) {
                this.bodyX = value;
            }

            /**
             * Gets the value of the bodyY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyY() {
                return bodyY;
            }

            /**
             * Sets the value of the bodyY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyY(String value) {
                this.bodyY = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyZ(String value) {
                this.bodyZ = value;
            }

            /**
             * Gets the value of the moldX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldX() {
                return moldX;
            }

            /**
             * Sets the value of the moldX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldX(String value) {
                this.moldX = value;
            }

            /**
             * Gets the value of the moldY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldY() {
                return moldY;
            }

            /**
             * Sets the value of the moldY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldY(String value) {
                this.moldY = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BodyX" type="{}Wstring" />
         *       &lt;attribute name="BodyY" type="{}Wstring" />
         *       &lt;attribute name="BodyZ" type="{}Wstring" />
         *       &lt;attribute name="MoldX" type="{}Wstring" />
         *       &lt;attribute name="MoldY" type="{}Wstring" />
         *       &lt;attribute name="MoldZ" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part012 {

            @XmlAttribute(name = "BodyX")
            protected String bodyX;
            @XmlAttribute(name = "BodyY")
            protected String bodyY;
            @XmlAttribute(name = "BodyZ")
            protected String bodyZ;
            @XmlAttribute(name = "MoldX")
            protected String moldX;
            @XmlAttribute(name = "MoldY")
            protected String moldY;
            @XmlAttribute(name = "MoldZ")
            protected String moldZ;

            /**
             * Gets the value of the bodyX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyX() {
                return bodyX;
            }

            /**
             * Sets the value of the bodyX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyX(String value) {
                this.bodyX = value;
            }

            /**
             * Gets the value of the bodyY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyY() {
                return bodyY;
            }

            /**
             * Sets the value of the bodyY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyY(String value) {
                this.bodyY = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyZ(String value) {
                this.bodyZ = value;
            }

            /**
             * Gets the value of the moldX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldX() {
                return moldX;
            }

            /**
             * Sets the value of the moldX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldX(String value) {
                this.moldX = value;
            }

            /**
             * Gets the value of the moldY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldY() {
                return moldY;
            }

            /**
             * Sets the value of the moldY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldY(String value) {
                this.moldY = value;
            }

            /**
             * Gets the value of the moldZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldZ() {
                return moldZ;
            }

            /**
             * Sets the value of the moldZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldZ(String value) {
                this.moldZ = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BodyX" type="{}Wstring" />
         *       &lt;attribute name="BodyY" type="{}Wstring" />
         *       &lt;attribute name="BodyZ" type="{}Wstring" />
         *       &lt;attribute name="MoldX" type="{}Wstring" />
         *       &lt;attribute name="MoldY" type="{}Wstring" />
         *       &lt;attribute name="MoldZ" type="{}Wstring" />
         *       &lt;attribute name="Thicknesschk" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part013 {

            @XmlAttribute(name = "BodyX")
            protected String bodyX;
            @XmlAttribute(name = "BodyY")
            protected String bodyY;
            @XmlAttribute(name = "BodyZ")
            protected String bodyZ;
            @XmlAttribute(name = "MoldX")
            protected String moldX;
            @XmlAttribute(name = "MoldY")
            protected String moldY;
            @XmlAttribute(name = "MoldZ")
            protected String moldZ;
            @XmlAttribute(name = "Thicknesschk")
            protected String thicknesschk;

            /**
             * Gets the value of the bodyX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyX() {
                return bodyX;
            }

            /**
             * Sets the value of the bodyX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyX(String value) {
                this.bodyX = value;
            }

            /**
             * Gets the value of the bodyY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyY() {
                return bodyY;
            }

            /**
             * Sets the value of the bodyY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyY(String value) {
                this.bodyY = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyZ(String value) {
                this.bodyZ = value;
            }

            /**
             * Gets the value of the moldX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldX() {
                return moldX;
            }

            /**
             * Sets the value of the moldX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldX(String value) {
                this.moldX = value;
            }

            /**
             * Gets the value of the moldY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldY() {
                return moldY;
            }

            /**
             * Sets the value of the moldY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldY(String value) {
                this.moldY = value;
            }

            /**
             * Gets the value of the moldZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldZ() {
                return moldZ;
            }

            /**
             * Sets the value of the moldZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldZ(String value) {
                this.moldZ = value;
            }

            /**
             * Gets the value of the thicknesschk property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getThicknesschk() {
                return thicknesschk;
            }

            /**
             * Sets the value of the thicknesschk property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setThicknesschk(String value) {
                this.thicknesschk = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BodyX" type="{}Wstring" />
         *       &lt;attribute name="BodyY" type="{}Wstring" />
         *       &lt;attribute name="BodyZ" type="{}Wstring" />
         *       &lt;attribute name="OffsetX" type="{}Wstring" />
         *       &lt;attribute name="OffsetY" type="{}Wstring" />
         *       &lt;attribute name="MoldX" type="{}Wstring" />
         *       &lt;attribute name="MoldY" type="{}Wstring" />
         *       &lt;attribute name="MoldZ" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part014 {

            @XmlAttribute(name = "BodyX")
            protected String bodyX;
            @XmlAttribute(name = "BodyY")
            protected String bodyY;
            @XmlAttribute(name = "BodyZ")
            protected String bodyZ;
            @XmlAttribute(name = "OffsetX")
            protected String offsetX;
            @XmlAttribute(name = "OffsetY")
            protected String offsetY;
            @XmlAttribute(name = "MoldX")
            protected String moldX;
            @XmlAttribute(name = "MoldY")
            protected String moldY;
            @XmlAttribute(name = "MoldZ")
            protected String moldZ;

            /**
             * Gets the value of the bodyX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyX() {
                return bodyX;
            }

            /**
             * Sets the value of the bodyX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyX(String value) {
                this.bodyX = value;
            }

            /**
             * Gets the value of the bodyY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyY() {
                return bodyY;
            }

            /**
             * Sets the value of the bodyY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyY(String value) {
                this.bodyY = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyZ(String value) {
                this.bodyZ = value;
            }

            /**
             * Gets the value of the offsetX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetX() {
                return offsetX;
            }

            /**
             * Sets the value of the offsetX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetX(String value) {
                this.offsetX = value;
            }

            /**
             * Gets the value of the offsetY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetY() {
                return offsetY;
            }

            /**
             * Sets the value of the offsetY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetY(String value) {
                this.offsetY = value;
            }

            /**
             * Gets the value of the moldX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldX() {
                return moldX;
            }

            /**
             * Sets the value of the moldX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldX(String value) {
                this.moldX = value;
            }

            /**
             * Gets the value of the moldY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldY() {
                return moldY;
            }

            /**
             * Sets the value of the moldY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldY(String value) {
                this.moldY = value;
            }

            /**
             * Gets the value of the moldZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldZ() {
                return moldZ;
            }

            /**
             * Sets the value of the moldZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldZ(String value) {
                this.moldZ = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BodyX" type="{}Wstring" />
         *       &lt;attribute name="BodyY" type="{}Wstring" />
         *       &lt;attribute name="BodyZ" type="{}Wstring" />
         *       &lt;attribute name="OffsetX" type="{}Wstring" />
         *       &lt;attribute name="OffsetY" type="{}Wstring" />
         *       &lt;attribute name="OffsetR" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part015 {

            @XmlAttribute(name = "BodyX")
            protected String bodyX;
            @XmlAttribute(name = "BodyY")
            protected String bodyY;
            @XmlAttribute(name = "BodyZ")
            protected String bodyZ;
            @XmlAttribute(name = "OffsetX")
            protected String offsetX;
            @XmlAttribute(name = "OffsetY")
            protected String offsetY;
            @XmlAttribute(name = "OffsetR")
            protected String offsetR;

            /**
             * Gets the value of the bodyX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyX() {
                return bodyX;
            }

            /**
             * Sets the value of the bodyX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyX(String value) {
                this.bodyX = value;
            }

            /**
             * Gets the value of the bodyY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyY() {
                return bodyY;
            }

            /**
             * Sets the value of the bodyY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyY(String value) {
                this.bodyY = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyZ(String value) {
                this.bodyZ = value;
            }

            /**
             * Gets the value of the offsetX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetX() {
                return offsetX;
            }

            /**
             * Sets the value of the offsetX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetX(String value) {
                this.offsetX = value;
            }

            /**
             * Gets the value of the offsetY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetY() {
                return offsetY;
            }

            /**
             * Sets the value of the offsetY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetY(String value) {
                this.offsetY = value;
            }

            /**
             * Gets the value of the offsetR property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetR() {
                return offsetR;
            }

            /**
             * Sets the value of the offsetR property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetR(String value) {
                this.offsetR = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BodyX" type="{}Wstring" />
         *       &lt;attribute name="BodyY" type="{}Wstring" />
         *       &lt;attribute name="BodyZ" type="{}Wstring" />
         *       &lt;attribute name="OffsetX" type="{}Wstring" />
         *       &lt;attribute name="OffsetY" type="{}Wstring" />
         *       &lt;attribute name="OffsetR" type="{}Wstring" />
         *       &lt;attribute name="MoldX" type="{}Wstring" />
         *       &lt;attribute name="MoldY" type="{}Wstring" />
         *       &lt;attribute name="MoldZ" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part016 {

            @XmlAttribute(name = "BodyX")
            protected String bodyX;
            @XmlAttribute(name = "BodyY")
            protected String bodyY;
            @XmlAttribute(name = "BodyZ")
            protected String bodyZ;
            @XmlAttribute(name = "OffsetX")
            protected String offsetX;
            @XmlAttribute(name = "OffsetY")
            protected String offsetY;
            @XmlAttribute(name = "OffsetR")
            protected String offsetR;
            @XmlAttribute(name = "MoldX")
            protected String moldX;
            @XmlAttribute(name = "MoldY")
            protected String moldY;
            @XmlAttribute(name = "MoldZ")
            protected String moldZ;

            /**
             * Gets the value of the bodyX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyX() {
                return bodyX;
            }

            /**
             * Sets the value of the bodyX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyX(String value) {
                this.bodyX = value;
            }

            /**
             * Gets the value of the bodyY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyY() {
                return bodyY;
            }

            /**
             * Sets the value of the bodyY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyY(String value) {
                this.bodyY = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyZ(String value) {
                this.bodyZ = value;
            }

            /**
             * Gets the value of the offsetX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetX() {
                return offsetX;
            }

            /**
             * Sets the value of the offsetX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetX(String value) {
                this.offsetX = value;
            }

            /**
             * Gets the value of the offsetY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetY() {
                return offsetY;
            }

            /**
             * Sets the value of the offsetY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetY(String value) {
                this.offsetY = value;
            }

            /**
             * Gets the value of the offsetR property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetR() {
                return offsetR;
            }

            /**
             * Sets the value of the offsetR property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetR(String value) {
                this.offsetR = value;
            }

            /**
             * Gets the value of the moldX property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldX() {
                return moldX;
            }

            /**
             * Sets the value of the moldX property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldX(String value) {
                this.moldX = value;
            }

            /**
             * Gets the value of the moldY property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldY() {
                return moldY;
            }

            /**
             * Sets the value of the moldY property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldY(String value) {
                this.moldY = value;
            }

            /**
             * Gets the value of the moldZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldZ() {
                return moldZ;
            }

            /**
             * Sets the value of the moldZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldZ(String value) {
                this.moldZ = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BodyDiameter" type="{}Wstring" />
         *       &lt;attribute name="BodyZ" type="{}Wstring" />
         *       &lt;attribute name="MoldDiameter" type="{}Wstring" />
         *       &lt;attribute name="MoldZ" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part017 {

            @XmlAttribute(name = "BodyDiameter")
            protected String bodyDiameter;
            @XmlAttribute(name = "BodyZ")
            protected String bodyZ;
            @XmlAttribute(name = "MoldDiameter")
            protected String moldDiameter;
            @XmlAttribute(name = "MoldZ")
            protected String moldZ;

            /**
             * Gets the value of the bodyDiameter property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyDiameter() {
                return bodyDiameter;
            }

            /**
             * Sets the value of the bodyDiameter property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyDiameter(String value) {
                this.bodyDiameter = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBodyZ(String value) {
                this.bodyZ = value;
            }

            /**
             * Gets the value of the moldDiameter property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldDiameter() {
                return moldDiameter;
            }

            /**
             * Sets the value of the moldDiameter property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldDiameter(String value) {
                this.moldDiameter = value;
            }

            /**
             * Gets the value of the moldZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMoldZ() {
                return moldZ;
            }

            /**
             * Sets the value of the moldZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMoldZ(String value) {
                this.moldZ = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="PolMark" type="{}Wstring" />
         *       &lt;attribute name="PolMarkPos" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part018 {

            @XmlAttribute(name = "PolMark")
            protected String polMark;
            @XmlAttribute(name = "PolMarkPos")
            protected String polMarkPos;

            /**
             * Gets the value of the polMark property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPolMark() {
                return polMark;
            }

            /**
             * Sets the value of the polMark property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPolMark(String value) {
                this.polMark = value;
            }

            /**
             * Gets the value of the polMarkPos property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPolMarkPos() {
                return polMarkPos;
            }

            /**
             * Sets the value of the polMarkPos property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPolMarkPos(String value) {
                this.polMarkPos = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffset" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part021 {

            @XmlAttribute(name = "RlrOffset")
            protected String rlrOffset;

            /**
             * Gets the value of the rlrOffset property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffset() {
                return rlrOffset;
            }

            /**
             * Sets the value of the rlrOffset property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffset(String value) {
                this.rlrOffset = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrWidth" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part022 {

            @XmlAttribute(name = "RlrWidth")
            protected String rlrWidth;

            /**
             * Gets the value of the rlrWidth property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrWidth() {
                return rlrWidth;
            }

            /**
             * Sets the value of the rlrWidth property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrWidth(String value) {
                this.rlrWidth = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffset" type="{}Wstring" />
         *       &lt;attribute name="LeadWidth" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part023 {

            @XmlAttribute(name = "RlrOffset")
            protected String rlrOffset;
            @XmlAttribute(name = "LeadWidth")
            protected String leadWidth;

            /**
             * Gets the value of the rlrOffset property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffset() {
                return rlrOffset;
            }

            /**
             * Sets the value of the rlrOffset property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffset(String value) {
                this.rlrOffset = value;
            }

            /**
             * Gets the value of the leadWidth property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidth() {
                return leadWidth;
            }

            /**
             * Sets the value of the leadWidth property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidth(String value) {
                this.leadWidth = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffset" type="{}Wstring" />
         *       &lt;attribute name="LeadLength" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part024 {

            @XmlAttribute(name = "RlrOffset")
            protected String rlrOffset;
            @XmlAttribute(name = "LeadLength")
            protected String leadLength;

            /**
             * Gets the value of the rlrOffset property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffset() {
                return rlrOffset;
            }

            /**
             * Sets the value of the rlrOffset property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffset(String value) {
                this.rlrOffset = value;
            }

            /**
             * Gets the value of the leadLength property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLength() {
                return leadLength;
            }

            /**
             * Sets the value of the leadLength property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLength(String value) {
                this.leadLength = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffset" type="{}Wstring" />
         *       &lt;attribute name="RlrWidth" type="{}Wstring" />
         *       &lt;attribute name="LeadWidth" type="{}Wstring" />
         *       &lt;attribute name="LeadLength" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part025 {

            @XmlAttribute(name = "RlrOffset")
            protected String rlrOffset;
            @XmlAttribute(name = "RlrWidth")
            protected String rlrWidth;
            @XmlAttribute(name = "LeadWidth")
            protected String leadWidth;
            @XmlAttribute(name = "LeadLength")
            protected String leadLength;

            /**
             * Gets the value of the rlrOffset property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffset() {
                return rlrOffset;
            }

            /**
             * Sets the value of the rlrOffset property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffset(String value) {
                this.rlrOffset = value;
            }

            /**
             * Gets the value of the rlrWidth property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrWidth() {
                return rlrWidth;
            }

            /**
             * Sets the value of the rlrWidth property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrWidth(String value) {
                this.rlrWidth = value;
            }

            /**
             * Gets the value of the leadWidth property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidth() {
                return leadWidth;
            }

            /**
             * Sets the value of the leadWidth property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidth(String value) {
                this.leadWidth = value;
            }

            /**
             * Gets the value of the leadLength property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLength() {
                return leadLength;
            }

            /**
             * Sets the value of the leadLength property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLength(String value) {
                this.leadLength = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffset" type="{}Wstring" />
         *       &lt;attribute name="RlrWidth" type="{}Wstring" />
         *       &lt;attribute name="LeadPitch" type="{}Wstring" />
         *       &lt;attribute name="LeadWidth" type="{}Wstring" />
         *       &lt;attribute name="LeadLength" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part026 {

            @XmlAttribute(name = "RlrOffset")
            protected String rlrOffset;
            @XmlAttribute(name = "RlrWidth")
            protected String rlrWidth;
            @XmlAttribute(name = "LeadPitch")
            protected String leadPitch;
            @XmlAttribute(name = "LeadWidth")
            protected String leadWidth;
            @XmlAttribute(name = "LeadLength")
            protected String leadLength;

            /**
             * Gets the value of the rlrOffset property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffset() {
                return rlrOffset;
            }

            /**
             * Sets the value of the rlrOffset property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffset(String value) {
                this.rlrOffset = value;
            }

            /**
             * Gets the value of the rlrWidth property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrWidth() {
                return rlrWidth;
            }

            /**
             * Sets the value of the rlrWidth property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrWidth(String value) {
                this.rlrWidth = value;
            }

            /**
             * Gets the value of the leadPitch property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitch() {
                return leadPitch;
            }

            /**
             * Sets the value of the leadPitch property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitch(String value) {
                this.leadPitch = value;
            }

            /**
             * Gets the value of the leadWidth property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidth() {
                return leadWidth;
            }

            /**
             * Sets the value of the leadWidth property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidth(String value) {
                this.leadWidth = value;
            }

            /**
             * Gets the value of the leadLength property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLength() {
                return leadLength;
            }

            /**
             * Sets the value of the leadLength property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLength(String value) {
                this.leadLength = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffset" type="{}Wstring" />
         *       &lt;attribute name="RlrWidth" type="{}Wstring" />
         *       &lt;attribute name="LeadPitch" type="{}Wstring" />
         *       &lt;attribute name="LeadWidth" type="{}Wstring" />
         *       &lt;attribute name="LeadLength" type="{}Wstring" />
         *       &lt;attribute name="BumpMask" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part027 {

            @XmlAttribute(name = "RlrOffset")
            protected String rlrOffset;
            @XmlAttribute(name = "RlrWidth")
            protected String rlrWidth;
            @XmlAttribute(name = "LeadPitch")
            protected String leadPitch;
            @XmlAttribute(name = "LeadWidth")
            protected String leadWidth;
            @XmlAttribute(name = "LeadLength")
            protected String leadLength;
            @XmlAttribute(name = "BumpMask")
            protected String bumpMask;

            /**
             * Gets the value of the rlrOffset property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffset() {
                return rlrOffset;
            }

            /**
             * Sets the value of the rlrOffset property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffset(String value) {
                this.rlrOffset = value;
            }

            /**
             * Gets the value of the rlrWidth property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrWidth() {
                return rlrWidth;
            }

            /**
             * Sets the value of the rlrWidth property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrWidth(String value) {
                this.rlrWidth = value;
            }

            /**
             * Gets the value of the leadPitch property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitch() {
                return leadPitch;
            }

            /**
             * Sets the value of the leadPitch property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitch(String value) {
                this.leadPitch = value;
            }

            /**
             * Gets the value of the leadWidth property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidth() {
                return leadWidth;
            }

            /**
             * Sets the value of the leadWidth property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidth(String value) {
                this.leadWidth = value;
            }

            /**
             * Gets the value of the leadLength property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLength() {
                return leadLength;
            }

            /**
             * Sets the value of the leadLength property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLength(String value) {
                this.leadLength = value;
            }

            /**
             * Gets the value of the bumpMask property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBumpMask() {
                return bumpMask;
            }

            /**
             * Sets the value of the bumpMask property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBumpMask(String value) {
                this.bumpMask = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetE" type="{}Wstring" />
         *       &lt;attribute name="RlrWidth" type="{}Wstring" />
         *       &lt;attribute name="LeadNumE" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchE" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthE" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthE" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part028 {

            @XmlAttribute(name = "RlrOffsetE")
            protected String rlrOffsetE;
            @XmlAttribute(name = "RlrWidth")
            protected String rlrWidth;
            @XmlAttribute(name = "LeadNumE")
            protected String leadNumE;
            @XmlAttribute(name = "LeadPitchE")
            protected String leadPitchE;
            @XmlAttribute(name = "LeadWidthE")
            protected String leadWidthE;
            @XmlAttribute(name = "LeadLengthE")
            protected String leadLengthE;

            /**
             * Gets the value of the rlrOffsetE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetE() {
                return rlrOffsetE;
            }

            /**
             * Sets the value of the rlrOffsetE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetE(String value) {
                this.rlrOffsetE = value;
            }

            /**
             * Gets the value of the rlrWidth property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrWidth() {
                return rlrWidth;
            }

            /**
             * Sets the value of the rlrWidth property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrWidth(String value) {
                this.rlrWidth = value;
            }

            /**
             * Gets the value of the leadNumE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumE() {
                return leadNumE;
            }

            /**
             * Sets the value of the leadNumE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumE(String value) {
                this.leadNumE = value;
            }

            /**
             * Gets the value of the leadPitchE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchE() {
                return leadPitchE;
            }

            /**
             * Sets the value of the leadPitchE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchE(String value) {
                this.leadPitchE = value;
            }

            /**
             * Gets the value of the leadWidthE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthE() {
                return leadWidthE;
            }

            /**
             * Sets the value of the leadWidthE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthE(String value) {
                this.leadWidthE = value;
            }

            /**
             * Gets the value of the leadLengthE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthE() {
                return leadLengthE;
            }

            /**
             * Sets the value of the leadLengthE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthE(String value) {
                this.leadLengthE = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumN" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part029 {

            @XmlAttribute(name = "LeadNumN")
            protected String leadNumN;

            /**
             * Gets the value of the leadNumN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumN() {
                return leadNumN;
            }

            /**
             * Sets the value of the leadNumN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumN(String value) {
                this.leadNumN = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumS" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part030 {

            @XmlAttribute(name = "LeadNumS")
            protected String leadNumS;

            /**
             * Gets the value of the leadNumS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumS() {
                return leadNumS;
            }

            /**
             * Sets the value of the leadNumS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumS(String value) {
                this.leadNumS = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumE" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part031 {

            @XmlAttribute(name = "LeadNumE")
            protected String leadNumE;

            /**
             * Gets the value of the leadNumE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumE() {
                return leadNumE;
            }

            /**
             * Sets the value of the leadNumE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumE(String value) {
                this.leadNumE = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumW" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part032 {

            @XmlAttribute(name = "LeadNumW")
            protected String leadNumW;

            /**
             * Gets the value of the leadNumW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumW() {
                return leadNumW;
            }

            /**
             * Sets the value of the leadNumW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumW(String value) {
                this.leadNumW = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumN" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchN" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part033 {

            @XmlAttribute(name = "LeadNumN")
            protected String leadNumN;
            @XmlAttribute(name = "LeadPitchN")
            protected String leadPitchN;

            /**
             * Gets the value of the leadNumN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumN() {
                return leadNumN;
            }

            /**
             * Sets the value of the leadNumN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumN(String value) {
                this.leadNumN = value;
            }

            /**
             * Gets the value of the leadPitchN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchN() {
                return leadPitchN;
            }

            /**
             * Sets the value of the leadPitchN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchN(String value) {
                this.leadPitchN = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumS" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchS" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part034 {

            @XmlAttribute(name = "LeadNumS")
            protected String leadNumS;
            @XmlAttribute(name = "LeadPitchS")
            protected String leadPitchS;

            /**
             * Gets the value of the leadNumS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumS() {
                return leadNumS;
            }

            /**
             * Sets the value of the leadNumS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumS(String value) {
                this.leadNumS = value;
            }

            /**
             * Gets the value of the leadPitchS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchS() {
                return leadPitchS;
            }

            /**
             * Sets the value of the leadPitchS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchS(String value) {
                this.leadPitchS = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetN" type="{}Wstring" />
         *       &lt;attribute name="LeadNumN" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchN" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthN" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthN" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part036 {

            @XmlAttribute(name = "RlrOffsetN")
            protected String rlrOffsetN;
            @XmlAttribute(name = "LeadNumN")
            protected String leadNumN;
            @XmlAttribute(name = "LeadPitchN")
            protected String leadPitchN;
            @XmlAttribute(name = "LeadWidthN")
            protected String leadWidthN;
            @XmlAttribute(name = "LeadLengthN")
            protected String leadLengthN;

            /**
             * Gets the value of the rlrOffsetN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetN() {
                return rlrOffsetN;
            }

            /**
             * Sets the value of the rlrOffsetN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetN(String value) {
                this.rlrOffsetN = value;
            }

            /**
             * Gets the value of the leadNumN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumN() {
                return leadNumN;
            }

            /**
             * Sets the value of the leadNumN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumN(String value) {
                this.leadNumN = value;
            }

            /**
             * Gets the value of the leadPitchN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchN() {
                return leadPitchN;
            }

            /**
             * Sets the value of the leadPitchN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchN(String value) {
                this.leadPitchN = value;
            }

            /**
             * Gets the value of the leadWidthN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthN() {
                return leadWidthN;
            }

            /**
             * Sets the value of the leadWidthN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthN(String value) {
                this.leadWidthN = value;
            }

            /**
             * Gets the value of the leadLengthN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthN() {
                return leadLengthN;
            }

            /**
             * Sets the value of the leadLengthN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthN(String value) {
                this.leadLengthN = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetS" type="{}Wstring" />
         *       &lt;attribute name="LeadNumS" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchS" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthS" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthS" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part037 {

            @XmlAttribute(name = "RlrOffsetS")
            protected String rlrOffsetS;
            @XmlAttribute(name = "LeadNumS")
            protected String leadNumS;
            @XmlAttribute(name = "LeadPitchS")
            protected String leadPitchS;
            @XmlAttribute(name = "LeadWidthS")
            protected String leadWidthS;
            @XmlAttribute(name = "LeadLengthS")
            protected String leadLengthS;

            /**
             * Gets the value of the rlrOffsetS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetS() {
                return rlrOffsetS;
            }

            /**
             * Sets the value of the rlrOffsetS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetS(String value) {
                this.rlrOffsetS = value;
            }

            /**
             * Gets the value of the leadNumS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumS() {
                return leadNumS;
            }

            /**
             * Sets the value of the leadNumS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumS(String value) {
                this.leadNumS = value;
            }

            /**
             * Gets the value of the leadPitchS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchS() {
                return leadPitchS;
            }

            /**
             * Sets the value of the leadPitchS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchS(String value) {
                this.leadPitchS = value;
            }

            /**
             * Gets the value of the leadWidthS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthS() {
                return leadWidthS;
            }

            /**
             * Sets the value of the leadWidthS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthS(String value) {
                this.leadWidthS = value;
            }

            /**
             * Gets the value of the leadLengthS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthS() {
                return leadLengthS;
            }

            /**
             * Sets the value of the leadLengthS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthS(String value) {
                this.leadLengthS = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetE" type="{}Wstring" />
         *       &lt;attribute name="LeadNumE" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchE" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthE" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthE" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part038 {

            @XmlAttribute(name = "RlrOffsetE")
            protected String rlrOffsetE;
            @XmlAttribute(name = "LeadNumE")
            protected String leadNumE;
            @XmlAttribute(name = "LeadPitchE")
            protected String leadPitchE;
            @XmlAttribute(name = "LeadWidthE")
            protected String leadWidthE;
            @XmlAttribute(name = "LeadLengthE")
            protected String leadLengthE;

            /**
             * Gets the value of the rlrOffsetE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetE() {
                return rlrOffsetE;
            }

            /**
             * Sets the value of the rlrOffsetE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetE(String value) {
                this.rlrOffsetE = value;
            }

            /**
             * Gets the value of the leadNumE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumE() {
                return leadNumE;
            }

            /**
             * Sets the value of the leadNumE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumE(String value) {
                this.leadNumE = value;
            }

            /**
             * Gets the value of the leadPitchE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchE() {
                return leadPitchE;
            }

            /**
             * Sets the value of the leadPitchE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchE(String value) {
                this.leadPitchE = value;
            }

            /**
             * Gets the value of the leadWidthE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthE() {
                return leadWidthE;
            }

            /**
             * Sets the value of the leadWidthE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthE(String value) {
                this.leadWidthE = value;
            }

            /**
             * Gets the value of the leadLengthE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthE() {
                return leadLengthE;
            }

            /**
             * Sets the value of the leadLengthE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthE(String value) {
                this.leadLengthE = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetW" type="{}Wstring" />
         *       &lt;attribute name="LeadNumW" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchW" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthW" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthW" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part039 {

            @XmlAttribute(name = "RlrOffsetW")
            protected String rlrOffsetW;
            @XmlAttribute(name = "LeadNumW")
            protected String leadNumW;
            @XmlAttribute(name = "LeadPitchW")
            protected String leadPitchW;
            @XmlAttribute(name = "LeadWidthW")
            protected String leadWidthW;
            @XmlAttribute(name = "LeadLengthW")
            protected String leadLengthW;

            /**
             * Gets the value of the rlrOffsetW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetW() {
                return rlrOffsetW;
            }

            /**
             * Sets the value of the rlrOffsetW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetW(String value) {
                this.rlrOffsetW = value;
            }

            /**
             * Gets the value of the leadNumW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumW() {
                return leadNumW;
            }

            /**
             * Sets the value of the leadNumW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumW(String value) {
                this.leadNumW = value;
            }

            /**
             * Gets the value of the leadPitchW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchW() {
                return leadPitchW;
            }

            /**
             * Sets the value of the leadPitchW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchW(String value) {
                this.leadPitchW = value;
            }

            /**
             * Gets the value of the leadWidthW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthW() {
                return leadWidthW;
            }

            /**
             * Sets the value of the leadWidthW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthW(String value) {
                this.leadWidthW = value;
            }

            /**
             * Gets the value of the leadLengthW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthW() {
                return leadLengthW;
            }

            /**
             * Sets the value of the leadLengthW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthW(String value) {
                this.leadLengthW = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetN" type="{}Wstring" />
         *       &lt;attribute name="LeadNumN" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchN" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthN" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthN" type="{}Wstring" />
         *       &lt;attribute name="OffLeadStartN" type="{}Wstring" />
         *       &lt;attribute name="OffLeadEndN" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part040 {

            @XmlAttribute(name = "RlrOffsetN")
            protected String rlrOffsetN;
            @XmlAttribute(name = "LeadNumN")
            protected String leadNumN;
            @XmlAttribute(name = "LeadPitchN")
            protected String leadPitchN;
            @XmlAttribute(name = "LeadWidthN")
            protected String leadWidthN;
            @XmlAttribute(name = "LeadLengthN")
            protected String leadLengthN;
            @XmlAttribute(name = "OffLeadStartN")
            protected String offLeadStartN;
            @XmlAttribute(name = "OffLeadEndN")
            protected String offLeadEndN;

            /**
             * Gets the value of the rlrOffsetN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetN() {
                return rlrOffsetN;
            }

            /**
             * Sets the value of the rlrOffsetN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetN(String value) {
                this.rlrOffsetN = value;
            }

            /**
             * Gets the value of the leadNumN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumN() {
                return leadNumN;
            }

            /**
             * Sets the value of the leadNumN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumN(String value) {
                this.leadNumN = value;
            }

            /**
             * Gets the value of the leadPitchN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchN() {
                return leadPitchN;
            }

            /**
             * Sets the value of the leadPitchN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchN(String value) {
                this.leadPitchN = value;
            }

            /**
             * Gets the value of the leadWidthN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthN() {
                return leadWidthN;
            }

            /**
             * Sets the value of the leadWidthN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthN(String value) {
                this.leadWidthN = value;
            }

            /**
             * Gets the value of the leadLengthN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthN() {
                return leadLengthN;
            }

            /**
             * Sets the value of the leadLengthN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthN(String value) {
                this.leadLengthN = value;
            }

            /**
             * Gets the value of the offLeadStartN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffLeadStartN() {
                return offLeadStartN;
            }

            /**
             * Sets the value of the offLeadStartN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffLeadStartN(String value) {
                this.offLeadStartN = value;
            }

            /**
             * Gets the value of the offLeadEndN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffLeadEndN() {
                return offLeadEndN;
            }

            /**
             * Sets the value of the offLeadEndN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffLeadEndN(String value) {
                this.offLeadEndN = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetS" type="{}Wstring" />
         *       &lt;attribute name="LeadNumS" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchS" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthS" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthS" type="{}Wstring" />
         *       &lt;attribute name="OffLeadStartS" type="{}Wstring" />
         *       &lt;attribute name="OffLeadEndS" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part041 {

            @XmlAttribute(name = "RlrOffsetS")
            protected String rlrOffsetS;
            @XmlAttribute(name = "LeadNumS")
            protected String leadNumS;
            @XmlAttribute(name = "LeadPitchS")
            protected String leadPitchS;
            @XmlAttribute(name = "LeadWidthS")
            protected String leadWidthS;
            @XmlAttribute(name = "LeadLengthS")
            protected String leadLengthS;
            @XmlAttribute(name = "OffLeadStartS")
            protected String offLeadStartS;
            @XmlAttribute(name = "OffLeadEndS")
            protected String offLeadEndS;

            /**
             * Gets the value of the rlrOffsetS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetS() {
                return rlrOffsetS;
            }

            /**
             * Sets the value of the rlrOffsetS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetS(String value) {
                this.rlrOffsetS = value;
            }

            /**
             * Gets the value of the leadNumS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumS() {
                return leadNumS;
            }

            /**
             * Sets the value of the leadNumS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumS(String value) {
                this.leadNumS = value;
            }

            /**
             * Gets the value of the leadPitchS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchS() {
                return leadPitchS;
            }

            /**
             * Sets the value of the leadPitchS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchS(String value) {
                this.leadPitchS = value;
            }

            /**
             * Gets the value of the leadWidthS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthS() {
                return leadWidthS;
            }

            /**
             * Sets the value of the leadWidthS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthS(String value) {
                this.leadWidthS = value;
            }

            /**
             * Gets the value of the leadLengthS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthS() {
                return leadLengthS;
            }

            /**
             * Sets the value of the leadLengthS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthS(String value) {
                this.leadLengthS = value;
            }

            /**
             * Gets the value of the offLeadStartS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffLeadStartS() {
                return offLeadStartS;
            }

            /**
             * Sets the value of the offLeadStartS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffLeadStartS(String value) {
                this.offLeadStartS = value;
            }

            /**
             * Gets the value of the offLeadEndS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffLeadEndS() {
                return offLeadEndS;
            }

            /**
             * Sets the value of the offLeadEndS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffLeadEndS(String value) {
                this.offLeadEndS = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetE" type="{}Wstring" />
         *       &lt;attribute name="LeadNumE" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchE" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthE" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthE" type="{}Wstring" />
         *       &lt;attribute name="OffLeadStartE" type="{}Wstring" />
         *       &lt;attribute name="OffLeadEndE" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part042 {

            @XmlAttribute(name = "RlrOffsetE")
            protected String rlrOffsetE;
            @XmlAttribute(name = "LeadNumE")
            protected String leadNumE;
            @XmlAttribute(name = "LeadPitchE")
            protected String leadPitchE;
            @XmlAttribute(name = "LeadWidthE")
            protected String leadWidthE;
            @XmlAttribute(name = "LeadLengthE")
            protected String leadLengthE;
            @XmlAttribute(name = "OffLeadStartE")
            protected String offLeadStartE;
            @XmlAttribute(name = "OffLeadEndE")
            protected String offLeadEndE;

            /**
             * Gets the value of the rlrOffsetE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetE() {
                return rlrOffsetE;
            }

            /**
             * Sets the value of the rlrOffsetE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetE(String value) {
                this.rlrOffsetE = value;
            }

            /**
             * Gets the value of the leadNumE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumE() {
                return leadNumE;
            }

            /**
             * Sets the value of the leadNumE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumE(String value) {
                this.leadNumE = value;
            }

            /**
             * Gets the value of the leadPitchE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchE() {
                return leadPitchE;
            }

            /**
             * Sets the value of the leadPitchE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchE(String value) {
                this.leadPitchE = value;
            }

            /**
             * Gets the value of the leadWidthE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthE() {
                return leadWidthE;
            }

            /**
             * Sets the value of the leadWidthE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthE(String value) {
                this.leadWidthE = value;
            }

            /**
             * Gets the value of the leadLengthE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthE() {
                return leadLengthE;
            }

            /**
             * Sets the value of the leadLengthE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthE(String value) {
                this.leadLengthE = value;
            }

            /**
             * Gets the value of the offLeadStartE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffLeadStartE() {
                return offLeadStartE;
            }

            /**
             * Sets the value of the offLeadStartE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffLeadStartE(String value) {
                this.offLeadStartE = value;
            }

            /**
             * Gets the value of the offLeadEndE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffLeadEndE() {
                return offLeadEndE;
            }

            /**
             * Sets the value of the offLeadEndE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffLeadEndE(String value) {
                this.offLeadEndE = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetW" type="{}Wstring" />
         *       &lt;attribute name="LeadNumW" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchW" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthW" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthW" type="{}Wstring" />
         *       &lt;attribute name="OffLeadStartW" type="{}Wstring" />
         *       &lt;attribute name="OffLeadEndW" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part043 {

            @XmlAttribute(name = "RlrOffsetW")
            protected String rlrOffsetW;
            @XmlAttribute(name = "LeadNumW")
            protected String leadNumW;
            @XmlAttribute(name = "LeadPitchW")
            protected String leadPitchW;
            @XmlAttribute(name = "LeadWidthW")
            protected String leadWidthW;
            @XmlAttribute(name = "LeadLengthW")
            protected String leadLengthW;
            @XmlAttribute(name = "OffLeadStartW")
            protected String offLeadStartW;
            @XmlAttribute(name = "OffLeadEndW")
            protected String offLeadEndW;

            /**
             * Gets the value of the rlrOffsetW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetW() {
                return rlrOffsetW;
            }

            /**
             * Sets the value of the rlrOffsetW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetW(String value) {
                this.rlrOffsetW = value;
            }

            /**
             * Gets the value of the leadNumW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumW() {
                return leadNumW;
            }

            /**
             * Sets the value of the leadNumW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumW(String value) {
                this.leadNumW = value;
            }

            /**
             * Gets the value of the leadPitchW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchW() {
                return leadPitchW;
            }

            /**
             * Sets the value of the leadPitchW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchW(String value) {
                this.leadPitchW = value;
            }

            /**
             * Gets the value of the leadWidthW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthW() {
                return leadWidthW;
            }

            /**
             * Sets the value of the leadWidthW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthW(String value) {
                this.leadWidthW = value;
            }

            /**
             * Gets the value of the leadLengthW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthW() {
                return leadLengthW;
            }

            /**
             * Sets the value of the leadLengthW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthW(String value) {
                this.leadLengthW = value;
            }

            /**
             * Gets the value of the offLeadStartW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffLeadStartW() {
                return offLeadStartW;
            }

            /**
             * Sets the value of the offLeadStartW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffLeadStartW(String value) {
                this.offLeadStartW = value;
            }

            /**
             * Gets the value of the offLeadEndW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffLeadEndW() {
                return offLeadEndW;
            }

            /**
             * Sets the value of the offLeadEndW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffLeadEndW(String value) {
                this.offLeadEndW = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetN" type="{}Wstring" />
         *       &lt;attribute name="LeadGroupN" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part044 {

            @XmlAttribute(name = "RlrOffsetN")
            protected String rlrOffsetN;
            @XmlAttribute(name = "LeadGroupN")
            protected String leadGroupN;

            /**
             * Gets the value of the rlrOffsetN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetN() {
                return rlrOffsetN;
            }

            /**
             * Sets the value of the rlrOffsetN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetN(String value) {
                this.rlrOffsetN = value;
            }

            /**
             * Gets the value of the leadGroupN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadGroupN() {
                return leadGroupN;
            }

            /**
             * Sets the value of the leadGroupN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadGroupN(String value) {
                this.leadGroupN = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetS" type="{}Wstring" />
         *       &lt;attribute name="LeadGroupS" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part045 {

            @XmlAttribute(name = "RlrOffsetS")
            protected String rlrOffsetS;
            @XmlAttribute(name = "LeadGroupS")
            protected String leadGroupS;

            /**
             * Gets the value of the rlrOffsetS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetS() {
                return rlrOffsetS;
            }

            /**
             * Sets the value of the rlrOffsetS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetS(String value) {
                this.rlrOffsetS = value;
            }

            /**
             * Gets the value of the leadGroupS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadGroupS() {
                return leadGroupS;
            }

            /**
             * Sets the value of the leadGroupS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadGroupS(String value) {
                this.leadGroupS = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetE" type="{}Wstring" />
         *       &lt;attribute name="LeadGroupE" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part046 {

            @XmlAttribute(name = "RlrOffsetE")
            protected String rlrOffsetE;
            @XmlAttribute(name = "LeadGroupE")
            protected String leadGroupE;

            /**
             * Gets the value of the rlrOffsetE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetE() {
                return rlrOffsetE;
            }

            /**
             * Sets the value of the rlrOffsetE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetE(String value) {
                this.rlrOffsetE = value;
            }

            /**
             * Gets the value of the leadGroupE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadGroupE() {
                return leadGroupE;
            }

            /**
             * Sets the value of the leadGroupE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadGroupE(String value) {
                this.leadGroupE = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="RlrOffsetW" type="{}Wstring" />
         *       &lt;attribute name="LeadGroupW" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part047 {

            @XmlAttribute(name = "RlrOffsetW")
            protected String rlrOffsetW;
            @XmlAttribute(name = "LeadGroupW")
            protected String leadGroupW;

            /**
             * Gets the value of the rlrOffsetW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRlrOffsetW() {
                return rlrOffsetW;
            }

            /**
             * Sets the value of the rlrOffsetW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRlrOffsetW(String value) {
                this.rlrOffsetW = value;
            }

            /**
             * Gets the value of the leadGroupW property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadGroupW() {
                return leadGroupW;
            }

            /**
             * Sets the value of the leadGroupW property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadGroupW(String value) {
                this.leadGroupW = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumN1" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchN1" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthN1" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthN1" type="{}Wstring" />
         *       &lt;attribute name="LeadPosXN1" type="{}Wstring" />
         *       &lt;attribute name="LeadPosYN1" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part048 {

            @XmlAttribute(name = "LeadNumN1")
            protected String leadNumN1;
            @XmlAttribute(name = "LeadPitchN1")
            protected String leadPitchN1;
            @XmlAttribute(name = "LeadWidthN1")
            protected String leadWidthN1;
            @XmlAttribute(name = "LeadLengthN1")
            protected String leadLengthN1;
            @XmlAttribute(name = "LeadPosXN1")
            protected String leadPosXN1;
            @XmlAttribute(name = "LeadPosYN1")
            protected String leadPosYN1;

            /**
             * Gets the value of the leadNumN1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumN1() {
                return leadNumN1;
            }

            /**
             * Sets the value of the leadNumN1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumN1(String value) {
                this.leadNumN1 = value;
            }

            /**
             * Gets the value of the leadPitchN1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchN1() {
                return leadPitchN1;
            }

            /**
             * Sets the value of the leadPitchN1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchN1(String value) {
                this.leadPitchN1 = value;
            }

            /**
             * Gets the value of the leadWidthN1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthN1() {
                return leadWidthN1;
            }

            /**
             * Sets the value of the leadWidthN1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthN1(String value) {
                this.leadWidthN1 = value;
            }

            /**
             * Gets the value of the leadLengthN1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthN1() {
                return leadLengthN1;
            }

            /**
             * Sets the value of the leadLengthN1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthN1(String value) {
                this.leadLengthN1 = value;
            }

            /**
             * Gets the value of the leadPosXN1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosXN1() {
                return leadPosXN1;
            }

            /**
             * Sets the value of the leadPosXN1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosXN1(String value) {
                this.leadPosXN1 = value;
            }

            /**
             * Gets the value of the leadPosYN1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosYN1() {
                return leadPosYN1;
            }

            /**
             * Sets the value of the leadPosYN1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosYN1(String value) {
                this.leadPosYN1 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumN2" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchN2" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthN2" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthN2" type="{}Wstring" />
         *       &lt;attribute name="LeadPosXN2" type="{}Wstring" />
         *       &lt;attribute name="LeadPosYN2" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part049 {

            @XmlAttribute(name = "LeadNumN2")
            protected String leadNumN2;
            @XmlAttribute(name = "LeadPitchN2")
            protected String leadPitchN2;
            @XmlAttribute(name = "LeadWidthN2")
            protected String leadWidthN2;
            @XmlAttribute(name = "LeadLengthN2")
            protected String leadLengthN2;
            @XmlAttribute(name = "LeadPosXN2")
            protected String leadPosXN2;
            @XmlAttribute(name = "LeadPosYN2")
            protected String leadPosYN2;

            /**
             * Gets the value of the leadNumN2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumN2() {
                return leadNumN2;
            }

            /**
             * Sets the value of the leadNumN2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumN2(String value) {
                this.leadNumN2 = value;
            }

            /**
             * Gets the value of the leadPitchN2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchN2() {
                return leadPitchN2;
            }

            /**
             * Sets the value of the leadPitchN2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchN2(String value) {
                this.leadPitchN2 = value;
            }

            /**
             * Gets the value of the leadWidthN2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthN2() {
                return leadWidthN2;
            }

            /**
             * Sets the value of the leadWidthN2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthN2(String value) {
                this.leadWidthN2 = value;
            }

            /**
             * Gets the value of the leadLengthN2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthN2() {
                return leadLengthN2;
            }

            /**
             * Sets the value of the leadLengthN2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthN2(String value) {
                this.leadLengthN2 = value;
            }

            /**
             * Gets the value of the leadPosXN2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosXN2() {
                return leadPosXN2;
            }

            /**
             * Sets the value of the leadPosXN2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosXN2(String value) {
                this.leadPosXN2 = value;
            }

            /**
             * Gets the value of the leadPosYN2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosYN2() {
                return leadPosYN2;
            }

            /**
             * Sets the value of the leadPosYN2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosYN2(String value) {
                this.leadPosYN2 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumS1" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchS1" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthS1" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthS1" type="{}Wstring" />
         *       &lt;attribute name="LeadPosXS1" type="{}Wstring" />
         *       &lt;attribute name="LeadPosYS1" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part050 {

            @XmlAttribute(name = "LeadNumS1")
            protected String leadNumS1;
            @XmlAttribute(name = "LeadPitchS1")
            protected String leadPitchS1;
            @XmlAttribute(name = "LeadWidthS1")
            protected String leadWidthS1;
            @XmlAttribute(name = "LeadLengthS1")
            protected String leadLengthS1;
            @XmlAttribute(name = "LeadPosXS1")
            protected String leadPosXS1;
            @XmlAttribute(name = "LeadPosYS1")
            protected String leadPosYS1;

            /**
             * Gets the value of the leadNumS1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumS1() {
                return leadNumS1;
            }

            /**
             * Sets the value of the leadNumS1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumS1(String value) {
                this.leadNumS1 = value;
            }

            /**
             * Gets the value of the leadPitchS1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchS1() {
                return leadPitchS1;
            }

            /**
             * Sets the value of the leadPitchS1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchS1(String value) {
                this.leadPitchS1 = value;
            }

            /**
             * Gets the value of the leadWidthS1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthS1() {
                return leadWidthS1;
            }

            /**
             * Sets the value of the leadWidthS1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthS1(String value) {
                this.leadWidthS1 = value;
            }

            /**
             * Gets the value of the leadLengthS1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthS1() {
                return leadLengthS1;
            }

            /**
             * Sets the value of the leadLengthS1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthS1(String value) {
                this.leadLengthS1 = value;
            }

            /**
             * Gets the value of the leadPosXS1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosXS1() {
                return leadPosXS1;
            }

            /**
             * Sets the value of the leadPosXS1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosXS1(String value) {
                this.leadPosXS1 = value;
            }

            /**
             * Gets the value of the leadPosYS1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosYS1() {
                return leadPosYS1;
            }

            /**
             * Sets the value of the leadPosYS1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosYS1(String value) {
                this.leadPosYS1 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumS2" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchS2" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthS2" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthS2" type="{}Wstring" />
         *       &lt;attribute name="LeadPosXS2" type="{}Wstring" />
         *       &lt;attribute name="LeadPosYS2" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part051 {

            @XmlAttribute(name = "LeadNumS2")
            protected String leadNumS2;
            @XmlAttribute(name = "LeadPitchS2")
            protected String leadPitchS2;
            @XmlAttribute(name = "LeadWidthS2")
            protected String leadWidthS2;
            @XmlAttribute(name = "LeadLengthS2")
            protected String leadLengthS2;
            @XmlAttribute(name = "LeadPosXS2")
            protected String leadPosXS2;
            @XmlAttribute(name = "LeadPosYS2")
            protected String leadPosYS2;

            /**
             * Gets the value of the leadNumS2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumS2() {
                return leadNumS2;
            }

            /**
             * Sets the value of the leadNumS2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumS2(String value) {
                this.leadNumS2 = value;
            }

            /**
             * Gets the value of the leadPitchS2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchS2() {
                return leadPitchS2;
            }

            /**
             * Sets the value of the leadPitchS2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchS2(String value) {
                this.leadPitchS2 = value;
            }

            /**
             * Gets the value of the leadWidthS2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthS2() {
                return leadWidthS2;
            }

            /**
             * Sets the value of the leadWidthS2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthS2(String value) {
                this.leadWidthS2 = value;
            }

            /**
             * Gets the value of the leadLengthS2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthS2() {
                return leadLengthS2;
            }

            /**
             * Sets the value of the leadLengthS2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthS2(String value) {
                this.leadLengthS2 = value;
            }

            /**
             * Gets the value of the leadPosXS2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosXS2() {
                return leadPosXS2;
            }

            /**
             * Sets the value of the leadPosXS2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosXS2(String value) {
                this.leadPosXS2 = value;
            }

            /**
             * Gets the value of the leadPosYS2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosYS2() {
                return leadPosYS2;
            }

            /**
             * Sets the value of the leadPosYS2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosYS2(String value) {
                this.leadPosYS2 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumE1" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchE1" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthE1" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthE1" type="{}Wstring" />
         *       &lt;attribute name="LeadPosXE1" type="{}Wstring" />
         *       &lt;attribute name="LeadPosYE1" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part052 {

            @XmlAttribute(name = "LeadNumE1")
            protected String leadNumE1;
            @XmlAttribute(name = "LeadPitchE1")
            protected String leadPitchE1;
            @XmlAttribute(name = "LeadWidthE1")
            protected String leadWidthE1;
            @XmlAttribute(name = "LeadLengthE1")
            protected String leadLengthE1;
            @XmlAttribute(name = "LeadPosXE1")
            protected String leadPosXE1;
            @XmlAttribute(name = "LeadPosYE1")
            protected String leadPosYE1;

            /**
             * Gets the value of the leadNumE1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumE1() {
                return leadNumE1;
            }

            /**
             * Sets the value of the leadNumE1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumE1(String value) {
                this.leadNumE1 = value;
            }

            /**
             * Gets the value of the leadPitchE1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchE1() {
                return leadPitchE1;
            }

            /**
             * Sets the value of the leadPitchE1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchE1(String value) {
                this.leadPitchE1 = value;
            }

            /**
             * Gets the value of the leadWidthE1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthE1() {
                return leadWidthE1;
            }

            /**
             * Sets the value of the leadWidthE1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthE1(String value) {
                this.leadWidthE1 = value;
            }

            /**
             * Gets the value of the leadLengthE1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthE1() {
                return leadLengthE1;
            }

            /**
             * Sets the value of the leadLengthE1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthE1(String value) {
                this.leadLengthE1 = value;
            }

            /**
             * Gets the value of the leadPosXE1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosXE1() {
                return leadPosXE1;
            }

            /**
             * Sets the value of the leadPosXE1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosXE1(String value) {
                this.leadPosXE1 = value;
            }

            /**
             * Gets the value of the leadPosYE1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosYE1() {
                return leadPosYE1;
            }

            /**
             * Sets the value of the leadPosYE1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosYE1(String value) {
                this.leadPosYE1 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumE2" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchE2" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthE2" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthE2" type="{}Wstring" />
         *       &lt;attribute name="LeadPosXE2" type="{}Wstring" />
         *       &lt;attribute name="LeadPosYE2" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part053 {

            @XmlAttribute(name = "LeadNumE2")
            protected String leadNumE2;
            @XmlAttribute(name = "LeadPitchE2")
            protected String leadPitchE2;
            @XmlAttribute(name = "LeadWidthE2")
            protected String leadWidthE2;
            @XmlAttribute(name = "LeadLengthE2")
            protected String leadLengthE2;
            @XmlAttribute(name = "LeadPosXE2")
            protected String leadPosXE2;
            @XmlAttribute(name = "LeadPosYE2")
            protected String leadPosYE2;

            /**
             * Gets the value of the leadNumE2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumE2() {
                return leadNumE2;
            }

            /**
             * Sets the value of the leadNumE2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumE2(String value) {
                this.leadNumE2 = value;
            }

            /**
             * Gets the value of the leadPitchE2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchE2() {
                return leadPitchE2;
            }

            /**
             * Sets the value of the leadPitchE2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchE2(String value) {
                this.leadPitchE2 = value;
            }

            /**
             * Gets the value of the leadWidthE2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthE2() {
                return leadWidthE2;
            }

            /**
             * Sets the value of the leadWidthE2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthE2(String value) {
                this.leadWidthE2 = value;
            }

            /**
             * Gets the value of the leadLengthE2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthE2() {
                return leadLengthE2;
            }

            /**
             * Sets the value of the leadLengthE2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthE2(String value) {
                this.leadLengthE2 = value;
            }

            /**
             * Gets the value of the leadPosXE2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosXE2() {
                return leadPosXE2;
            }

            /**
             * Sets the value of the leadPosXE2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosXE2(String value) {
                this.leadPosXE2 = value;
            }

            /**
             * Gets the value of the leadPosYE2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosYE2() {
                return leadPosYE2;
            }

            /**
             * Sets the value of the leadPosYE2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosYE2(String value) {
                this.leadPosYE2 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumW1" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchW1" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthW1" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthW1" type="{}Wstring" />
         *       &lt;attribute name="LeadPosXW1" type="{}Wstring" />
         *       &lt;attribute name="LeadPosYW1" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part054 {

            @XmlAttribute(name = "LeadNumW1")
            protected String leadNumW1;
            @XmlAttribute(name = "LeadPitchW1")
            protected String leadPitchW1;
            @XmlAttribute(name = "LeadWidthW1")
            protected String leadWidthW1;
            @XmlAttribute(name = "LeadLengthW1")
            protected String leadLengthW1;
            @XmlAttribute(name = "LeadPosXW1")
            protected String leadPosXW1;
            @XmlAttribute(name = "LeadPosYW1")
            protected String leadPosYW1;

            /**
             * Gets the value of the leadNumW1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumW1() {
                return leadNumW1;
            }

            /**
             * Sets the value of the leadNumW1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumW1(String value) {
                this.leadNumW1 = value;
            }

            /**
             * Gets the value of the leadPitchW1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchW1() {
                return leadPitchW1;
            }

            /**
             * Sets the value of the leadPitchW1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchW1(String value) {
                this.leadPitchW1 = value;
            }

            /**
             * Gets the value of the leadWidthW1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthW1() {
                return leadWidthW1;
            }

            /**
             * Sets the value of the leadWidthW1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthW1(String value) {
                this.leadWidthW1 = value;
            }

            /**
             * Gets the value of the leadLengthW1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthW1() {
                return leadLengthW1;
            }

            /**
             * Sets the value of the leadLengthW1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthW1(String value) {
                this.leadLengthW1 = value;
            }

            /**
             * Gets the value of the leadPosXW1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosXW1() {
                return leadPosXW1;
            }

            /**
             * Sets the value of the leadPosXW1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosXW1(String value) {
                this.leadPosXW1 = value;
            }

            /**
             * Gets the value of the leadPosYW1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosYW1() {
                return leadPosYW1;
            }

            /**
             * Sets the value of the leadPosYW1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosYW1(String value) {
                this.leadPosYW1 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LeadNumW2" type="{}Wstring" />
         *       &lt;attribute name="LeadPitchW2" type="{}Wstring" />
         *       &lt;attribute name="LeadWidthW2" type="{}Wstring" />
         *       &lt;attribute name="LeadLengthW2" type="{}Wstring" />
         *       &lt;attribute name="LeadPosXW2" type="{}Wstring" />
         *       &lt;attribute name="LeadPosYW2" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part055 {

            @XmlAttribute(name = "LeadNumW2")
            protected String leadNumW2;
            @XmlAttribute(name = "LeadPitchW2")
            protected String leadPitchW2;
            @XmlAttribute(name = "LeadWidthW2")
            protected String leadWidthW2;
            @XmlAttribute(name = "LeadLengthW2")
            protected String leadLengthW2;
            @XmlAttribute(name = "LeadPosXW2")
            protected String leadPosXW2;
            @XmlAttribute(name = "LeadPosYW2")
            protected String leadPosYW2;

            /**
             * Gets the value of the leadNumW2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadNumW2() {
                return leadNumW2;
            }

            /**
             * Sets the value of the leadNumW2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadNumW2(String value) {
                this.leadNumW2 = value;
            }

            /**
             * Gets the value of the leadPitchW2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPitchW2() {
                return leadPitchW2;
            }

            /**
             * Sets the value of the leadPitchW2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPitchW2(String value) {
                this.leadPitchW2 = value;
            }

            /**
             * Gets the value of the leadWidthW2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadWidthW2() {
                return leadWidthW2;
            }

            /**
             * Sets the value of the leadWidthW2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadWidthW2(String value) {
                this.leadWidthW2 = value;
            }

            /**
             * Gets the value of the leadLengthW2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadLengthW2() {
                return leadLengthW2;
            }

            /**
             * Sets the value of the leadLengthW2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadLengthW2(String value) {
                this.leadLengthW2 = value;
            }

            /**
             * Gets the value of the leadPosXW2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosXW2() {
                return leadPosXW2;
            }

            /**
             * Sets the value of the leadPosXW2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosXW2(String value) {
                this.leadPosXW2 = value;
            }

            /**
             * Gets the value of the leadPosYW2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLeadPosYW2() {
                return leadPosYW2;
            }

            /**
             * Sets the value of the leadPosYW2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLeadPosYW2(String value) {
                this.leadPosYW2 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BgaAmount" type="{}Wstring" />
         *       &lt;attribute name="BgaDotNumN" type="{}Wstring" />
         *       &lt;attribute name="BgaDotNumE" type="{}Wstring" />
         *       &lt;attribute name="BgaPitch" type="{}Wstring" />
         *       &lt;attribute name="BgaDiameter" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part056 {

            @XmlAttribute(name = "BgaAmount")
            protected String bgaAmount;
            @XmlAttribute(name = "BgaDotNumN")
            protected String bgaDotNumN;
            @XmlAttribute(name = "BgaDotNumE")
            protected String bgaDotNumE;
            @XmlAttribute(name = "BgaPitch")
            protected String bgaPitch;
            @XmlAttribute(name = "BgaDiameter")
            protected String bgaDiameter;

            /**
             * Gets the value of the bgaAmount property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaAmount() {
                return bgaAmount;
            }

            /**
             * Sets the value of the bgaAmount property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaAmount(String value) {
                this.bgaAmount = value;
            }

            /**
             * Gets the value of the bgaDotNumN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaDotNumN() {
                return bgaDotNumN;
            }

            /**
             * Sets the value of the bgaDotNumN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaDotNumN(String value) {
                this.bgaDotNumN = value;
            }

            /**
             * Gets the value of the bgaDotNumE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaDotNumE() {
                return bgaDotNumE;
            }

            /**
             * Sets the value of the bgaDotNumE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaDotNumE(String value) {
                this.bgaDotNumE = value;
            }

            /**
             * Gets the value of the bgaPitch property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaPitch() {
                return bgaPitch;
            }

            /**
             * Sets the value of the bgaPitch property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaPitch(String value) {
                this.bgaPitch = value;
            }

            /**
             * Gets the value of the bgaDiameter property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaDiameter() {
                return bgaDiameter;
            }

            /**
             * Sets the value of the bgaDiameter property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaDiameter(String value) {
                this.bgaDiameter = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="BgaAmount" type="{}Wstring" />
         *       &lt;attribute name="BgaDotNumN" type="{}Wstring" />
         *       &lt;attribute name="BgaDotNumE" type="{}Wstring" />
         *       &lt;attribute name="BgaPitchN" type="{}Wstring" />
         *       &lt;attribute name="BgaPitchE" type="{}Wstring" />
         *       &lt;attribute name="BgaDiameter" type="{}Wstring" />
         *       &lt;attribute name="BinaryLevel" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part057 {

            @XmlAttribute(name = "BgaAmount")
            protected String bgaAmount;
            @XmlAttribute(name = "BgaDotNumN")
            protected String bgaDotNumN;
            @XmlAttribute(name = "BgaDotNumE")
            protected String bgaDotNumE;
            @XmlAttribute(name = "BgaPitchN")
            protected String bgaPitchN;
            @XmlAttribute(name = "BgaPitchE")
            protected String bgaPitchE;
            @XmlAttribute(name = "BgaDiameter")
            protected String bgaDiameter;
            @XmlAttribute(name = "BinaryLevel")
            protected String binaryLevel;

            /**
             * Gets the value of the bgaAmount property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaAmount() {
                return bgaAmount;
            }

            /**
             * Sets the value of the bgaAmount property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaAmount(String value) {
                this.bgaAmount = value;
            }

            /**
             * Gets the value of the bgaDotNumN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaDotNumN() {
                return bgaDotNumN;
            }

            /**
             * Sets the value of the bgaDotNumN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaDotNumN(String value) {
                this.bgaDotNumN = value;
            }

            /**
             * Gets the value of the bgaDotNumE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaDotNumE() {
                return bgaDotNumE;
            }

            /**
             * Sets the value of the bgaDotNumE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaDotNumE(String value) {
                this.bgaDotNumE = value;
            }

            /**
             * Gets the value of the bgaPitchN property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaPitchN() {
                return bgaPitchN;
            }

            /**
             * Sets the value of the bgaPitchN property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaPitchN(String value) {
                this.bgaPitchN = value;
            }

            /**
             * Gets the value of the bgaPitchE property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaPitchE() {
                return bgaPitchE;
            }

            /**
             * Sets the value of the bgaPitchE property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaPitchE(String value) {
                this.bgaPitchE = value;
            }

            /**
             * Gets the value of the bgaDiameter property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBgaDiameter() {
                return bgaDiameter;
            }

            /**
             * Sets the value of the bgaDiameter property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBgaDiameter(String value) {
                this.bgaDiameter = value;
            }

            /**
             * Gets the value of the binaryLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBinaryLevel() {
                return binaryLevel;
            }

            /**
             * Sets the value of the binaryLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBinaryLevel(String value) {
                this.binaryLevel = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Algorithm" type="{}Wstring" />
         *       &lt;attribute name="BaseVType" type="{}Wstring" />
         *       &lt;attribute name="Option1" type="{}Wstring" />
         *       &lt;attribute name="Option2" type="{}Wstring" />
         *       &lt;attribute name="Option3" type="{}Wstring" />
         *       &lt;attribute name="Option4" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part062 {

            @XmlAttribute(name = "Algorithm")
            protected String algorithm;
            @XmlAttribute(name = "BaseVType")
            protected String baseVType;
            @XmlAttribute(name = "Option1")
            protected String option1;
            @XmlAttribute(name = "Option2")
            protected String option2;
            @XmlAttribute(name = "Option3")
            protected String option3;
            @XmlAttribute(name = "Option4")
            protected String option4;

            /**
             * Gets the value of the algorithm property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlgorithm() {
                return algorithm;
            }

            /**
             * Sets the value of the algorithm property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlgorithm(String value) {
                this.algorithm = value;
            }

            /**
             * Gets the value of the baseVType property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getBaseVType() {
                return baseVType;
            }

            /**
             * Sets the value of the baseVType property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setBaseVType(String value) {
                this.baseVType = value;
            }

            /**
             * Gets the value of the option1 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1() {
                return option1;
            }

            /**
             * Sets the value of the option1 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption1(String value) {
                this.option1 = value;
            }

            /**
             * Gets the value of the option2 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption2() {
                return option2;
            }

            /**
             * Sets the value of the option2 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption2(String value) {
                this.option2 = value;
            }

            /**
             * Gets the value of the option3 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption3() {
                return option3;
            }

            /**
             * Sets the value of the option3 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption3(String value) {
                this.option3 = value;
            }

            /**
             * Gets the value of the option4 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption4() {
                return option4;
            }

            /**
             * Sets the value of the option4 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption4(String value) {
                this.option4 = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="SurfaceType" type="{}Wstring" />
         *       &lt;attribute name="CutOuterNoise" type="{}Wstring" />
         *       &lt;attribute name="CutInnerNoise" type="{}Wstring" />
         *       &lt;attribute name="NoiseCutOrder" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part063 {

            @XmlAttribute(name = "SurfaceType")
            protected String surfaceType;
            @XmlAttribute(name = "CutOuterNoise")
            protected String cutOuterNoise;
            @XmlAttribute(name = "CutInnerNoise")
            protected String cutInnerNoise;
            @XmlAttribute(name = "NoiseCutOrder")
            protected String noiseCutOrder;

            /**
             * Gets the value of the surfaceType property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSurfaceType() {
                return surfaceType;
            }

            /**
             * Sets the value of the surfaceType property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSurfaceType(String value) {
                this.surfaceType = value;
            }

            /**
             * Gets the value of the cutOuterNoise property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCutOuterNoise() {
                return cutOuterNoise;
            }

            /**
             * Sets the value of the cutOuterNoise property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCutOuterNoise(String value) {
                this.cutOuterNoise = value;
            }

            /**
             * Gets the value of the cutInnerNoise property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCutInnerNoise() {
                return cutInnerNoise;
            }

            /**
             * Sets the value of the cutInnerNoise property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCutInnerNoise(String value) {
                this.cutInnerNoise = value;
            }

            /**
             * Gets the value of the noiseCutOrder property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNoiseCutOrder() {
                return noiseCutOrder;
            }

            /**
             * Sets the value of the noiseCutOrder property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNoiseCutOrder(String value) {
                this.noiseCutOrder = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Recognition" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part064 {

            @XmlAttribute(name = "Recognition")
            protected String recognition;

            /**
             * Gets the value of the recognition property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRecognition() {
                return recognition;
            }

            /**
             * Sets the value of the recognition property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRecognition(String value) {
                this.recognition = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Alignment" type="{}Wstring" />
         *       &lt;attribute name="AlignRefSubMlt" type="{}Wstring" />
         *       &lt;attribute name="AlignRefSubSgl" type="{}Wstring" />
         *       &lt;attribute name="AlignRefSubScan" type="{}Wstring" />
         *       &lt;attribute name="AutoThreshold" type="{}Wstring" />
         *       &lt;attribute name="Threshold" type="{}Wstring" />
         *       &lt;attribute name="Tolerance" type="{}Wstring" />
         *       &lt;attribute name="SearchArea" type="{}Wstring" />
         *       &lt;attribute name="DatumAngle" type="{}Wstring" />
         *       &lt;attribute name="MultiMACS" type="{}Wstring" />
         *       &lt;attribute name="OffsetRec" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part070 {

            @XmlAttribute(name = "Alignment")
            protected String alignment;
            @XmlAttribute(name = "AlignRefSubMlt")
            protected String alignRefSubMlt;
            @XmlAttribute(name = "AlignRefSubSgl")
            protected String alignRefSubSgl;
            @XmlAttribute(name = "AlignRefSubScan")
            protected String alignRefSubScan;
            @XmlAttribute(name = "AutoThreshold")
            protected String autoThreshold;
            @XmlAttribute(name = "Threshold")
            protected String threshold;
            @XmlAttribute(name = "Tolerance")
            protected String tolerance;
            @XmlAttribute(name = "SearchArea")
            protected String searchArea;
            @XmlAttribute(name = "DatumAngle")
            protected String datumAngle;
            @XmlAttribute(name = "MultiMACS")
            protected String multiMACS;
            @XmlAttribute(name = "OffsetRec")
            protected String offsetRec;

            /**
             * Gets the value of the alignment property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignment() {
                return alignment;
            }

            /**
             * Sets the value of the alignment property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignment(String value) {
                this.alignment = value;
            }

            /**
             * Gets the value of the alignRefSubMlt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignRefSubMlt() {
                return alignRefSubMlt;
            }

            /**
             * Sets the value of the alignRefSubMlt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignRefSubMlt(String value) {
                this.alignRefSubMlt = value;
            }

            /**
             * Gets the value of the alignRefSubSgl property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignRefSubSgl() {
                return alignRefSubSgl;
            }

            /**
             * Sets the value of the alignRefSubSgl property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignRefSubSgl(String value) {
                this.alignRefSubSgl = value;
            }

            /**
             * Gets the value of the alignRefSubScan property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignRefSubScan() {
                return alignRefSubScan;
            }

            /**
             * Sets the value of the alignRefSubScan property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignRefSubScan(String value) {
                this.alignRefSubScan = value;
            }

            /**
             * Gets the value of the autoThreshold property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAutoThreshold() {
                return autoThreshold;
            }

            /**
             * Sets the value of the autoThreshold property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAutoThreshold(String value) {
                this.autoThreshold = value;
            }

            /**
             * Gets the value of the threshold property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getThreshold() {
                return threshold;
            }

            /**
             * Sets the value of the threshold property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setThreshold(String value) {
                this.threshold = value;
            }

            /**
             * Gets the value of the tolerance property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTolerance() {
                return tolerance;
            }

            /**
             * Sets the value of the tolerance property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTolerance(String value) {
                this.tolerance = value;
            }

            /**
             * Gets the value of the searchArea property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSearchArea() {
                return searchArea;
            }

            /**
             * Sets the value of the searchArea property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSearchArea(String value) {
                this.searchArea = value;
            }

            /**
             * Gets the value of the datumAngle property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDatumAngle() {
                return datumAngle;
            }

            /**
             * Sets the value of the datumAngle property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDatumAngle(String value) {
                this.datumAngle = value;
            }

            /**
             * Gets the value of the multiMACS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMultiMACS() {
                return multiMACS;
            }

            /**
             * Sets the value of the multiMACS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMultiMACS(String value) {
                this.multiMACS = value;
            }

            /**
             * Gets the value of the offsetRec property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetRec() {
                return offsetRec;
            }

            /**
             * Sets the value of the offsetRec property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetRec(String value) {
                this.offsetRec = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Alignment" type="{}Wstring" />
         *       &lt;attribute name="AlignRefSubMlt" type="{}Wstring" />
         *       &lt;attribute name="AlignRefSubSgl" type="{}Wstring" />
         *       &lt;attribute name="AlignRefSubScan" type="{}Wstring" />
         *       &lt;attribute name="AutoThreshold" type="{}Wstring" />
         *       &lt;attribute name="Threshold" type="{}Wstring" />
         *       &lt;attribute name="Tolerance" type="{}Wstring" />
         *       &lt;attribute name="SearchArea" type="{}Wstring" />
         *       &lt;attribute name="DatumAngle" type="{}Wstring" />
         *       &lt;attribute name="CompIntensity" type="{}Wstring" />
         *       &lt;attribute name="MultiMACS" type="{}Wstring" />
         *       &lt;attribute name="OffsetRec" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part071 {

            @XmlAttribute(name = "Alignment")
            protected String alignment;
            @XmlAttribute(name = "AlignRefSubMlt")
            protected String alignRefSubMlt;
            @XmlAttribute(name = "AlignRefSubSgl")
            protected String alignRefSubSgl;
            @XmlAttribute(name = "AlignRefSubScan")
            protected String alignRefSubScan;
            @XmlAttribute(name = "AutoThreshold")
            protected String autoThreshold;
            @XmlAttribute(name = "Threshold")
            protected String threshold;
            @XmlAttribute(name = "Tolerance")
            protected String tolerance;
            @XmlAttribute(name = "SearchArea")
            protected String searchArea;
            @XmlAttribute(name = "DatumAngle")
            protected String datumAngle;
            @XmlAttribute(name = "CompIntensity")
            protected String compIntensity;
            @XmlAttribute(name = "MultiMACS")
            protected String multiMACS;
            @XmlAttribute(name = "OffsetRec")
            protected String offsetRec;

            /**
             * Gets the value of the alignment property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignment() {
                return alignment;
            }

            /**
             * Sets the value of the alignment property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignment(String value) {
                this.alignment = value;
            }

            /**
             * Gets the value of the alignRefSubMlt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignRefSubMlt() {
                return alignRefSubMlt;
            }

            /**
             * Sets the value of the alignRefSubMlt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignRefSubMlt(String value) {
                this.alignRefSubMlt = value;
            }

            /**
             * Gets the value of the alignRefSubSgl property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignRefSubSgl() {
                return alignRefSubSgl;
            }

            /**
             * Sets the value of the alignRefSubSgl property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignRefSubSgl(String value) {
                this.alignRefSubSgl = value;
            }

            /**
             * Gets the value of the alignRefSubScan property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignRefSubScan() {
                return alignRefSubScan;
            }

            /**
             * Sets the value of the alignRefSubScan property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAlignRefSubScan(String value) {
                this.alignRefSubScan = value;
            }

            /**
             * Gets the value of the autoThreshold property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAutoThreshold() {
                return autoThreshold;
            }

            /**
             * Sets the value of the autoThreshold property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAutoThreshold(String value) {
                this.autoThreshold = value;
            }

            /**
             * Gets the value of the threshold property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getThreshold() {
                return threshold;
            }

            /**
             * Sets the value of the threshold property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setThreshold(String value) {
                this.threshold = value;
            }

            /**
             * Gets the value of the tolerance property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTolerance() {
                return tolerance;
            }

            /**
             * Sets the value of the tolerance property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTolerance(String value) {
                this.tolerance = value;
            }

            /**
             * Gets the value of the searchArea property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSearchArea() {
                return searchArea;
            }

            /**
             * Sets the value of the searchArea property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSearchArea(String value) {
                this.searchArea = value;
            }

            /**
             * Gets the value of the datumAngle property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDatumAngle() {
                return datumAngle;
            }

            /**
             * Sets the value of the datumAngle property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDatumAngle(String value) {
                this.datumAngle = value;
            }

            /**
             * Gets the value of the compIntensity property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCompIntensity() {
                return compIntensity;
            }

            /**
             * Sets the value of the compIntensity property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCompIntensity(String value) {
                this.compIntensity = value;
            }

            /**
             * Gets the value of the multiMACS property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMultiMACS() {
                return multiMACS;
            }

            /**
             * Sets the value of the multiMACS property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMultiMACS(String value) {
                this.multiMACS = value;
            }

            /**
             * Gets the value of the offsetRec property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOffsetRec() {
                return offsetRec;
            }

            /**
             * Sets the value of the offsetRec property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOffsetRec(String value) {
                this.offsetRec = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LightSetting" type="{}Wstring" />
         *       &lt;attribute name="LightLevel" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part072 {

            @XmlAttribute(name = "LightSetting")
            protected String lightSetting;
            @XmlAttribute(name = "LightLevel")
            protected String lightLevel;

            /**
             * Gets the value of the lightSetting property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLightSetting() {
                return lightSetting;
            }

            /**
             * Sets the value of the lightSetting property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLightSetting(String value) {
                this.lightSetting = value;
            }

            /**
             * Gets the value of the lightLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLightLevel() {
                return lightLevel;
            }

            /**
             * Sets the value of the lightLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLightLevel(String value) {
                this.lightLevel = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LightSetting" type="{}Wstring" />
         *       &lt;attribute name="LightLevel" type="{}Wstring" />
         *       &lt;attribute name="AllLightOn" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part073 {

            @XmlAttribute(name = "LightSetting")
            protected String lightSetting;
            @XmlAttribute(name = "LightLevel")
            protected String lightLevel;
            @XmlAttribute(name = "AllLightOn")
            protected String allLightOn;

            /**
             * Gets the value of the lightSetting property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLightSetting() {
                return lightSetting;
            }

            /**
             * Sets the value of the lightSetting property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLightSetting(String value) {
                this.lightSetting = value;
            }

            /**
             * Gets the value of the lightLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLightLevel() {
                return lightLevel;
            }

            /**
             * Sets the value of the lightLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLightLevel(String value) {
                this.lightLevel = value;
            }

            /**
             * Gets the value of the allLightOn property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAllLightOn() {
                return allLightOn;
            }

            /**
             * Sets the value of the allLightOn property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAllLightOn(String value) {
                this.allLightOn = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="CoplaLevel" type="{}Wstring" />
         *       &lt;attribute name="CoplaThreshold" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part074 {

            @XmlAttribute(name = "CoplaLevel")
            protected String coplaLevel;
            @XmlAttribute(name = "CoplaThreshold")
            protected String coplaThreshold;

            /**
             * Gets the value of the coplaLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCoplaLevel() {
                return coplaLevel;
            }

            /**
             * Sets the value of the coplaLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCoplaLevel(String value) {
                this.coplaLevel = value;
            }

            /**
             * Gets the value of the coplaThreshold property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCoplaThreshold() {
                return coplaThreshold;
            }

            /**
             * Sets the value of the coplaThreshold property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCoplaThreshold(String value) {
                this.coplaThreshold = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LightMode" type="{}Wstring" />
         *       &lt;attribute name="MainLightLevel" type="{}Wstring" />
         *       &lt;attribute name="CoaxsLightLevel" type="{}Wstring" />
         *       &lt;attribute name="SideLightLevel" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part076 {

            @XmlAttribute(name = "LightMode")
            protected String lightMode;
            @XmlAttribute(name = "MainLightLevel")
            protected String mainLightLevel;
            @XmlAttribute(name = "CoaxsLightLevel")
            protected String coaxsLightLevel;
            @XmlAttribute(name = "SideLightLevel")
            protected String sideLightLevel;

            /**
             * Gets the value of the lightMode property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLightMode() {
                return lightMode;
            }

            /**
             * Sets the value of the lightMode property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLightMode(String value) {
                this.lightMode = value;
            }

            /**
             * Gets the value of the mainLightLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMainLightLevel() {
                return mainLightLevel;
            }

            /**
             * Sets the value of the mainLightLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMainLightLevel(String value) {
                this.mainLightLevel = value;
            }

            /**
             * Gets the value of the coaxsLightLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCoaxsLightLevel() {
                return coaxsLightLevel;
            }

            /**
             * Sets the value of the coaxsLightLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCoaxsLightLevel(String value) {
                this.coaxsLightLevel = value;
            }

            /**
             * Gets the value of the sideLightLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSideLightLevel() {
                return sideLightLevel;
            }

            /**
             * Sets the value of the sideLightLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSideLightLevel(String value) {
                this.sideLightLevel = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LightSetting" type="{}Wstring" />
         *       &lt;attribute name="LightLevel" type="{}Wstring" />
         *       &lt;attribute name="ExcBallCheck" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part077 {

            @XmlAttribute(name = "LightSetting")
            protected String lightSetting;
            @XmlAttribute(name = "LightLevel")
            protected String lightLevel;
            @XmlAttribute(name = "ExcBallCheck")
            protected String excBallCheck;

            /**
             * Gets the value of the lightSetting property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLightSetting() {
                return lightSetting;
            }

            /**
             * Sets the value of the lightSetting property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLightSetting(String value) {
                this.lightSetting = value;
            }

            /**
             * Gets the value of the lightLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLightLevel() {
                return lightLevel;
            }

            /**
             * Sets the value of the lightLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLightLevel(String value) {
                this.lightLevel = value;
            }

            /**
             * Gets the value of the excBallCheck property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getExcBallCheck() {
                return excBallCheck;
            }

            /**
             * Sets the value of the excBallCheck property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setExcBallCheck(String value) {
                this.excBallCheck = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LightSetting" type="{}Wstring" />
         *       &lt;attribute name="LightLevel" type="{}Wstring" />
         *       &lt;attribute name="AllLightOn" type="{}Wstring" />
         *       &lt;attribute name="ExcPinCheck" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part078 {

            @XmlAttribute(name = "LightSetting")
            protected String lightSetting;
            @XmlAttribute(name = "LightLevel")
            protected String lightLevel;
            @XmlAttribute(name = "AllLightOn")
            protected String allLightOn;
            @XmlAttribute(name = "ExcPinCheck")
            protected String excPinCheck;

            /**
             * Gets the value of the lightSetting property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLightSetting() {
                return lightSetting;
            }

            /**
             * Sets the value of the lightSetting property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLightSetting(String value) {
                this.lightSetting = value;
            }

            /**
             * Gets the value of the lightLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLightLevel() {
                return lightLevel;
            }

            /**
             * Sets the value of the lightLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLightLevel(String value) {
                this.lightLevel = value;
            }

            /**
             * Gets the value of the allLightOn property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAllLightOn() {
                return allLightOn;
            }

            /**
             * Sets the value of the allLightOn property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAllLightOn(String value) {
                this.allLightOn = value;
            }

            /**
             * Gets the value of the excPinCheck property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getExcPinCheck() {
                return excPinCheck;
            }

            /**
             * Sets the value of the excPinCheck property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setExcPinCheck(String value) {
                this.excPinCheck = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Alignment" type="{}Wstring" />
         *       &lt;attribute name="AlignRefSubMlt" type="{}Wstring" />
         *       &lt;attribute name="AlignRefSubSgl" type="{}Wstring" />
         *       &lt;attribute name="AlignRefSubScan" type="{}Wstring" />
         *       &lt;attribute name="AutoThreshold" type="{}Wstring" />
         *       &lt;attribute name="Threshold" type="{}Wstring" />
         *       &lt;attribute name="Tolerance" type="{}Wstring" />
         *       &lt;attribute name="SearchArea" type="{}Wstring" />
         *       &lt;attribute name="DatumAngle" type="{}Wstring" />
         *       &lt;attribute name="EdgeThreshold" type="{}Wstring" />
         *       &lt;attribute name="MinMatchLevel" type="{}Wstring" />
         *       &lt;attribute name="AngleSearchArea" type="{}Wstring" />
         *       &lt;attribute name="MultiMACS" type="{}Wstring" />
         *       &lt;attribute name="OffsetRec" type="{}Wstring" />
         *       &lt;attribute name="RecognitionOffsetZ" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part079 {

            @XmlAttribute(name = "Alignment")
            protected String alignment;
            @XmlAttribute(name = "AlignRefSubMlt")
            protected String alignRefSubMlt;
            @XmlAttribute(name = "AlignRefSubSgl")
            protected String alignRefSubSgl;
            @XmlAttribute(name = "AlignRefSubScan")
            protected String alignRefSubScan;
            @XmlAttribute(name = "AutoThreshold")
            protected String autoThreshold;
            @XmlAttribute(name = "Threshold")
            protected String threshold;
            @XmlAttribute(name = "Tolerance")
            protected String tolerance;
            @XmlAttribute(name = "SearchArea")
            protected String searchArea;
            @XmlAttribute(name = "DatumAngle")
            protected String datumAngle;
            @XmlAttribute(name = "EdgeThreshold")
            protected String edgeThreshold;
            @XmlAttribute(name = "MinMatchLevel")
            protected String minMatchLevel;
            @XmlAttribute(name = "AngleSearchArea")
            protected String angleSearchArea;
            @XmlAttribute(name = "MultiMACS")
            protected String multiMACS;
            @XmlAttribute(name = "OffsetRec")
            protected String offsetRec;
            @XmlAttribute(name = "RecognitionOffsetZ")
            protected String recognitionOffsetZ;

            /**
             * Gets the value of the alignment property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignment() {
                return alignment;
            }

            /**
             * Sets the value of the alignment property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignment(String value) {
                this.alignment = value;
            }

            /**
             * Gets the value of the alignRefSubMlt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignRefSubMlt() {
                return alignRefSubMlt;
            }

            /**
             * Sets the value of the alignRefSubMlt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignRefSubMlt(String value) {
                this.alignRefSubMlt = value;
            }

            /**
             * Gets the value of the alignRefSubSgl property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignRefSubSgl() {
                return alignRefSubSgl;
            }

            /**
             * Sets the value of the alignRefSubSgl property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignRefSubSgl(String value) {
                this.alignRefSubSgl = value;
            }

            /**
             * Gets the value of the alignRefSubScan property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAlignRefSubScan() {
                return alignRefSubScan;
            }

            /**
             * Sets the value of the alignRefSubScan property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAlignRefSubScan(String value) {
                this.alignRefSubScan = value;
            }

            /**
             * Gets the value of the autoThreshold property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAutoThreshold() {
                return autoThreshold;
            }

            /**
             * Sets the value of the autoThreshold property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAutoThreshold(String value) {
                this.autoThreshold = value;
            }

            /**
             * Gets the value of the threshold property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getThreshold() {
                return threshold;
            }

            /**
             * Sets the value of the threshold property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setThreshold(String value) {
                this.threshold = value;
            }

            /**
             * Gets the value of the tolerance property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTolerance() {
                return tolerance;
            }

            /**
             * Sets the value of the tolerance property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTolerance(String value) {
                this.tolerance = value;
            }

            /**
             * Gets the value of the searchArea property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSearchArea() {
                return searchArea;
            }

            /**
             * Sets the value of the searchArea property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSearchArea(String value) {
                this.searchArea = value;
            }

            /**
             * Gets the value of the datumAngle property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDatumAngle() {
                return datumAngle;
            }

            /**
             * Sets the value of the datumAngle property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDatumAngle(String value) {
                this.datumAngle = value;
            }

            /**
             * Gets the value of the edgeThreshold property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getEdgeThreshold() {
                return edgeThreshold;
            }

            /**
             * Sets the value of the edgeThreshold property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setEdgeThreshold(String value) {
                this.edgeThreshold = value;
            }

            /**
             * Gets the value of the minMatchLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMinMatchLevel() {
                return minMatchLevel;
            }

            /**
             * Sets the value of the minMatchLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMinMatchLevel(String value) {
                this.minMatchLevel = value;
            }

            /**
             * Gets the value of the angleSearchArea property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAngleSearchArea() {
                return angleSearchArea;
            }

            /**
             * Sets the value of the angleSearchArea property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAngleSearchArea(String value) {
                this.angleSearchArea = value;
            }

            /**
             * Gets the value of the multiMACS property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMultiMACS() {
                return multiMACS;
            }

            /**
             * Sets the value of the multiMACS property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMultiMACS(String value) {
                this.multiMACS = value;
            }

            /**
             * Gets the value of the offsetRec property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOffsetRec() {
                return offsetRec;
            }

            /**
             * Sets the value of the offsetRec property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOffsetRec(String value) {
                this.offsetRec = value;
            }

            /**
             * Gets the value of the recognitionOffsetZ property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRecognitionOffsetZ() {
                return recognitionOffsetZ;
            }

            /**
             * Sets the value of the recognitionOffsetZ property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRecognitionOffsetZ(String value) {
                this.recognitionOffsetZ = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Nozzle" type="{}Wstring" />
         *       &lt;attribute name="XYSpeed" type="{}Wstring" />
         *       &lt;attribute name="ConvYSpeed" type="{}Wstring" />
         *       &lt;attribute name="FdrAngle" type="{}Wstring" />
         *       &lt;attribute name="VacChk" type="{}Wstring" />
         *       &lt;attribute name="CorrectPos" type="{}Wstring" />
         *       &lt;attribute name="Action" type="{}Wstring" />
         *       &lt;attribute name="PickStart" type="{}Wstring" />
         *       &lt;attribute name="Dump" type="{}Wstring" />
         *       &lt;attribute name="Retry" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part080 {

            @XmlAttribute(name = "Nozzle")
            protected String nozzle;
            @XmlAttribute(name = "XYSpeed")
            protected String xySpeed;
            @XmlAttribute(name = "ConvYSpeed")
            protected String convYSpeed;
            @XmlAttribute(name = "FdrAngle")
            protected String fdrAngle;
            @XmlAttribute(name = "VacChk")
            protected String vacChk;
            @XmlAttribute(name = "CorrectPos")
            protected String correctPos;
            @XmlAttribute(name = "Action")
            protected String action;
            @XmlAttribute(name = "PickStart")
            protected String pickStart;
            @XmlAttribute(name = "Dump")
            protected String dump;
            @XmlAttribute(name = "Retry")
            protected String retry;

            /**
             * Gets the value of the nozzle property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNozzle() {
                return nozzle;
            }

            /**
             * Sets the value of the nozzle property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNozzle(String value) {
                this.nozzle = value;
            }

            /**
             * Gets the value of the xySpeed property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getXYSpeed() {
                return xySpeed;
            }

            /**
             * Sets the value of the xySpeed property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setXYSpeed(String value) {
                this.xySpeed = value;
            }

            /**
             * Gets the value of the convYSpeed property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getConvYSpeed() {
                return convYSpeed;
            }

            /**
             * Sets the value of the convYSpeed property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setConvYSpeed(String value) {
                this.convYSpeed = value;
            }

            /**
             * Gets the value of the fdrAngle property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFdrAngle() {
                return fdrAngle;
            }

            /**
             * Sets the value of the fdrAngle property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setFdrAngle(String value) {
                this.fdrAngle = value;
            }

            /**
             * Gets the value of the vacChk property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVacChk() {
                return vacChk;
            }

            /**
             * Sets the value of the vacChk property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVacChk(String value) {
                this.vacChk = value;
            }

            /**
             * Gets the value of the correctPos property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCorrectPos() {
                return correctPos;
            }

            /**
             * Sets the value of the correctPos property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCorrectPos(String value) {
                this.correctPos = value;
            }

            /**
             * Gets the value of the action property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getAction() {
                return action;
            }

            /**
             * Sets the value of the action property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setAction(String value) {
                this.action = value;
            }

            /**
             * Gets the value of the pickStart property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPickStart() {
                return pickStart;
            }

            /**
             * Sets the value of the pickStart property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPickStart(String value) {
                this.pickStart = value;
            }

            /**
             * Gets the value of the dump property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDump() {
                return dump;
            }

            /**
             * Sets the value of the dump property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDump(String value) {
                this.dump = value;
            }

            /**
             * Gets the value of the retry property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getRetry() {
                return retry;
            }

            /**
             * Sets the value of the retry property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setRetry(String value) {
                this.retry = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="PckHeight" type="{}Wstring" />
         *       &lt;attribute name="PckTimer" type="{}Wstring" />
         *       &lt;attribute name="PckSpeed" type="{}Wstring" />
         *       &lt;attribute name="PckVLevel" type="{}Wstring" />
         *       &lt;attribute name="PckSingleDir" type="{}Wstring" />
         *       &lt;attribute name="PckCtrlDown" type="{}Wstring" />
         *       &lt;attribute name="PckCtrlUp" type="{}Wstring" />
         *       &lt;attribute name="NozzleTouchHeight" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part081 {

            @XmlAttribute(name = "PckHeight")
            protected String pckHeight;
            @XmlAttribute(name = "PckTimer")
            protected String pckTimer;
            @XmlAttribute(name = "PckSpeed")
            protected String pckSpeed;
            @XmlAttribute(name = "PckVLevel")
            protected String pckVLevel;
            @XmlAttribute(name = "PckSingleDir")
            protected String pckSingleDir;
            @XmlAttribute(name = "PckCtrlDown")
            protected String pckCtrlDown;
            @XmlAttribute(name = "PckCtrlUp")
            protected String pckCtrlUp;
            @XmlAttribute(name = "NozzleTouchHeight")
            protected String nozzleTouchHeight;

            /**
             * Gets the value of the pckHeight property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckHeight() {
                return pckHeight;
            }

            /**
             * Sets the value of the pckHeight property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckHeight(String value) {
                this.pckHeight = value;
            }

            /**
             * Gets the value of the pckTimer property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckTimer() {
                return pckTimer;
            }

            /**
             * Sets the value of the pckTimer property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckTimer(String value) {
                this.pckTimer = value;
            }

            /**
             * Gets the value of the pckSpeed property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckSpeed() {
                return pckSpeed;
            }

            /**
             * Sets the value of the pckSpeed property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckSpeed(String value) {
                this.pckSpeed = value;
            }

            /**
             * Gets the value of the pckVLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckVLevel() {
                return pckVLevel;
            }

            /**
             * Sets the value of the pckVLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckVLevel(String value) {
                this.pckVLevel = value;
            }

            /**
             * Gets the value of the pckSingleDir property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckSingleDir() {
                return pckSingleDir;
            }

            /**
             * Sets the value of the pckSingleDir property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckSingleDir(String value) {
                this.pckSingleDir = value;
            }

            /**
             * Gets the value of the pckCtrlDown property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckCtrlDown() {
                return pckCtrlDown;
            }

            /**
             * Sets the value of the pckCtrlDown property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckCtrlDown(String value) {
                this.pckCtrlDown = value;
            }

            /**
             * Gets the value of the pckCtrlUp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckCtrlUp() {
                return pckCtrlUp;
            }

            /**
             * Sets the value of the pckCtrlUp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckCtrlUp(String value) {
                this.pckCtrlUp = value;
            }

            /**
             * Gets the value of the nozzleTouchHeight property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNozzleTouchHeight() {
                return nozzleTouchHeight;
            }

            /**
             * Sets the value of the nozzleTouchHeight property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNozzleTouchHeight(String value) {
                this.nozzleTouchHeight = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="PckTimer" type="{}Wstring" />
         *       &lt;attribute name="PckSpeed" type="{}Wstring" />
         *       &lt;attribute name="PckVLevel" type="{}Wstring" />
         *       &lt;attribute name="PckSingleDir" type="{}Wstring" />
         *       &lt;attribute name="PckCtrlDown" type="{}Wstring" />
         *       &lt;attribute name="PckCtrlUp" type="{}Wstring" />
         *       &lt;attribute name="NozzleTouchHeight" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part082 {

            @XmlAttribute(name = "PckTimer")
            protected String pckTimer;
            @XmlAttribute(name = "PckSpeed")
            protected String pckSpeed;
            @XmlAttribute(name = "PckVLevel")
            protected String pckVLevel;
            @XmlAttribute(name = "PckSingleDir")
            protected String pckSingleDir;
            @XmlAttribute(name = "PckCtrlDown")
            protected String pckCtrlDown;
            @XmlAttribute(name = "PckCtrlUp")
            protected String pckCtrlUp;
            @XmlAttribute(name = "NozzleTouchHeight")
            protected String nozzleTouchHeight;

            /**
             * Gets the value of the pckTimer property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckTimer() {
                return pckTimer;
            }

            /**
             * Sets the value of the pckTimer property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckTimer(String value) {
                this.pckTimer = value;
            }

            /**
             * Gets the value of the pckSpeed property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckSpeed() {
                return pckSpeed;
            }

            /**
             * Sets the value of the pckSpeed property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckSpeed(String value) {
                this.pckSpeed = value;
            }

            /**
             * Gets the value of the pckVLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckVLevel() {
                return pckVLevel;
            }

            /**
             * Sets the value of the pckVLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckVLevel(String value) {
                this.pckVLevel = value;
            }

            /**
             * Gets the value of the pckSingleDir property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckSingleDir() {
                return pckSingleDir;
            }

            /**
             * Sets the value of the pckSingleDir property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckSingleDir(String value) {
                this.pckSingleDir = value;
            }

            /**
             * Gets the value of the pckCtrlDown property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckCtrlDown() {
                return pckCtrlDown;
            }

            /**
             * Sets the value of the pckCtrlDown property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckCtrlDown(String value) {
                this.pckCtrlDown = value;
            }

            /**
             * Gets the value of the pckCtrlUp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckCtrlUp() {
                return pckCtrlUp;
            }

            /**
             * Sets the value of the pckCtrlUp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckCtrlUp(String value) {
                this.pckCtrlUp = value;
            }

            /**
             * Gets the value of the nozzleTouchHeight property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNozzleTouchHeight() {
                return nozzleTouchHeight;
            }

            /**
             * Sets the value of the nozzleTouchHeight property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNozzleTouchHeight(String value) {
                this.nozzleTouchHeight = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="MntHeight" type="{}Wstring" />
         *       &lt;attribute name="MntTimer" type="{}Wstring" />
         *       &lt;attribute name="MntSpeed" type="{}Wstring" />
         *       &lt;attribute name="MntPLevel" type="{}Wstring" />
         *       &lt;attribute name="MntSingleDir" type="{}Wstring" />
         *       &lt;attribute name="MntCtrlDown" type="{}Wstring" />
         *       &lt;attribute name="MntCtrlUp" type="{}Wstring" />
         *       &lt;attribute name="MntInsertLength" type="{}Wstring" />
         *       &lt;attribute name="MntInsertShortDistance" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part083 {

            @XmlAttribute(name = "MntHeight")
            protected String mntHeight;
            @XmlAttribute(name = "MntTimer")
            protected String mntTimer;
            @XmlAttribute(name = "MntSpeed")
            protected String mntSpeed;
            @XmlAttribute(name = "MntPLevel")
            protected String mntPLevel;
            @XmlAttribute(name = "MntSingleDir")
            protected String mntSingleDir;
            @XmlAttribute(name = "MntCtrlDown")
            protected String mntCtrlDown;
            @XmlAttribute(name = "MntCtrlUp")
            protected String mntCtrlUp;
            @XmlAttribute(name = "MntInsertLength")
            protected String mntInsertLength;
            @XmlAttribute(name = "MntInsertShortDistance")
            protected String mntInsertShortDistance;

            /**
             * Gets the value of the mntHeight property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMntHeight() {
                return mntHeight;
            }

            /**
             * Sets the value of the mntHeight property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMntHeight(String value) {
                this.mntHeight = value;
            }

            /**
             * Gets the value of the mntTimer property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMntTimer() {
                return mntTimer;
            }

            /**
             * Sets the value of the mntTimer property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMntTimer(String value) {
                this.mntTimer = value;
            }

            /**
             * Gets the value of the mntSpeed property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMntSpeed() {
                return mntSpeed;
            }

            /**
             * Sets the value of the mntSpeed property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMntSpeed(String value) {
                this.mntSpeed = value;
            }

            /**
             * Gets the value of the mntPLevel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMntPLevel() {
                return mntPLevel;
            }

            /**
             * Sets the value of the mntPLevel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMntPLevel(String value) {
                this.mntPLevel = value;
            }

            /**
             * Gets the value of the mntSingleDir property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMntSingleDir() {
                return mntSingleDir;
            }

            /**
             * Sets the value of the mntSingleDir property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMntSingleDir(String value) {
                this.mntSingleDir = value;
            }

            /**
             * Gets the value of the mntCtrlDown property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMntCtrlDown() {
                return mntCtrlDown;
            }

            /**
             * Sets the value of the mntCtrlDown property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMntCtrlDown(String value) {
                this.mntCtrlDown = value;
            }

            /**
             * Gets the value of the mntCtrlUp property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMntCtrlUp() {
                return mntCtrlUp;
            }

            /**
             * Sets the value of the mntCtrlUp property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMntCtrlUp(String value) {
                this.mntCtrlUp = value;
            }

            /**
             * Gets the value of the mntInsertLength property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMntInsertLength() {
                return mntInsertLength;
            }

            /**
             * Sets the value of the mntInsertLength property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMntInsertLength(String value) {
                this.mntInsertLength = value;
            }

            /**
             * Gets the value of the mntInsertShortDistance property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMntInsertShortDistance() {
                return mntInsertShortDistance;
            }

            /**
             * Sets the value of the mntInsertShortDistance property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMntInsertShortDistance(String value) {
                this.mntInsertShortDistance = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="TrayXSize" type="{}Wstring" />
         *       &lt;attribute name="TrayYSize" type="{}Wstring" />
         *       &lt;attribute name="TrayXpt" type="{}Wstring" />
         *       &lt;attribute name="TrayYpt" type="{}Wstring" />
         *       &lt;attribute name="TrayThickness" type="{}Wstring" />
         *       &lt;attribute name="TrayXiSize" type="{}Wstring" />
         *       &lt;attribute name="TrayYiSize" type="{}Wstring" />
         *       &lt;attribute name="TrayXipt" type="{}Wstring" />
         *       &lt;attribute name="TrayYipt" type="{}Wstring" />
         *       &lt;attribute name="CountStp" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part100 {

            @XmlAttribute(name = "TrayXSize")
            protected String trayXSize;
            @XmlAttribute(name = "TrayYSize")
            protected String trayYSize;
            @XmlAttribute(name = "TrayXpt")
            protected String trayXpt;
            @XmlAttribute(name = "TrayYpt")
            protected String trayYpt;
            @XmlAttribute(name = "TrayThickness")
            protected String trayThickness;
            @XmlAttribute(name = "TrayXiSize")
            protected String trayXiSize;
            @XmlAttribute(name = "TrayYiSize")
            protected String trayYiSize;
            @XmlAttribute(name = "TrayXipt")
            protected String trayXipt;
            @XmlAttribute(name = "TrayYipt")
            protected String trayYipt;
            @XmlAttribute(name = "CountStp")
            protected String countStp;

            /**
             * Gets the value of the trayXSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXSize() {
                return trayXSize;
            }

            /**
             * Sets the value of the trayXSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXSize(String value) {
                this.trayXSize = value;
            }

            /**
             * Gets the value of the trayYSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYSize() {
                return trayYSize;
            }

            /**
             * Sets the value of the trayYSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYSize(String value) {
                this.trayYSize = value;
            }

            /**
             * Gets the value of the trayXpt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXpt() {
                return trayXpt;
            }

            /**
             * Sets the value of the trayXpt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXpt(String value) {
                this.trayXpt = value;
            }

            /**
             * Gets the value of the trayYpt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYpt() {
                return trayYpt;
            }

            /**
             * Sets the value of the trayYpt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYpt(String value) {
                this.trayYpt = value;
            }

            /**
             * Gets the value of the trayThickness property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayThickness() {
                return trayThickness;
            }

            /**
             * Sets the value of the trayThickness property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayThickness(String value) {
                this.trayThickness = value;
            }

            /**
             * Gets the value of the trayXiSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXiSize() {
                return trayXiSize;
            }

            /**
             * Sets the value of the trayXiSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXiSize(String value) {
                this.trayXiSize = value;
            }

            /**
             * Gets the value of the trayYiSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYiSize() {
                return trayYiSize;
            }

            /**
             * Sets the value of the trayYiSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYiSize(String value) {
                this.trayYiSize = value;
            }

            /**
             * Gets the value of the trayXipt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXipt() {
                return trayXipt;
            }

            /**
             * Sets the value of the trayXipt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXipt(String value) {
                this.trayXipt = value;
            }

            /**
             * Gets the value of the trayYipt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYipt() {
                return trayYipt;
            }

            /**
             * Sets the value of the trayYipt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYipt(String value) {
                this.trayYipt = value;
            }

            /**
             * Gets the value of the countStp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCountStp() {
                return countStp;
            }

            /**
             * Sets the value of the countStp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCountStp(String value) {
                this.countStp = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="TrayXSize" type="{}Wstring" />
         *       &lt;attribute name="TrayYSize" type="{}Wstring" />
         *       &lt;attribute name="TrayXpt" type="{}Wstring" />
         *       &lt;attribute name="TrayYpt" type="{}Wstring" />
         *       &lt;attribute name="TrayZpt" type="{}Wstring" />
         *       &lt;attribute name="TrayThickness" type="{}Wstring" />
         *       &lt;attribute name="TraySt" type="{}Wstring" />
         *       &lt;attribute name="TrayEn" type="{}Wstring" />
         *       &lt;attribute name="TrayXiSize" type="{}Wstring" />
         *       &lt;attribute name="TrayYiSize" type="{}Wstring" />
         *       &lt;attribute name="TrayXipt" type="{}Wstring" />
         *       &lt;attribute name="TrayYipt" type="{}Wstring" />
         *       &lt;attribute name="CountStp" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part101 {

            @XmlAttribute(name = "TrayXSize")
            protected String trayXSize;
            @XmlAttribute(name = "TrayYSize")
            protected String trayYSize;
            @XmlAttribute(name = "TrayXpt")
            protected String trayXpt;
            @XmlAttribute(name = "TrayYpt")
            protected String trayYpt;
            @XmlAttribute(name = "TrayZpt")
            protected String trayZpt;
            @XmlAttribute(name = "TrayThickness")
            protected String trayThickness;
            @XmlAttribute(name = "TraySt")
            protected String traySt;
            @XmlAttribute(name = "TrayEn")
            protected String trayEn;
            @XmlAttribute(name = "TrayXiSize")
            protected String trayXiSize;
            @XmlAttribute(name = "TrayYiSize")
            protected String trayYiSize;
            @XmlAttribute(name = "TrayXipt")
            protected String trayXipt;
            @XmlAttribute(name = "TrayYipt")
            protected String trayYipt;
            @XmlAttribute(name = "CountStp")
            protected String countStp;

            /**
             * Gets the value of the trayXSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXSize() {
                return trayXSize;
            }

            /**
             * Sets the value of the trayXSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXSize(String value) {
                this.trayXSize = value;
            }

            /**
             * Gets the value of the trayYSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYSize() {
                return trayYSize;
            }

            /**
             * Sets the value of the trayYSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYSize(String value) {
                this.trayYSize = value;
            }

            /**
             * Gets the value of the trayXpt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXpt() {
                return trayXpt;
            }

            /**
             * Sets the value of the trayXpt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXpt(String value) {
                this.trayXpt = value;
            }

            /**
             * Gets the value of the trayYpt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYpt() {
                return trayYpt;
            }

            /**
             * Sets the value of the trayYpt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYpt(String value) {
                this.trayYpt = value;
            }

            /**
             * Gets the value of the trayZpt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayZpt() {
                return trayZpt;
            }

            /**
             * Sets the value of the trayZpt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayZpt(String value) {
                this.trayZpt = value;
            }

            /**
             * Gets the value of the trayThickness property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayThickness() {
                return trayThickness;
            }

            /**
             * Sets the value of the trayThickness property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayThickness(String value) {
                this.trayThickness = value;
            }

            /**
             * Gets the value of the traySt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTraySt() {
                return traySt;
            }

            /**
             * Sets the value of the traySt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTraySt(String value) {
                this.traySt = value;
            }

            /**
             * Gets the value of the trayEn property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayEn() {
                return trayEn;
            }

            /**
             * Sets the value of the trayEn property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayEn(String value) {
                this.trayEn = value;
            }

            /**
             * Gets the value of the trayXiSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXiSize() {
                return trayXiSize;
            }

            /**
             * Sets the value of the trayXiSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXiSize(String value) {
                this.trayXiSize = value;
            }

            /**
             * Gets the value of the trayYiSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYiSize() {
                return trayYiSize;
            }

            /**
             * Sets the value of the trayYiSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYiSize(String value) {
                this.trayYiSize = value;
            }

            /**
             * Gets the value of the trayXipt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXipt() {
                return trayXipt;
            }

            /**
             * Sets the value of the trayXipt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXipt(String value) {
                this.trayXipt = value;
            }

            /**
             * Gets the value of the trayYipt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYipt() {
                return trayYipt;
            }

            /**
             * Sets the value of the trayYipt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYipt(String value) {
                this.trayYipt = value;
            }

            /**
             * Gets the value of the countStp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCountStp() {
                return countStp;
            }

            /**
             * Sets the value of the countStp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCountStp(String value) {
                this.countStp = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="TrayYiSize" type="{}Wstring" />
         *       &lt;attribute name="CountStp" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part103 {

            @XmlAttribute(name = "TrayYiSize")
            protected String trayYiSize;
            @XmlAttribute(name = "CountStp")
            protected String countStp;

            /**
             * Gets the value of the trayYiSize property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYiSize() {
                return trayYiSize;
            }

            /**
             * Sets the value of the trayYiSize property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYiSize(String value) {
                this.trayYiSize = value;
            }

            /**
             * Gets the value of the countStp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCountStp() {
                return countStp;
            }

            /**
             * Sets the value of the countStp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCountStp(String value) {
                this.countStp = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="WastedSpaceL" type="{}Wstring" />
         *       &lt;attribute name="WastedSpaceR" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part104 {

            @XmlAttribute(name = "WastedSpaceL")
            protected String wastedSpaceL;
            @XmlAttribute(name = "WastedSpaceR")
            protected String wastedSpaceR;

            /**
             * Gets the value of the wastedSpaceL property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getWastedSpaceL() {
                return wastedSpaceL;
            }

            /**
             * Sets the value of the wastedSpaceL property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setWastedSpaceL(String value) {
                this.wastedSpaceL = value;
            }

            /**
             * Gets the value of the wastedSpaceR property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getWastedSpaceR() {
                return wastedSpaceR;
            }

            /**
             * Sets the value of the wastedSpaceR property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setWastedSpaceR(String value) {
                this.wastedSpaceR = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="TrayXCur" type="{}Wstring" />
         *       &lt;attribute name="TrayYCur" type="{}Wstring" />
         *       &lt;attribute name="TrayXiCur" type="{}Wstring" />
         *       &lt;attribute name="TrayYiCur" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part105 {

            @XmlAttribute(name = "TrayXCur")
            protected String trayXCur;
            @XmlAttribute(name = "TrayYCur")
            protected String trayYCur;
            @XmlAttribute(name = "TrayXiCur")
            protected String trayXiCur;
            @XmlAttribute(name = "TrayYiCur")
            protected String trayYiCur;

            /**
             * Gets the value of the trayXCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXCur() {
                return trayXCur;
            }

            /**
             * Sets the value of the trayXCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXCur(String value) {
                this.trayXCur = value;
            }

            /**
             * Gets the value of the trayYCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYCur() {
                return trayYCur;
            }

            /**
             * Sets the value of the trayYCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYCur(String value) {
                this.trayYCur = value;
            }

            /**
             * Gets the value of the trayXiCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXiCur() {
                return trayXiCur;
            }

            /**
             * Sets the value of the trayXiCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXiCur(String value) {
                this.trayXiCur = value;
            }

            /**
             * Gets the value of the trayYiCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYiCur() {
                return trayYiCur;
            }

            /**
             * Sets the value of the trayYiCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYiCur(String value) {
                this.trayYiCur = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="TrayXCur" type="{}Wstring" />
         *       &lt;attribute name="TrayYCur" type="{}Wstring" />
         *       &lt;attribute name="TrayCur" type="{}Wstring" />
         *       &lt;attribute name="TrayXiCur" type="{}Wstring" />
         *       &lt;attribute name="TrayYiCur" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part106 {

            @XmlAttribute(name = "TrayXCur")
            protected String trayXCur;
            @XmlAttribute(name = "TrayYCur")
            protected String trayYCur;
            @XmlAttribute(name = "TrayCur")
            protected String trayCur;
            @XmlAttribute(name = "TrayXiCur")
            protected String trayXiCur;
            @XmlAttribute(name = "TrayYiCur")
            protected String trayYiCur;

            /**
             * Gets the value of the trayXCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXCur() {
                return trayXCur;
            }

            /**
             * Sets the value of the trayXCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXCur(String value) {
                this.trayXCur = value;
            }

            /**
             * Gets the value of the trayYCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYCur() {
                return trayYCur;
            }

            /**
             * Sets the value of the trayYCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYCur(String value) {
                this.trayYCur = value;
            }

            /**
             * Gets the value of the trayCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayCur() {
                return trayCur;
            }

            /**
             * Sets the value of the trayCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayCur(String value) {
                this.trayCur = value;
            }

            /**
             * Gets the value of the trayXiCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayXiCur() {
                return trayXiCur;
            }

            /**
             * Sets the value of the trayXiCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayXiCur(String value) {
                this.trayXiCur = value;
            }

            /**
             * Gets the value of the trayYiCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYiCur() {
                return trayYiCur;
            }

            /**
             * Sets the value of the trayYiCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYiCur(String value) {
                this.trayYiCur = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="TrayYiCur" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part107 {

            @XmlAttribute(name = "TrayYiCur")
            protected String trayYiCur;

            /**
             * Gets the value of the trayYiCur property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getTrayYiCur() {
                return trayYiCur;
            }

            /**
             * Sets the value of the trayYiCur property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setTrayYiCur(String value) {
                this.trayYiCur = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LhAccel" type="{}Wstring" />
         *       &lt;attribute name="LtAccel" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part108 {

            @XmlAttribute(name = "LhAccel")
            protected String lhAccel;
            @XmlAttribute(name = "LtAccel")
            protected String ltAccel;

            /**
             * Gets the value of the lhAccel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLhAccel() {
                return lhAccel;
            }

            /**
             * Sets the value of the lhAccel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLhAccel(String value) {
                this.lhAccel = value;
            }

            /**
             * Gets the value of the ltAccel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLtAccel() {
                return ltAccel;
            }

            /**
             * Sets the value of the ltAccel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLtAccel(String value) {
                this.ltAccel = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="LhAccel" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part109 {

            @XmlAttribute(name = "LhAccel")
            protected String lhAccel;

            /**
             * Gets the value of the lhAccel property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLhAccel() {
                return lhAccel;
            }

            /**
             * Sets the value of the lhAccel property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLhAccel(String value) {
                this.lhAccel = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="DspCType" type="{}Wstring" />
         *       &lt;attribute name="DNozzle" type="{}Wstring" />
         *       &lt;attribute name="Dtimer" type="{}Wstring" />
         *       &lt;attribute name="DXpos" type="{}Wstring" />
         *       &lt;attribute name="DYpos" type="{}Wstring" />
         *       &lt;attribute name="DspAngle" type="{}Wstring" />
         *       &lt;attribute name="DXpt" type="{}Wstring" />
         *       &lt;attribute name="DYpt" type="{}Wstring" />
         *       &lt;attribute name="DXtime" type="{}Wstring" />
         *       &lt;attribute name="DYtime" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part200 {

            @XmlAttribute(name = "DspCType")
            protected String dspCType;
            @XmlAttribute(name = "DNozzle")
            protected String dNozzle;
            @XmlAttribute(name = "Dtimer")
            protected String dtimer;
            @XmlAttribute(name = "DXpos")
            protected String dXpos;
            @XmlAttribute(name = "DYpos")
            protected String dYpos;
            @XmlAttribute(name = "DspAngle")
            protected String dspAngle;
            @XmlAttribute(name = "DXpt")
            protected String dXpt;
            @XmlAttribute(name = "DYpt")
            protected String dYpt;
            @XmlAttribute(name = "DXtime")
            protected String dXtime;
            @XmlAttribute(name = "DYtime")
            protected String dYtime;

            /**
             * Gets the value of the dspCType property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDspCType() {
                return dspCType;
            }

            /**
             * Sets the value of the dspCType property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDspCType(String value) {
                this.dspCType = value;
            }

            /**
             * Gets the value of the dNozzle property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDNozzle() {
                return dNozzle;
            }

            /**
             * Sets the value of the dNozzle property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDNozzle(String value) {
                this.dNozzle = value;
            }

            /**
             * Gets the value of the dtimer property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDtimer() {
                return dtimer;
            }

            /**
             * Sets the value of the dtimer property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDtimer(String value) {
                this.dtimer = value;
            }

            /**
             * Gets the value of the dXpos property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDXpos() {
                return dXpos;
            }

            /**
             * Sets the value of the dXpos property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDXpos(String value) {
                this.dXpos = value;
            }

            /**
             * Gets the value of the dYpos property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDYpos() {
                return dYpos;
            }

            /**
             * Sets the value of the dYpos property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDYpos(String value) {
                this.dYpos = value;
            }

            /**
             * Gets the value of the dspAngle property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDspAngle() {
                return dspAngle;
            }

            /**
             * Sets the value of the dspAngle property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDspAngle(String value) {
                this.dspAngle = value;
            }

            /**
             * Gets the value of the dXpt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDXpt() {
                return dXpt;
            }

            /**
             * Sets the value of the dXpt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDXpt(String value) {
                this.dXpt = value;
            }

            /**
             * Gets the value of the dYpt property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDYpt() {
                return dYpt;
            }

            /**
             * Sets the value of the dYpt property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDYpt(String value) {
                this.dYpt = value;
            }

            /**
             * Gets the value of the dXtime property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDXtime() {
                return dXtime;
            }

            /**
             * Sets the value of the dXtime property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDXtime(String value) {
                this.dXtime = value;
            }

            /**
             * Gets the value of the dYtime property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDYtime() {
                return dYtime;
            }

            /**
             * Sets the value of the dYtime property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDYtime(String value) {
                this.dYtime = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Pck2ndSrvDown" type="{}Wstring" />
         *       &lt;attribute name="Pck2ndSrvUp" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part300 {

            @XmlAttribute(name = "Pck2ndSrvDown")
            protected String pck2NdSrvDown;
            @XmlAttribute(name = "Pck2ndSrvUp")
            protected String pck2NdSrvUp;

            /**
             * Gets the value of the pck2NdSrvDown property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPck2NdSrvDown() {
                return pck2NdSrvDown;
            }

            /**
             * Sets the value of the pck2NdSrvDown property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPck2NdSrvDown(String value) {
                this.pck2NdSrvDown = value;
            }

            /**
             * Gets the value of the pck2NdSrvUp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPck2NdSrvUp() {
                return pck2NdSrvUp;
            }

            /**
             * Sets the value of the pck2NdSrvUp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPck2NdSrvUp(String value) {
                this.pck2NdSrvUp = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Mnt2ndSrvDown" type="{}Wstring" />
         *       &lt;attribute name="Mnt2ndSrvUp" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part301 {

            @XmlAttribute(name = "Mnt2ndSrvDown")
            protected String mnt2NdSrvDown;
            @XmlAttribute(name = "Mnt2ndSrvUp")
            protected String mnt2NdSrvUp;

            /**
             * Gets the value of the mnt2NdSrvDown property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMnt2NdSrvDown() {
                return mnt2NdSrvDown;
            }

            /**
             * Sets the value of the mnt2NdSrvDown property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMnt2NdSrvDown(String value) {
                this.mnt2NdSrvDown = value;
            }

            /**
             * Gets the value of the mnt2NdSrvUp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMnt2NdSrvUp() {
                return mnt2NdSrvUp;
            }

            /**
             * Sets the value of the mnt2NdSrvUp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMnt2NdSrvUp(String value) {
                this.mnt2NdSrvUp = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="PckForceExist" type="{}Wstring" />
         *       &lt;attribute name="PckForceTarget" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part302 {

            @XmlAttribute(name = "PckForceExist")
            protected String pckForceExist;
            @XmlAttribute(name = "PckForceTarget")
            protected String pckForceTarget;

            /**
             * Gets the value of the pckForceExist property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckForceExist() {
                return pckForceExist;
            }

            /**
             * Sets the value of the pckForceExist property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckForceExist(String value) {
                this.pckForceExist = value;
            }

            /**
             * Gets the value of the pckForceTarget property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getPckForceTarget() {
                return pckForceTarget;
            }

            /**
             * Sets the value of the pckForceTarget property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setPckForceTarget(String value) {
                this.pckForceTarget = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="MntForceExist" type="{}Wstring" />
         *       &lt;attribute name="MntForceTarget" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part303 {

            @XmlAttribute(name = "MntForceExist")
            protected String mntForceExist;
            @XmlAttribute(name = "MntForceTarget")
            protected String mntForceTarget;

            /**
             * Gets the value of the mntForceExist property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMntForceExist() {
                return mntForceExist;
            }

            /**
             * Sets the value of the mntForceExist property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMntForceExist(String value) {
                this.mntForceExist = value;
            }

            /**
             * Gets the value of the mntForceTarget property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getMntForceTarget() {
                return mntForceTarget;
            }

            /**
             * Sets the value of the mntForceTarget property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setMntForceTarget(String value) {
                this.mntForceTarget = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="DDDExecPass" type="{}Wstring" />
         *       &lt;attribute name="DDDThreNmlCam" type="{}Wstring" />
         *       &lt;attribute name="DDDThreSlantCam" type="{}Wstring" />
         *       &lt;attribute name="DDDLightCoaxNmlCam" type="{}Wstring" />
         *       &lt;attribute name="DDDLightCoaxSlantCam" type="{}Wstring" />
         *       &lt;attribute name="DDDLightMainSlantCam" type="{}Wstring" />
         *       &lt;attribute name="DDDLightSideSlantCam" type="{}Wstring" />
         *       &lt;attribute name="DDDBrightAreaNmlCam" type="{}Wstring" />
         *       &lt;attribute name="DDDBrightAreaSlantCam" type="{}Wstring" />
         *       &lt;attribute name="DDDPermitTol" type="{}Wstring" />
         *       &lt;attribute name="DDDHeightCheck" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part310 {

            @XmlAttribute(name = "DDDExecPass")
            protected String dddExecPass;
            @XmlAttribute(name = "DDDThreNmlCam")
            protected String dddThreNmlCam;
            @XmlAttribute(name = "DDDThreSlantCam")
            protected String dddThreSlantCam;
            @XmlAttribute(name = "DDDLightCoaxNmlCam")
            protected String dddLightCoaxNmlCam;
            @XmlAttribute(name = "DDDLightCoaxSlantCam")
            protected String dddLightCoaxSlantCam;
            @XmlAttribute(name = "DDDLightMainSlantCam")
            protected String dddLightMainSlantCam;
            @XmlAttribute(name = "DDDLightSideSlantCam")
            protected String dddLightSideSlantCam;
            @XmlAttribute(name = "DDDBrightAreaNmlCam")
            protected String dddBrightAreaNmlCam;
            @XmlAttribute(name = "DDDBrightAreaSlantCam")
            protected String dddBrightAreaSlantCam;
            @XmlAttribute(name = "DDDPermitTol")
            protected String dddPermitTol;
            @XmlAttribute(name = "DDDHeightCheck")
            protected String dddHeightCheck;

            /**
             * Gets the value of the dddExecPass property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDExecPass() {
                return dddExecPass;
            }

            /**
             * Sets the value of the dddExecPass property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDExecPass(String value) {
                this.dddExecPass = value;
            }

            /**
             * Gets the value of the dddThreNmlCam property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDThreNmlCam() {
                return dddThreNmlCam;
            }

            /**
             * Sets the value of the dddThreNmlCam property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDThreNmlCam(String value) {
                this.dddThreNmlCam = value;
            }

            /**
             * Gets the value of the dddThreSlantCam property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDThreSlantCam() {
                return dddThreSlantCam;
            }

            /**
             * Sets the value of the dddThreSlantCam property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDThreSlantCam(String value) {
                this.dddThreSlantCam = value;
            }

            /**
             * Gets the value of the dddLightCoaxNmlCam property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDLightCoaxNmlCam() {
                return dddLightCoaxNmlCam;
            }

            /**
             * Sets the value of the dddLightCoaxNmlCam property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDLightCoaxNmlCam(String value) {
                this.dddLightCoaxNmlCam = value;
            }

            /**
             * Gets the value of the dddLightCoaxSlantCam property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDLightCoaxSlantCam() {
                return dddLightCoaxSlantCam;
            }

            /**
             * Sets the value of the dddLightCoaxSlantCam property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDLightCoaxSlantCam(String value) {
                this.dddLightCoaxSlantCam = value;
            }

            /**
             * Gets the value of the dddLightMainSlantCam property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDLightMainSlantCam() {
                return dddLightMainSlantCam;
            }

            /**
             * Sets the value of the dddLightMainSlantCam property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDLightMainSlantCam(String value) {
                this.dddLightMainSlantCam = value;
            }

            /**
             * Gets the value of the dddLightSideSlantCam property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDLightSideSlantCam() {
                return dddLightSideSlantCam;
            }

            /**
             * Sets the value of the dddLightSideSlantCam property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDLightSideSlantCam(String value) {
                this.dddLightSideSlantCam = value;
            }

            /**
             * Gets the value of the dddBrightAreaNmlCam property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDBrightAreaNmlCam() {
                return dddBrightAreaNmlCam;
            }

            /**
             * Sets the value of the dddBrightAreaNmlCam property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDBrightAreaNmlCam(String value) {
                this.dddBrightAreaNmlCam = value;
            }

            /**
             * Gets the value of the dddBrightAreaSlantCam property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDBrightAreaSlantCam() {
                return dddBrightAreaSlantCam;
            }

            /**
             * Sets the value of the dddBrightAreaSlantCam property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDBrightAreaSlantCam(String value) {
                this.dddBrightAreaSlantCam = value;
            }

            /**
             * Gets the value of the dddPermitTol property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDPermitTol() {
                return dddPermitTol;
            }

            /**
             * Sets the value of the dddPermitTol property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDPermitTol(String value) {
                this.dddPermitTol = value;
            }

            /**
             * Gets the value of the dddHeightCheck property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDDDHeightCheck() {
                return dddHeightCheck;
            }

            /**
             * Sets the value of the dddHeightCheck property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDDDHeightCheck(String value) {
                this.dddHeightCheck = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Category" type="{}Wstring" />
         *       &lt;attribute name="DipAct" type="{}Wstring" />
         *       &lt;attribute name="StampAct" type="{}Wstring" />
         *       &lt;attribute name="Marking" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part500 {

            @XmlAttribute(name = "Category")
            protected String category;
            @XmlAttribute(name = "DipAct")
            protected String dipAct;
            @XmlAttribute(name = "StampAct")
            protected String stampAct;
            @XmlAttribute(name = "Marking")
            protected String marking;

            /**
             * Gets the value of the category property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCategory() {
                return category;
            }

            /**
             * Sets the value of the category property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCategory(String value) {
                this.category = value;
            }

            /**
             * Gets the value of the dipAct property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDipAct() {
                return dipAct;
            }

            /**
             * Sets the value of the dipAct property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDipAct(String value) {
                this.dipAct = value;
            }

            /**
             * Gets the value of the stampAct property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStampAct() {
                return stampAct;
            }

            /**
             * Sets the value of the stampAct property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStampAct(String value) {
                this.stampAct = value;
            }

            /**
             * Gets the value of the marking property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getMarking() {
                return marking;
            }

            /**
             * Sets the value of the marking property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setMarking(String value) {
                this.marking = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Option1StationNo" type="{}Wstring" />
         *       &lt;attribute name="Option1WaitVision" type="{}Wstring" />
         *       &lt;attribute name="Option1DownSequenceAir" type="{}Wstring" />
         *       &lt;attribute name="Option12ndSrvDown" type="{}Wstring" />
         *       &lt;attribute name="Option1DownSpeed" type="{}Wstring" />
         *       &lt;attribute name="Option1LowendHeight" type="{}Wstring" />
         *       &lt;attribute name="Option1LowendTimer" type="{}Wstring" />
         *       &lt;attribute name="Option1UpSequenceAir" type="{}Wstring" />
         *       &lt;attribute name="Option12ndSrvUp" type="{}Wstring" />
         *       &lt;attribute name="Option1UpSpeed" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part501 {

            @XmlAttribute(name = "Option1StationNo")
            protected String option1StationNo;
            @XmlAttribute(name = "Option1WaitVision")
            protected String option1WaitVision;
            @XmlAttribute(name = "Option1DownSequenceAir")
            protected String option1DownSequenceAir;
            @XmlAttribute(name = "Option12ndSrvDown")
            protected String option12NdSrvDown;
            @XmlAttribute(name = "Option1DownSpeed")
            protected String option1DownSpeed;
            @XmlAttribute(name = "Option1LowendHeight")
            protected String option1LowendHeight;
            @XmlAttribute(name = "Option1LowendTimer")
            protected String option1LowendTimer;
            @XmlAttribute(name = "Option1UpSequenceAir")
            protected String option1UpSequenceAir;
            @XmlAttribute(name = "Option12ndSrvUp")
            protected String option12NdSrvUp;
            @XmlAttribute(name = "Option1UpSpeed")
            protected String option1UpSpeed;

            /**
             * Gets the value of the option1StationNo property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOption1StationNo() {
                return option1StationNo;
            }

            /**
             * Sets the value of the option1StationNo property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOption1StationNo(String value) {
                this.option1StationNo = value;
            }

            /**
             * Gets the value of the option1WaitVision property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1WaitVision() {
                return option1WaitVision;
            }

            /**
             * Sets the value of the option1WaitVision property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOption1WaitVision(String value) {
                this.option1WaitVision = value;
            }

            /**
             * Gets the value of the option1DownSequenceAir property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1DownSequenceAir() {
                return option1DownSequenceAir;
            }

            /**
             * Sets the value of the option1DownSequenceAir property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption1DownSequenceAir(String value) {
                this.option1DownSequenceAir = value;
            }

            /**
             * Gets the value of the option12NdSrvDown property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption12NdSrvDown() {
                return option12NdSrvDown;
            }

            /**
             * Sets the value of the option12NdSrvDown property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption12NdSrvDown(String value) {
                this.option12NdSrvDown = value;
            }

            /**
             * Gets the value of the option1DownSpeed property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1DownSpeed() {
                return option1DownSpeed;
            }

            /**
             * Sets the value of the option1DownSpeed property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption1DownSpeed(String value) {
                this.option1DownSpeed = value;
            }

            /**
             * Gets the value of the option1LowendHeight property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1LowendHeight() {
                return option1LowendHeight;
            }

            /**
             * Sets the value of the option1LowendHeight property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption1LowendHeight(String value) {
                this.option1LowendHeight = value;
            }

            /**
             * Gets the value of the option1LowendTimer property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1LowendTimer() {
                return option1LowendTimer;
            }

            /**
             * Sets the value of the option1LowendTimer property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption1LowendTimer(String value) {
                this.option1LowendTimer = value;
            }

            /**
             * Gets the value of the option1UpSequenceAir property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1UpSequenceAir() {
                return option1UpSequenceAir;
            }

            /**
             * Sets the value of the option1UpSequenceAir property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption1UpSequenceAir(String value) {
                this.option1UpSequenceAir = value;
            }

            /**
             * Gets the value of the option12NdSrvUp property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption12NdSrvUp() {
                return option12NdSrvUp;
            }

            /**
             * Sets the value of the option12NdSrvUp property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption12NdSrvUp(String value) {
                this.option12NdSrvUp = value;
            }

            /**
             * Gets the value of the option1UpSpeed property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1UpSpeed() {
                return option1UpSpeed;
            }

            /**
             * Sets the value of the option1UpSpeed property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOption1UpSpeed(String value) {
                this.option1UpSpeed = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Option1ForceExist" type="{}Wstring" />
         *       &lt;attribute name="Option1ForceTarget" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part502 {

            @XmlAttribute(name = "Option1ForceExist")
            protected String option1ForceExist;
            @XmlAttribute(name = "Option1ForceTarget")
            protected String option1ForceTarget;

            /**
             * Gets the value of the option1ForceExist property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1ForceExist() {
                return option1ForceExist;
            }

            /**
             * Sets the value of the option1ForceExist property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setOption1ForceExist(String value) {
                this.option1ForceExist = value;
            }

            /**
             * Gets the value of the option1ForceTarget property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getOption1ForceTarget() {
                return option1ForceTarget;
            }

            /**
             * Sets the value of the option1ForceTarget property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOption1ForceTarget(String value) {
                this.option1ForceTarget = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="SVUse" type="{}Wstring" />
         *       &lt;attribute name="SVBringBack" type="{}Wstring" />
         *       &lt;attribute name="SVBodyLimit" type="{}Wstring" />
         *       &lt;attribute name="SVReverseCheck" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part520 {

            @XmlAttribute(name = "SVUse")
            protected String svUse;
            @XmlAttribute(name = "SVBringBack")
            protected String svBringBack;
            @XmlAttribute(name = "SVBodyLimit")
            protected String svBodyLimit;
            @XmlAttribute(name = "SVReverseCheck")
            protected String svReverseCheck;

            /**
             * Gets the value of the svUse property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSVUse() {
                return svUse;
            }

            /**
             * Sets the value of the svUse property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSVUse(String value) {
                this.svUse = value;
            }

            /**
             * Gets the value of the svBringBack property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSVBringBack() {
                return svBringBack;
            }

            /**
             * Sets the value of the svBringBack property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSVBringBack(String value) {
                this.svBringBack = value;
            }

            /**
             * Gets the value of the svBodyLimit property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSVBodyLimit() {
                return svBodyLimit;
            }

            /**
             * Sets the value of the svBodyLimit property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSVBodyLimit(String value) {
                this.svBodyLimit = value;
            }

            /**
             * Gets the value of the svReverseCheck property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSVReverseCheck() {
                return svReverseCheck;
            }

            /**
             * Sets the value of the svReverseCheck property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSVReverseCheck(String value) {
                this.svReverseCheck = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *       &lt;/sequence>
         *       &lt;attribute name="Data.001" type="{}Wstring" />
         *       &lt;attribute name="Data.002" type="{}Wstring" />
         *       &lt;attribute name="Data.003" type="{}Wstring" />
         *       &lt;attribute name="Data.004" type="{}Wstring" />
         *       &lt;attribute name="Data.005" type="{}Wstring" />
         *       &lt;attribute name="Data.006" type="{}Wstring" />
         *       &lt;attribute name="Data.007" type="{}Wstring" />
         *       &lt;attribute name="Data.008" type="{}Wstring" />
         *       &lt;attribute name="Data.009" type="{}Wstring" />
         *       &lt;attribute name="Data.010" type="{}Wstring" />
         *       &lt;attribute name="Data.011" type="{}Wstring" />
         *       &lt;attribute name="Data.012" type="{}Wstring" />
         *       &lt;attribute name="Data.013" type="{}Wstring" />
         *       &lt;attribute name="Data.014" type="{}Wstring" />
         *       &lt;attribute name="Data.015" type="{}Wstring" />
         *       &lt;attribute name="Data.016" type="{}Wstring" />
         *       &lt;attribute name="Data.017" type="{}Wstring" />
         *       &lt;attribute name="Data.018" type="{}Wstring" />
         *       &lt;attribute name="Data.019" type="{}Wstring" />
         *       &lt;attribute name="Data.020" type="{}Wstring" />
         *       &lt;attribute name="Data.021" type="{}Wstring" />
         *       &lt;attribute name="Data.022" type="{}Wstring" />
         *       &lt;attribute name="Data.023" type="{}Wstring" />
         *       &lt;attribute name="Data.024" type="{}Wstring" />
         *       &lt;attribute name="Data.025" type="{}Wstring" />
         *       &lt;attribute name="Data.026" type="{}Wstring" />
         *       &lt;attribute name="Data.027" type="{}Wstring" />
         *       &lt;attribute name="Data.028" type="{}Wstring" />
         *       &lt;attribute name="Data.029" type="{}Wstring" />
         *       &lt;attribute name="Data.030" type="{}Wstring" />
         *       &lt;attribute name="Data.031" type="{}Wstring" />
         *       &lt;attribute name="Data.032" type="{}Wstring" />
         *       &lt;attribute name="Data.033" type="{}Wstring" />
         *       &lt;attribute name="Data.034" type="{}Wstring" />
         *       &lt;attribute name="Data.035" type="{}Wstring" />
         *       &lt;attribute name="Data.036" type="{}Wstring" />
         *       &lt;attribute name="Data.037" type="{}Wstring" />
         *       &lt;attribute name="Data.038" type="{}Wstring" />
         *       &lt;attribute name="Data.039" type="{}Wstring" />
         *       &lt;attribute name="Data.040" type="{}Wstring" />
         *       &lt;attribute name="Data.041" type="{}Wstring" />
         *       &lt;attribute name="Data.042" type="{}Wstring" />
         *       &lt;attribute name="Data.043" type="{}Wstring" />
         *       &lt;attribute name="Data.044" type="{}Wstring" />
         *       &lt;attribute name="Data.045" type="{}Wstring" />
         *       &lt;attribute name="Data.046" type="{}Wstring" />
         *       &lt;attribute name="Data.047" type="{}Wstring" />
         *       &lt;attribute name="Data.048" type="{}Wstring" />
         *       &lt;attribute name="Data.049" type="{}Wstring" />
         *       &lt;attribute name="Data.050" type="{}Wstring" />
         *       &lt;attribute name="Data.051" type="{}Wstring" />
         *       &lt;attribute name="Data.052" type="{}Wstring" />
         *       &lt;attribute name="Data.053" type="{}Wstring" />
         *       &lt;attribute name="Data.054" type="{}Wstring" />
         *       &lt;attribute name="Data.055" type="{}Wstring" />
         *       &lt;attribute name="Data.056" type="{}Wstring" />
         *       &lt;attribute name="Data.057" type="{}Wstring" />
         *       &lt;attribute name="Data.058" type="{}Wstring" />
         *       &lt;attribute name="Data.059" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SmartRecognition {

            @XmlAttribute(name = "Data.001")
            protected String data001;
            @XmlAttribute(name = "Data.002")
            protected String data002;
            @XmlAttribute(name = "Data.003")
            protected String data003;
            @XmlAttribute(name = "Data.004")
            protected String data004;
            @XmlAttribute(name = "Data.005")
            protected String data005;
            @XmlAttribute(name = "Data.006")
            protected String data006;
            @XmlAttribute(name = "Data.007")
            protected String data007;
            @XmlAttribute(name = "Data.008")
            protected String data008;
            @XmlAttribute(name = "Data.009")
            protected String data009;
            @XmlAttribute(name = "Data.010")
            protected String data010;
            @XmlAttribute(name = "Data.011")
            protected String data011;
            @XmlAttribute(name = "Data.012")
            protected String data012;
            @XmlAttribute(name = "Data.013")
            protected String data013;
            @XmlAttribute(name = "Data.014")
            protected String data014;
            @XmlAttribute(name = "Data.015")
            protected String data015;
            @XmlAttribute(name = "Data.016")
            protected String data016;
            @XmlAttribute(name = "Data.017")
            protected String data017;
            @XmlAttribute(name = "Data.018")
            protected String data018;
            @XmlAttribute(name = "Data.019")
            protected String data019;
            @XmlAttribute(name = "Data.020")
            protected String data020;
            @XmlAttribute(name = "Data.021")
            protected String data021;
            @XmlAttribute(name = "Data.022")
            protected String data022;
            @XmlAttribute(name = "Data.023")
            protected String data023;
            @XmlAttribute(name = "Data.024")
            protected String data024;
            @XmlAttribute(name = "Data.025")
            protected String data025;
            @XmlAttribute(name = "Data.026")
            protected String data026;
            @XmlAttribute(name = "Data.027")
            protected String data027;
            @XmlAttribute(name = "Data.028")
            protected String data028;
            @XmlAttribute(name = "Data.029")
            protected String data029;
            @XmlAttribute(name = "Data.030")
            protected String data030;
            @XmlAttribute(name = "Data.031")
            protected String data031;
            @XmlAttribute(name = "Data.032")
            protected String data032;
            @XmlAttribute(name = "Data.033")
            protected String data033;
            @XmlAttribute(name = "Data.034")
            protected String data034;
            @XmlAttribute(name = "Data.035")
            protected String data035;
            @XmlAttribute(name = "Data.036")
            protected String data036;
            @XmlAttribute(name = "Data.037")
            protected String data037;
            @XmlAttribute(name = "Data.038")
            protected String data038;
            @XmlAttribute(name = "Data.039")
            protected String data039;
            @XmlAttribute(name = "Data.040")
            protected String data040;
            @XmlAttribute(name = "Data.041")
            protected String data041;
            @XmlAttribute(name = "Data.042")
            protected String data042;
            @XmlAttribute(name = "Data.043")
            protected String data043;
            @XmlAttribute(name = "Data.044")
            protected String data044;
            @XmlAttribute(name = "Data.045")
            protected String data045;
            @XmlAttribute(name = "Data.046")
            protected String data046;
            @XmlAttribute(name = "Data.047")
            protected String data047;
            @XmlAttribute(name = "Data.048")
            protected String data048;
            @XmlAttribute(name = "Data.049")
            protected String data049;
            @XmlAttribute(name = "Data.050")
            protected String data050;
            @XmlAttribute(name = "Data.051")
            protected String data051;
            @XmlAttribute(name = "Data.052")
            protected String data052;
            @XmlAttribute(name = "Data.053")
            protected String data053;
            @XmlAttribute(name = "Data.054")
            protected String data054;
            @XmlAttribute(name = "Data.055")
            protected String data055;
            @XmlAttribute(name = "Data.056")
            protected String data056;
            @XmlAttribute(name = "Data.057")
            protected String data057;
            @XmlAttribute(name = "Data.058")
            protected String data058;
            @XmlAttribute(name = "Data.059")
            protected String data059;

            /**
             * Gets the value of the data001 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData001() {
                return data001;
            }

            /**
             * Sets the value of the data001 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData001(String value) {
                this.data001 = value;
            }

            /**
             * Gets the value of the data002 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData002() {
                return data002;
            }

            /**
             * Sets the value of the data002 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData002(String value) {
                this.data002 = value;
            }

            /**
             * Gets the value of the data003 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData003() {
                return data003;
            }

            /**
             * Sets the value of the data003 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData003(String value) {
                this.data003 = value;
            }

            /**
             * Gets the value of the data004 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData004() {
                return data004;
            }

            /**
             * Sets the value of the data004 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData004(String value) {
                this.data004 = value;
            }

            /**
             * Gets the value of the data005 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData005() {
                return data005;
            }

            /**
             * Sets the value of the data005 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData005(String value) {
                this.data005 = value;
            }

            /**
             * Gets the value of the data006 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData006() {
                return data006;
            }

            /**
             * Sets the value of the data006 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData006(String value) {
                this.data006 = value;
            }

            /**
             * Gets the value of the data007 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData007() {
                return data007;
            }

            /**
             * Sets the value of the data007 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData007(String value) {
                this.data007 = value;
            }

            /**
             * Gets the value of the data008 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData008() {
                return data008;
            }

            /**
             * Sets the value of the data008 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData008(String value) {
                this.data008 = value;
            }

            /**
             * Gets the value of the data009 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData009() {
                return data009;
            }

            /**
             * Sets the value of the data009 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData009(String value) {
                this.data009 = value;
            }

            /**
             * Gets the value of the data010 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData010() {
                return data010;
            }

            /**
             * Sets the value of the data010 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData010(String value) {
                this.data010 = value;
            }

            /**
             * Gets the value of the data011 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData011() {
                return data011;
            }

            /**
             * Sets the value of the data011 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData011(String value) {
                this.data011 = value;
            }

            /**
             * Gets the value of the data012 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData012() {
                return data012;
            }

            /**
             * Sets the value of the data012 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData012(String value) {
                this.data012 = value;
            }

            /**
             * Gets the value of the data013 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData013() {
                return data013;
            }

            /**
             * Sets the value of the data013 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData013(String value) {
                this.data013 = value;
            }

            /**
             * Gets the value of the data014 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData014() {
                return data014;
            }

            /**
             * Sets the value of the data014 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData014(String value) {
                this.data014 = value;
            }

            /**
             * Gets the value of the data015 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData015() {
                return data015;
            }

            /**
             * Sets the value of the data015 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData015(String value) {
                this.data015 = value;
            }

            /**
             * Gets the value of the data016 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData016() {
                return data016;
            }

            /**
             * Sets the value of the data016 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData016(String value) {
                this.data016 = value;
            }

            /**
             * Gets the value of the data017 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData017() {
                return data017;
            }

            /**
             * Sets the value of the data017 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData017(String value) {
                this.data017 = value;
            }

            /**
             * Gets the value of the data018 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData018() {
                return data018;
            }

            /**
             * Sets the value of the data018 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData018(String value) {
                this.data018 = value;
            }

            /**
             * Gets the value of the data019 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData019() {
                return data019;
            }

            /**
             * Sets the value of the data019 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData019(String value) {
                this.data019 = value;
            }

            /**
             * Gets the value of the data020 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData020() {
                return data020;
            }

            /**
             * Sets the value of the data020 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData020(String value) {
                this.data020 = value;
            }

            /**
             * Gets the value of the data021 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData021() {
                return data021;
            }

            /**
             * Sets the value of the data021 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData021(String value) {
                this.data021 = value;
            }

            /**
             * Gets the value of the data022 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData022() {
                return data022;
            }

            /**
             * Sets the value of the data022 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData022(String value) {
                this.data022 = value;
            }

            /**
             * Gets the value of the data023 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData023() {
                return data023;
            }

            /**
             * Sets the value of the data023 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData023(String value) {
                this.data023 = value;
            }

            /**
             * Gets the value of the data024 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData024() {
                return data024;
            }

            /**
             * Sets the value of the data024 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData024(String value) {
                this.data024 = value;
            }

            /**
             * Gets the value of the data025 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData025() {
                return data025;
            }

            /**
             * Sets the value of the data025 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData025(String value) {
                this.data025 = value;
            }

            /**
             * Gets the value of the data026 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData026() {
                return data026;
            }

            /**
             * Sets the value of the data026 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData026(String value) {
                this.data026 = value;
            }

            /**
             * Gets the value of the data027 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData027() {
                return data027;
            }

            /**
             * Sets the value of the data027 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData027(String value) {
                this.data027 = value;
            }

            /**
             * Gets the value of the data028 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData028() {
                return data028;
            }

            /**
             * Sets the value of the data028 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData028(String value) {
                this.data028 = value;
            }

            /**
             * Gets the value of the data029 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData029() {
                return data029;
            }

            /**
             * Sets the value of the data029 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData029(String value) {
                this.data029 = value;
            }

            /**
             * Gets the value of the data030 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData030() {
                return data030;
            }

            /**
             * Sets the value of the data030 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData030(String value) {
                this.data030 = value;
            }

            /**
             * Gets the value of the data031 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData031() {
                return data031;
            }

            /**
             * Sets the value of the data031 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData031(String value) {
                this.data031 = value;
            }

            /**
             * Gets the value of the data032 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData032() {
                return data032;
            }

            /**
             * Sets the value of the data032 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData032(String value) {
                this.data032 = value;
            }

            /**
             * Gets the value of the data033 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData033() {
                return data033;
            }

            /**
             * Sets the value of the data033 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData033(String value) {
                this.data033 = value;
            }

            /**
             * Gets the value of the data034 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData034() {
                return data034;
            }

            /**
             * Sets the value of the data034 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData034(String value) {
                this.data034 = value;
            }

            /**
             * Gets the value of the data035 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData035() {
                return data035;
            }

            /**
             * Sets the value of the data035 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData035(String value) {
                this.data035 = value;
            }

            /**
             * Gets the value of the data036 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData036() {
                return data036;
            }

            /**
             * Sets the value of the data036 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData036(String value) {
                this.data036 = value;
            }

            /**
             * Gets the value of the data037 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData037() {
                return data037;
            }

            /**
             * Sets the value of the data037 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData037(String value) {
                this.data037 = value;
            }

            /**
             * Gets the value of the data038 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData038() {
                return data038;
            }

            /**
             * Sets the value of the data038 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData038(String value) {
                this.data038 = value;
            }

            /**
             * Gets the value of the data039 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData039() {
                return data039;
            }

            /**
             * Sets the value of the data039 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData039(String value) {
                this.data039 = value;
            }

            /**
             * Gets the value of the data040 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData040() {
                return data040;
            }

            /**
             * Sets the value of the data040 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData040(String value) {
                this.data040 = value;
            }

            /**
             * Gets the value of the data041 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData041() {
                return data041;
            }

            /**
             * Sets the value of the data041 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData041(String value) {
                this.data041 = value;
            }

            /**
             * Gets the value of the data042 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData042() {
                return data042;
            }

            /**
             * Sets the value of the data042 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData042(String value) {
                this.data042 = value;
            }

            /**
             * Gets the value of the data043 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData043() {
                return data043;
            }

            /**
             * Sets the value of the data043 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData043(String value) {
                this.data043 = value;
            }

            /**
             * Gets the value of the data044 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData044() {
                return data044;
            }

            /**
             * Sets the value of the data044 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData044(String value) {
                this.data044 = value;
            }

            /**
             * Gets the value of the data045 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData045() {
                return data045;
            }

            /**
             * Sets the value of the data045 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData045(String value) {
                this.data045 = value;
            }

            /**
             * Gets the value of the data046 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData046() {
                return data046;
            }

            /**
             * Sets the value of the data046 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData046(String value) {
                this.data046 = value;
            }

            /**
             * Gets the value of the data047 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData047() {
                return data047;
            }

            /**
             * Sets the value of the data047 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData047(String value) {
                this.data047 = value;
            }

            /**
             * Gets the value of the data048 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData048() {
                return data048;
            }

            /**
             * Sets the value of the data048 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData048(String value) {
                this.data048 = value;
            }

            /**
             * Gets the value of the data049 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData049() {
                return data049;
            }

            /**
             * Sets the value of the data049 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData049(String value) {
                this.data049 = value;
            }

            /**
             * Gets the value of the data050 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData050() {
                return data050;
            }

            /**
             * Sets the value of the data050 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData050(String value) {
                this.data050 = value;
            }

            /**
             * Gets the value of the data051 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData051() {
                return data051;
            }

            /**
             * Sets the value of the data051 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData051(String value) {
                this.data051 = value;
            }

            /**
             * Gets the value of the data052 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData052() {
                return data052;
            }

            /**
             * Sets the value of the data052 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData052(String value) {
                this.data052 = value;
            }

            /**
             * Gets the value of the data053 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData053() {
                return data053;
            }

            /**
             * Sets the value of the data053 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData053(String value) {
                this.data053 = value;
            }

            /**
             * Gets the value of the data054 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData054() {
                return data054;
            }

            /**
             * Sets the value of the data054 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData054(String value) {
                this.data054 = value;
            }

            /**
             * Gets the value of the data055 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData055() {
                return data055;
            }

            /**
             * Sets the value of the data055 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData055(String value) {
                this.data055 = value;
            }

            /**
             * Gets the value of the data056 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData056() {
                return data056;
            }

            /**
             * Sets the value of the data056 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData056(String value) {
                this.data056 = value;
            }

            /**
             * Gets the value of the data057 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData057() {
                return data057;
            }

            /**
             * Sets the value of the data057 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData057(String value) {
                this.data057 = value;
            }

            /**
             * Gets the value of the data058 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData058() {
                return data058;
            }

            /**
             * Sets the value of the data058 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData058(String value) {
                this.data058 = value;
            }

            /**
             * Gets the value of the data059 property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getData059() {
                return data059;
            }

            /**
             * Sets the value of the data059 property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setData059(String value) {
                this.data059 = value;
            }

        }

    }

}

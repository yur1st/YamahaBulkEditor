
package com.editor.domain.database;

import jakarta.xml.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


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
 *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="VersionNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
 *                           &lt;attribute name="PartsName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="LibraryUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="LibraryFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="LibraryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_002">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ShapeType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Package" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="FdrType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_003">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Setno" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Definition" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="XPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="YPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="FdrIdxStep" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Optimize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="PartsGroupNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="FixCmp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="SwFdr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_012" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_028" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="RlrOffsetE" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="RlrWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="LeadNumE" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="LeadPitchE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="LeadWidthE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="LeadLengthE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_070" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_013" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Thicknesschk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_021" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_071" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="CompIntensity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_072">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="LightSetting" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="LightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_074">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CoplaLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="CoplaThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_076">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="LightMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="MainLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="CoaxsLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="SideLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_310">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DDDExecPass" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDThreNmlCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDThreSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDLightCoaxNmlCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDLightCoaxSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDLightMainSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDLightSideSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDBrightAreaNmlCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDBrightAreaSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDPermitTol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DDDHeightCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_080">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Nozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="XYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="ConvYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="FdrAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="VacChk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="CorrectPos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Action" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="PickStart" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Dump" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Retry" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_081">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PckHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="PckTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="PckSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="PckVLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="PckSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="PckCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="PckCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="NozzleTouchHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_083">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="MntHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MntTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="MntSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="MntPLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="MntSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="MntCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="MntCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_300">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Pck2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Pck2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_301">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Mnt2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Mnt2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_302">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="PckForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="PckForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_303">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="MntForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="MntForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_200">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="DspCType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DNozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Dtimer" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DXpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="DYpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="DspAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DXpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="DYpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="DXtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DYtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_500">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="DipAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="StampAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Marking" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_501">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Option1StationNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Option1WaitVision" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Option1DownSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Option12ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Option1DownSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Option1LowendHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Option1LowendTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="Option1UpSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Option12ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Option1UpSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_502">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Option1ForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Option1ForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Part_520">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="SVUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="SVBringBack" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="SVBodyLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
     * @param value allowed object is
     *              {@link PartsDatabaseFile.LastEditing }
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
     */
    public List<PartsDatabaseFile.Part> getPart() {
        if (part == null) {
            part = new ArrayList<>();
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
     *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="VersionNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LastEditing {

        @XmlAttribute(name = "Date", required = true)
        protected String date;
        @XmlAttribute(name = "Time", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar time;
        @XmlAttribute(name = "VersionNo", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short versionNo;

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
         * @param value allowed object is
         *              {@link String }
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the time property.
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setTime(XMLGregorianCalendar value) {
            this.time = value;
        }

        /**
         * Gets the value of the versionNo property.
         */
        public short getVersionNo() {
            return versionNo;
        }

        /**
         * Sets the value of the versionNo property.
         */
        public void setVersionNo(short value) {
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
     *                 &lt;attribute name="PartsName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="LibraryUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="LibraryFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="LibraryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_002">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ShapeType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Package" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="FdrType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_003">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Setno" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Definition" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="XPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="YPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="FdrIdxStep" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Optimize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="PartsGroupNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="FixCmp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="SwFdr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_012" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_028" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="RlrOffsetE" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="RlrWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="LeadNumE" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="LeadPitchE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="LeadWidthE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="LeadLengthE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_070" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_013" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Thicknesschk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_021" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_071" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="CompIntensity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_072">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="LightSetting" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="LightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_074">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CoplaLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="CoplaThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_076">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="LightMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="MainLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="CoaxsLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="SideLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_310">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DDDExecPass" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDThreNmlCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDThreSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDLightCoaxNmlCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDLightCoaxSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDLightMainSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDLightSideSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDBrightAreaNmlCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDBrightAreaSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDPermitTol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DDDHeightCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_080">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Nozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="XYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="ConvYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="FdrAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="VacChk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="CorrectPos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Action" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="PickStart" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Dump" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Retry" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_081">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PckHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="PckTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="PckSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="PckVLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="PckSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="PckCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="PckCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="NozzleTouchHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_083">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="MntHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MntTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="MntSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="MntPLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="MntSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="MntCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="MntCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_300">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Pck2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Pck2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_301">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Mnt2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Mnt2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_302">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="PckForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="PckForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_303">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="MntForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="MntForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_200">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="DspCType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DNozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Dtimer" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DXpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="DYpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="DspAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DXpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="DYpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="DXtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DYtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_500">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="DipAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="StampAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Marking" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_501">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Option1StationNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Option1WaitVision" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Option1DownSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Option12ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Option1DownSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Option1LowendHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Option1LowendTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="Option1UpSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Option12ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Option1UpSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_502">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Option1ForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Option1ForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Part_520">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="SVUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="SVBringBack" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="SVBodyLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "part001",
            "part002",
            "part003",
            "part012",
            "part028",
            "part070",
            "part013",
            "part021",
            "part071",
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
            "part520"
    })
    public static class Part {

        @XmlElement(name = "Part_001", required = true)
        protected PartsDatabaseFile.Part.Part001 part001;
        @XmlElement(name = "Part_002", required = true)
        protected PartsDatabaseFile.Part.Part002 part002;
        @XmlElement(name = "Part_003", required = true)
        protected PartsDatabaseFile.Part.Part003 part003;
        @XmlElement(name = "Part_012")
        protected PartsDatabaseFile.Part.Part012 part012;
        @XmlElement(name = "Part_028")
        protected PartsDatabaseFile.Part.Part028 part028;
        @XmlElement(name = "Part_070")
        protected PartsDatabaseFile.Part.Part070 part070;
        @XmlElement(name = "Part_013")
        protected PartsDatabaseFile.Part.Part013 part013;
        @XmlElement(name = "Part_021")
        protected PartsDatabaseFile.Part.Part021 part021;
        @XmlElement(name = "Part_071")
        protected PartsDatabaseFile.Part.Part071 part071;
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
        @XmlAttribute(name = "No", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short no;

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
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part001 }
         */
        public void setPart001(PartsDatabaseFile.Part.Part001 value) {
            this.part001 = value;
        }

        /**
         * Gets the value of the part002 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part002 }
         */
        public PartsDatabaseFile.Part.Part002 getPart002() {
            return part002;
        }

        /**
         * Sets the value of the part002 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part002 }
         */
        public void setPart002(PartsDatabaseFile.Part.Part002 value) {
            this.part002 = value;
        }

        /**
         * Gets the value of the part003 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part003 }
         */
        public PartsDatabaseFile.Part.Part003 getPart003() {
            return part003;
        }

        /**
         * Sets the value of the part003 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part003 }
         */
        public void setPart003(PartsDatabaseFile.Part.Part003 value) {
            this.part003 = value;
        }

        /**
         * Gets the value of the part012 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part012 }
         */
        public PartsDatabaseFile.Part.Part012 getPart012() {
            return part012;
        }

        /**
         * Sets the value of the part012 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part012 }
         */
        public void setPart012(PartsDatabaseFile.Part.Part012 value) {
            this.part012 = value;
        }

        /**
         * Gets the value of the part028 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part028 }
         */
        public PartsDatabaseFile.Part.Part028 getPart028() {
            return part028;
        }

        /**
         * Sets the value of the part028 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part028 }
         */
        public void setPart028(PartsDatabaseFile.Part.Part028 value) {
            this.part028 = value;
        }

        /**
         * Gets the value of the part070 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part070 }
         */
        public PartsDatabaseFile.Part.Part070 getPart070() {
            return part070;
        }

        /**
         * Sets the value of the part070 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part070 }
         */
        public void setPart070(PartsDatabaseFile.Part.Part070 value) {
            this.part070 = value;
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
         * Gets the value of the part072 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part072 }
         */
        public PartsDatabaseFile.Part.Part072 getPart072() {
            return part072;
        }

        /**
         * Sets the value of the part072 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part072 }
         */
        public void setPart072(PartsDatabaseFile.Part.Part072 value) {
            this.part072 = value;
        }

        /**
         * Gets the value of the part074 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part074 }
         */
        public PartsDatabaseFile.Part.Part074 getPart074() {
            return part074;
        }

        /**
         * Sets the value of the part074 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part074 }
         */
        public void setPart074(PartsDatabaseFile.Part.Part074 value) {
            this.part074 = value;
        }

        /**
         * Gets the value of the part076 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part076 }
         */
        public PartsDatabaseFile.Part.Part076 getPart076() {
            return part076;
        }

        /**
         * Sets the value of the part076 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part076 }
         */
        public void setPart076(PartsDatabaseFile.Part.Part076 value) {
            this.part076 = value;
        }

        /**
         * Gets the value of the part310 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part310 }
         */
        public PartsDatabaseFile.Part.Part310 getPart310() {
            return part310;
        }

        /**
         * Sets the value of the part310 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part310 }
         */
        public void setPart310(PartsDatabaseFile.Part.Part310 value) {
            this.part310 = value;
        }

        /**
         * Gets the value of the part080 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part080 }
         */
        public PartsDatabaseFile.Part.Part080 getPart080() {
            return part080;
        }

        /**
         * Sets the value of the part080 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part080 }
         */
        public void setPart080(PartsDatabaseFile.Part.Part080 value) {
            this.part080 = value;
        }

        /**
         * Gets the value of the part081 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part081 }
         */
        public PartsDatabaseFile.Part.Part081 getPart081() {
            return part081;
        }

        /**
         * Sets the value of the part081 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part081 }
         */
        public void setPart081(PartsDatabaseFile.Part.Part081 value) {
            this.part081 = value;
        }

        /**
         * Gets the value of the part083 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part083 }
         */
        public PartsDatabaseFile.Part.Part083 getPart083() {
            return part083;
        }

        /**
         * Sets the value of the part083 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part083 }
         */
        public void setPart083(PartsDatabaseFile.Part.Part083 value) {
            this.part083 = value;
        }

        /**
         * Gets the value of the part300 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part300 }
         */
        public PartsDatabaseFile.Part.Part300 getPart300() {
            return part300;
        }

        /**
         * Sets the value of the part300 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part300 }
         */
        public void setPart300(PartsDatabaseFile.Part.Part300 value) {
            this.part300 = value;
        }

        /**
         * Gets the value of the part301 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part301 }
         */
        public PartsDatabaseFile.Part.Part301 getPart301() {
            return part301;
        }

        /**
         * Sets the value of the part301 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part301 }
         */
        public void setPart301(PartsDatabaseFile.Part.Part301 value) {
            this.part301 = value;
        }

        /**
         * Gets the value of the part302 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part302 }
         */
        public PartsDatabaseFile.Part.Part302 getPart302() {
            return part302;
        }

        /**
         * Sets the value of the part302 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part302 }
         */
        public void setPart302(PartsDatabaseFile.Part.Part302 value) {
            this.part302 = value;
        }

        /**
         * Gets the value of the part303 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part303 }
         */
        public PartsDatabaseFile.Part.Part303 getPart303() {
            return part303;
        }

        /**
         * Sets the value of the part303 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part303 }
         */
        public void setPart303(PartsDatabaseFile.Part.Part303 value) {
            this.part303 = value;
        }

        /**
         * Gets the value of the part200 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part200 }
         */
        public PartsDatabaseFile.Part.Part200 getPart200() {
            return part200;
        }

        /**
         * Sets the value of the part200 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part200 }
         */
        public void setPart200(PartsDatabaseFile.Part.Part200 value) {
            this.part200 = value;
        }

        /**
         * Gets the value of the part500 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part500 }
         */
        public PartsDatabaseFile.Part.Part500 getPart500() {
            return part500;
        }

        /**
         * Sets the value of the part500 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part500 }
         */
        public void setPart500(PartsDatabaseFile.Part.Part500 value) {
            this.part500 = value;
        }

        /**
         * Gets the value of the part501 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part501 }
         */
        public PartsDatabaseFile.Part.Part501 getPart501() {
            return part501;
        }

        /**
         * Sets the value of the part501 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part501 }
         */
        public void setPart501(PartsDatabaseFile.Part.Part501 value) {
            this.part501 = value;
        }

        /**
         * Gets the value of the part502 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part502 }
         */
        public PartsDatabaseFile.Part.Part502 getPart502() {
            return part502;
        }

        /**
         * Sets the value of the part502 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part502 }
         */
        public void setPart502(PartsDatabaseFile.Part.Part502 value) {
            this.part502 = value;
        }

        /**
         * Gets the value of the part520 property.
         *
         * @return possible object is
         * {@link PartsDatabaseFile.Part.Part520 }
         */
        public PartsDatabaseFile.Part.Part520 getPart520() {
            return part520;
        }

        /**
         * Sets the value of the part520 property.
         *
         * @param value allowed object is
         *              {@link PartsDatabaseFile.Part.Part520 }
         */
        public void setPart520(PartsDatabaseFile.Part.Part520 value) {
            this.part520 = value;
        }

        /**
         * Gets the value of the no property.
         */
        public short getNo() {
            return no;
        }

        /**
         * Sets the value of the no property.
         */
        public void setNo(short value) {
            this.no = value;
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
         *       &lt;attribute name="PartsName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="LibraryUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="LibraryFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="LibraryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part001 {

            @XmlAttribute(name = "PartsName", required = true)
            protected String partsName;
            @XmlAttribute(name = "Comment", required = true)
            protected String comment;
            @XmlAttribute(name = "DatabaseNo", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short databaseNo;
            @XmlAttribute(name = "LibraryUse", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short libraryUse;
            @XmlAttribute(name = "LibraryFolder", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short libraryFolder;
            @XmlAttribute(name = "LibraryPath", required = true)
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
             * @param value allowed object is
             *              {@link String }
             */
            public void setPartsName(String value) {
                this.partsName = value;
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
             * Gets the value of the databaseNo property.
             */
            public short getDatabaseNo() {
                return databaseNo;
            }

            /**
             * Sets the value of the databaseNo property.
             */
            public void setDatabaseNo(short value) {
                this.databaseNo = value;
            }

            /**
             * Gets the value of the libraryUse property.
             */
            public short getLibraryUse() {
                return libraryUse;
            }

            /**
             * Sets the value of the libraryUse property.
             */
            public void setLibraryUse(short value) {
                this.libraryUse = value;
            }

            /**
             * Gets the value of the libraryFolder property.
             */
            public short getLibraryFolder() {
                return libraryFolder;
            }

            /**
             * Sets the value of the libraryFolder property.
             */
            public void setLibraryFolder(short value) {
                this.libraryFolder = value;
            }

            /**
             * Gets the value of the libraryPath property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLibraryPath() {
                return libraryPath;
            }

            /**
             * Sets the value of the libraryPath property.
             *
             * @param value allowed object is
             *              {@link String }
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
         *       &lt;attribute name="ShapeType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Package" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="FdrType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part002 {

            @XmlAttribute(name = "ShapeType", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short shapeType;
            @XmlAttribute(name = "Package", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short _package;
            @XmlAttribute(name = "FdrType", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short fdrType;

            /**
             * Gets the value of the shapeType property.
             */
            public short getShapeType() {
                return shapeType;
            }

            /**
             * Sets the value of the shapeType property.
             */
            public void setShapeType(short value) {
                this.shapeType = value;
            }

            /**
             * Gets the value of the package property.
             */
            public short getPackage() {
                return _package;
            }

            /**
             * Sets the value of the package property.
             */
            public void setPackage(short value) {
                this._package = value;
            }

            /**
             * Gets the value of the fdrType property.
             */
            public short getFdrType() {
                return fdrType;
            }

            /**
             * Sets the value of the fdrType property.
             */
            public void setFdrType(short value) {
                this.fdrType = value;
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
         *       &lt;attribute name="Setno" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Definition" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="XPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="YPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="FdrIdxStep" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Optimize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="PartsGroupNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="FixCmp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="SwFdr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part003 {

            @XmlAttribute(name = "Setno", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short setno;
            @XmlAttribute(name = "Definition", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short definition;
            @XmlAttribute(name = "XPos", required = true)
            protected BigDecimal xPos;
            @XmlAttribute(name = "YPos", required = true)
            protected BigDecimal yPos;
            @XmlAttribute(name = "FdrIdxStep", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short fdrIdxStep;
            @XmlAttribute(name = "Optimize", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short optimize;
            @XmlAttribute(name = "PartsGroupNo", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short partsGroupNo;
            @XmlAttribute(name = "FixCmp", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short fixCmp;
            @XmlAttribute(name = "SwFdr", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short swFdr;

            /**
             * Gets the value of the setno property.
             */
            public short getSetno() {
                return setno;
            }

            /**
             * Sets the value of the setno property.
             */
            public void setSetno(short value) {
                this.setno = value;
            }

            /**
             * Gets the value of the definition property.
             */
            public short getDefinition() {
                return definition;
            }

            /**
             * Sets the value of the definition property.
             */
            public void setDefinition(short value) {
                this.definition = value;
            }

            /**
             * Gets the value of the xPos property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getXPos() {
                return xPos;
            }

            /**
             * Sets the value of the xPos property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setXPos(BigDecimal value) {
                this.xPos = value;
            }

            /**
             * Gets the value of the yPos property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getYPos() {
                return yPos;
            }

            /**
             * Sets the value of the yPos property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setYPos(BigDecimal value) {
                this.yPos = value;
            }

            /**
             * Gets the value of the fdrIdxStep property.
             */
            public short getFdrIdxStep() {
                return fdrIdxStep;
            }

            /**
             * Sets the value of the fdrIdxStep property.
             */
            public void setFdrIdxStep(short value) {
                this.fdrIdxStep = value;
            }

            /**
             * Gets the value of the optimize property.
             */
            public short getOptimize() {
                return optimize;
            }

            /**
             * Sets the value of the optimize property.
             */
            public void setOptimize(short value) {
                this.optimize = value;
            }

            /**
             * Gets the value of the partsGroupNo property.
             */
            public short getPartsGroupNo() {
                return partsGroupNo;
            }

            /**
             * Sets the value of the partsGroupNo property.
             */
            public void setPartsGroupNo(short value) {
                this.partsGroupNo = value;
            }

            /**
             * Gets the value of the fixCmp property.
             */
            public short getFixCmp() {
                return fixCmp;
            }

            /**
             * Sets the value of the fixCmp property.
             */
            public void setFixCmp(short value) {
                this.fixCmp = value;
            }

            /**
             * Gets the value of the swFdr property.
             */
            public short getSwFdr() {
                return swFdr;
            }

            /**
             * Sets the value of the swFdr property.
             */
            public void setSwFdr(short value) {
                this.swFdr = value;
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
         *       &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part012 {

            @XmlAttribute(name = "BodyX", required = true)
            protected BigDecimal bodyX;
            @XmlAttribute(name = "BodyY", required = true)
            protected BigDecimal bodyY;
            @XmlAttribute(name = "BodyZ", required = true)
            protected BigDecimal bodyZ;
            @XmlAttribute(name = "MoldX", required = true)
            protected BigDecimal moldX;
            @XmlAttribute(name = "MoldY", required = true)
            protected BigDecimal moldY;
            @XmlAttribute(name = "MoldZ", required = true)
            protected BigDecimal moldZ;

            /**
             * Gets the value of the bodyX property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getBodyX() {
                return bodyX;
            }

            /**
             * Sets the value of the bodyX property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setBodyX(BigDecimal value) {
                this.bodyX = value;
            }

            /**
             * Gets the value of the bodyY property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getBodyY() {
                return bodyY;
            }

            /**
             * Sets the value of the bodyY property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setBodyY(BigDecimal value) {
                this.bodyY = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setBodyZ(BigDecimal value) {
                this.bodyZ = value;
            }

            /**
             * Gets the value of the moldX property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMoldX() {
                return moldX;
            }

            /**
             * Sets the value of the moldX property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMoldX(BigDecimal value) {
                this.moldX = value;
            }

            /**
             * Gets the value of the moldY property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMoldY() {
                return moldY;
            }

            /**
             * Sets the value of the moldY property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMoldY(BigDecimal value) {
                this.moldY = value;
            }

            /**
             * Gets the value of the moldZ property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMoldZ() {
                return moldZ;
            }

            /**
             * Sets the value of the moldZ property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMoldZ(BigDecimal value) {
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
         *       &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Thicknesschk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part013 {

            @XmlAttribute(name = "BodyX", required = true)
            protected BigDecimal bodyX;
            @XmlAttribute(name = "BodyY", required = true)
            protected BigDecimal bodyY;
            @XmlAttribute(name = "BodyZ", required = true)
            protected BigDecimal bodyZ;
            @XmlAttribute(name = "MoldX", required = true)
            protected BigDecimal moldX;
            @XmlAttribute(name = "MoldY", required = true)
            protected BigDecimal moldY;
            @XmlAttribute(name = "MoldZ", required = true)
            protected BigDecimal moldZ;
            @XmlAttribute(name = "Thicknesschk", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short thicknesschk;

            /**
             * Gets the value of the bodyX property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getBodyX() {
                return bodyX;
            }

            /**
             * Sets the value of the bodyX property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setBodyX(BigDecimal value) {
                this.bodyX = value;
            }

            /**
             * Gets the value of the bodyY property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getBodyY() {
                return bodyY;
            }

            /**
             * Sets the value of the bodyY property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setBodyY(BigDecimal value) {
                this.bodyY = value;
            }

            /**
             * Gets the value of the bodyZ property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getBodyZ() {
                return bodyZ;
            }

            /**
             * Sets the value of the bodyZ property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setBodyZ(BigDecimal value) {
                this.bodyZ = value;
            }

            /**
             * Gets the value of the moldX property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMoldX() {
                return moldX;
            }

            /**
             * Sets the value of the moldX property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMoldX(BigDecimal value) {
                this.moldX = value;
            }

            /**
             * Gets the value of the moldY property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMoldY() {
                return moldY;
            }

            /**
             * Sets the value of the moldY property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMoldY(BigDecimal value) {
                this.moldY = value;
            }

            /**
             * Gets the value of the moldZ property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMoldZ() {
                return moldZ;
            }

            /**
             * Sets the value of the moldZ property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMoldZ(BigDecimal value) {
                this.moldZ = value;
            }

            /**
             * Gets the value of the thicknesschk property.
             */
            public short getThicknesschk() {
                return thicknesschk;
            }

            /**
             * Sets the value of the thicknesschk property.
             */
            public void setThicknesschk(short value) {
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
         *       &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part021 {

            @XmlAttribute(name = "RlrOffset", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short rlrOffset;

            /**
             * Gets the value of the rlrOffset property.
             */
            public short getRlrOffset() {
                return rlrOffset;
            }

            /**
             * Sets the value of the rlrOffset property.
             */
            public void setRlrOffset(short value) {
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
         *       &lt;attribute name="RlrOffsetE" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="RlrWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="LeadNumE" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="LeadPitchE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="LeadWidthE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="LeadLengthE" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part028 {

            @XmlAttribute(name = "RlrOffsetE", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short rlrOffsetE;
            @XmlAttribute(name = "RlrWidth", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short rlrWidth;
            @XmlAttribute(name = "LeadNumE", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short leadNumE;
            @XmlAttribute(name = "LeadPitchE", required = true)
            protected BigDecimal leadPitchE;
            @XmlAttribute(name = "LeadWidthE", required = true)
            protected BigDecimal leadWidthE;
            @XmlAttribute(name = "LeadLengthE", required = true)
            protected BigDecimal leadLengthE;

            /**
             * Gets the value of the rlrOffsetE property.
             */
            public short getRlrOffsetE() {
                return rlrOffsetE;
            }

            /**
             * Sets the value of the rlrOffsetE property.
             */
            public void setRlrOffsetE(short value) {
                this.rlrOffsetE = value;
            }

            /**
             * Gets the value of the rlrWidth property.
             */
            public short getRlrWidth() {
                return rlrWidth;
            }

            /**
             * Sets the value of the rlrWidth property.
             */
            public void setRlrWidth(short value) {
                this.rlrWidth = value;
            }

            /**
             * Gets the value of the leadNumE property.
             */
            public short getLeadNumE() {
                return leadNumE;
            }

            /**
             * Sets the value of the leadNumE property.
             */
            public void setLeadNumE(short value) {
                this.leadNumE = value;
            }

            /**
             * Gets the value of the leadPitchE property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getLeadPitchE() {
                return leadPitchE;
            }

            /**
             * Sets the value of the leadPitchE property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setLeadPitchE(BigDecimal value) {
                this.leadPitchE = value;
            }

            /**
             * Gets the value of the leadWidthE property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getLeadWidthE() {
                return leadWidthE;
            }

            /**
             * Sets the value of the leadWidthE property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setLeadWidthE(BigDecimal value) {
                this.leadWidthE = value;
            }

            /**
             * Gets the value of the leadLengthE property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getLeadLengthE() {
                return leadLengthE;
            }

            /**
             * Sets the value of the leadLengthE property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setLeadLengthE(BigDecimal value) {
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
         *       &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part070 {

            @XmlAttribute(name = "Alignment", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short alignment;
            @XmlAttribute(name = "AutoThreshold", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short autoThreshold;
            @XmlAttribute(name = "Threshold", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short threshold;
            @XmlAttribute(name = "Tolerance", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short tolerance;
            @XmlAttribute(name = "SearchArea", required = true)
            protected BigDecimal searchArea;
            @XmlAttribute(name = "DatumAngle", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short datumAngle;
            @XmlAttribute(name = "MultiMACS", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short multiMACS;

            /**
             * Gets the value of the alignment property.
             */
            public short getAlignment() {
                return alignment;
            }

            /**
             * Sets the value of the alignment property.
             */
            public void setAlignment(short value) {
                this.alignment = value;
            }

            /**
             * Gets the value of the autoThreshold property.
             */
            public short getAutoThreshold() {
                return autoThreshold;
            }

            /**
             * Sets the value of the autoThreshold property.
             */
            public void setAutoThreshold(short value) {
                this.autoThreshold = value;
            }

            /**
             * Gets the value of the threshold property.
             */
            public short getThreshold() {
                return threshold;
            }

            /**
             * Sets the value of the threshold property.
             */
            public void setThreshold(short value) {
                this.threshold = value;
            }

            /**
             * Gets the value of the tolerance property.
             */
            public short getTolerance() {
                return tolerance;
            }

            /**
             * Sets the value of the tolerance property.
             */
            public void setTolerance(short value) {
                this.tolerance = value;
            }

            /**
             * Gets the value of the searchArea property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getSearchArea() {
                return searchArea;
            }

            /**
             * Sets the value of the searchArea property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setSearchArea(BigDecimal value) {
                this.searchArea = value;
            }

            /**
             * Gets the value of the datumAngle property.
             */
            public short getDatumAngle() {
                return datumAngle;
            }

            /**
             * Sets the value of the datumAngle property.
             */
            public void setDatumAngle(short value) {
                this.datumAngle = value;
            }

            /**
             * Gets the value of the multiMACS property.
             */
            public short getMultiMACS() {
                return multiMACS;
            }

            /**
             * Sets the value of the multiMACS property.
             */
            public void setMultiMACS(short value) {
                this.multiMACS = value;
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
         *       &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="CompIntensity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part071 {

            @XmlAttribute(name = "Alignment", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short alignment;
            @XmlAttribute(name = "AutoThreshold", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short autoThreshold;
            @XmlAttribute(name = "Threshold", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short threshold;
            @XmlAttribute(name = "Tolerance", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short tolerance;
            @XmlAttribute(name = "SearchArea", required = true)
            protected BigDecimal searchArea;
            @XmlAttribute(name = "DatumAngle", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short datumAngle;
            @XmlAttribute(name = "CompIntensity", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short compIntensity;
            @XmlAttribute(name = "MultiMACS", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short multiMACS;

            /**
             * Gets the value of the alignment property.
             */
            public short getAlignment() {
                return alignment;
            }

            /**
             * Sets the value of the alignment property.
             */
            public void setAlignment(short value) {
                this.alignment = value;
            }

            /**
             * Gets the value of the autoThreshold property.
             */
            public short getAutoThreshold() {
                return autoThreshold;
            }

            /**
             * Sets the value of the autoThreshold property.
             */
            public void setAutoThreshold(short value) {
                this.autoThreshold = value;
            }

            /**
             * Gets the value of the threshold property.
             */
            public short getThreshold() {
                return threshold;
            }

            /**
             * Sets the value of the threshold property.
             */
            public void setThreshold(short value) {
                this.threshold = value;
            }

            /**
             * Gets the value of the tolerance property.
             */
            public short getTolerance() {
                return tolerance;
            }

            /**
             * Sets the value of the tolerance property.
             */
            public void setTolerance(short value) {
                this.tolerance = value;
            }

            /**
             * Gets the value of the searchArea property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getSearchArea() {
                return searchArea;
            }

            /**
             * Sets the value of the searchArea property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setSearchArea(BigDecimal value) {
                this.searchArea = value;
            }

            /**
             * Gets the value of the datumAngle property.
             */
            public short getDatumAngle() {
                return datumAngle;
            }

            /**
             * Sets the value of the datumAngle property.
             */
            public void setDatumAngle(short value) {
                this.datumAngle = value;
            }

            /**
             * Gets the value of the compIntensity property.
             */
            public short getCompIntensity() {
                return compIntensity;
            }

            /**
             * Sets the value of the compIntensity property.
             */
            public void setCompIntensity(short value) {
                this.compIntensity = value;
            }

            /**
             * Gets the value of the multiMACS property.
             */
            public short getMultiMACS() {
                return multiMACS;
            }

            /**
             * Sets the value of the multiMACS property.
             */
            public void setMultiMACS(short value) {
                this.multiMACS = value;
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
         *       &lt;attribute name="LightSetting" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="LightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part072 {

            @XmlAttribute(name = "LightSetting", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short lightSetting;
            @XmlAttribute(name = "LightLevel", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short lightLevel;

            /**
             * Gets the value of the lightSetting property.
             */
            public short getLightSetting() {
                return lightSetting;
            }

            /**
             * Sets the value of the lightSetting property.
             */
            public void setLightSetting(short value) {
                this.lightSetting = value;
            }

            /**
             * Gets the value of the lightLevel property.
             */
            public short getLightLevel() {
                return lightLevel;
            }

            /**
             * Sets the value of the lightLevel property.
             */
            public void setLightLevel(short value) {
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
         *       &lt;attribute name="CoplaLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="CoplaThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part074 {

            @XmlAttribute(name = "CoplaLevel", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short coplaLevel;
            @XmlAttribute(name = "CoplaThreshold", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short coplaThreshold;

            /**
             * Gets the value of the coplaLevel property.
             */
            public short getCoplaLevel() {
                return coplaLevel;
            }

            /**
             * Sets the value of the coplaLevel property.
             */
            public void setCoplaLevel(short value) {
                this.coplaLevel = value;
            }

            /**
             * Gets the value of the coplaThreshold property.
             */
            public short getCoplaThreshold() {
                return coplaThreshold;
            }

            /**
             * Sets the value of the coplaThreshold property.
             */
            public void setCoplaThreshold(short value) {
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
         *       &lt;attribute name="LightMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="MainLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="CoaxsLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="SideLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part076 {

            @XmlAttribute(name = "LightMode", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short lightMode;
            @XmlAttribute(name = "MainLightLevel", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short mainLightLevel;
            @XmlAttribute(name = "CoaxsLightLevel", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short coaxsLightLevel;
            @XmlAttribute(name = "SideLightLevel", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short sideLightLevel;

            /**
             * Gets the value of the lightMode property.
             */
            public short getLightMode() {
                return lightMode;
            }

            /**
             * Sets the value of the lightMode property.
             */
            public void setLightMode(short value) {
                this.lightMode = value;
            }

            /**
             * Gets the value of the mainLightLevel property.
             */
            public short getMainLightLevel() {
                return mainLightLevel;
            }

            /**
             * Sets the value of the mainLightLevel property.
             */
            public void setMainLightLevel(short value) {
                this.mainLightLevel = value;
            }

            /**
             * Gets the value of the coaxsLightLevel property.
             */
            public short getCoaxsLightLevel() {
                return coaxsLightLevel;
            }

            /**
             * Sets the value of the coaxsLightLevel property.
             */
            public void setCoaxsLightLevel(short value) {
                this.coaxsLightLevel = value;
            }

            /**
             * Gets the value of the sideLightLevel property.
             */
            public short getSideLightLevel() {
                return sideLightLevel;
            }

            /**
             * Sets the value of the sideLightLevel property.
             */
            public void setSideLightLevel(short value) {
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
         *       &lt;attribute name="Nozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="XYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="ConvYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="FdrAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="VacChk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="CorrectPos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Action" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="PickStart" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Dump" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Retry" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part080 {

            @XmlAttribute(name = "Nozzle", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short nozzle;
            @XmlAttribute(name = "XYSpeed", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short xySpeed;
            @XmlAttribute(name = "ConvYSpeed", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short convYSpeed;
            @XmlAttribute(name = "FdrAngle", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short fdrAngle;
            @XmlAttribute(name = "VacChk", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short vacChk;
            @XmlAttribute(name = "CorrectPos", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short correctPos;
            @XmlAttribute(name = "Action", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short action;
            @XmlAttribute(name = "PickStart", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short pickStart;
            @XmlAttribute(name = "Dump", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dump;
            @XmlAttribute(name = "Retry", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short retry;

            /**
             * Gets the value of the nozzle property.
             */
            public short getNozzle() {
                return nozzle;
            }

            /**
             * Sets the value of the nozzle property.
             */
            public void setNozzle(short value) {
                this.nozzle = value;
            }

            /**
             * Gets the value of the xySpeed property.
             */
            public short getXYSpeed() {
                return xySpeed;
            }

            /**
             * Sets the value of the xySpeed property.
             */
            public void setXYSpeed(short value) {
                this.xySpeed = value;
            }

            /**
             * Gets the value of the convYSpeed property.
             */
            public short getConvYSpeed() {
                return convYSpeed;
            }

            /**
             * Sets the value of the convYSpeed property.
             */
            public void setConvYSpeed(short value) {
                this.convYSpeed = value;
            }

            /**
             * Gets the value of the fdrAngle property.
             */
            public short getFdrAngle() {
                return fdrAngle;
            }

            /**
             * Sets the value of the fdrAngle property.
             */
            public void setFdrAngle(short value) {
                this.fdrAngle = value;
            }

            /**
             * Gets the value of the vacChk property.
             */
            public short getVacChk() {
                return vacChk;
            }

            /**
             * Sets the value of the vacChk property.
             */
            public void setVacChk(short value) {
                this.vacChk = value;
            }

            /**
             * Gets the value of the correctPos property.
             */
            public short getCorrectPos() {
                return correctPos;
            }

            /**
             * Sets the value of the correctPos property.
             */
            public void setCorrectPos(short value) {
                this.correctPos = value;
            }

            /**
             * Gets the value of the action property.
             */
            public short getAction() {
                return action;
            }

            /**
             * Sets the value of the action property.
             */
            public void setAction(short value) {
                this.action = value;
            }

            /**
             * Gets the value of the pickStart property.
             */
            public short getPickStart() {
                return pickStart;
            }

            /**
             * Sets the value of the pickStart property.
             */
            public void setPickStart(short value) {
                this.pickStart = value;
            }

            /**
             * Gets the value of the dump property.
             */
            public short getDump() {
                return dump;
            }

            /**
             * Sets the value of the dump property.
             */
            public void setDump(short value) {
                this.dump = value;
            }

            /**
             * Gets the value of the retry property.
             */
            public short getRetry() {
                return retry;
            }

            /**
             * Sets the value of the retry property.
             */
            public void setRetry(short value) {
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
         *       &lt;attribute name="PckHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="PckTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="PckSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="PckVLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="PckSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="PckCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="PckCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="NozzleTouchHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part081 {

            @XmlAttribute(name = "PckHeight", required = true)
            protected BigDecimal pckHeight;
            @XmlAttribute(name = "PckTimer", required = true)
            protected BigDecimal pckTimer;
            @XmlAttribute(name = "PckSpeed", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short pckSpeed;
            @XmlAttribute(name = "PckVLevel", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short pckVLevel;
            @XmlAttribute(name = "PckSingleDir", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short pckSingleDir;
            @XmlAttribute(name = "PckCtrlDown", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short pckCtrlDown;
            @XmlAttribute(name = "PckCtrlUp", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short pckCtrlUp;
            @XmlAttribute(name = "NozzleTouchHeight", required = true)
            protected BigDecimal nozzleTouchHeight;

            /**
             * Gets the value of the pckHeight property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getPckHeight() {
                return pckHeight;
            }

            /**
             * Sets the value of the pckHeight property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setPckHeight(BigDecimal value) {
                this.pckHeight = value;
            }

            /**
             * Gets the value of the pckTimer property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getPckTimer() {
                return pckTimer;
            }

            /**
             * Sets the value of the pckTimer property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setPckTimer(BigDecimal value) {
                this.pckTimer = value;
            }

            /**
             * Gets the value of the pckSpeed property.
             */
            public short getPckSpeed() {
                return pckSpeed;
            }

            /**
             * Sets the value of the pckSpeed property.
             */
            public void setPckSpeed(short value) {
                this.pckSpeed = value;
            }

            /**
             * Gets the value of the pckVLevel property.
             */
            public short getPckVLevel() {
                return pckVLevel;
            }

            /**
             * Sets the value of the pckVLevel property.
             */
            public void setPckVLevel(short value) {
                this.pckVLevel = value;
            }

            /**
             * Gets the value of the pckSingleDir property.
             */
            public short getPckSingleDir() {
                return pckSingleDir;
            }

            /**
             * Sets the value of the pckSingleDir property.
             */
            public void setPckSingleDir(short value) {
                this.pckSingleDir = value;
            }

            /**
             * Gets the value of the pckCtrlDown property.
             */
            public short getPckCtrlDown() {
                return pckCtrlDown;
            }

            /**
             * Sets the value of the pckCtrlDown property.
             */
            public void setPckCtrlDown(short value) {
                this.pckCtrlDown = value;
            }

            /**
             * Gets the value of the pckCtrlUp property.
             */
            public short getPckCtrlUp() {
                return pckCtrlUp;
            }

            /**
             * Sets the value of the pckCtrlUp property.
             */
            public void setPckCtrlUp(short value) {
                this.pckCtrlUp = value;
            }

            /**
             * Gets the value of the nozzleTouchHeight property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getNozzleTouchHeight() {
                return nozzleTouchHeight;
            }

            /**
             * Sets the value of the nozzleTouchHeight property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setNozzleTouchHeight(BigDecimal value) {
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
         *       &lt;attribute name="MntHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MntTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="MntSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="MntPLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="MntSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="MntCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="MntCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part083 {

            @XmlAttribute(name = "MntHeight", required = true)
            protected BigDecimal mntHeight;
            @XmlAttribute(name = "MntTimer", required = true)
            protected BigDecimal mntTimer;
            @XmlAttribute(name = "MntSpeed", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short mntSpeed;
            @XmlAttribute(name = "MntPLevel", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short mntPLevel;
            @XmlAttribute(name = "MntSingleDir", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short mntSingleDir;
            @XmlAttribute(name = "MntCtrlDown", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short mntCtrlDown;
            @XmlAttribute(name = "MntCtrlUp", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short mntCtrlUp;

            /**
             * Gets the value of the mntHeight property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMntHeight() {
                return mntHeight;
            }

            /**
             * Sets the value of the mntHeight property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMntHeight(BigDecimal value) {
                this.mntHeight = value;
            }

            /**
             * Gets the value of the mntTimer property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMntTimer() {
                return mntTimer;
            }

            /**
             * Sets the value of the mntTimer property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMntTimer(BigDecimal value) {
                this.mntTimer = value;
            }

            /**
             * Gets the value of the mntSpeed property.
             */
            public short getMntSpeed() {
                return mntSpeed;
            }

            /**
             * Sets the value of the mntSpeed property.
             */
            public void setMntSpeed(short value) {
                this.mntSpeed = value;
            }

            /**
             * Gets the value of the mntPLevel property.
             */
            public short getMntPLevel() {
                return mntPLevel;
            }

            /**
             * Sets the value of the mntPLevel property.
             */
            public void setMntPLevel(short value) {
                this.mntPLevel = value;
            }

            /**
             * Gets the value of the mntSingleDir property.
             */
            public short getMntSingleDir() {
                return mntSingleDir;
            }

            /**
             * Sets the value of the mntSingleDir property.
             */
            public void setMntSingleDir(short value) {
                this.mntSingleDir = value;
            }

            /**
             * Gets the value of the mntCtrlDown property.
             */
            public short getMntCtrlDown() {
                return mntCtrlDown;
            }

            /**
             * Sets the value of the mntCtrlDown property.
             */
            public void setMntCtrlDown(short value) {
                this.mntCtrlDown = value;
            }

            /**
             * Gets the value of the mntCtrlUp property.
             */
            public short getMntCtrlUp() {
                return mntCtrlUp;
            }

            /**
             * Sets the value of the mntCtrlUp property.
             */
            public void setMntCtrlUp(short value) {
                this.mntCtrlUp = value;
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
         *       &lt;attribute name="DspCType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DNozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Dtimer" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DXpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="DYpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="DspAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DXpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="DYpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="DXtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DYtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part200 {

            @XmlAttribute(name = "DspCType", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dspCType;
            @XmlAttribute(name = "DNozzle", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dNozzle;
            @XmlAttribute(name = "Dtimer", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dtimer;
            @XmlAttribute(name = "DXpos", required = true)
            protected BigDecimal dXpos;
            @XmlAttribute(name = "DYpos", required = true)
            protected BigDecimal dYpos;
            @XmlAttribute(name = "DspAngle", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dspAngle;
            @XmlAttribute(name = "DXpt", required = true)
            protected BigDecimal dXpt;
            @XmlAttribute(name = "DYpt", required = true)
            protected BigDecimal dYpt;
            @XmlAttribute(name = "DXtime", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dXtime;
            @XmlAttribute(name = "DYtime", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dYtime;

            /**
             * Gets the value of the dspCType property.
             */
            public short getDspCType() {
                return dspCType;
            }

            /**
             * Sets the value of the dspCType property.
             */
            public void setDspCType(short value) {
                this.dspCType = value;
            }

            /**
             * Gets the value of the dNozzle property.
             */
            public short getDNozzle() {
                return dNozzle;
            }

            /**
             * Sets the value of the dNozzle property.
             */
            public void setDNozzle(short value) {
                this.dNozzle = value;
            }

            /**
             * Gets the value of the dtimer property.
             */
            public short getDtimer() {
                return dtimer;
            }

            /**
             * Sets the value of the dtimer property.
             */
            public void setDtimer(short value) {
                this.dtimer = value;
            }

            /**
             * Gets the value of the dXpos property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getDXpos() {
                return dXpos;
            }

            /**
             * Sets the value of the dXpos property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setDXpos(BigDecimal value) {
                this.dXpos = value;
            }

            /**
             * Gets the value of the dYpos property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getDYpos() {
                return dYpos;
            }

            /**
             * Sets the value of the dYpos property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setDYpos(BigDecimal value) {
                this.dYpos = value;
            }

            /**
             * Gets the value of the dspAngle property.
             */
            public short getDspAngle() {
                return dspAngle;
            }

            /**
             * Sets the value of the dspAngle property.
             */
            public void setDspAngle(short value) {
                this.dspAngle = value;
            }

            /**
             * Gets the value of the dXpt property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getDXpt() {
                return dXpt;
            }

            /**
             * Sets the value of the dXpt property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setDXpt(BigDecimal value) {
                this.dXpt = value;
            }

            /**
             * Gets the value of the dYpt property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getDYpt() {
                return dYpt;
            }

            /**
             * Sets the value of the dYpt property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setDYpt(BigDecimal value) {
                this.dYpt = value;
            }

            /**
             * Gets the value of the dXtime property.
             */
            public short getDXtime() {
                return dXtime;
            }

            /**
             * Sets the value of the dXtime property.
             */
            public void setDXtime(short value) {
                this.dXtime = value;
            }

            /**
             * Gets the value of the dYtime property.
             */
            public short getDYtime() {
                return dYtime;
            }

            /**
             * Sets the value of the dYtime property.
             */
            public void setDYtime(short value) {
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
         *       &lt;attribute name="Pck2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Pck2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part300 {

            @XmlAttribute(name = "Pck2ndSrvDown", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short pck2NdSrvDown;
            @XmlAttribute(name = "Pck2ndSrvUp", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short pck2NdSrvUp;

            /**
             * Gets the value of the pck2NdSrvDown property.
             */
            public short getPck2NdSrvDown() {
                return pck2NdSrvDown;
            }

            /**
             * Sets the value of the pck2NdSrvDown property.
             */
            public void setPck2NdSrvDown(short value) {
                this.pck2NdSrvDown = value;
            }

            /**
             * Gets the value of the pck2NdSrvUp property.
             */
            public short getPck2NdSrvUp() {
                return pck2NdSrvUp;
            }

            /**
             * Sets the value of the pck2NdSrvUp property.
             */
            public void setPck2NdSrvUp(short value) {
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
         *       &lt;attribute name="Mnt2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Mnt2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part301 {

            @XmlAttribute(name = "Mnt2ndSrvDown", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short mnt2NdSrvDown;
            @XmlAttribute(name = "Mnt2ndSrvUp", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short mnt2NdSrvUp;

            /**
             * Gets the value of the mnt2NdSrvDown property.
             */
            public short getMnt2NdSrvDown() {
                return mnt2NdSrvDown;
            }

            /**
             * Sets the value of the mnt2NdSrvDown property.
             */
            public void setMnt2NdSrvDown(short value) {
                this.mnt2NdSrvDown = value;
            }

            /**
             * Gets the value of the mnt2NdSrvUp property.
             */
            public short getMnt2NdSrvUp() {
                return mnt2NdSrvUp;
            }

            /**
             * Sets the value of the mnt2NdSrvUp property.
             */
            public void setMnt2NdSrvUp(short value) {
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
         *       &lt;attribute name="PckForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="PckForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part302 {

            @XmlAttribute(name = "PckForceExist", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short pckForceExist;
            @XmlAttribute(name = "PckForceTarget", required = true)
            protected BigDecimal pckForceTarget;

            /**
             * Gets the value of the pckForceExist property.
             */
            public short getPckForceExist() {
                return pckForceExist;
            }

            /**
             * Sets the value of the pckForceExist property.
             */
            public void setPckForceExist(short value) {
                this.pckForceExist = value;
            }

            /**
             * Gets the value of the pckForceTarget property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getPckForceTarget() {
                return pckForceTarget;
            }

            /**
             * Sets the value of the pckForceTarget property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setPckForceTarget(BigDecimal value) {
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
         *       &lt;attribute name="MntForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="MntForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part303 {

            @XmlAttribute(name = "MntForceExist", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short mntForceExist;
            @XmlAttribute(name = "MntForceTarget", required = true)
            protected BigDecimal mntForceTarget;

            /**
             * Gets the value of the mntForceExist property.
             */
            public short getMntForceExist() {
                return mntForceExist;
            }

            /**
             * Sets the value of the mntForceExist property.
             */
            public void setMntForceExist(short value) {
                this.mntForceExist = value;
            }

            /**
             * Gets the value of the mntForceTarget property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMntForceTarget() {
                return mntForceTarget;
            }

            /**
             * Sets the value of the mntForceTarget property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMntForceTarget(BigDecimal value) {
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
         *       &lt;attribute name="DDDExecPass" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDThreNmlCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDThreSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDLightCoaxNmlCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDLightCoaxSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDLightMainSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDLightSideSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDBrightAreaNmlCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDBrightAreaSlantCam" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDPermitTol" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DDDHeightCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part310 {

            @XmlAttribute(name = "DDDExecPass", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddExecPass;
            @XmlAttribute(name = "DDDThreNmlCam", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddThreNmlCam;
            @XmlAttribute(name = "DDDThreSlantCam", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddThreSlantCam;
            @XmlAttribute(name = "DDDLightCoaxNmlCam", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddLightCoaxNmlCam;
            @XmlAttribute(name = "DDDLightCoaxSlantCam", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddLightCoaxSlantCam;
            @XmlAttribute(name = "DDDLightMainSlantCam", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddLightMainSlantCam;
            @XmlAttribute(name = "DDDLightSideSlantCam", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddLightSideSlantCam;
            @XmlAttribute(name = "DDDBrightAreaNmlCam", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddBrightAreaNmlCam;
            @XmlAttribute(name = "DDDBrightAreaSlantCam", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddBrightAreaSlantCam;
            @XmlAttribute(name = "DDDPermitTol", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dddPermitTol;
            @XmlAttribute(name = "DDDHeightCheck", required = true)
            protected BigDecimal dddHeightCheck;

            /**
             * Gets the value of the dddExecPass property.
             */
            public short getDDDExecPass() {
                return dddExecPass;
            }

            /**
             * Sets the value of the dddExecPass property.
             */
            public void setDDDExecPass(short value) {
                this.dddExecPass = value;
            }

            /**
             * Gets the value of the dddThreNmlCam property.
             */
            public short getDDDThreNmlCam() {
                return dddThreNmlCam;
            }

            /**
             * Sets the value of the dddThreNmlCam property.
             */
            public void setDDDThreNmlCam(short value) {
                this.dddThreNmlCam = value;
            }

            /**
             * Gets the value of the dddThreSlantCam property.
             */
            public short getDDDThreSlantCam() {
                return dddThreSlantCam;
            }

            /**
             * Sets the value of the dddThreSlantCam property.
             */
            public void setDDDThreSlantCam(short value) {
                this.dddThreSlantCam = value;
            }

            /**
             * Gets the value of the dddLightCoaxNmlCam property.
             */
            public short getDDDLightCoaxNmlCam() {
                return dddLightCoaxNmlCam;
            }

            /**
             * Sets the value of the dddLightCoaxNmlCam property.
             */
            public void setDDDLightCoaxNmlCam(short value) {
                this.dddLightCoaxNmlCam = value;
            }

            /**
             * Gets the value of the dddLightCoaxSlantCam property.
             */
            public short getDDDLightCoaxSlantCam() {
                return dddLightCoaxSlantCam;
            }

            /**
             * Sets the value of the dddLightCoaxSlantCam property.
             */
            public void setDDDLightCoaxSlantCam(short value) {
                this.dddLightCoaxSlantCam = value;
            }

            /**
             * Gets the value of the dddLightMainSlantCam property.
             */
            public short getDDDLightMainSlantCam() {
                return dddLightMainSlantCam;
            }

            /**
             * Sets the value of the dddLightMainSlantCam property.
             */
            public void setDDDLightMainSlantCam(short value) {
                this.dddLightMainSlantCam = value;
            }

            /**
             * Gets the value of the dddLightSideSlantCam property.
             */
            public short getDDDLightSideSlantCam() {
                return dddLightSideSlantCam;
            }

            /**
             * Sets the value of the dddLightSideSlantCam property.
             */
            public void setDDDLightSideSlantCam(short value) {
                this.dddLightSideSlantCam = value;
            }

            /**
             * Gets the value of the dddBrightAreaNmlCam property.
             */
            public short getDDDBrightAreaNmlCam() {
                return dddBrightAreaNmlCam;
            }

            /**
             * Sets the value of the dddBrightAreaNmlCam property.
             */
            public void setDDDBrightAreaNmlCam(short value) {
                this.dddBrightAreaNmlCam = value;
            }

            /**
             * Gets the value of the dddBrightAreaSlantCam property.
             */
            public short getDDDBrightAreaSlantCam() {
                return dddBrightAreaSlantCam;
            }

            /**
             * Sets the value of the dddBrightAreaSlantCam property.
             */
            public void setDDDBrightAreaSlantCam(short value) {
                this.dddBrightAreaSlantCam = value;
            }

            /**
             * Gets the value of the dddPermitTol property.
             */
            public short getDDDPermitTol() {
                return dddPermitTol;
            }

            /**
             * Sets the value of the dddPermitTol property.
             */
            public void setDDDPermitTol(short value) {
                this.dddPermitTol = value;
            }

            /**
             * Gets the value of the dddHeightCheck property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getDDDHeightCheck() {
                return dddHeightCheck;
            }

            /**
             * Sets the value of the dddHeightCheck property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setDDDHeightCheck(BigDecimal value) {
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
         *       &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="DipAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="StampAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Marking" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part500 {

            @XmlAttribute(name = "Category", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short category;
            @XmlAttribute(name = "DipAct", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short dipAct;
            @XmlAttribute(name = "StampAct", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short stampAct;
            @XmlAttribute(name = "Marking", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short marking;

            /**
             * Gets the value of the category property.
             */
            public short getCategory() {
                return category;
            }

            /**
             * Sets the value of the category property.
             */
            public void setCategory(short value) {
                this.category = value;
            }

            /**
             * Gets the value of the dipAct property.
             */
            public short getDipAct() {
                return dipAct;
            }

            /**
             * Sets the value of the dipAct property.
             */
            public void setDipAct(short value) {
                this.dipAct = value;
            }

            /**
             * Gets the value of the stampAct property.
             */
            public short getStampAct() {
                return stampAct;
            }

            /**
             * Sets the value of the stampAct property.
             */
            public void setStampAct(short value) {
                this.stampAct = value;
            }

            /**
             * Gets the value of the marking property.
             */
            public short getMarking() {
                return marking;
            }

            /**
             * Sets the value of the marking property.
             */
            public void setMarking(short value) {
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
         *       &lt;attribute name="Option1StationNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Option1WaitVision" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Option1DownSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Option12ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Option1DownSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Option1LowendHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Option1LowendTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="Option1UpSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Option12ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Option1UpSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part501 {

            @XmlAttribute(name = "Option1StationNo", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short option1StationNo;
            @XmlAttribute(name = "Option1WaitVision", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short option1WaitVision;
            @XmlAttribute(name = "Option1DownSequenceAir", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short option1DownSequenceAir;
            @XmlAttribute(name = "Option12ndSrvDown", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short option12NdSrvDown;
            @XmlAttribute(name = "Option1DownSpeed", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short option1DownSpeed;
            @XmlAttribute(name = "Option1LowendHeight", required = true)
            protected BigDecimal option1LowendHeight;
            @XmlAttribute(name = "Option1LowendTimer", required = true)
            protected BigDecimal option1LowendTimer;
            @XmlAttribute(name = "Option1UpSequenceAir", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short option1UpSequenceAir;
            @XmlAttribute(name = "Option12ndSrvUp", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short option12NdSrvUp;
            @XmlAttribute(name = "Option1UpSpeed", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short option1UpSpeed;

            /**
             * Gets the value of the option1StationNo property.
             */
            public short getOption1StationNo() {
                return option1StationNo;
            }

            /**
             * Sets the value of the option1StationNo property.
             */
            public void setOption1StationNo(short value) {
                this.option1StationNo = value;
            }

            /**
             * Gets the value of the option1WaitVision property.
             */
            public short getOption1WaitVision() {
                return option1WaitVision;
            }

            /**
             * Sets the value of the option1WaitVision property.
             */
            public void setOption1WaitVision(short value) {
                this.option1WaitVision = value;
            }

            /**
             * Gets the value of the option1DownSequenceAir property.
             */
            public short getOption1DownSequenceAir() {
                return option1DownSequenceAir;
            }

            /**
             * Sets the value of the option1DownSequenceAir property.
             */
            public void setOption1DownSequenceAir(short value) {
                this.option1DownSequenceAir = value;
            }

            /**
             * Gets the value of the option12NdSrvDown property.
             */
            public short getOption12NdSrvDown() {
                return option12NdSrvDown;
            }

            /**
             * Sets the value of the option12NdSrvDown property.
             */
            public void setOption12NdSrvDown(short value) {
                this.option12NdSrvDown = value;
            }

            /**
             * Gets the value of the option1DownSpeed property.
             */
            public short getOption1DownSpeed() {
                return option1DownSpeed;
            }

            /**
             * Sets the value of the option1DownSpeed property.
             */
            public void setOption1DownSpeed(short value) {
                this.option1DownSpeed = value;
            }

            /**
             * Gets the value of the option1LowendHeight property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getOption1LowendHeight() {
                return option1LowendHeight;
            }

            /**
             * Sets the value of the option1LowendHeight property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setOption1LowendHeight(BigDecimal value) {
                this.option1LowendHeight = value;
            }

            /**
             * Gets the value of the option1LowendTimer property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getOption1LowendTimer() {
                return option1LowendTimer;
            }

            /**
             * Sets the value of the option1LowendTimer property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setOption1LowendTimer(BigDecimal value) {
                this.option1LowendTimer = value;
            }

            /**
             * Gets the value of the option1UpSequenceAir property.
             */
            public short getOption1UpSequenceAir() {
                return option1UpSequenceAir;
            }

            /**
             * Sets the value of the option1UpSequenceAir property.
             */
            public void setOption1UpSequenceAir(short value) {
                this.option1UpSequenceAir = value;
            }

            /**
             * Gets the value of the option12NdSrvUp property.
             */
            public short getOption12NdSrvUp() {
                return option12NdSrvUp;
            }

            /**
             * Sets the value of the option12NdSrvUp property.
             */
            public void setOption12NdSrvUp(short value) {
                this.option12NdSrvUp = value;
            }

            /**
             * Gets the value of the option1UpSpeed property.
             */
            public short getOption1UpSpeed() {
                return option1UpSpeed;
            }

            /**
             * Sets the value of the option1UpSpeed property.
             */
            public void setOption1UpSpeed(short value) {
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
         *       &lt;attribute name="Option1ForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Option1ForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part502 {

            @XmlAttribute(name = "Option1ForceExist", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short option1ForceExist;
            @XmlAttribute(name = "Option1ForceTarget", required = true)
            protected BigDecimal option1ForceTarget;

            /**
             * Gets the value of the option1ForceExist property.
             */
            public short getOption1ForceExist() {
                return option1ForceExist;
            }

            /**
             * Sets the value of the option1ForceExist property.
             */
            public void setOption1ForceExist(short value) {
                this.option1ForceExist = value;
            }

            /**
             * Gets the value of the option1ForceTarget property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getOption1ForceTarget() {
                return option1ForceTarget;
            }

            /**
             * Sets the value of the option1ForceTarget property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setOption1ForceTarget(BigDecimal value) {
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
         *       &lt;attribute name="SVUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="SVBringBack" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="SVBodyLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Part520 {

            @XmlAttribute(name = "SVUse", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short svUse;
            @XmlAttribute(name = "SVBringBack", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short svBringBack;
            @XmlAttribute(name = "SVBodyLimit", required = true)
            protected BigDecimal svBodyLimit;

            /**
             * Gets the value of the svUse property.
             */
            public short getSVUse() {
                return svUse;
            }

            /**
             * Sets the value of the svUse property.
             */
            public void setSVUse(short value) {
                this.svUse = value;
            }

            /**
             * Gets the value of the svBringBack property.
             */
            public short getSVBringBack() {
                return svBringBack;
            }

            /**
             * Sets the value of the svBringBack property.
             */
            public void setSVBringBack(short value) {
                this.svBringBack = value;
            }

            /**
             * Gets the value of the svBodyLimit property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getSVBodyLimit() {
                return svBodyLimit;
            }

            /**
             * Sets the value of the svBodyLimit property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setSVBodyLimit(BigDecimal value) {
                this.svBodyLimit = value;
            }

        }

    }

}

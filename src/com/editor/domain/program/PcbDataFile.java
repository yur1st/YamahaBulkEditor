
package com.editor.domain.program;

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
 *                 &lt;sequence>
 *                   &lt;element name="SetupMachine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="VersionNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Machine">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Property">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="LastEditingDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="LastEditingTime" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                           &lt;attribute name="VersionNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Production">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProductGroup">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Lane" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Board">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Board_000">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="OriginX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="OriginY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="SizeX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="SizeY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="BlockCount" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="SizeZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="TransOffsetU" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="TransOffsetT1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="TransOffsetT2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="BoardStandardCT" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="BoardStandardPlanTime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="CarriedPosCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="CarriedPosCheckValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="CarriedPosCheckDetail" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="CarriedPosCheckMark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="CarriedPosCheckMarkX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="CarriedPosCheckMarkY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="BoardEdgeOffsetDistanceLowerLeft" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="BoardEdgeOffsetDistanceLowerRight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="BoardEdgeOffsetDistanceUpperLeft" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="BoardEdgeOffsetDistanceUpperRight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_101">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="PcbFixWay" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="ConvPreFixTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="TransHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="ConvTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="YSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TransMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="ConvSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="PartHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="ConvTransWay" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TransferOneByOne" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_102">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="MountExec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="VacCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="CoPlanarity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="PrePick" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="RetrySeq" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="SkipRetry" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="PositionFreeSetup" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TrayPre" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="FixedComp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Correct3A" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="InterfereAvoidance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="MountSequenceMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_103">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="BadSortA" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="BadSortB" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="BadSortC" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_104">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_105">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="PreDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="DotDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="DotCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Refresh" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="PosCorDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="PosCorPreDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_106">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="SpecialFunction" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_107">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="PushUpPinSetupManagement" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_108">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="HeadA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA9" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA10" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA11" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA12" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA13" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA14" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA15" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadA16" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_109">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="HeadB1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB9" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB10" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB11" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB12" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB13" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB14" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB15" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="HeadB16" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_110">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="TempControlA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TempControlA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TempControlA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TempControlA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TempControlA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TempControlA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TempControlA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TempControlA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_111">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="TargetTempA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TargetTempA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TargetTempA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TargetTempA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TargetTempA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TargetTempA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TargetTempA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="TargetTempA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Fiducial">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FidUse">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PcbFid">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BlkFid">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BadMark">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BadUse">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PcbBad">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BlkBad">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Offset">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Repeat" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="R" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="OrgBlk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Mounts">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Mount" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="R" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Fid" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Bad" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Comp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Group" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Opt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Opt2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Head" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="PickRod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="MountRod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Nozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="OrgBlk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="MaskDX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="MaskDY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="SeqOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                     &lt;attribute name="GroupID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="GrpOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="CodeScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="MntStage" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Programs">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Program">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Commands" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="LocalPoints" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="Watches" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GlobalPoints" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="PreDispenses" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="DotDispenses" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="PosCorDispenses" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Parts">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Part" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Part_001">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="PartsName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *                                               &lt;attribute name="LibraryUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LibraryFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LibraryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_002">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ShapeType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Package" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="FdrType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="ReelDiameter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="BitFlags" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_062" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="BaseVType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_003">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Setno" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Definition" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="XPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="YPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="FdrIdxStep" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="FdrIdxSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="FeederTimerOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="Optimize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PartsGroupNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="FixCmp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="SwFdr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PitchEffect" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Correct3A" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="UnitNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PickPosCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PickToleranceX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="PickToleranceY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="PickToleranceR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="PickToleranceOffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="PickToleranceOffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="BoardDataTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="ToleranceTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_016" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="OffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="OffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="OffsetR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_023" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_012" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_025" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="RlrWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="LeadLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_033" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LeadNumN" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LeadPitchN" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_034" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LeadNumS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LeadPitchS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_070" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_013" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="Thicknesschk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_021" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_071" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="CompIntensity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_072">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LightSetting" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_074">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="CoplaLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="CoplaThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_076">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LightMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="MainLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="CoaxsLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="SideLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_080">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Nozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="XYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="ConvYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="FdrAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="VacChk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="CorrectPos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Action" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PickStart" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Dump" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Retry" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_081">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="PckHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="PckTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="PckSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PckVLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PckSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PckCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PckCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="NozzleTouchHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_083">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="MntHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MntTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MntSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="MntPLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="MntSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="MntCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="MntCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="MntInsertLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="MntInsertShortDistance" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_300">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Pck2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Pck2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_301">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Mnt2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Mnt2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_302">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="PckForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="PckForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_303">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="MntForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="MntForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_200">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="DspCType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="DNozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Dtimer" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="DXpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="DYpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="DspAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="DXpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="DYpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="DXtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="DYtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_500">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="DipAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="StampAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Marking" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_501">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Option1StationNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option1WaitVision" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option1DownSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option12ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option1DownSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option1LowendHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="Option1LowendTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="Option1UpSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option12ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option1UpSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_502">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Option1ForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Option1ForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Part_520">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="SVUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="SVBringBack" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="SVBodyLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="SVReverseCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Marks">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Mark" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Mark_001">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="MarkName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LibraryUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LibraryFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LibraryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Mark_011">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="MarkType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Shape" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="OutSize" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Mark_100">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Surface" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="SearchAreaX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="SearchAreaY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                               &lt;attribute name="Sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Mark_200">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LightingOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LightingInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LightingDrop" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LightingIROuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="LightingIRInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="FilterInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                               &lt;attribute name="FilterOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CodeScan">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CodeScanUse">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PcbCodeScan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BlkCodeScan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                     &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                     &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;attribute name="MachineType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;attribute name="SubMachineType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                 &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "machine"
})
@XmlRootElement(name = "PcbDataFile")
public class PcbDataFile {

    @XmlElement(name = "LastEditing", required = true)
    protected PcbDataFile.LastEditing lastEditing;
    @XmlElement(name = "Machine", required = true)
    protected PcbDataFile.Machine machine;

    /**
     * Gets the value of the lastEditing property.
     *
     * @return possible object is
     * {@link PcbDataFile.LastEditing }
     */
    public PcbDataFile.LastEditing getLastEditing() {
        return lastEditing;
    }

    /**
     * Sets the value of the lastEditing property.
     *
     * @param value allowed object is
     *              {@link PcbDataFile.LastEditing }
     */
    public void setLastEditing(PcbDataFile.LastEditing value) {
        this.lastEditing = value;
    }

    /**
     * Gets the value of the machine property.
     *
     * @return possible object is
     * {@link PcbDataFile.Machine }
     */
    public PcbDataFile.Machine getMachine() {
        return machine;
    }

    /**
     * Sets the value of the machine property.
     *
     * @param value allowed object is
     *              {@link PcbDataFile.Machine }
     */
    public void setMachine(PcbDataFile.Machine value) {
        this.machine = value;
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
     *         &lt;element name="SetupMachine">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="VersionNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "setupMachine"
    })
    public static class LastEditing {

        @XmlElement(name = "SetupMachine", required = true)
        protected PcbDataFile.LastEditing.SetupMachine setupMachine;
        @XmlAttribute(name = "Date", required = true)
        protected String date;
        @XmlAttribute(name = "Time", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar time;
        @XmlAttribute(name = "VersionNo", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short versionNo;

        /**
         * Gets the value of the setupMachine property.
         *
         * @return possible object is
         * {@link PcbDataFile.LastEditing.SetupMachine }
         */
        public PcbDataFile.LastEditing.SetupMachine getSetupMachine() {
            return setupMachine;
        }

        /**
         * Sets the value of the setupMachine property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.LastEditing.SetupMachine }
         */
        public void setSetupMachine(PcbDataFile.LastEditing.SetupMachine value) {
            this.setupMachine = value;
        }

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


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SetupMachine {

            @XmlAttribute(name = "No", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short no;
            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "ID", required = true)
            @XmlSchemaType(name = "unsignedShort")
            protected int id;

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
             * Gets the value of the name property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             */
            public int getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             */
            public void setID(int value) {
                this.id = value;
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
     *         &lt;element name="Property">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="LastEditingDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="LastEditingTime" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *                 &lt;attribute name="VersionNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Production">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProductGroup">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Lane" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Board">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Board_000">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="OriginX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="OriginY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="SizeX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="SizeY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="BlockCount" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="SizeZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="TransOffsetU" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="TransOffsetT1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="TransOffsetT2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="BoardStandardCT" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="BoardStandardPlanTime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="CarriedPosCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="CarriedPosCheckValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="CarriedPosCheckDetail" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="CarriedPosCheckMark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="CarriedPosCheckMarkX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="CarriedPosCheckMarkY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="BoardEdgeOffsetDistanceLowerLeft" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="BoardEdgeOffsetDistanceLowerRight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="BoardEdgeOffsetDistanceUpperLeft" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="BoardEdgeOffsetDistanceUpperRight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_101">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PcbFixWay" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="ConvPreFixTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="TransHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="ConvTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="YSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TransMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="ConvSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="PartHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="ConvTransWay" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TransferOneByOne" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_102">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="MountExec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="VacCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="CoPlanarity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="PrePick" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="RetrySeq" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="SkipRetry" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="PositionFreeSetup" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TrayPre" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="FixedComp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Correct3A" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="InterfereAvoidance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="MountSequenceMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_103">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="BadSortA" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="BadSortB" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="BadSortC" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_104">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_105">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PreDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="DotDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="DotCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Refresh" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="PosCorDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="PosCorPreDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_106">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="SpecialFunction" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_107">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PushUpPinSetupManagement" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_108">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="HeadA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA9" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA10" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA11" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA12" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA13" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA14" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA15" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadA16" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_109">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="HeadB1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB9" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB10" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB11" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB12" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB13" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB14" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB15" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="HeadB16" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_110">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="TempControlA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TempControlA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TempControlA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TempControlA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TempControlA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TempControlA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TempControlA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TempControlA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_111">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="TargetTempA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TargetTempA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TargetTempA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TargetTempA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TargetTempA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TargetTempA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TargetTempA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="TargetTempA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Fiducial">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FidUse">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PcbFid">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BlkFid">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BadMark">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BadUse">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PcbBad">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BlkBad">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Offset">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Repeat" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="R" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="OrgBlk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Mounts">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Mount" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="R" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Fid" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Bad" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Comp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Group" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Opt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Opt2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Head" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="PickRod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="MountRod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Nozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="OrgBlk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="MaskDX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="MaskDY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="SeqOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                           &lt;attribute name="GroupID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="GrpOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="CodeScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="MntStage" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Programs">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Program">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Commands" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="LocalPoints" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="Watches" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GlobalPoints" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="PreDispenses" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="DotDispenses" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="PosCorDispenses" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Parts">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Part" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Part_001">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="PartsName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
     *                                     &lt;attribute name="LibraryUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LibraryFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LibraryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_002">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ShapeType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Package" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="FdrType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="ReelDiameter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="BitFlags" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_062" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="BaseVType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_003">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Setno" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Definition" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="XPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="YPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="FdrIdxStep" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="FdrIdxSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="FeederTimerOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="Optimize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PartsGroupNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="FixCmp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="SwFdr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PitchEffect" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Correct3A" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="UnitNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PickPosCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PickToleranceX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="PickToleranceY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="PickToleranceR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="PickToleranceOffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="PickToleranceOffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="BoardDataTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="ToleranceTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_016" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="OffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="OffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="OffsetR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_023" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_012" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_025" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="RlrWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="LeadLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_033" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LeadNumN" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LeadPitchN" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_034" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LeadNumS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LeadPitchS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_070" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_013" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="Thicknesschk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_021" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_071" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="CompIntensity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_072">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LightSetting" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_074">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="CoplaLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="CoplaThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_076">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LightMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="MainLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="CoaxsLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="SideLightLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_080">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Nozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="XYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="ConvYSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="FdrAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="VacChk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="CorrectPos" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Action" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PickStart" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Dump" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Retry" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_081">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="PckHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="PckTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="PckSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PckVLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PckSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PckCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PckCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="NozzleTouchHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_083">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="MntHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MntTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MntSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="MntPLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="MntSingleDir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="MntCtrlDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="MntCtrlUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="MntInsertLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="MntInsertShortDistance" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_300">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Pck2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Pck2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_301">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Mnt2ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Mnt2ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_302">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="PckForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="PckForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_303">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="MntForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="MntForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_200">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="DspCType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="DNozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Dtimer" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="DXpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="DYpos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="DspAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="DXpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="DYpt" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="DXtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="DYtime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_500">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="DipAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="StampAct" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Marking" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_501">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Option1StationNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option1WaitVision" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option1DownSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option12ndSrvDown" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option1DownSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option1LowendHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="Option1LowendTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="Option1UpSequenceAir" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option12ndSrvUp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option1UpSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_502">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Option1ForceExist" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Option1ForceTarget" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Part_520">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="SVUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="SVBringBack" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="SVBodyLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="SVReverseCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Marks">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Mark" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Mark_001">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="MarkName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LibraryUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LibraryFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LibraryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Mark_011">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="MarkType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Shape" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="OutSize" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Mark_100">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Surface" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="SearchAreaX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="SearchAreaY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                     &lt;attribute name="Sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Mark_200">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LightingOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LightingInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LightingDrop" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LightingIROuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="LightingIRInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="FilterInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                     &lt;attribute name="FilterOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CodeScan">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CodeScanUse">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PcbCodeScan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BlkCodeScan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                           &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                           &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="MachineType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="SubMachineType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "property",
            "production",
            "board",
            "fiducial",
            "badMark",
            "offset",
            "mounts",
            "programs",
            "globalPoints",
            "preDispenses",
            "dotDispenses",
            "posCorDispenses",
            "parts",
            "marks",
            "codeScan"
    })
    public static class Machine {

        @XmlElement(name = "Property", required = true)
        protected PcbDataFile.Machine.Property property;
        @XmlElement(name = "Production", required = true)
        protected PcbDataFile.Machine.Production production;
        @XmlElement(name = "Board", required = true)
        protected PcbDataFile.Machine.Board board;
        @XmlElement(name = "Fiducial", required = true)
        protected PcbDataFile.Machine.Fiducial fiducial;
        @XmlElement(name = "BadMark", required = true)
        protected PcbDataFile.Machine.BadMark badMark;
        @XmlElement(name = "Offset", required = true)
        protected PcbDataFile.Machine.Offset offset;
        @XmlElement(name = "Mounts", required = true)
        protected PcbDataFile.Machine.Mounts mounts;
        @XmlElement(name = "Programs", required = true)
        protected PcbDataFile.Machine.Programs programs;
        @XmlElement(name = "GlobalPoints", required = true)
        protected Object globalPoints;
        @XmlElement(name = "PreDispenses", required = true)
        protected Object preDispenses;
        @XmlElement(name = "DotDispenses", required = true)
        protected Object dotDispenses;
        @XmlElement(name = "PosCorDispenses", required = true)
        protected Object posCorDispenses;
        @XmlElement(name = "Parts", required = true)
        protected PcbDataFile.Machine.Parts parts;
        @XmlElement(name = "Marks", required = true)
        protected PcbDataFile.Machine.Marks marks;
        @XmlElement(name = "CodeScan", required = true)
        protected PcbDataFile.Machine.CodeScan codeScan;
        @XmlAttribute(name = "No", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short no;
        @XmlAttribute(name = "MachineType", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short machineType;
        @XmlAttribute(name = "SubMachineType", required = true)
        @XmlSchemaType(name = "unsignedByte")
        protected short subMachineType;
        @XmlAttribute(name = "Version", required = true)
        protected String version;

        /**
         * Gets the value of the property property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.Property }
         */
        public PcbDataFile.Machine.Property getProperty() {
            return property;
        }

        /**
         * Sets the value of the property property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.Property }
         */
        public void setProperty(PcbDataFile.Machine.Property value) {
            this.property = value;
        }

        /**
         * Gets the value of the production property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.Production }
         */
        public PcbDataFile.Machine.Production getProduction() {
            return production;
        }

        /**
         * Sets the value of the production property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.Production }
         */
        public void setProduction(PcbDataFile.Machine.Production value) {
            this.production = value;
        }

        /**
         * Gets the value of the board property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.Board }
         */
        public PcbDataFile.Machine.Board getBoard() {
            return board;
        }

        /**
         * Sets the value of the board property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.Board }
         */
        public void setBoard(PcbDataFile.Machine.Board value) {
            this.board = value;
        }

        /**
         * Gets the value of the fiducial property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.Fiducial }
         */
        public PcbDataFile.Machine.Fiducial getFiducial() {
            return fiducial;
        }

        /**
         * Sets the value of the fiducial property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.Fiducial }
         */
        public void setFiducial(PcbDataFile.Machine.Fiducial value) {
            this.fiducial = value;
        }

        /**
         * Gets the value of the badMark property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.BadMark }
         */
        public PcbDataFile.Machine.BadMark getBadMark() {
            return badMark;
        }

        /**
         * Sets the value of the badMark property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.BadMark }
         */
        public void setBadMark(PcbDataFile.Machine.BadMark value) {
            this.badMark = value;
        }

        /**
         * Gets the value of the offset property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.Offset }
         */
        public PcbDataFile.Machine.Offset getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.Offset }
         */
        public void setOffset(PcbDataFile.Machine.Offset value) {
            this.offset = value;
        }

        /**
         * Gets the value of the mounts property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.Mounts }
         */
        public PcbDataFile.Machine.Mounts getMounts() {
            return mounts;
        }

        /**
         * Sets the value of the mounts property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.Mounts }
         */
        public void setMounts(PcbDataFile.Machine.Mounts value) {
            this.mounts = value;
        }

        /**
         * Gets the value of the programs property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.Programs }
         */
        public PcbDataFile.Machine.Programs getPrograms() {
            return programs;
        }

        /**
         * Sets the value of the programs property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.Programs }
         */
        public void setPrograms(PcbDataFile.Machine.Programs value) {
            this.programs = value;
        }

        /**
         * Gets the value of the globalPoints property.
         *
         * @return possible object is
         * {@link Object }
         */
        public Object getGlobalPoints() {
            return globalPoints;
        }

        /**
         * Sets the value of the globalPoints property.
         *
         * @param value allowed object is
         *              {@link Object }
         */
        public void setGlobalPoints(Object value) {
            this.globalPoints = value;
        }

        /**
         * Gets the value of the preDispenses property.
         *
         * @return possible object is
         * {@link Object }
         */
        public Object getPreDispenses() {
            return preDispenses;
        }

        /**
         * Sets the value of the preDispenses property.
         *
         * @param value allowed object is
         *              {@link Object }
         */
        public void setPreDispenses(Object value) {
            this.preDispenses = value;
        }

        /**
         * Gets the value of the dotDispenses property.
         *
         * @return possible object is
         * {@link Object }
         */
        public Object getDotDispenses() {
            return dotDispenses;
        }

        /**
         * Sets the value of the dotDispenses property.
         *
         * @param value allowed object is
         *              {@link Object }
         */
        public void setDotDispenses(Object value) {
            this.dotDispenses = value;
        }

        /**
         * Gets the value of the posCorDispenses property.
         *
         * @return possible object is
         * {@link Object }
         */
        public Object getPosCorDispenses() {
            return posCorDispenses;
        }

        /**
         * Sets the value of the posCorDispenses property.
         *
         * @param value allowed object is
         *              {@link Object }
         */
        public void setPosCorDispenses(Object value) {
            this.posCorDispenses = value;
        }

        /**
         * Gets the value of the parts property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.Parts }
         */
        public PcbDataFile.Machine.Parts getParts() {
            return parts;
        }

        /**
         * Sets the value of the parts property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.Parts }
         */
        public void setParts(PcbDataFile.Machine.Parts value) {
            this.parts = value;
        }

        /**
         * Gets the value of the marks property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.Marks }
         */
        public PcbDataFile.Machine.Marks getMarks() {
            return marks;
        }

        /**
         * Sets the value of the marks property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.Marks }
         */
        public void setMarks(PcbDataFile.Machine.Marks value) {
            this.marks = value;
        }

        /**
         * Gets the value of the codeScan property.
         *
         * @return possible object is
         * {@link PcbDataFile.Machine.CodeScan }
         */
        public PcbDataFile.Machine.CodeScan getCodeScan() {
            return codeScan;
        }

        /**
         * Sets the value of the codeScan property.
         *
         * @param value allowed object is
         *              {@link PcbDataFile.Machine.CodeScan }
         */
        public void setCodeScan(PcbDataFile.Machine.CodeScan value) {
            this.codeScan = value;
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
         * Gets the value of the machineType property.
         */
        public short getMachineType() {
            return machineType;
        }

        /**
         * Sets the value of the machineType property.
         */
        public void setMachineType(short value) {
            this.machineType = value;
        }

        /**
         * Gets the value of the subMachineType property.
         */
        public short getSubMachineType() {
            return subMachineType;
        }

        /**
         * Sets the value of the subMachineType property.
         */
        public void setSubMachineType(short value) {
            this.subMachineType = value;
        }

        /**
         * Gets the value of the version property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVersion(String value) {
            this.version = value;
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
         *         &lt;element name="BadUse">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PcbBad">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BlkBad">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                "badUse",
                "pcbBad",
                "blkBad"
        })
        public static class BadMark {

            @XmlElement(name = "BadUse", required = true)
            protected PcbDataFile.Machine.BadMark.BadUse badUse;
            @XmlElement(name = "PcbBad", required = true)
            protected PcbDataFile.Machine.BadMark.PcbBad pcbBad;
            @XmlElement(name = "BlkBad", required = true)
            protected PcbDataFile.Machine.BadMark.BlkBad blkBad;

            /**
             * Gets the value of the badUse property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.BadMark.BadUse }
             */
            public PcbDataFile.Machine.BadMark.BadUse getBadUse() {
                return badUse;
            }

            /**
             * Sets the value of the badUse property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.BadMark.BadUse }
             */
            public void setBadUse(PcbDataFile.Machine.BadMark.BadUse value) {
                this.badUse = value;
            }

            /**
             * Gets the value of the pcbBad property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.BadMark.PcbBad }
             */
            public PcbDataFile.Machine.BadMark.PcbBad getPcbBad() {
                return pcbBad;
            }

            /**
             * Sets the value of the pcbBad property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.BadMark.PcbBad }
             */
            public void setPcbBad(PcbDataFile.Machine.BadMark.PcbBad value) {
                this.pcbBad = value;
            }

            /**
             * Gets the value of the blkBad property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.BadMark.BlkBad }
             */
            public PcbDataFile.Machine.BadMark.BlkBad getBlkBad() {
                return blkBad;
            }

            /**
             * Sets the value of the blkBad property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.BadMark.BlkBad }
             */
            public void setBlkBad(PcbDataFile.Machine.BadMark.BlkBad value) {
                this.blkBad = value;
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
             *       &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BadUse {

                @XmlAttribute(name = "Pcb", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short pcb;
                @XmlAttribute(name = "Blk", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short blk;
                @XmlAttribute(name = "Local", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short local;

                /**
                 * Gets the value of the pcb property.
                 */
                public short getPcb() {
                    return pcb;
                }

                /**
                 * Sets the value of the pcb property.
                 */
                public void setPcb(short value) {
                    this.pcb = value;
                }

                /**
                 * Gets the value of the blk property.
                 */
                public short getBlk() {
                    return blk;
                }

                /**
                 * Sets the value of the blk property.
                 */
                public void setBlk(short value) {
                    this.blk = value;
                }

                /**
                 * Gets the value of the local property.
                 */
                public short getLocal() {
                    return local;
                }

                /**
                 * Sets the value of the local property.
                 */
                public void setLocal(short value) {
                    this.local = value;
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
             *       &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BlkBad {

                @XmlAttribute(name = "X", required = true)
                protected BigDecimal x;
                @XmlAttribute(name = "Y", required = true)
                protected BigDecimal y;
                @XmlAttribute(name = "Mark", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark;

                /**
                 * Gets the value of the x property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX() {
                    return x;
                }

                /**
                 * Sets the value of the x property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX(BigDecimal value) {
                    this.x = value;
                }

                /**
                 * Gets the value of the y property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY() {
                    return y;
                }

                /**
                 * Sets the value of the y property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY(BigDecimal value) {
                    this.y = value;
                }

                /**
                 * Gets the value of the mark property.
                 */
                public short getMark() {
                    return mark;
                }

                /**
                 * Sets the value of the mark property.
                 */
                public void setMark(short value) {
                    this.mark = value;
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
             *       &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PcbBad {

                @XmlAttribute(name = "X", required = true)
                protected BigDecimal x;
                @XmlAttribute(name = "Y", required = true)
                protected BigDecimal y;
                @XmlAttribute(name = "Mark", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark;

                /**
                 * Gets the value of the x property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX() {
                    return x;
                }

                /**
                 * Sets the value of the x property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX(BigDecimal value) {
                    this.x = value;
                }

                /**
                 * Gets the value of the y property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY() {
                    return y;
                }

                /**
                 * Sets the value of the y property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY(BigDecimal value) {
                    this.y = value;
                }

                /**
                 * Gets the value of the mark property.
                 */
                public short getMark() {
                    return mark;
                }

                /**
                 * Sets the value of the mark property.
                 */
                public void setMark(short value) {
                    this.mark = value;
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
         *         &lt;element name="Board_000">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="OriginX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="OriginY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="SizeX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="SizeY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="BlockCount" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="SizeZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="TransOffsetU" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="TransOffsetT1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="TransOffsetT2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="BoardStandardCT" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="BoardStandardPlanTime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="CarriedPosCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="CarriedPosCheckValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="CarriedPosCheckDetail" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="CarriedPosCheckMark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="CarriedPosCheckMarkX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="CarriedPosCheckMarkY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="BoardEdgeOffsetDistanceLowerLeft" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="BoardEdgeOffsetDistanceLowerRight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="BoardEdgeOffsetDistanceUpperLeft" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="BoardEdgeOffsetDistanceUpperRight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_101">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PcbFixWay" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="ConvPreFixTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="TransHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="ConvTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="YSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TransMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="ConvSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="PartHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="ConvTransWay" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TransferOneByOne" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_102">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="MountExec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="VacCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="CoPlanarity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="PrePick" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="RetrySeq" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="SkipRetry" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="PositionFreeSetup" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TrayPre" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="FixedComp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Correct3A" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="InterfereAvoidance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="MountSequenceMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_103">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="BadSortA" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="BadSortB" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="BadSortC" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_104">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_105">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PreDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="DotDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="DotCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Refresh" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="PosCorDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="PosCorPreDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_106">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="SpecialFunction" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_107">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PushUpPinSetupManagement" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_108">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="HeadA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA9" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA10" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA11" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA12" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA13" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA14" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA15" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadA16" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_109">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="HeadB1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB9" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB10" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB11" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB12" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB13" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB14" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB15" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="HeadB16" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_110">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="TempControlA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TempControlA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TempControlA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TempControlA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TempControlA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TempControlA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TempControlA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TempControlA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_111">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="TargetTempA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TargetTempA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TargetTempA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TargetTempA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TargetTempA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TargetTempA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TargetTempA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="TargetTempA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                "board000",
                "board101",
                "board102",
                "board103",
                "board104",
                "board105",
                "board106",
                "board107",
                "board108",
                "board109",
                "board110",
                "board111"
        })
        public static class Board {

            @XmlElement(name = "Board_000", required = true)
            protected PcbDataFile.Machine.Board.Board000 board000;
            @XmlElement(name = "Board_101", required = true)
            protected PcbDataFile.Machine.Board.Board101 board101;
            @XmlElement(name = "Board_102", required = true)
            protected PcbDataFile.Machine.Board.Board102 board102;
            @XmlElement(name = "Board_103", required = true)
            protected PcbDataFile.Machine.Board.Board103 board103;
            @XmlElement(name = "Board_104", required = true)
            protected PcbDataFile.Machine.Board.Board104 board104;
            @XmlElement(name = "Board_105", required = true)
            protected PcbDataFile.Machine.Board.Board105 board105;
            @XmlElement(name = "Board_106", required = true)
            protected PcbDataFile.Machine.Board.Board106 board106;
            @XmlElement(name = "Board_107", required = true)
            protected PcbDataFile.Machine.Board.Board107 board107;
            @XmlElement(name = "Board_108", required = true)
            protected PcbDataFile.Machine.Board.Board108 board108;
            @XmlElement(name = "Board_109", required = true)
            protected PcbDataFile.Machine.Board.Board109 board109;
            @XmlElement(name = "Board_110", required = true)
            protected PcbDataFile.Machine.Board.Board110 board110;
            @XmlElement(name = "Board_111", required = true)
            protected PcbDataFile.Machine.Board.Board111 board111;

            /**
             * Gets the value of the board000 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board000 }
             */
            public PcbDataFile.Machine.Board.Board000 getBoard000() {
                return board000;
            }

            /**
             * Sets the value of the board000 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board000 }
             */
            public void setBoard000(PcbDataFile.Machine.Board.Board000 value) {
                this.board000 = value;
            }

            /**
             * Gets the value of the board101 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board101 }
             */
            public PcbDataFile.Machine.Board.Board101 getBoard101() {
                return board101;
            }

            /**
             * Sets the value of the board101 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board101 }
             */
            public void setBoard101(PcbDataFile.Machine.Board.Board101 value) {
                this.board101 = value;
            }

            /**
             * Gets the value of the board102 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board102 }
             */
            public PcbDataFile.Machine.Board.Board102 getBoard102() {
                return board102;
            }

            /**
             * Sets the value of the board102 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board102 }
             */
            public void setBoard102(PcbDataFile.Machine.Board.Board102 value) {
                this.board102 = value;
            }

            /**
             * Gets the value of the board103 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board103 }
             */
            public PcbDataFile.Machine.Board.Board103 getBoard103() {
                return board103;
            }

            /**
             * Sets the value of the board103 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board103 }
             */
            public void setBoard103(PcbDataFile.Machine.Board.Board103 value) {
                this.board103 = value;
            }

            /**
             * Gets the value of the board104 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board104 }
             */
            public PcbDataFile.Machine.Board.Board104 getBoard104() {
                return board104;
            }

            /**
             * Sets the value of the board104 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board104 }
             */
            public void setBoard104(PcbDataFile.Machine.Board.Board104 value) {
                this.board104 = value;
            }

            /**
             * Gets the value of the board105 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board105 }
             */
            public PcbDataFile.Machine.Board.Board105 getBoard105() {
                return board105;
            }

            /**
             * Sets the value of the board105 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board105 }
             */
            public void setBoard105(PcbDataFile.Machine.Board.Board105 value) {
                this.board105 = value;
            }

            /**
             * Gets the value of the board106 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board106 }
             */
            public PcbDataFile.Machine.Board.Board106 getBoard106() {
                return board106;
            }

            /**
             * Sets the value of the board106 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board106 }
             */
            public void setBoard106(PcbDataFile.Machine.Board.Board106 value) {
                this.board106 = value;
            }

            /**
             * Gets the value of the board107 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board107 }
             */
            public PcbDataFile.Machine.Board.Board107 getBoard107() {
                return board107;
            }

            /**
             * Sets the value of the board107 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board107 }
             */
            public void setBoard107(PcbDataFile.Machine.Board.Board107 value) {
                this.board107 = value;
            }

            /**
             * Gets the value of the board108 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board108 }
             */
            public PcbDataFile.Machine.Board.Board108 getBoard108() {
                return board108;
            }

            /**
             * Sets the value of the board108 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board108 }
             */
            public void setBoard108(PcbDataFile.Machine.Board.Board108 value) {
                this.board108 = value;
            }

            /**
             * Gets the value of the board109 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board109 }
             */
            public PcbDataFile.Machine.Board.Board109 getBoard109() {
                return board109;
            }

            /**
             * Sets the value of the board109 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board109 }
             */
            public void setBoard109(PcbDataFile.Machine.Board.Board109 value) {
                this.board109 = value;
            }

            /**
             * Gets the value of the board110 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board110 }
             */
            public PcbDataFile.Machine.Board.Board110 getBoard110() {
                return board110;
            }

            /**
             * Sets the value of the board110 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board110 }
             */
            public void setBoard110(PcbDataFile.Machine.Board.Board110 value) {
                this.board110 = value;
            }

            /**
             * Gets the value of the board111 property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Board.Board111 }
             */
            public PcbDataFile.Machine.Board.Board111 getBoard111() {
                return board111;
            }

            /**
             * Sets the value of the board111 property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Board.Board111 }
             */
            public void setBoard111(PcbDataFile.Machine.Board.Board111 value) {
                this.board111 = value;
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
             *       &lt;attribute name="OriginX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="OriginY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="SizeX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="SizeY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="BlockCount" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="SizeZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="TransOffsetU" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="TransOffsetT1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="TransOffsetT2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="BoardStandardCT" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="BoardStandardPlanTime" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="CarriedPosCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="CarriedPosCheckValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="CarriedPosCheckDetail" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="CarriedPosCheckMark" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="CarriedPosCheckMarkX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="CarriedPosCheckMarkY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="BoardEdgeOffsetDistanceLowerLeft" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="BoardEdgeOffsetDistanceLowerRight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="BoardEdgeOffsetDistanceUpperLeft" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="BoardEdgeOffsetDistanceUpperRight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board000 {

                @XmlAttribute(name = "OriginX", required = true)
                protected BigDecimal originX;
                @XmlAttribute(name = "OriginY", required = true)
                protected BigDecimal originY;
                @XmlAttribute(name = "SizeX", required = true)
                protected BigDecimal sizeX;
                @XmlAttribute(name = "SizeY", required = true)
                protected BigDecimal sizeY;
                @XmlAttribute(name = "BlockCount", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short blockCount;
                @XmlAttribute(name = "SizeZ", required = true)
                protected BigDecimal sizeZ;
                @XmlAttribute(name = "TransOffsetU", required = true)
                protected BigDecimal transOffsetU;
                @XmlAttribute(name = "TransOffsetT1", required = true)
                protected BigDecimal transOffsetT1;
                @XmlAttribute(name = "TransOffsetT2", required = true)
                protected BigDecimal transOffsetT2;
                @XmlAttribute(name = "BoardStandardCT", required = true)
                protected BigDecimal boardStandardCT;
                @XmlAttribute(name = "BoardStandardPlanTime", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short boardStandardPlanTime;
                @XmlAttribute(name = "CarriedPosCheck", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short carriedPosCheck;
                @XmlAttribute(name = "CarriedPosCheckValue", required = true)
                protected BigDecimal carriedPosCheckValue;
                @XmlAttribute(name = "CarriedPosCheckDetail", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short carriedPosCheckDetail;
                @XmlAttribute(name = "CarriedPosCheckMark", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short carriedPosCheckMark;
                @XmlAttribute(name = "CarriedPosCheckMarkX", required = true)
                protected BigDecimal carriedPosCheckMarkX;
                @XmlAttribute(name = "CarriedPosCheckMarkY", required = true)
                protected BigDecimal carriedPosCheckMarkY;
                @XmlAttribute(name = "BoardEdgeOffsetDistanceLowerLeft", required = true)
                protected BigDecimal boardEdgeOffsetDistanceLowerLeft;
                @XmlAttribute(name = "BoardEdgeOffsetDistanceLowerRight", required = true)
                protected BigDecimal boardEdgeOffsetDistanceLowerRight;
                @XmlAttribute(name = "BoardEdgeOffsetDistanceUpperLeft", required = true)
                protected BigDecimal boardEdgeOffsetDistanceUpperLeft;
                @XmlAttribute(name = "BoardEdgeOffsetDistanceUpperRight", required = true)
                protected BigDecimal boardEdgeOffsetDistanceUpperRight;

                /**
                 * Gets the value of the originX property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getOriginX() {
                    return originX;
                }

                /**
                 * Sets the value of the originX property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setOriginX(BigDecimal value) {
                    this.originX = value;
                }

                /**
                 * Gets the value of the originY property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getOriginY() {
                    return originY;
                }

                /**
                 * Sets the value of the originY property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setOriginY(BigDecimal value) {
                    this.originY = value;
                }

                /**
                 * Gets the value of the sizeX property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getSizeX() {
                    return sizeX;
                }

                /**
                 * Sets the value of the sizeX property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setSizeX(BigDecimal value) {
                    this.sizeX = value;
                }

                /**
                 * Gets the value of the sizeY property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getSizeY() {
                    return sizeY;
                }

                /**
                 * Sets the value of the sizeY property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setSizeY(BigDecimal value) {
                    this.sizeY = value;
                }

                /**
                 * Gets the value of the blockCount property.
                 */
                public short getBlockCount() {
                    return blockCount;
                }

                /**
                 * Sets the value of the blockCount property.
                 */
                public void setBlockCount(short value) {
                    this.blockCount = value;
                }

                /**
                 * Gets the value of the sizeZ property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getSizeZ() {
                    return sizeZ;
                }

                /**
                 * Sets the value of the sizeZ property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setSizeZ(BigDecimal value) {
                    this.sizeZ = value;
                }

                /**
                 * Gets the value of the transOffsetU property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getTransOffsetU() {
                    return transOffsetU;
                }

                /**
                 * Sets the value of the transOffsetU property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setTransOffsetU(BigDecimal value) {
                    this.transOffsetU = value;
                }

                /**
                 * Gets the value of the transOffsetT1 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getTransOffsetT1() {
                    return transOffsetT1;
                }

                /**
                 * Sets the value of the transOffsetT1 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setTransOffsetT1(BigDecimal value) {
                    this.transOffsetT1 = value;
                }

                /**
                 * Gets the value of the transOffsetT2 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getTransOffsetT2() {
                    return transOffsetT2;
                }

                /**
                 * Sets the value of the transOffsetT2 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setTransOffsetT2(BigDecimal value) {
                    this.transOffsetT2 = value;
                }

                /**
                 * Gets the value of the boardStandardCT property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getBoardStandardCT() {
                    return boardStandardCT;
                }

                /**
                 * Sets the value of the boardStandardCT property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setBoardStandardCT(BigDecimal value) {
                    this.boardStandardCT = value;
                }

                /**
                 * Gets the value of the boardStandardPlanTime property.
                 */
                public short getBoardStandardPlanTime() {
                    return boardStandardPlanTime;
                }

                /**
                 * Sets the value of the boardStandardPlanTime property.
                 */
                public void setBoardStandardPlanTime(short value) {
                    this.boardStandardPlanTime = value;
                }

                /**
                 * Gets the value of the carriedPosCheck property.
                 */
                public short getCarriedPosCheck() {
                    return carriedPosCheck;
                }

                /**
                 * Sets the value of the carriedPosCheck property.
                 */
                public void setCarriedPosCheck(short value) {
                    this.carriedPosCheck = value;
                }

                /**
                 * Gets the value of the carriedPosCheckValue property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getCarriedPosCheckValue() {
                    return carriedPosCheckValue;
                }

                /**
                 * Sets the value of the carriedPosCheckValue property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setCarriedPosCheckValue(BigDecimal value) {
                    this.carriedPosCheckValue = value;
                }

                /**
                 * Gets the value of the carriedPosCheckDetail property.
                 */
                public short getCarriedPosCheckDetail() {
                    return carriedPosCheckDetail;
                }

                /**
                 * Sets the value of the carriedPosCheckDetail property.
                 */
                public void setCarriedPosCheckDetail(short value) {
                    this.carriedPosCheckDetail = value;
                }

                /**
                 * Gets the value of the carriedPosCheckMark property.
                 */
                public short getCarriedPosCheckMark() {
                    return carriedPosCheckMark;
                }

                /**
                 * Sets the value of the carriedPosCheckMark property.
                 */
                public void setCarriedPosCheckMark(short value) {
                    this.carriedPosCheckMark = value;
                }

                /**
                 * Gets the value of the carriedPosCheckMarkX property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getCarriedPosCheckMarkX() {
                    return carriedPosCheckMarkX;
                }

                /**
                 * Sets the value of the carriedPosCheckMarkX property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setCarriedPosCheckMarkX(BigDecimal value) {
                    this.carriedPosCheckMarkX = value;
                }

                /**
                 * Gets the value of the carriedPosCheckMarkY property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getCarriedPosCheckMarkY() {
                    return carriedPosCheckMarkY;
                }

                /**
                 * Sets the value of the carriedPosCheckMarkY property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setCarriedPosCheckMarkY(BigDecimal value) {
                    this.carriedPosCheckMarkY = value;
                }

                /**
                 * Gets the value of the boardEdgeOffsetDistanceLowerLeft property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getBoardEdgeOffsetDistanceLowerLeft() {
                    return boardEdgeOffsetDistanceLowerLeft;
                }

                /**
                 * Sets the value of the boardEdgeOffsetDistanceLowerLeft property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setBoardEdgeOffsetDistanceLowerLeft(BigDecimal value) {
                    this.boardEdgeOffsetDistanceLowerLeft = value;
                }

                /**
                 * Gets the value of the boardEdgeOffsetDistanceLowerRight property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getBoardEdgeOffsetDistanceLowerRight() {
                    return boardEdgeOffsetDistanceLowerRight;
                }

                /**
                 * Sets the value of the boardEdgeOffsetDistanceLowerRight property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setBoardEdgeOffsetDistanceLowerRight(BigDecimal value) {
                    this.boardEdgeOffsetDistanceLowerRight = value;
                }

                /**
                 * Gets the value of the boardEdgeOffsetDistanceUpperLeft property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getBoardEdgeOffsetDistanceUpperLeft() {
                    return boardEdgeOffsetDistanceUpperLeft;
                }

                /**
                 * Sets the value of the boardEdgeOffsetDistanceUpperLeft property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setBoardEdgeOffsetDistanceUpperLeft(BigDecimal value) {
                    this.boardEdgeOffsetDistanceUpperLeft = value;
                }

                /**
                 * Gets the value of the boardEdgeOffsetDistanceUpperRight property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getBoardEdgeOffsetDistanceUpperRight() {
                    return boardEdgeOffsetDistanceUpperRight;
                }

                /**
                 * Sets the value of the boardEdgeOffsetDistanceUpperRight property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setBoardEdgeOffsetDistanceUpperRight(BigDecimal value) {
                    this.boardEdgeOffsetDistanceUpperRight = value;
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
             *       &lt;attribute name="PcbFixWay" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="ConvPreFixTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="TransHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="ConvTimer" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="YSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TransMode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="ConvSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="PartHeight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="ConvTransWay" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TransferOneByOne" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board101 {

                @XmlAttribute(name = "PcbFixWay", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short pcbFixWay;
                @XmlAttribute(name = "ConvPreFixTimer", required = true)
                protected BigDecimal convPreFixTimer;
                @XmlAttribute(name = "TransHeight", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transHeight;
                @XmlAttribute(name = "ConvTimer", required = true)
                protected BigDecimal convTimer;
                @XmlAttribute(name = "YSpeed", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short ySpeed;
                @XmlAttribute(name = "TransMode", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transMode;
                @XmlAttribute(name = "ConvSpeed", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short convSpeed;
                @XmlAttribute(name = "PartHeight", required = true)
                protected BigDecimal partHeight;
                @XmlAttribute(name = "ConvTransWay", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short convTransWay;
                @XmlAttribute(name = "TransferOneByOne", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short transferOneByOne;

                /**
                 * Gets the value of the pcbFixWay property.
                 */
                public short getPcbFixWay() {
                    return pcbFixWay;
                }

                /**
                 * Sets the value of the pcbFixWay property.
                 */
                public void setPcbFixWay(short value) {
                    this.pcbFixWay = value;
                }

                /**
                 * Gets the value of the convPreFixTimer property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getConvPreFixTimer() {
                    return convPreFixTimer;
                }

                /**
                 * Sets the value of the convPreFixTimer property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setConvPreFixTimer(BigDecimal value) {
                    this.convPreFixTimer = value;
                }

                /**
                 * Gets the value of the transHeight property.
                 */
                public short getTransHeight() {
                    return transHeight;
                }

                /**
                 * Sets the value of the transHeight property.
                 */
                public void setTransHeight(short value) {
                    this.transHeight = value;
                }

                /**
                 * Gets the value of the convTimer property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getConvTimer() {
                    return convTimer;
                }

                /**
                 * Sets the value of the convTimer property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setConvTimer(BigDecimal value) {
                    this.convTimer = value;
                }

                /**
                 * Gets the value of the ySpeed property.
                 */
                public short getYSpeed() {
                    return ySpeed;
                }

                /**
                 * Sets the value of the ySpeed property.
                 */
                public void setYSpeed(short value) {
                    this.ySpeed = value;
                }

                /**
                 * Gets the value of the transMode property.
                 */
                public short getTransMode() {
                    return transMode;
                }

                /**
                 * Sets the value of the transMode property.
                 */
                public void setTransMode(short value) {
                    this.transMode = value;
                }

                /**
                 * Gets the value of the convSpeed property.
                 */
                public short getConvSpeed() {
                    return convSpeed;
                }

                /**
                 * Sets the value of the convSpeed property.
                 */
                public void setConvSpeed(short value) {
                    this.convSpeed = value;
                }

                /**
                 * Gets the value of the partHeight property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getPartHeight() {
                    return partHeight;
                }

                /**
                 * Sets the value of the partHeight property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setPartHeight(BigDecimal value) {
                    this.partHeight = value;
                }

                /**
                 * Gets the value of the convTransWay property.
                 */
                public short getConvTransWay() {
                    return convTransWay;
                }

                /**
                 * Sets the value of the convTransWay property.
                 */
                public void setConvTransWay(short value) {
                    this.convTransWay = value;
                }

                /**
                 * Gets the value of the transferOneByOne property.
                 */
                public short getTransferOneByOne() {
                    return transferOneByOne;
                }

                /**
                 * Sets the value of the transferOneByOne property.
                 */
                public void setTransferOneByOne(short value) {
                    this.transferOneByOne = value;
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
             *       &lt;attribute name="MountExec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="VacCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="CoPlanarity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="PrePick" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="RetrySeq" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="SkipRetry" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="PositionFreeSetup" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TrayPre" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="FixedComp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Correct3A" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="InterfereAvoidance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="MountSequenceMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board102 {

                @XmlAttribute(name = "MountExec", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mountExec;
                @XmlAttribute(name = "VacCheck", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short vacCheck;
                @XmlAttribute(name = "Alignment", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short alignment;
                @XmlAttribute(name = "CoPlanarity", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short coPlanarity;
                @XmlAttribute(name = "PrePick", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short prePick;
                @XmlAttribute(name = "RetrySeq", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short retrySeq;
                @XmlAttribute(name = "SkipRetry", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short skipRetry;
                @XmlAttribute(name = "PositionFreeSetup", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short positionFreeSetup;
                @XmlAttribute(name = "TrayPre", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short trayPre;
                @XmlAttribute(name = "FixedComp", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short fixedComp;
                @XmlAttribute(name = "Correct3A", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short correct3A;
                @XmlAttribute(name = "InterfereAvoidance", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short interfereAvoidance;
                @XmlAttribute(name = "MountSequenceMethod", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mountSequenceMethod;

                /**
                 * Gets the value of the mountExec property.
                 */
                public short getMountExec() {
                    return mountExec;
                }

                /**
                 * Sets the value of the mountExec property.
                 */
                public void setMountExec(short value) {
                    this.mountExec = value;
                }

                /**
                 * Gets the value of the vacCheck property.
                 */
                public short getVacCheck() {
                    return vacCheck;
                }

                /**
                 * Sets the value of the vacCheck property.
                 */
                public void setVacCheck(short value) {
                    this.vacCheck = value;
                }

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
                 * Gets the value of the coPlanarity property.
                 */
                public short getCoPlanarity() {
                    return coPlanarity;
                }

                /**
                 * Sets the value of the coPlanarity property.
                 */
                public void setCoPlanarity(short value) {
                    this.coPlanarity = value;
                }

                /**
                 * Gets the value of the prePick property.
                 */
                public short getPrePick() {
                    return prePick;
                }

                /**
                 * Sets the value of the prePick property.
                 */
                public void setPrePick(short value) {
                    this.prePick = value;
                }

                /**
                 * Gets the value of the retrySeq property.
                 */
                public short getRetrySeq() {
                    return retrySeq;
                }

                /**
                 * Sets the value of the retrySeq property.
                 */
                public void setRetrySeq(short value) {
                    this.retrySeq = value;
                }

                /**
                 * Gets the value of the skipRetry property.
                 */
                public short getSkipRetry() {
                    return skipRetry;
                }

                /**
                 * Sets the value of the skipRetry property.
                 */
                public void setSkipRetry(short value) {
                    this.skipRetry = value;
                }

                /**
                 * Gets the value of the positionFreeSetup property.
                 */
                public short getPositionFreeSetup() {
                    return positionFreeSetup;
                }

                /**
                 * Sets the value of the positionFreeSetup property.
                 */
                public void setPositionFreeSetup(short value) {
                    this.positionFreeSetup = value;
                }

                /**
                 * Gets the value of the trayPre property.
                 */
                public short getTrayPre() {
                    return trayPre;
                }

                /**
                 * Sets the value of the trayPre property.
                 */
                public void setTrayPre(short value) {
                    this.trayPre = value;
                }

                /**
                 * Gets the value of the fixedComp property.
                 */
                public short getFixedComp() {
                    return fixedComp;
                }

                /**
                 * Sets the value of the fixedComp property.
                 */
                public void setFixedComp(short value) {
                    this.fixedComp = value;
                }

                /**
                 * Gets the value of the correct3A property.
                 */
                public short getCorrect3A() {
                    return correct3A;
                }

                /**
                 * Sets the value of the correct3A property.
                 */
                public void setCorrect3A(short value) {
                    this.correct3A = value;
                }

                /**
                 * Gets the value of the interfereAvoidance property.
                 */
                public short getInterfereAvoidance() {
                    return interfereAvoidance;
                }

                /**
                 * Sets the value of the interfereAvoidance property.
                 */
                public void setInterfereAvoidance(short value) {
                    this.interfereAvoidance = value;
                }

                /**
                 * Gets the value of the mountSequenceMethod property.
                 */
                public short getMountSequenceMethod() {
                    return mountSequenceMethod;
                }

                /**
                 * Sets the value of the mountSequenceMethod property.
                 */
                public void setMountSequenceMethod(short value) {
                    this.mountSequenceMethod = value;
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
             *       &lt;attribute name="BadSortA" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="BadSortB" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="BadSortC" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board103 {

                @XmlAttribute(name = "BadSortA", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short badSortA;
                @XmlAttribute(name = "BadSortB", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short badSortB;
                @XmlAttribute(name = "BadSortC", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short badSortC;

                /**
                 * Gets the value of the badSortA property.
                 */
                public short getBadSortA() {
                    return badSortA;
                }

                /**
                 * Sets the value of the badSortA property.
                 */
                public void setBadSortA(short value) {
                    this.badSortA = value;
                }

                /**
                 * Gets the value of the badSortB property.
                 */
                public short getBadSortB() {
                    return badSortB;
                }

                /**
                 * Sets the value of the badSortB property.
                 */
                public void setBadSortB(short value) {
                    this.badSortB = value;
                }

                /**
                 * Gets the value of the badSortC property.
                 */
                public short getBadSortC() {
                    return badSortC;
                }

                /**
                 * Sets the value of the badSortC property.
                 */
                public void setBadSortC(short value) {
                    this.badSortC = value;
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
             *       &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board104 {

                @XmlAttribute(name = "Comment", required = true)
                protected String comment;

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
             *       &lt;attribute name="PreDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="DotDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="DotCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Refresh" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="PosCorDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="PosCorPreDisp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board105 {

                @XmlAttribute(name = "PreDisp", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short preDisp;
                @XmlAttribute(name = "DotDisp", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short dotDisp;
                @XmlAttribute(name = "DotCheck", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short dotCheck;
                @XmlAttribute(name = "Refresh", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short refresh;
                @XmlAttribute(name = "PosCorDisp", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short posCorDisp;
                @XmlAttribute(name = "PosCorPreDisp", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short posCorPreDisp;

                /**
                 * Gets the value of the preDisp property.
                 */
                public short getPreDisp() {
                    return preDisp;
                }

                /**
                 * Sets the value of the preDisp property.
                 */
                public void setPreDisp(short value) {
                    this.preDisp = value;
                }

                /**
                 * Gets the value of the dotDisp property.
                 */
                public short getDotDisp() {
                    return dotDisp;
                }

                /**
                 * Sets the value of the dotDisp property.
                 */
                public void setDotDisp(short value) {
                    this.dotDisp = value;
                }

                /**
                 * Gets the value of the dotCheck property.
                 */
                public short getDotCheck() {
                    return dotCheck;
                }

                /**
                 * Sets the value of the dotCheck property.
                 */
                public void setDotCheck(short value) {
                    this.dotCheck = value;
                }

                /**
                 * Gets the value of the refresh property.
                 */
                public short getRefresh() {
                    return refresh;
                }

                /**
                 * Sets the value of the refresh property.
                 */
                public void setRefresh(short value) {
                    this.refresh = value;
                }

                /**
                 * Gets the value of the posCorDisp property.
                 */
                public short getPosCorDisp() {
                    return posCorDisp;
                }

                /**
                 * Sets the value of the posCorDisp property.
                 */
                public void setPosCorDisp(short value) {
                    this.posCorDisp = value;
                }

                /**
                 * Gets the value of the posCorPreDisp property.
                 */
                public short getPosCorPreDisp() {
                    return posCorPreDisp;
                }

                /**
                 * Sets the value of the posCorPreDisp property.
                 */
                public void setPosCorPreDisp(short value) {
                    this.posCorPreDisp = value;
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
             *       &lt;attribute name="SpecialFunction" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board106 {

                @XmlAttribute(name = "SpecialFunction", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short specialFunction;

                /**
                 * Gets the value of the specialFunction property.
                 */
                public short getSpecialFunction() {
                    return specialFunction;
                }

                /**
                 * Sets the value of the specialFunction property.
                 */
                public void setSpecialFunction(short value) {
                    this.specialFunction = value;
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
             *       &lt;attribute name="PushUpPinSetupManagement" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board107 {

                @XmlAttribute(name = "PushUpPinSetupManagement", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short pushUpPinSetupManagement;

                /**
                 * Gets the value of the pushUpPinSetupManagement property.
                 */
                public short getPushUpPinSetupManagement() {
                    return pushUpPinSetupManagement;
                }

                /**
                 * Sets the value of the pushUpPinSetupManagement property.
                 */
                public void setPushUpPinSetupManagement(short value) {
                    this.pushUpPinSetupManagement = value;
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
             *       &lt;attribute name="HeadA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA9" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA10" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA11" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA12" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA13" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA14" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA15" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadA16" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board108 {

                @XmlAttribute(name = "HeadA1", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA1;
                @XmlAttribute(name = "HeadA2", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA2;
                @XmlAttribute(name = "HeadA3", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA3;
                @XmlAttribute(name = "HeadA4", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA4;
                @XmlAttribute(name = "HeadA5", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA5;
                @XmlAttribute(name = "HeadA6", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA6;
                @XmlAttribute(name = "HeadA7", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA7;
                @XmlAttribute(name = "HeadA8", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA8;
                @XmlAttribute(name = "HeadA9", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA9;
                @XmlAttribute(name = "HeadA10", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA10;
                @XmlAttribute(name = "HeadA11", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA11;
                @XmlAttribute(name = "HeadA12", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA12;
                @XmlAttribute(name = "HeadA13", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA13;
                @XmlAttribute(name = "HeadA14", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA14;
                @XmlAttribute(name = "HeadA15", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA15;
                @XmlAttribute(name = "HeadA16", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headA16;

                /**
                 * Gets the value of the headA1 property.
                 */
                public short getHeadA1() {
                    return headA1;
                }

                /**
                 * Sets the value of the headA1 property.
                 */
                public void setHeadA1(short value) {
                    this.headA1 = value;
                }

                /**
                 * Gets the value of the headA2 property.
                 */
                public short getHeadA2() {
                    return headA2;
                }

                /**
                 * Sets the value of the headA2 property.
                 */
                public void setHeadA2(short value) {
                    this.headA2 = value;
                }

                /**
                 * Gets the value of the headA3 property.
                 */
                public short getHeadA3() {
                    return headA3;
                }

                /**
                 * Sets the value of the headA3 property.
                 */
                public void setHeadA3(short value) {
                    this.headA3 = value;
                }

                /**
                 * Gets the value of the headA4 property.
                 */
                public short getHeadA4() {
                    return headA4;
                }

                /**
                 * Sets the value of the headA4 property.
                 */
                public void setHeadA4(short value) {
                    this.headA4 = value;
                }

                /**
                 * Gets the value of the headA5 property.
                 */
                public short getHeadA5() {
                    return headA5;
                }

                /**
                 * Sets the value of the headA5 property.
                 */
                public void setHeadA5(short value) {
                    this.headA5 = value;
                }

                /**
                 * Gets the value of the headA6 property.
                 */
                public short getHeadA6() {
                    return headA6;
                }

                /**
                 * Sets the value of the headA6 property.
                 */
                public void setHeadA6(short value) {
                    this.headA6 = value;
                }

                /**
                 * Gets the value of the headA7 property.
                 */
                public short getHeadA7() {
                    return headA7;
                }

                /**
                 * Sets the value of the headA7 property.
                 */
                public void setHeadA7(short value) {
                    this.headA7 = value;
                }

                /**
                 * Gets the value of the headA8 property.
                 */
                public short getHeadA8() {
                    return headA8;
                }

                /**
                 * Sets the value of the headA8 property.
                 */
                public void setHeadA8(short value) {
                    this.headA8 = value;
                }

                /**
                 * Gets the value of the headA9 property.
                 */
                public short getHeadA9() {
                    return headA9;
                }

                /**
                 * Sets the value of the headA9 property.
                 */
                public void setHeadA9(short value) {
                    this.headA9 = value;
                }

                /**
                 * Gets the value of the headA10 property.
                 */
                public short getHeadA10() {
                    return headA10;
                }

                /**
                 * Sets the value of the headA10 property.
                 */
                public void setHeadA10(short value) {
                    this.headA10 = value;
                }

                /**
                 * Gets the value of the headA11 property.
                 */
                public short getHeadA11() {
                    return headA11;
                }

                /**
                 * Sets the value of the headA11 property.
                 */
                public void setHeadA11(short value) {
                    this.headA11 = value;
                }

                /**
                 * Gets the value of the headA12 property.
                 */
                public short getHeadA12() {
                    return headA12;
                }

                /**
                 * Sets the value of the headA12 property.
                 */
                public void setHeadA12(short value) {
                    this.headA12 = value;
                }

                /**
                 * Gets the value of the headA13 property.
                 */
                public short getHeadA13() {
                    return headA13;
                }

                /**
                 * Sets the value of the headA13 property.
                 */
                public void setHeadA13(short value) {
                    this.headA13 = value;
                }

                /**
                 * Gets the value of the headA14 property.
                 */
                public short getHeadA14() {
                    return headA14;
                }

                /**
                 * Sets the value of the headA14 property.
                 */
                public void setHeadA14(short value) {
                    this.headA14 = value;
                }

                /**
                 * Gets the value of the headA15 property.
                 */
                public short getHeadA15() {
                    return headA15;
                }

                /**
                 * Sets the value of the headA15 property.
                 */
                public void setHeadA15(short value) {
                    this.headA15 = value;
                }

                /**
                 * Gets the value of the headA16 property.
                 */
                public short getHeadA16() {
                    return headA16;
                }

                /**
                 * Sets the value of the headA16 property.
                 */
                public void setHeadA16(short value) {
                    this.headA16 = value;
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
             *       &lt;attribute name="HeadB1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB9" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB10" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB11" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB12" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB13" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB14" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB15" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="HeadB16" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board109 {

                @XmlAttribute(name = "HeadB1", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB1;
                @XmlAttribute(name = "HeadB2", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB2;
                @XmlAttribute(name = "HeadB3", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB3;
                @XmlAttribute(name = "HeadB4", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB4;
                @XmlAttribute(name = "HeadB5", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB5;
                @XmlAttribute(name = "HeadB6", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB6;
                @XmlAttribute(name = "HeadB7", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB7;
                @XmlAttribute(name = "HeadB8", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB8;
                @XmlAttribute(name = "HeadB9", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB9;
                @XmlAttribute(name = "HeadB10", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB10;
                @XmlAttribute(name = "HeadB11", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB11;
                @XmlAttribute(name = "HeadB12", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB12;
                @XmlAttribute(name = "HeadB13", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB13;
                @XmlAttribute(name = "HeadB14", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB14;
                @XmlAttribute(name = "HeadB15", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB15;
                @XmlAttribute(name = "HeadB16", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short headB16;

                /**
                 * Gets the value of the headB1 property.
                 */
                public short getHeadB1() {
                    return headB1;
                }

                /**
                 * Sets the value of the headB1 property.
                 */
                public void setHeadB1(short value) {
                    this.headB1 = value;
                }

                /**
                 * Gets the value of the headB2 property.
                 */
                public short getHeadB2() {
                    return headB2;
                }

                /**
                 * Sets the value of the headB2 property.
                 */
                public void setHeadB2(short value) {
                    this.headB2 = value;
                }

                /**
                 * Gets the value of the headB3 property.
                 */
                public short getHeadB3() {
                    return headB3;
                }

                /**
                 * Sets the value of the headB3 property.
                 */
                public void setHeadB3(short value) {
                    this.headB3 = value;
                }

                /**
                 * Gets the value of the headB4 property.
                 */
                public short getHeadB4() {
                    return headB4;
                }

                /**
                 * Sets the value of the headB4 property.
                 */
                public void setHeadB4(short value) {
                    this.headB4 = value;
                }

                /**
                 * Gets the value of the headB5 property.
                 */
                public short getHeadB5() {
                    return headB5;
                }

                /**
                 * Sets the value of the headB5 property.
                 */
                public void setHeadB5(short value) {
                    this.headB5 = value;
                }

                /**
                 * Gets the value of the headB6 property.
                 */
                public short getHeadB6() {
                    return headB6;
                }

                /**
                 * Sets the value of the headB6 property.
                 */
                public void setHeadB6(short value) {
                    this.headB6 = value;
                }

                /**
                 * Gets the value of the headB7 property.
                 */
                public short getHeadB7() {
                    return headB7;
                }

                /**
                 * Sets the value of the headB7 property.
                 */
                public void setHeadB7(short value) {
                    this.headB7 = value;
                }

                /**
                 * Gets the value of the headB8 property.
                 */
                public short getHeadB8() {
                    return headB8;
                }

                /**
                 * Sets the value of the headB8 property.
                 */
                public void setHeadB8(short value) {
                    this.headB8 = value;
                }

                /**
                 * Gets the value of the headB9 property.
                 */
                public short getHeadB9() {
                    return headB9;
                }

                /**
                 * Sets the value of the headB9 property.
                 */
                public void setHeadB9(short value) {
                    this.headB9 = value;
                }

                /**
                 * Gets the value of the headB10 property.
                 */
                public short getHeadB10() {
                    return headB10;
                }

                /**
                 * Sets the value of the headB10 property.
                 */
                public void setHeadB10(short value) {
                    this.headB10 = value;
                }

                /**
                 * Gets the value of the headB11 property.
                 */
                public short getHeadB11() {
                    return headB11;
                }

                /**
                 * Sets the value of the headB11 property.
                 */
                public void setHeadB11(short value) {
                    this.headB11 = value;
                }

                /**
                 * Gets the value of the headB12 property.
                 */
                public short getHeadB12() {
                    return headB12;
                }

                /**
                 * Sets the value of the headB12 property.
                 */
                public void setHeadB12(short value) {
                    this.headB12 = value;
                }

                /**
                 * Gets the value of the headB13 property.
                 */
                public short getHeadB13() {
                    return headB13;
                }

                /**
                 * Sets the value of the headB13 property.
                 */
                public void setHeadB13(short value) {
                    this.headB13 = value;
                }

                /**
                 * Gets the value of the headB14 property.
                 */
                public short getHeadB14() {
                    return headB14;
                }

                /**
                 * Sets the value of the headB14 property.
                 */
                public void setHeadB14(short value) {
                    this.headB14 = value;
                }

                /**
                 * Gets the value of the headB15 property.
                 */
                public short getHeadB15() {
                    return headB15;
                }

                /**
                 * Sets the value of the headB15 property.
                 */
                public void setHeadB15(short value) {
                    this.headB15 = value;
                }

                /**
                 * Gets the value of the headB16 property.
                 */
                public short getHeadB16() {
                    return headB16;
                }

                /**
                 * Sets the value of the headB16 property.
                 */
                public void setHeadB16(short value) {
                    this.headB16 = value;
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
             *       &lt;attribute name="TempControlA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TempControlA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TempControlA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TempControlA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TempControlA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TempControlA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TempControlA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TempControlA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board110 {

                @XmlAttribute(name = "TempControlA1", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short tempControlA1;
                @XmlAttribute(name = "TempControlA2", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short tempControlA2;
                @XmlAttribute(name = "TempControlA3", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short tempControlA3;
                @XmlAttribute(name = "TempControlA4", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short tempControlA4;
                @XmlAttribute(name = "TempControlA5", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short tempControlA5;
                @XmlAttribute(name = "TempControlA6", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short tempControlA6;
                @XmlAttribute(name = "TempControlA7", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short tempControlA7;
                @XmlAttribute(name = "TempControlA8", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short tempControlA8;

                /**
                 * Gets the value of the tempControlA1 property.
                 */
                public short getTempControlA1() {
                    return tempControlA1;
                }

                /**
                 * Sets the value of the tempControlA1 property.
                 */
                public void setTempControlA1(short value) {
                    this.tempControlA1 = value;
                }

                /**
                 * Gets the value of the tempControlA2 property.
                 */
                public short getTempControlA2() {
                    return tempControlA2;
                }

                /**
                 * Sets the value of the tempControlA2 property.
                 */
                public void setTempControlA2(short value) {
                    this.tempControlA2 = value;
                }

                /**
                 * Gets the value of the tempControlA3 property.
                 */
                public short getTempControlA3() {
                    return tempControlA3;
                }

                /**
                 * Sets the value of the tempControlA3 property.
                 */
                public void setTempControlA3(short value) {
                    this.tempControlA3 = value;
                }

                /**
                 * Gets the value of the tempControlA4 property.
                 */
                public short getTempControlA4() {
                    return tempControlA4;
                }

                /**
                 * Sets the value of the tempControlA4 property.
                 */
                public void setTempControlA4(short value) {
                    this.tempControlA4 = value;
                }

                /**
                 * Gets the value of the tempControlA5 property.
                 */
                public short getTempControlA5() {
                    return tempControlA5;
                }

                /**
                 * Sets the value of the tempControlA5 property.
                 */
                public void setTempControlA5(short value) {
                    this.tempControlA5 = value;
                }

                /**
                 * Gets the value of the tempControlA6 property.
                 */
                public short getTempControlA6() {
                    return tempControlA6;
                }

                /**
                 * Sets the value of the tempControlA6 property.
                 */
                public void setTempControlA6(short value) {
                    this.tempControlA6 = value;
                }

                /**
                 * Gets the value of the tempControlA7 property.
                 */
                public short getTempControlA7() {
                    return tempControlA7;
                }

                /**
                 * Sets the value of the tempControlA7 property.
                 */
                public void setTempControlA7(short value) {
                    this.tempControlA7 = value;
                }

                /**
                 * Gets the value of the tempControlA8 property.
                 */
                public short getTempControlA8() {
                    return tempControlA8;
                }

                /**
                 * Sets the value of the tempControlA8 property.
                 */
                public void setTempControlA8(short value) {
                    this.tempControlA8 = value;
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
             *       &lt;attribute name="TargetTempA1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TargetTempA2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TargetTempA3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TargetTempA4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TargetTempA5" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TargetTempA6" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TargetTempA7" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="TargetTempA8" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board111 {

                @XmlAttribute(name = "TargetTempA1", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short targetTempA1;
                @XmlAttribute(name = "TargetTempA2", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short targetTempA2;
                @XmlAttribute(name = "TargetTempA3", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short targetTempA3;
                @XmlAttribute(name = "TargetTempA4", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short targetTempA4;
                @XmlAttribute(name = "TargetTempA5", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short targetTempA5;
                @XmlAttribute(name = "TargetTempA6", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short targetTempA6;
                @XmlAttribute(name = "TargetTempA7", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short targetTempA7;
                @XmlAttribute(name = "TargetTempA8", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short targetTempA8;

                /**
                 * Gets the value of the targetTempA1 property.
                 */
                public short getTargetTempA1() {
                    return targetTempA1;
                }

                /**
                 * Sets the value of the targetTempA1 property.
                 */
                public void setTargetTempA1(short value) {
                    this.targetTempA1 = value;
                }

                /**
                 * Gets the value of the targetTempA2 property.
                 */
                public short getTargetTempA2() {
                    return targetTempA2;
                }

                /**
                 * Sets the value of the targetTempA2 property.
                 */
                public void setTargetTempA2(short value) {
                    this.targetTempA2 = value;
                }

                /**
                 * Gets the value of the targetTempA3 property.
                 */
                public short getTargetTempA3() {
                    return targetTempA3;
                }

                /**
                 * Sets the value of the targetTempA3 property.
                 */
                public void setTargetTempA3(short value) {
                    this.targetTempA3 = value;
                }

                /**
                 * Gets the value of the targetTempA4 property.
                 */
                public short getTargetTempA4() {
                    return targetTempA4;
                }

                /**
                 * Sets the value of the targetTempA4 property.
                 */
                public void setTargetTempA4(short value) {
                    this.targetTempA4 = value;
                }

                /**
                 * Gets the value of the targetTempA5 property.
                 */
                public short getTargetTempA5() {
                    return targetTempA5;
                }

                /**
                 * Sets the value of the targetTempA5 property.
                 */
                public void setTargetTempA5(short value) {
                    this.targetTempA5 = value;
                }

                /**
                 * Gets the value of the targetTempA6 property.
                 */
                public short getTargetTempA6() {
                    return targetTempA6;
                }

                /**
                 * Sets the value of the targetTempA6 property.
                 */
                public void setTargetTempA6(short value) {
                    this.targetTempA6 = value;
                }

                /**
                 * Gets the value of the targetTempA7 property.
                 */
                public short getTargetTempA7() {
                    return targetTempA7;
                }

                /**
                 * Sets the value of the targetTempA7 property.
                 */
                public void setTargetTempA7(short value) {
                    this.targetTempA7 = value;
                }

                /**
                 * Gets the value of the targetTempA8 property.
                 */
                public short getTargetTempA8() {
                    return targetTempA8;
                }

                /**
                 * Sets the value of the targetTempA8 property.
                 */
                public void setTargetTempA8(short value) {
                    this.targetTempA8 = value;
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
         *         &lt;element name="CodeScanUse">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PcbCodeScan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BlkCodeScan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                "codeScanUse",
                "pcbCodeScan",
                "blkCodeScan"
        })
        public static class CodeScan {

            @XmlElement(name = "CodeScanUse", required = true)
            protected PcbDataFile.Machine.CodeScan.CodeScanUse codeScanUse;
            @XmlElement(name = "PcbCodeScan", required = true)
            protected PcbDataFile.Machine.CodeScan.PcbCodeScan pcbCodeScan;
            @XmlElement(name = "BlkCodeScan", required = true)
            protected PcbDataFile.Machine.CodeScan.BlkCodeScan blkCodeScan;

            /**
             * Gets the value of the codeScanUse property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.CodeScan.CodeScanUse }
             */
            public PcbDataFile.Machine.CodeScan.CodeScanUse getCodeScanUse() {
                return codeScanUse;
            }

            /**
             * Sets the value of the codeScanUse property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.CodeScan.CodeScanUse }
             */
            public void setCodeScanUse(PcbDataFile.Machine.CodeScan.CodeScanUse value) {
                this.codeScanUse = value;
            }

            /**
             * Gets the value of the pcbCodeScan property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.CodeScan.PcbCodeScan }
             */
            public PcbDataFile.Machine.CodeScan.PcbCodeScan getPcbCodeScan() {
                return pcbCodeScan;
            }

            /**
             * Sets the value of the pcbCodeScan property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.CodeScan.PcbCodeScan }
             */
            public void setPcbCodeScan(PcbDataFile.Machine.CodeScan.PcbCodeScan value) {
                this.pcbCodeScan = value;
            }

            /**
             * Gets the value of the blkCodeScan property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.CodeScan.BlkCodeScan }
             */
            public PcbDataFile.Machine.CodeScan.BlkCodeScan getBlkCodeScan() {
                return blkCodeScan;
            }

            /**
             * Sets the value of the blkCodeScan property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.CodeScan.BlkCodeScan }
             */
            public void setBlkCodeScan(PcbDataFile.Machine.CodeScan.BlkCodeScan value) {
                this.blkCodeScan = value;
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
             *       &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BlkCodeScan {

                @XmlAttribute(name = "X1", required = true)
                protected BigDecimal x1;
                @XmlAttribute(name = "Y1", required = true)
                protected BigDecimal y1;
                @XmlAttribute(name = "Mark1", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark1;
                @XmlAttribute(name = "X2", required = true)
                protected BigDecimal x2;
                @XmlAttribute(name = "Y2", required = true)
                protected BigDecimal y2;
                @XmlAttribute(name = "Mark2", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark2;

                /**
                 * Gets the value of the x1 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX1() {
                    return x1;
                }

                /**
                 * Sets the value of the x1 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX1(BigDecimal value) {
                    this.x1 = value;
                }

                /**
                 * Gets the value of the y1 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY1() {
                    return y1;
                }

                /**
                 * Sets the value of the y1 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY1(BigDecimal value) {
                    this.y1 = value;
                }

                /**
                 * Gets the value of the mark1 property.
                 */
                public short getMark1() {
                    return mark1;
                }

                /**
                 * Sets the value of the mark1 property.
                 */
                public void setMark1(short value) {
                    this.mark1 = value;
                }

                /**
                 * Gets the value of the x2 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX2() {
                    return x2;
                }

                /**
                 * Sets the value of the x2 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX2(BigDecimal value) {
                    this.x2 = value;
                }

                /**
                 * Gets the value of the y2 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY2() {
                    return y2;
                }

                /**
                 * Sets the value of the y2 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY2(BigDecimal value) {
                    this.y2 = value;
                }

                /**
                 * Gets the value of the mark2 property.
                 */
                public short getMark2() {
                    return mark2;
                }

                /**
                 * Sets the value of the mark2 property.
                 */
                public void setMark2(short value) {
                    this.mark2 = value;
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
             *       &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CodeScanUse {

                @XmlAttribute(name = "Pcb", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short pcb;
                @XmlAttribute(name = "Blk", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short blk;
                @XmlAttribute(name = "Local", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short local;

                /**
                 * Gets the value of the pcb property.
                 */
                public short getPcb() {
                    return pcb;
                }

                /**
                 * Sets the value of the pcb property.
                 */
                public void setPcb(short value) {
                    this.pcb = value;
                }

                /**
                 * Gets the value of the blk property.
                 */
                public short getBlk() {
                    return blk;
                }

                /**
                 * Sets the value of the blk property.
                 */
                public void setBlk(short value) {
                    this.blk = value;
                }

                /**
                 * Gets the value of the local property.
                 */
                public short getLocal() {
                    return local;
                }

                /**
                 * Sets the value of the local property.
                 */
                public void setLocal(short value) {
                    this.local = value;
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
             *       &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PcbCodeScan {

                @XmlAttribute(name = "X1", required = true)
                protected BigDecimal x1;
                @XmlAttribute(name = "Y1", required = true)
                protected BigDecimal y1;
                @XmlAttribute(name = "Mark1", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark1;
                @XmlAttribute(name = "X2", required = true)
                protected BigDecimal x2;
                @XmlAttribute(name = "Y2", required = true)
                protected BigDecimal y2;
                @XmlAttribute(name = "Mark2", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark2;

                /**
                 * Gets the value of the x1 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX1() {
                    return x1;
                }

                /**
                 * Sets the value of the x1 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX1(BigDecimal value) {
                    this.x1 = value;
                }

                /**
                 * Gets the value of the y1 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY1() {
                    return y1;
                }

                /**
                 * Sets the value of the y1 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY1(BigDecimal value) {
                    this.y1 = value;
                }

                /**
                 * Gets the value of the mark1 property.
                 */
                public short getMark1() {
                    return mark1;
                }

                /**
                 * Sets the value of the mark1 property.
                 */
                public void setMark1(short value) {
                    this.mark1 = value;
                }

                /**
                 * Gets the value of the x2 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX2() {
                    return x2;
                }

                /**
                 * Sets the value of the x2 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX2(BigDecimal value) {
                    this.x2 = value;
                }

                /**
                 * Gets the value of the y2 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY2() {
                    return y2;
                }

                /**
                 * Sets the value of the y2 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY2(BigDecimal value) {
                    this.y2 = value;
                }

                /**
                 * Gets the value of the mark2 property.
                 */
                public short getMark2() {
                    return mark2;
                }

                /**
                 * Sets the value of the mark2 property.
                 */
                public void setMark2(short value) {
                    this.mark2 = value;
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
         *         &lt;element name="FidUse">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PcbFid">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BlkFid">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                "fidUse",
                "pcbFid",
                "blkFid"
        })
        public static class Fiducial {

            @XmlElement(name = "FidUse", required = true)
            protected PcbDataFile.Machine.Fiducial.FidUse fidUse;
            @XmlElement(name = "PcbFid", required = true)
            protected PcbDataFile.Machine.Fiducial.PcbFid pcbFid;
            @XmlElement(name = "BlkFid", required = true)
            protected PcbDataFile.Machine.Fiducial.BlkFid blkFid;

            /**
             * Gets the value of the fidUse property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Fiducial.FidUse }
             */
            public PcbDataFile.Machine.Fiducial.FidUse getFidUse() {
                return fidUse;
            }

            /**
             * Sets the value of the fidUse property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Fiducial.FidUse }
             */
            public void setFidUse(PcbDataFile.Machine.Fiducial.FidUse value) {
                this.fidUse = value;
            }

            /**
             * Gets the value of the pcbFid property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Fiducial.PcbFid }
             */
            public PcbDataFile.Machine.Fiducial.PcbFid getPcbFid() {
                return pcbFid;
            }

            /**
             * Sets the value of the pcbFid property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Fiducial.PcbFid }
             */
            public void setPcbFid(PcbDataFile.Machine.Fiducial.PcbFid value) {
                this.pcbFid = value;
            }

            /**
             * Gets the value of the blkFid property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Fiducial.BlkFid }
             */
            public PcbDataFile.Machine.Fiducial.BlkFid getBlkFid() {
                return blkFid;
            }

            /**
             * Sets the value of the blkFid property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Fiducial.BlkFid }
             */
            public void setBlkFid(PcbDataFile.Machine.Fiducial.BlkFid value) {
                this.blkFid = value;
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
             *       &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BlkFid {

                @XmlAttribute(name = "X1", required = true)
                protected BigDecimal x1;
                @XmlAttribute(name = "Y1", required = true)
                protected BigDecimal y1;
                @XmlAttribute(name = "Mark1", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark1;
                @XmlAttribute(name = "X2", required = true)
                protected BigDecimal x2;
                @XmlAttribute(name = "Y2", required = true)
                protected BigDecimal y2;
                @XmlAttribute(name = "Mark2", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark2;

                /**
                 * Gets the value of the x1 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX1() {
                    return x1;
                }

                /**
                 * Sets the value of the x1 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX1(BigDecimal value) {
                    this.x1 = value;
                }

                /**
                 * Gets the value of the y1 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY1() {
                    return y1;
                }

                /**
                 * Sets the value of the y1 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY1(BigDecimal value) {
                    this.y1 = value;
                }

                /**
                 * Gets the value of the mark1 property.
                 */
                public short getMark1() {
                    return mark1;
                }

                /**
                 * Sets the value of the mark1 property.
                 */
                public void setMark1(short value) {
                    this.mark1 = value;
                }

                /**
                 * Gets the value of the x2 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX2() {
                    return x2;
                }

                /**
                 * Sets the value of the x2 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX2(BigDecimal value) {
                    this.x2 = value;
                }

                /**
                 * Gets the value of the y2 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY2() {
                    return y2;
                }

                /**
                 * Sets the value of the y2 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY2(BigDecimal value) {
                    this.y2 = value;
                }

                /**
                 * Gets the value of the mark2 property.
                 */
                public short getMark2() {
                    return mark2;
                }

                /**
                 * Sets the value of the mark2 property.
                 */
                public void setMark2(short value) {
                    this.mark2 = value;
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
             *       &lt;attribute name="Pcb" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Blk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Local" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FidUse {

                @XmlAttribute(name = "Pcb", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short pcb;
                @XmlAttribute(name = "Blk", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short blk;
                @XmlAttribute(name = "Local", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short local;

                /**
                 * Gets the value of the pcb property.
                 */
                public short getPcb() {
                    return pcb;
                }

                /**
                 * Sets the value of the pcb property.
                 */
                public void setPcb(short value) {
                    this.pcb = value;
                }

                /**
                 * Gets the value of the blk property.
                 */
                public short getBlk() {
                    return blk;
                }

                /**
                 * Sets the value of the blk property.
                 */
                public void setBlk(short value) {
                    this.blk = value;
                }

                /**
                 * Gets the value of the local property.
                 */
                public short getLocal() {
                    return local;
                }

                /**
                 * Sets the value of the local property.
                 */
                public void setLocal(short value) {
                    this.local = value;
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
             *       &lt;attribute name="X1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y1" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="X2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y2" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Mark2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PcbFid {

                @XmlAttribute(name = "X1", required = true)
                protected BigDecimal x1;
                @XmlAttribute(name = "Y1", required = true)
                protected BigDecimal y1;
                @XmlAttribute(name = "Mark1", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark1;
                @XmlAttribute(name = "X2", required = true)
                protected BigDecimal x2;
                @XmlAttribute(name = "Y2", required = true)
                protected BigDecimal y2;
                @XmlAttribute(name = "Mark2", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mark2;

                /**
                 * Gets the value of the x1 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX1() {
                    return x1;
                }

                /**
                 * Sets the value of the x1 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX1(BigDecimal value) {
                    this.x1 = value;
                }

                /**
                 * Gets the value of the y1 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY1() {
                    return y1;
                }

                /**
                 * Sets the value of the y1 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY1(BigDecimal value) {
                    this.y1 = value;
                }

                /**
                 * Gets the value of the mark1 property.
                 */
                public short getMark1() {
                    return mark1;
                }

                /**
                 * Sets the value of the mark1 property.
                 */
                public void setMark1(short value) {
                    this.mark1 = value;
                }

                /**
                 * Gets the value of the x2 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX2() {
                    return x2;
                }

                /**
                 * Sets the value of the x2 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX2(BigDecimal value) {
                    this.x2 = value;
                }

                /**
                 * Gets the value of the y2 property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY2() {
                    return y2;
                }

                /**
                 * Sets the value of the y2 property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY2(BigDecimal value) {
                    this.y2 = value;
                }

                /**
                 * Gets the value of the mark2 property.
                 */
                public short getMark2() {
                    return mark2;
                }

                /**
                 * Sets the value of the mark2 property.
                 */
                public void setMark2(short value) {
                    this.mark2 = value;
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
         *         &lt;element name="Mark" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Mark_001">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="MarkName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LibraryUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LibraryFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LibraryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Mark_011">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="MarkType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Shape" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="OutSize" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Mark_100">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Surface" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="SearchAreaX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="SearchAreaY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="Sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Mark_200">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="LightingOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LightingInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LightingDrop" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LightingIROuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LightingIRInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="FilterInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="FilterOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                "mark"
        })
        public static class Marks {

            @XmlElement(name = "Mark", required = true)
            protected List<PcbDataFile.Machine.Marks.Mark> mark;

            /**
             * Gets the value of the mark property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mark property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMark().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PcbDataFile.Machine.Marks.Mark }
             */
            public List<PcbDataFile.Machine.Marks.Mark> getMark() {
                if (mark == null) {
                    mark = new ArrayList<>();
                }
                return this.mark;
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
             *         &lt;element name="Mark_001">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="MarkName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LibraryUse" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LibraryFolder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LibraryPath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Mark_011">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="MarkType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Shape" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="OutSize" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Mark_100">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Surface" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="SearchAreaX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="SearchAreaY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="Sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Mark_200">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="LightingOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LightingInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LightingDrop" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LightingIROuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LightingIRInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="FilterInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="FilterOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                    "mark001",
                    "mark011",
                    "mark100",
                    "mark200"
            })
            public static class Mark {

                @XmlElement(name = "Mark_001", required = true)
                protected PcbDataFile.Machine.Marks.Mark.Mark001 mark001;
                @XmlElement(name = "Mark_011", required = true)
                protected PcbDataFile.Machine.Marks.Mark.Mark011 mark011;
                @XmlElement(name = "Mark_100", required = true)
                protected PcbDataFile.Machine.Marks.Mark.Mark100 mark100;
                @XmlElement(name = "Mark_200", required = true)
                protected PcbDataFile.Machine.Marks.Mark.Mark200 mark200;
                @XmlAttribute(name = "No", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short no;

                /**
                 * Gets the value of the mark001 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Marks.Mark.Mark001 }
                 */
                public PcbDataFile.Machine.Marks.Mark.Mark001 getMark001() {
                    return mark001;
                }

                /**
                 * Sets the value of the mark001 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Marks.Mark.Mark001 }
                 */
                public void setMark001(PcbDataFile.Machine.Marks.Mark.Mark001 value) {
                    this.mark001 = value;
                }

                /**
                 * Gets the value of the mark011 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Marks.Mark.Mark011 }
                 */
                public PcbDataFile.Machine.Marks.Mark.Mark011 getMark011() {
                    return mark011;
                }

                /**
                 * Sets the value of the mark011 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Marks.Mark.Mark011 }
                 */
                public void setMark011(PcbDataFile.Machine.Marks.Mark.Mark011 value) {
                    this.mark011 = value;
                }

                /**
                 * Gets the value of the mark100 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Marks.Mark.Mark100 }
                 */
                public PcbDataFile.Machine.Marks.Mark.Mark100 getMark100() {
                    return mark100;
                }

                /**
                 * Sets the value of the mark100 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Marks.Mark.Mark100 }
                 */
                public void setMark100(PcbDataFile.Machine.Marks.Mark.Mark100 value) {
                    this.mark100 = value;
                }

                /**
                 * Gets the value of the mark200 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Marks.Mark.Mark200 }
                 */
                public PcbDataFile.Machine.Marks.Mark.Mark200 getMark200() {
                    return mark200;
                }

                /**
                 * Sets the value of the mark200 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Marks.Mark.Mark200 }
                 */
                public void setMark200(PcbDataFile.Machine.Marks.Mark.Mark200 value) {
                    this.mark200 = value;
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
                 *       &lt;attribute name="MarkName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class Mark001 {

                    @XmlAttribute(name = "MarkName", required = true)
                    protected String markName;
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
                     * Gets the value of the markName property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getMarkName() {
                        return markName;
                    }

                    /**
                     * Sets the value of the markName property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setMarkName(String value) {
                        this.markName = value;
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
                 *       &lt;attribute name="MarkType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Shape" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="OutSize" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Mark011 {

                    @XmlAttribute(name = "MarkType", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short markType;
                    @XmlAttribute(name = "Shape", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short shape;
                    @XmlAttribute(name = "Exec", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short exec;
                    @XmlAttribute(name = "OutSize", required = true)
                    protected BigDecimal outSize;

                    /**
                     * Gets the value of the markType property.
                     */
                    public short getMarkType() {
                        return markType;
                    }

                    /**
                     * Sets the value of the markType property.
                     */
                    public void setMarkType(short value) {
                        this.markType = value;
                    }

                    /**
                     * Gets the value of the shape property.
                     */
                    public short getShape() {
                        return shape;
                    }

                    /**
                     * Sets the value of the shape property.
                     */
                    public void setShape(short value) {
                        this.shape = value;
                    }

                    /**
                     * Gets the value of the exec property.
                     */
                    public short getExec() {
                        return exec;
                    }

                    /**
                     * Sets the value of the exec property.
                     */
                    public void setExec(short value) {
                        this.exec = value;
                    }

                    /**
                     * Gets the value of the outSize property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getOutSize() {
                        return outSize;
                    }

                    /**
                     * Sets the value of the outSize property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setOutSize(BigDecimal value) {
                        this.outSize = value;
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
                 *       &lt;attribute name="Surface" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="SearchAreaX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="SearchAreaY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="Sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Mark100 {

                    @XmlAttribute(name = "Surface", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short surface;
                    @XmlAttribute(name = "Threshold", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short threshold;
                    @XmlAttribute(name = "Tolerance", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short tolerance;
                    @XmlAttribute(name = "SearchAreaX", required = true)
                    protected BigDecimal searchAreaX;
                    @XmlAttribute(name = "SearchAreaY", required = true)
                    protected BigDecimal searchAreaY;
                    @XmlAttribute(name = "Sequence", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short sequence;

                    /**
                     * Gets the value of the surface property.
                     */
                    public short getSurface() {
                        return surface;
                    }

                    /**
                     * Sets the value of the surface property.
                     */
                    public void setSurface(short value) {
                        this.surface = value;
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
                     * Gets the value of the searchAreaX property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getSearchAreaX() {
                        return searchAreaX;
                    }

                    /**
                     * Sets the value of the searchAreaX property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setSearchAreaX(BigDecimal value) {
                        this.searchAreaX = value;
                    }

                    /**
                     * Gets the value of the searchAreaY property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getSearchAreaY() {
                        return searchAreaY;
                    }

                    /**
                     * Sets the value of the searchAreaY property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setSearchAreaY(BigDecimal value) {
                        this.searchAreaY = value;
                    }

                    /**
                     * Gets the value of the sequence property.
                     */
                    public short getSequence() {
                        return sequence;
                    }

                    /**
                     * Sets the value of the sequence property.
                     */
                    public void setSequence(short value) {
                        this.sequence = value;
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
                 *       &lt;attribute name="LightingOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="LightingInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="LightingDrop" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="LightingIROuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="LightingIRInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="FilterInner" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="FilterOuter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Mark200 {

                    @XmlAttribute(name = "LightingOuter", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short lightingOuter;
                    @XmlAttribute(name = "LightingInner", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short lightingInner;
                    @XmlAttribute(name = "LightingDrop", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short lightingDrop;
                    @XmlAttribute(name = "LightingIROuter", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short lightingIROuter;
                    @XmlAttribute(name = "LightingIRInner", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short lightingIRInner;
                    @XmlAttribute(name = "FilterInner", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short filterInner;
                    @XmlAttribute(name = "FilterOuter", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short filterOuter;

                    /**
                     * Gets the value of the lightingOuter property.
                     */
                    public short getLightingOuter() {
                        return lightingOuter;
                    }

                    /**
                     * Sets the value of the lightingOuter property.
                     */
                    public void setLightingOuter(short value) {
                        this.lightingOuter = value;
                    }

                    /**
                     * Gets the value of the lightingInner property.
                     */
                    public short getLightingInner() {
                        return lightingInner;
                    }

                    /**
                     * Sets the value of the lightingInner property.
                     */
                    public void setLightingInner(short value) {
                        this.lightingInner = value;
                    }

                    /**
                     * Gets the value of the lightingDrop property.
                     */
                    public short getLightingDrop() {
                        return lightingDrop;
                    }

                    /**
                     * Sets the value of the lightingDrop property.
                     */
                    public void setLightingDrop(short value) {
                        this.lightingDrop = value;
                    }

                    /**
                     * Gets the value of the lightingIROuter property.
                     */
                    public short getLightingIROuter() {
                        return lightingIROuter;
                    }

                    /**
                     * Sets the value of the lightingIROuter property.
                     */
                    public void setLightingIROuter(short value) {
                        this.lightingIROuter = value;
                    }

                    /**
                     * Gets the value of the lightingIRInner property.
                     */
                    public short getLightingIRInner() {
                        return lightingIRInner;
                    }

                    /**
                     * Sets the value of the lightingIRInner property.
                     */
                    public void setLightingIRInner(short value) {
                        this.lightingIRInner = value;
                    }

                    /**
                     * Gets the value of the filterInner property.
                     */
                    public short getFilterInner() {
                        return filterInner;
                    }

                    /**
                     * Sets the value of the filterInner property.
                     */
                    public void setFilterInner(short value) {
                        this.filterInner = value;
                    }

                    /**
                     * Gets the value of the filterOuter property.
                     */
                    public short getFilterOuter() {
                        return filterOuter;
                    }

                    /**
                     * Sets the value of the filterOuter property.
                     */
                    public void setFilterOuter(short value) {
                        this.filterOuter = value;
                    }

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
         *         &lt;element name="Mount" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="R" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Fid" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Bad" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Comp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Group" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Opt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Opt2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Head" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="PickRod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="MountRod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Nozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="OrgBlk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="MaskDX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="MaskDY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="SeqOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                 &lt;attribute name="GroupID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="GrpOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="CodeScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="MntStage" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                "mount"
        })
        public static class Mounts {

            @XmlElement(name = "Mount", required = true)
            protected List<PcbDataFile.Machine.Mounts.Mount> mount;

            /**
             * Gets the value of the mount property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the mount property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMount().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PcbDataFile.Machine.Mounts.Mount }
             */
            public List<PcbDataFile.Machine.Mounts.Mount> getMount() {
                if (mount == null) {
                    mount = new ArrayList<>();
                }
                return this.mount;
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
             *       &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="R" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Fid" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Bad" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Comp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Group" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Opt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Opt2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Head" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="PickRod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="MountRod" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Nozzle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="OrgBlk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="MaskDX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="MaskDY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="SeqOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *       &lt;attribute name="GroupID" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="GrpOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="CodeScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="MntStage" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Mount {

                @XmlAttribute(name = "No", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short no;
                @XmlAttribute(name = "X", required = true)
                protected BigDecimal x;
                @XmlAttribute(name = "Y", required = true)
                protected BigDecimal y;
                @XmlAttribute(name = "R", required = true)
                protected BigDecimal r;
                @XmlAttribute(name = "Fid", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short fid;
                @XmlAttribute(name = "Bad", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short bad;
                @XmlAttribute(name = "Comp", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short comp;
                @XmlAttribute(name = "Group", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short group;
                @XmlAttribute(name = "Opt", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short opt;
                @XmlAttribute(name = "Opt2", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short opt2;
                @XmlAttribute(name = "Head", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short head;
                @XmlAttribute(name = "PickRod", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short pickRod;
                @XmlAttribute(name = "MountRod", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mountRod;
                @XmlAttribute(name = "Nozzle", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short nozzle;
                @XmlAttribute(name = "Exec", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short exec;
                @XmlAttribute(name = "Comment", required = true)
                protected String comment;
                @XmlAttribute(name = "OrgBlk", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short orgBlk;
                @XmlAttribute(name = "MaskDX", required = true)
                protected BigDecimal maskDX;
                @XmlAttribute(name = "MaskDY", required = true)
                protected BigDecimal maskDY;
                @XmlAttribute(name = "SeqOrder", required = true)
                protected byte seqOrder;
                @XmlAttribute(name = "GroupID", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short groupID;
                @XmlAttribute(name = "GrpOrder", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short grpOrder;
                @XmlAttribute(name = "CodeScan", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short codeScan;
                @XmlAttribute(name = "MntStage", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short mntStage;

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
                 * Gets the value of the x property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX() {
                    return x;
                }

                /**
                 * Sets the value of the x property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX(BigDecimal value) {
                    this.x = value;
                }

                /**
                 * Gets the value of the y property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY() {
                    return y;
                }

                /**
                 * Sets the value of the y property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY(BigDecimal value) {
                    this.y = value;
                }

                /**
                 * Gets the value of the r property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getR() {
                    return r;
                }

                /**
                 * Sets the value of the r property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setR(BigDecimal value) {
                    this.r = value;
                }

                /**
                 * Gets the value of the fid property.
                 */
                public short getFid() {
                    return fid;
                }

                /**
                 * Sets the value of the fid property.
                 */
                public void setFid(short value) {
                    this.fid = value;
                }

                /**
                 * Gets the value of the bad property.
                 */
                public short getBad() {
                    return bad;
                }

                /**
                 * Sets the value of the bad property.
                 */
                public void setBad(short value) {
                    this.bad = value;
                }

                /**
                 * Gets the value of the comp property.
                 */
                public short getComp() {
                    return comp;
                }

                /**
                 * Sets the value of the comp property.
                 */
                public void setComp(short value) {
                    this.comp = value;
                }

                /**
                 * Gets the value of the group property.
                 */
                public short getGroup() {
                    return group;
                }

                /**
                 * Sets the value of the group property.
                 */
                public void setGroup(short value) {
                    this.group = value;
                }

                /**
                 * Gets the value of the opt property.
                 */
                public short getOpt() {
                    return opt;
                }

                /**
                 * Sets the value of the opt property.
                 */
                public void setOpt(short value) {
                    this.opt = value;
                }

                /**
                 * Gets the value of the opt2 property.
                 */
                public short getOpt2() {
                    return opt2;
                }

                /**
                 * Sets the value of the opt2 property.
                 */
                public void setOpt2(short value) {
                    this.opt2 = value;
                }

                /**
                 * Gets the value of the head property.
                 */
                public short getHead() {
                    return head;
                }

                /**
                 * Sets the value of the head property.
                 */
                public void setHead(short value) {
                    this.head = value;
                }

                /**
                 * Gets the value of the pickRod property.
                 */
                public short getPickRod() {
                    return pickRod;
                }

                /**
                 * Sets the value of the pickRod property.
                 */
                public void setPickRod(short value) {
                    this.pickRod = value;
                }

                /**
                 * Gets the value of the mountRod property.
                 */
                public short getMountRod() {
                    return mountRod;
                }

                /**
                 * Sets the value of the mountRod property.
                 */
                public void setMountRod(short value) {
                    this.mountRod = value;
                }

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
                 * Gets the value of the exec property.
                 */
                public short getExec() {
                    return exec;
                }

                /**
                 * Sets the value of the exec property.
                 */
                public void setExec(short value) {
                    this.exec = value;
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
                 * Gets the value of the orgBlk property.
                 */
                public short getOrgBlk() {
                    return orgBlk;
                }

                /**
                 * Sets the value of the orgBlk property.
                 */
                public void setOrgBlk(short value) {
                    this.orgBlk = value;
                }

                /**
                 * Gets the value of the maskDX property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getMaskDX() {
                    return maskDX;
                }

                /**
                 * Sets the value of the maskDX property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setMaskDX(BigDecimal value) {
                    this.maskDX = value;
                }

                /**
                 * Gets the value of the maskDY property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getMaskDY() {
                    return maskDY;
                }

                /**
                 * Sets the value of the maskDY property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setMaskDY(BigDecimal value) {
                    this.maskDY = value;
                }

                /**
                 * Gets the value of the seqOrder property.
                 */
                public byte getSeqOrder() {
                    return seqOrder;
                }

                /**
                 * Sets the value of the seqOrder property.
                 */
                public void setSeqOrder(byte value) {
                    this.seqOrder = value;
                }

                /**
                 * Gets the value of the groupID property.
                 */
                public short getGroupID() {
                    return groupID;
                }

                /**
                 * Sets the value of the groupID property.
                 */
                public void setGroupID(short value) {
                    this.groupID = value;
                }

                /**
                 * Gets the value of the grpOrder property.
                 */
                public short getGrpOrder() {
                    return grpOrder;
                }

                /**
                 * Sets the value of the grpOrder property.
                 */
                public void setGrpOrder(short value) {
                    this.grpOrder = value;
                }

                /**
                 * Gets the value of the codeScan property.
                 */
                public short getCodeScan() {
                    return codeScan;
                }

                /**
                 * Sets the value of the codeScan property.
                 */
                public void setCodeScan(short value) {
                    this.codeScan = value;
                }

                /**
                 * Gets the value of the mntStage property.
                 */
                public short getMntStage() {
                    return mntStage;
                }

                /**
                 * Sets the value of the mntStage property.
                 */
                public void setMntStage(short value) {
                    this.mntStage = value;
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
         *         &lt;element name="Repeat" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="R" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                 &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="OrgBlk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                "repeat"
        })
        public static class Offset {

            @XmlElement(name = "Repeat", required = true)
            protected List<PcbDataFile.Machine.Offset.Repeat> repeat;

            /**
             * Gets the value of the repeat property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the repeat property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRepeat().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PcbDataFile.Machine.Offset.Repeat }
             */
            public List<PcbDataFile.Machine.Offset.Repeat> getRepeat() {
                if (repeat == null) {
                    repeat = new ArrayList<>();
                }
                return this.repeat;
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
             *       &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="R" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *       &lt;attribute name="Exec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="OrgBlk" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Repeat {

                @XmlAttribute(name = "No", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short no;
                @XmlAttribute(name = "X", required = true)
                protected BigDecimal x;
                @XmlAttribute(name = "Y", required = true)
                protected BigDecimal y;
                @XmlAttribute(name = "R", required = true)
                protected BigDecimal r;
                @XmlAttribute(name = "Exec", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short exec;
                @XmlAttribute(name = "Comment", required = true)
                protected String comment;
                @XmlAttribute(name = "OrgBlk", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short orgBlk;

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
                 * Gets the value of the x property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getX() {
                    return x;
                }

                /**
                 * Sets the value of the x property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setX(BigDecimal value) {
                    this.x = value;
                }

                /**
                 * Gets the value of the y property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getY() {
                    return y;
                }

                /**
                 * Sets the value of the y property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setY(BigDecimal value) {
                    this.y = value;
                }

                /**
                 * Gets the value of the r property.
                 *
                 * @return possible object is
                 * {@link BigDecimal }
                 */
                public BigDecimal getR() {
                    return r;
                }

                /**
                 * Sets the value of the r property.
                 *
                 * @param value allowed object is
                 *              {@link BigDecimal }
                 */
                public void setR(BigDecimal value) {
                    this.r = value;
                }

                /**
                 * Gets the value of the exec property.
                 */
                public short getExec() {
                    return exec;
                }

                /**
                 * Sets the value of the exec property.
                 */
                public void setExec(short value) {
                    this.exec = value;
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
                 * Gets the value of the orgBlk property.
                 */
                public short getOrgBlk() {
                    return orgBlk;
                }

                /**
                 * Sets the value of the orgBlk property.
                 */
                public void setOrgBlk(short value) {
                    this.orgBlk = value;
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
         *                           &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
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
         *                           &lt;attribute name="ReelDiameter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="BitFlags" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Part_062" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="BaseVType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Option1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Option2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Option3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Option4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
         *                           &lt;attribute name="FdrIdxSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="FeederTimerOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="Optimize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="PartsGroupNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="FixCmp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="SwFdr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="PitchEffect" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Correct3A" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="UnitNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="PickPosCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="PickToleranceX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="PickToleranceY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="PickToleranceR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="PickToleranceOffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="PickToleranceOffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="BoardDataTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="ToleranceTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Part_016" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="OffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="OffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="OffsetR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Part_023" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
         *                   &lt;element name="Part_025" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="RlrWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="LeadLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Part_033" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="LeadNumN" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LeadPitchN" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Part_034" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="LeadNumS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="LeadPitchS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Part_070" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
         *                           &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="CompIntensity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                           &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
         *                           &lt;attribute name="MntInsertLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                           &lt;attribute name="MntInsertShortDistance" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
         *                           &lt;attribute name="SVReverseCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                "part"
        })
        public static class Parts {

            @XmlElement(name = "Part", required = true)
            protected List<PcbDataFile.Machine.Parts.Part> part;

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
             * {@link PcbDataFile.Machine.Parts.Part }
             */
            public List<PcbDataFile.Machine.Parts.Part> getPart() {
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
             *       &lt;sequence>
             *         &lt;element name="Part_001">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="PartsName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
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
             *                 &lt;attribute name="ReelDiameter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="BitFlags" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Part_062" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="BaseVType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Option1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Option2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Option3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Option4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
             *                 &lt;attribute name="FdrIdxSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="FeederTimerOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="Optimize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="PartsGroupNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="FixCmp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="SwFdr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="PitchEffect" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Correct3A" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="UnitNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="PickPosCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="PickToleranceX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="PickToleranceY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="PickToleranceR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="PickToleranceOffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="PickToleranceOffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="BoardDataTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="ToleranceTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Part_016" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="OffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="OffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="OffsetR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="MoldX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="MoldY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="MoldZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Part_023" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
             *         &lt;element name="Part_025" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="RlrWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="LeadLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Part_033" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="LeadNumN" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LeadPitchN" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Part_034" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="LeadNumS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="LeadPitchS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Part_070" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
             *                 &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="CompIntensity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *                 &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
             *                 &lt;attribute name="MntInsertLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                 &lt;attribute name="MntInsertShortDistance" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
             *                 &lt;attribute name="SVReverseCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                    "part062",
                    "part003",
                    "part016",
                    "part023",
                    "part012",
                    "part025",
                    "part033",
                    "part034",
                    "part070",
                    "part013",
                    "part021",
                    "part071",
                    "part072",
                    "part074",
                    "part076",
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
                protected PcbDataFile.Machine.Parts.Part.Part001 part001;
                @XmlElement(name = "Part_002", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part002 part002;
                @XmlElement(name = "Part_062")
                protected PcbDataFile.Machine.Parts.Part.Part062 part062;
                @XmlElement(name = "Part_003", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part003 part003;
                @XmlElement(name = "Part_016")
                protected PcbDataFile.Machine.Parts.Part.Part016 part016;
                @XmlElement(name = "Part_023")
                protected PcbDataFile.Machine.Parts.Part.Part023 part023;
                @XmlElement(name = "Part_012")
                protected PcbDataFile.Machine.Parts.Part.Part012 part012;
                @XmlElement(name = "Part_025")
                protected PcbDataFile.Machine.Parts.Part.Part025 part025;
                @XmlElement(name = "Part_033")
                protected PcbDataFile.Machine.Parts.Part.Part033 part033;
                @XmlElement(name = "Part_034")
                protected PcbDataFile.Machine.Parts.Part.Part034 part034;
                @XmlElement(name = "Part_070")
                protected PcbDataFile.Machine.Parts.Part.Part070 part070;
                @XmlElement(name = "Part_013")
                protected PcbDataFile.Machine.Parts.Part.Part013 part013;
                @XmlElement(name = "Part_021")
                protected PcbDataFile.Machine.Parts.Part.Part021 part021;
                @XmlElement(name = "Part_071")
                protected PcbDataFile.Machine.Parts.Part.Part071 part071;
                @XmlElement(name = "Part_072", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part072 part072;
                @XmlElement(name = "Part_074", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part074 part074;
                @XmlElement(name = "Part_076", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part076 part076;
                @XmlElement(name = "Part_080", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part080 part080;
                @XmlElement(name = "Part_081", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part081 part081;
                @XmlElement(name = "Part_083", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part083 part083;
                @XmlElement(name = "Part_300", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part300 part300;
                @XmlElement(name = "Part_301", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part301 part301;
                @XmlElement(name = "Part_302", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part302 part302;
                @XmlElement(name = "Part_303", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part303 part303;
                @XmlElement(name = "Part_200", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part200 part200;
                @XmlElement(name = "Part_500", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part500 part500;
                @XmlElement(name = "Part_501", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part501 part501;
                @XmlElement(name = "Part_502", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part502 part502;
                @XmlElement(name = "Part_520", required = true)
                protected PcbDataFile.Machine.Parts.Part.Part520 part520;
                @XmlAttribute(name = "No", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short no;

                /**
                 * Gets the value of the part001 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part001 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part001 getPart001() {
                    return part001;
                }

                /**
                 * Sets the value of the part001 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part001 }
                 */
                public void setPart001(PcbDataFile.Machine.Parts.Part.Part001 value) {
                    this.part001 = value;
                }

                /**
                 * Gets the value of the part002 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part002 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part002 getPart002() {
                    return part002;
                }

                /**
                 * Sets the value of the part002 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part002 }
                 */
                public void setPart002(PcbDataFile.Machine.Parts.Part.Part002 value) {
                    this.part002 = value;
                }

                /**
                 * Gets the value of the part062 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part062 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part062 getPart062() {
                    return part062;
                }

                /**
                 * Sets the value of the part062 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part062 }
                 */
                public void setPart062(PcbDataFile.Machine.Parts.Part.Part062 value) {
                    this.part062 = value;
                }

                /**
                 * Gets the value of the part003 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part003 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part003 getPart003() {
                    return part003;
                }

                /**
                 * Sets the value of the part003 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part003 }
                 */
                public void setPart003(PcbDataFile.Machine.Parts.Part.Part003 value) {
                    this.part003 = value;
                }

                /**
                 * Gets the value of the part016 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part016 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part016 getPart016() {
                    return part016;
                }

                /**
                 * Sets the value of the part016 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part016 }
                 */
                public void setPart016(PcbDataFile.Machine.Parts.Part.Part016 value) {
                    this.part016 = value;
                }

                /**
                 * Gets the value of the part023 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part023 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part023 getPart023() {
                    return part023;
                }

                /**
                 * Sets the value of the part023 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part023 }
                 */
                public void setPart023(PcbDataFile.Machine.Parts.Part.Part023 value) {
                    this.part023 = value;
                }

                /**
                 * Gets the value of the part012 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part012 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part012 getPart012() {
                    return part012;
                }

                /**
                 * Sets the value of the part012 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part012 }
                 */
                public void setPart012(PcbDataFile.Machine.Parts.Part.Part012 value) {
                    this.part012 = value;
                }

                /**
                 * Gets the value of the part025 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part025 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part025 getPart025() {
                    return part025;
                }

                /**
                 * Sets the value of the part025 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part025 }
                 */
                public void setPart025(PcbDataFile.Machine.Parts.Part.Part025 value) {
                    this.part025 = value;
                }

                /**
                 * Gets the value of the part033 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part033 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part033 getPart033() {
                    return part033;
                }

                /**
                 * Sets the value of the part033 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part033 }
                 */
                public void setPart033(PcbDataFile.Machine.Parts.Part.Part033 value) {
                    this.part033 = value;
                }

                /**
                 * Gets the value of the part034 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part034 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part034 getPart034() {
                    return part034;
                }

                /**
                 * Sets the value of the part034 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part034 }
                 */
                public void setPart034(PcbDataFile.Machine.Parts.Part.Part034 value) {
                    this.part034 = value;
                }

                /**
                 * Gets the value of the part070 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part070 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part070 getPart070() {
                    return part070;
                }

                /**
                 * Sets the value of the part070 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part070 }
                 */
                public void setPart070(PcbDataFile.Machine.Parts.Part.Part070 value) {
                    this.part070 = value;
                }

                /**
                 * Gets the value of the part013 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part013 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part013 getPart013() {
                    return part013;
                }

                /**
                 * Sets the value of the part013 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part013 }
                 */
                public void setPart013(PcbDataFile.Machine.Parts.Part.Part013 value) {
                    this.part013 = value;
                }

                /**
                 * Gets the value of the part021 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part021 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part021 getPart021() {
                    return part021;
                }

                /**
                 * Sets the value of the part021 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part021 }
                 */
                public void setPart021(PcbDataFile.Machine.Parts.Part.Part021 value) {
                    this.part021 = value;
                }

                /**
                 * Gets the value of the part071 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part071 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part071 getPart071() {
                    return part071;
                }

                /**
                 * Sets the value of the part071 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part071 }
                 */
                public void setPart071(PcbDataFile.Machine.Parts.Part.Part071 value) {
                    this.part071 = value;
                }

                /**
                 * Gets the value of the part072 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part072 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part072 getPart072() {
                    return part072;
                }

                /**
                 * Sets the value of the part072 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part072 }
                 */
                public void setPart072(PcbDataFile.Machine.Parts.Part.Part072 value) {
                    this.part072 = value;
                }

                /**
                 * Gets the value of the part074 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part074 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part074 getPart074() {
                    return part074;
                }

                /**
                 * Sets the value of the part074 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part074 }
                 */
                public void setPart074(PcbDataFile.Machine.Parts.Part.Part074 value) {
                    this.part074 = value;
                }

                /**
                 * Gets the value of the part076 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part076 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part076 getPart076() {
                    return part076;
                }

                /**
                 * Sets the value of the part076 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part076 }
                 */
                public void setPart076(PcbDataFile.Machine.Parts.Part.Part076 value) {
                    this.part076 = value;
                }

                /**
                 * Gets the value of the part080 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part080 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part080 getPart080() {
                    return part080;
                }

                /**
                 * Sets the value of the part080 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part080 }
                 */
                public void setPart080(PcbDataFile.Machine.Parts.Part.Part080 value) {
                    this.part080 = value;
                }

                /**
                 * Gets the value of the part081 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part081 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part081 getPart081() {
                    return part081;
                }

                /**
                 * Sets the value of the part081 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part081 }
                 */
                public void setPart081(PcbDataFile.Machine.Parts.Part.Part081 value) {
                    this.part081 = value;
                }

                /**
                 * Gets the value of the part083 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part083 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part083 getPart083() {
                    return part083;
                }

                /**
                 * Sets the value of the part083 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part083 }
                 */
                public void setPart083(PcbDataFile.Machine.Parts.Part.Part083 value) {
                    this.part083 = value;
                }

                /**
                 * Gets the value of the part300 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part300 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part300 getPart300() {
                    return part300;
                }

                /**
                 * Sets the value of the part300 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part300 }
                 */
                public void setPart300(PcbDataFile.Machine.Parts.Part.Part300 value) {
                    this.part300 = value;
                }

                /**
                 * Gets the value of the part301 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part301 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part301 getPart301() {
                    return part301;
                }

                /**
                 * Sets the value of the part301 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part301 }
                 */
                public void setPart301(PcbDataFile.Machine.Parts.Part.Part301 value) {
                    this.part301 = value;
                }

                /**
                 * Gets the value of the part302 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part302 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part302 getPart302() {
                    return part302;
                }

                /**
                 * Sets the value of the part302 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part302 }
                 */
                public void setPart302(PcbDataFile.Machine.Parts.Part.Part302 value) {
                    this.part302 = value;
                }

                /**
                 * Gets the value of the part303 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part303 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part303 getPart303() {
                    return part303;
                }

                /**
                 * Sets the value of the part303 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part303 }
                 */
                public void setPart303(PcbDataFile.Machine.Parts.Part.Part303 value) {
                    this.part303 = value;
                }

                /**
                 * Gets the value of the part200 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part200 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part200 getPart200() {
                    return part200;
                }

                /**
                 * Sets the value of the part200 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part200 }
                 */
                public void setPart200(PcbDataFile.Machine.Parts.Part.Part200 value) {
                    this.part200 = value;
                }

                /**
                 * Gets the value of the part500 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part500 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part500 getPart500() {
                    return part500;
                }

                /**
                 * Sets the value of the part500 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part500 }
                 */
                public void setPart500(PcbDataFile.Machine.Parts.Part.Part500 value) {
                    this.part500 = value;
                }

                /**
                 * Gets the value of the part501 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part501 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part501 getPart501() {
                    return part501;
                }

                /**
                 * Sets the value of the part501 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part501 }
                 */
                public void setPart501(PcbDataFile.Machine.Parts.Part.Part501 value) {
                    this.part501 = value;
                }

                /**
                 * Gets the value of the part502 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part502 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part502 getPart502() {
                    return part502;
                }

                /**
                 * Sets the value of the part502 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part502 }
                 */
                public void setPart502(PcbDataFile.Machine.Parts.Part.Part502 value) {
                    this.part502 = value;
                }

                /**
                 * Gets the value of the part520 property.
                 *
                 * @return possible object is
                 * {@link PcbDataFile.Machine.Parts.Part.Part520 }
                 */
                public PcbDataFile.Machine.Parts.Part.Part520 getPart520() {
                    return part520;
                }

                /**
                 * Sets the value of the part520 property.
                 *
                 * @param value allowed object is
                 *              {@link PcbDataFile.Machine.Parts.Part.Part520 }
                 */
                public void setPart520(PcbDataFile.Machine.Parts.Part.Part520 value) {
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
                 *       &lt;attribute name="DatabaseNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
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
                    @XmlSchemaType(name = "unsignedShort")
                    protected int databaseNo;
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
                    public int getDatabaseNo() {
                        return databaseNo;
                    }

                    /**
                     * Sets the value of the databaseNo property.
                     */
                    public void setDatabaseNo(int value) {
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
                 *       &lt;attribute name="ReelDiameter" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="BitFlags" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                    @XmlAttribute(name = "ReelDiameter", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short reelDiameter;
                    @XmlAttribute(name = "BitFlags", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short bitFlags;

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

                    /**
                     * Gets the value of the reelDiameter property.
                     */
                    public short getReelDiameter() {
                        return reelDiameter;
                    }

                    /**
                     * Sets the value of the reelDiameter property.
                     */
                    public void setReelDiameter(short value) {
                        this.reelDiameter = value;
                    }

                    /**
                     * Gets the value of the bitFlags property.
                     */
                    public short getBitFlags() {
                        return bitFlags;
                    }

                    /**
                     * Sets the value of the bitFlags property.
                     */
                    public void setBitFlags(short value) {
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
                 *       &lt;attribute name="Setno" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Definition" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="XPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="YPos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="FdrIdxStep" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="FdrIdxSpeed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="FeederTimerOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="Optimize" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="PartsGroupNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="FixCmp" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="SwFdr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="PitchEffect" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Correct3A" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="UnitNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="PickPosCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="PickToleranceX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="PickToleranceY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="PickToleranceR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="PickToleranceOffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="PickToleranceOffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="BoardDataTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="ToleranceTuning" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                    @XmlAttribute(name = "FdrIdxSpeed", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short fdrIdxSpeed;
                    @XmlAttribute(name = "FeederTimerOffset", required = true)
                    protected BigDecimal feederTimerOffset;
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
                    @XmlAttribute(name = "PitchEffect", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short pitchEffect;
                    @XmlAttribute(name = "Correct3A", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short correct3A;
                    @XmlAttribute(name = "UnitNo", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short unitNo;
                    @XmlAttribute(name = "PickPosCheck", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short pickPosCheck;
                    @XmlAttribute(name = "PickToleranceX", required = true)
                    protected BigDecimal pickToleranceX;
                    @XmlAttribute(name = "PickToleranceY", required = true)
                    protected BigDecimal pickToleranceY;
                    @XmlAttribute(name = "PickToleranceR", required = true)
                    protected BigDecimal pickToleranceR;
                    @XmlAttribute(name = "PickToleranceOffsetX", required = true)
                    protected BigDecimal pickToleranceOffsetX;
                    @XmlAttribute(name = "PickToleranceOffsetY", required = true)
                    protected BigDecimal pickToleranceOffsetY;
                    @XmlAttribute(name = "BoardDataTuning", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short boardDataTuning;
                    @XmlAttribute(name = "ToleranceTuning", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short toleranceTuning;

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
                     * Gets the value of the fdrIdxSpeed property.
                     */
                    public short getFdrIdxSpeed() {
                        return fdrIdxSpeed;
                    }

                    /**
                     * Sets the value of the fdrIdxSpeed property.
                     */
                    public void setFdrIdxSpeed(short value) {
                        this.fdrIdxSpeed = value;
                    }

                    /**
                     * Gets the value of the feederTimerOffset property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getFeederTimerOffset() {
                        return feederTimerOffset;
                    }

                    /**
                     * Sets the value of the feederTimerOffset property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setFeederTimerOffset(BigDecimal value) {
                        this.feederTimerOffset = value;
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

                    /**
                     * Gets the value of the pitchEffect property.
                     */
                    public short getPitchEffect() {
                        return pitchEffect;
                    }

                    /**
                     * Sets the value of the pitchEffect property.
                     */
                    public void setPitchEffect(short value) {
                        this.pitchEffect = value;
                    }

                    /**
                     * Gets the value of the correct3A property.
                     */
                    public short getCorrect3A() {
                        return correct3A;
                    }

                    /**
                     * Sets the value of the correct3A property.
                     */
                    public void setCorrect3A(short value) {
                        this.correct3A = value;
                    }

                    /**
                     * Gets the value of the unitNo property.
                     */
                    public short getUnitNo() {
                        return unitNo;
                    }

                    /**
                     * Sets the value of the unitNo property.
                     */
                    public void setUnitNo(short value) {
                        this.unitNo = value;
                    }

                    /**
                     * Gets the value of the pickPosCheck property.
                     */
                    public short getPickPosCheck() {
                        return pickPosCheck;
                    }

                    /**
                     * Sets the value of the pickPosCheck property.
                     */
                    public void setPickPosCheck(short value) {
                        this.pickPosCheck = value;
                    }

                    /**
                     * Gets the value of the pickToleranceX property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getPickToleranceX() {
                        return pickToleranceX;
                    }

                    /**
                     * Sets the value of the pickToleranceX property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setPickToleranceX(BigDecimal value) {
                        this.pickToleranceX = value;
                    }

                    /**
                     * Gets the value of the pickToleranceY property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getPickToleranceY() {
                        return pickToleranceY;
                    }

                    /**
                     * Sets the value of the pickToleranceY property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setPickToleranceY(BigDecimal value) {
                        this.pickToleranceY = value;
                    }

                    /**
                     * Gets the value of the pickToleranceR property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getPickToleranceR() {
                        return pickToleranceR;
                    }

                    /**
                     * Sets the value of the pickToleranceR property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setPickToleranceR(BigDecimal value) {
                        this.pickToleranceR = value;
                    }

                    /**
                     * Gets the value of the pickToleranceOffsetX property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getPickToleranceOffsetX() {
                        return pickToleranceOffsetX;
                    }

                    /**
                     * Sets the value of the pickToleranceOffsetX property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setPickToleranceOffsetX(BigDecimal value) {
                        this.pickToleranceOffsetX = value;
                    }

                    /**
                     * Gets the value of the pickToleranceOffsetY property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getPickToleranceOffsetY() {
                        return pickToleranceOffsetY;
                    }

                    /**
                     * Sets the value of the pickToleranceOffsetY property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setPickToleranceOffsetY(BigDecimal value) {
                        this.pickToleranceOffsetY = value;
                    }

                    /**
                     * Gets the value of the boardDataTuning property.
                     */
                    public short getBoardDataTuning() {
                        return boardDataTuning;
                    }

                    /**
                     * Sets the value of the boardDataTuning property.
                     */
                    public void setBoardDataTuning(short value) {
                        this.boardDataTuning = value;
                    }

                    /**
                     * Gets the value of the toleranceTuning property.
                     */
                    public short getToleranceTuning() {
                        return toleranceTuning;
                    }

                    /**
                     * Sets the value of the toleranceTuning property.
                     */
                    public void setToleranceTuning(short value) {
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
                 *       &lt;attribute name="BodyX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="BodyY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="BodyZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="OffsetX" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="OffsetY" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="OffsetR" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
                public static class Part016 {

                    @XmlAttribute(name = "BodyX", required = true)
                    protected BigDecimal bodyX;
                    @XmlAttribute(name = "BodyY", required = true)
                    protected BigDecimal bodyY;
                    @XmlAttribute(name = "BodyZ", required = true)
                    protected BigDecimal bodyZ;
                    @XmlAttribute(name = "OffsetX", required = true)
                    protected BigDecimal offsetX;
                    @XmlAttribute(name = "OffsetY", required = true)
                    protected BigDecimal offsetY;
                    @XmlAttribute(name = "OffsetR", required = true)
                    protected BigDecimal offsetR;
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
                     * Gets the value of the offsetX property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getOffsetX() {
                        return offsetX;
                    }

                    /**
                     * Sets the value of the offsetX property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setOffsetX(BigDecimal value) {
                        this.offsetX = value;
                    }

                    /**
                     * Gets the value of the offsetY property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getOffsetY() {
                        return offsetY;
                    }

                    /**
                     * Sets the value of the offsetY property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setOffsetY(BigDecimal value) {
                        this.offsetY = value;
                    }

                    /**
                     * Gets the value of the offsetR property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getOffsetR() {
                        return offsetR;
                    }

                    /**
                     * Sets the value of the offsetR property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setOffsetR(BigDecimal value) {
                        this.offsetR = value;
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
                 *       &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part023 {

                    @XmlAttribute(name = "RlrOffset", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short rlrOffset;
                    @XmlAttribute(name = "LeadWidth", required = true)
                    protected BigDecimal leadWidth;

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

                    /**
                     * Gets the value of the leadWidth property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getLeadWidth() {
                        return leadWidth;
                    }

                    /**
                     * Sets the value of the leadWidth property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setLeadWidth(BigDecimal value) {
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
                 *       &lt;attribute name="RlrOffset" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="RlrWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="LeadWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="LeadLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part025 {

                    @XmlAttribute(name = "RlrOffset", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short rlrOffset;
                    @XmlAttribute(name = "RlrWidth", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short rlrWidth;
                    @XmlAttribute(name = "LeadWidth", required = true)
                    protected BigDecimal leadWidth;
                    @XmlAttribute(name = "LeadLength", required = true)
                    protected BigDecimal leadLength;

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
                     * Gets the value of the leadWidth property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getLeadWidth() {
                        return leadWidth;
                    }

                    /**
                     * Sets the value of the leadWidth property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setLeadWidth(BigDecimal value) {
                        this.leadWidth = value;
                    }

                    /**
                     * Gets the value of the leadLength property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getLeadLength() {
                        return leadLength;
                    }

                    /**
                     * Sets the value of the leadLength property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setLeadLength(BigDecimal value) {
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
                 *       &lt;attribute name="LeadNumN" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="LeadPitchN" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part033 {

                    @XmlAttribute(name = "LeadNumN", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short leadNumN;
                    @XmlAttribute(name = "LeadPitchN", required = true)
                    protected BigDecimal leadPitchN;

                    /**
                     * Gets the value of the leadNumN property.
                     */
                    public short getLeadNumN() {
                        return leadNumN;
                    }

                    /**
                     * Sets the value of the leadNumN property.
                     */
                    public void setLeadNumN(short value) {
                        this.leadNumN = value;
                    }

                    /**
                     * Gets the value of the leadPitchN property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getLeadPitchN() {
                        return leadPitchN;
                    }

                    /**
                     * Sets the value of the leadPitchN property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setLeadPitchN(BigDecimal value) {
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
                 *       &lt;attribute name="LeadNumS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="LeadPitchS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part034 {

                    @XmlAttribute(name = "LeadNumS", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short leadNumS;
                    @XmlAttribute(name = "LeadPitchS", required = true)
                    protected BigDecimal leadPitchS;

                    /**
                     * Gets the value of the leadNumS property.
                     */
                    public short getLeadNumS() {
                        return leadNumS;
                    }

                    /**
                     * Sets the value of the leadNumS property.
                     */
                    public void setLeadNumS(short value) {
                        this.leadNumS = value;
                    }

                    /**
                     * Gets the value of the leadPitchS property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getLeadPitchS() {
                        return leadPitchS;
                    }

                    /**
                     * Sets the value of the leadPitchS property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setLeadPitchS(BigDecimal value) {
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
                 *       &lt;attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="BaseVType" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Option1" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Option2" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Option3" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Option4" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part062 {

                    @XmlAttribute(name = "Algorithm", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short algorithm;
                    @XmlAttribute(name = "BaseVType", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short baseVType;
                    @XmlAttribute(name = "Option1", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short option1;
                    @XmlAttribute(name = "Option2", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short option2;
                    @XmlAttribute(name = "Option3", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short option3;
                    @XmlAttribute(name = "Option4", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short option4;

                    /**
                     * Gets the value of the algorithm property.
                     */
                    public short getAlgorithm() {
                        return algorithm;
                    }

                    /**
                     * Sets the value of the algorithm property.
                     */
                    public void setAlgorithm(short value) {
                        this.algorithm = value;
                    }

                    /**
                     * Gets the value of the baseVType property.
                     */
                    public short getBaseVType() {
                        return baseVType;
                    }

                    /**
                     * Sets the value of the baseVType property.
                     */
                    public void setBaseVType(short value) {
                        this.baseVType = value;
                    }

                    /**
                     * Gets the value of the option1 property.
                     */
                    public short getOption1() {
                        return option1;
                    }

                    /**
                     * Sets the value of the option1 property.
                     */
                    public void setOption1(short value) {
                        this.option1 = value;
                    }

                    /**
                     * Gets the value of the option2 property.
                     */
                    public short getOption2() {
                        return option2;
                    }

                    /**
                     * Sets the value of the option2 property.
                     */
                    public void setOption2(short value) {
                        this.option2 = value;
                    }

                    /**
                     * Gets the value of the option3 property.
                     */
                    public short getOption3() {
                        return option3;
                    }

                    /**
                     * Sets the value of the option3 property.
                     */
                    public void setOption3(short value) {
                        this.option3 = value;
                    }

                    /**
                     * Gets the value of the option4 property.
                     */
                    public short getOption4() {
                        return option4;
                    }

                    /**
                     * Sets the value of the option4 property.
                     */
                    public void setOption4(short value) {
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
                 *       &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
                    @XmlAttribute(name = "AlignRefSubMlt", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short alignRefSubMlt;
                    @XmlAttribute(name = "AlignRefSubSgl", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short alignRefSubSgl;
                    @XmlAttribute(name = "AlignRefSubScan", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short alignRefSubScan;
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
                    @XmlAttribute(name = "OffsetRec", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short offsetRec;
                    @XmlAttribute(name = "RecognitionOffsetZ", required = true)
                    protected BigDecimal recognitionOffsetZ;

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
                     * Gets the value of the alignRefSubMlt property.
                     */
                    public short getAlignRefSubMlt() {
                        return alignRefSubMlt;
                    }

                    /**
                     * Sets the value of the alignRefSubMlt property.
                     */
                    public void setAlignRefSubMlt(short value) {
                        this.alignRefSubMlt = value;
                    }

                    /**
                     * Gets the value of the alignRefSubSgl property.
                     */
                    public short getAlignRefSubSgl() {
                        return alignRefSubSgl;
                    }

                    /**
                     * Sets the value of the alignRefSubSgl property.
                     */
                    public void setAlignRefSubSgl(short value) {
                        this.alignRefSubSgl = value;
                    }

                    /**
                     * Gets the value of the alignRefSubScan property.
                     */
                    public short getAlignRefSubScan() {
                        return alignRefSubScan;
                    }

                    /**
                     * Sets the value of the alignRefSubScan property.
                     */
                    public void setAlignRefSubScan(short value) {
                        this.alignRefSubScan = value;
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

                    /**
                     * Gets the value of the offsetRec property.
                     */
                    public short getOffsetRec() {
                        return offsetRec;
                    }

                    /**
                     * Sets the value of the offsetRec property.
                     */
                    public void setOffsetRec(short value) {
                        this.offsetRec = value;
                    }

                    /**
                     * Gets the value of the recognitionOffsetZ property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getRecognitionOffsetZ() {
                        return recognitionOffsetZ;
                    }

                    /**
                     * Sets the value of the recognitionOffsetZ property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setRecognitionOffsetZ(BigDecimal value) {
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
                 *       &lt;attribute name="Alignment" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="AlignRefSubMlt" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="AlignRefSubSgl" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="AlignRefSubScan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="AutoThreshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Threshold" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="Tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="SearchArea" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="DatumAngle" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="CompIntensity" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="MultiMACS" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="OffsetRec" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
                 *       &lt;attribute name="RecognitionOffsetZ" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
                    @XmlAttribute(name = "AlignRefSubMlt", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short alignRefSubMlt;
                    @XmlAttribute(name = "AlignRefSubSgl", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short alignRefSubSgl;
                    @XmlAttribute(name = "AlignRefSubScan", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short alignRefSubScan;
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
                    @XmlAttribute(name = "OffsetRec", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short offsetRec;
                    @XmlAttribute(name = "RecognitionOffsetZ", required = true)
                    protected BigDecimal recognitionOffsetZ;

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
                     * Gets the value of the alignRefSubMlt property.
                     */
                    public short getAlignRefSubMlt() {
                        return alignRefSubMlt;
                    }

                    /**
                     * Sets the value of the alignRefSubMlt property.
                     */
                    public void setAlignRefSubMlt(short value) {
                        this.alignRefSubMlt = value;
                    }

                    /**
                     * Gets the value of the alignRefSubSgl property.
                     */
                    public short getAlignRefSubSgl() {
                        return alignRefSubSgl;
                    }

                    /**
                     * Sets the value of the alignRefSubSgl property.
                     */
                    public void setAlignRefSubSgl(short value) {
                        this.alignRefSubSgl = value;
                    }

                    /**
                     * Gets the value of the alignRefSubScan property.
                     */
                    public short getAlignRefSubScan() {
                        return alignRefSubScan;
                    }

                    /**
                     * Sets the value of the alignRefSubScan property.
                     */
                    public void setAlignRefSubScan(short value) {
                        this.alignRefSubScan = value;
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

                    /**
                     * Gets the value of the offsetRec property.
                     */
                    public short getOffsetRec() {
                        return offsetRec;
                    }

                    /**
                     * Sets the value of the offsetRec property.
                     */
                    public void setOffsetRec(short value) {
                        this.offsetRec = value;
                    }

                    /**
                     * Gets the value of the recognitionOffsetZ property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getRecognitionOffsetZ() {
                        return recognitionOffsetZ;
                    }

                    /**
                     * Sets the value of the recognitionOffsetZ property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setRecognitionOffsetZ(BigDecimal value) {
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
                 *       &lt;attribute name="MntInsertLength" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *       &lt;attribute name="MntInsertShortDistance" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
                    @XmlAttribute(name = "MntInsertLength", required = true)
                    protected BigDecimal mntInsertLength;
                    @XmlAttribute(name = "MntInsertShortDistance", required = true)
                    protected BigDecimal mntInsertShortDistance;

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

                    /**
                     * Gets the value of the mntInsertLength property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getMntInsertLength() {
                        return mntInsertLength;
                    }

                    /**
                     * Sets the value of the mntInsertLength property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setMntInsertLength(BigDecimal value) {
                        this.mntInsertLength = value;
                    }

                    /**
                     * Gets the value of the mntInsertShortDistance property.
                     *
                     * @return possible object is
                     * {@link BigDecimal }
                     */
                    public BigDecimal getMntInsertShortDistance() {
                        return mntInsertShortDistance;
                    }

                    /**
                     * Sets the value of the mntInsertShortDistance property.
                     *
                     * @param value allowed object is
                     *              {@link BigDecimal }
                     */
                    public void setMntInsertShortDistance(BigDecimal value) {
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
                 *       &lt;attribute name="SVReverseCheck" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                    @XmlAttribute(name = "SVReverseCheck", required = true)
                    @XmlSchemaType(name = "unsignedByte")
                    protected short svReverseCheck;

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

                    /**
                     * Gets the value of the svReverseCheck property.
                     */
                    public short getSVReverseCheck() {
                        return svReverseCheck;
                    }

                    /**
                     * Sets the value of the svReverseCheck property.
                     */
                    public void setSVReverseCheck(short value) {
                        this.svReverseCheck = value;
                    }

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
         *         &lt;element name="ProductGroup">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *                 &lt;attribute name="Lane" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
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
                "productGroup"
        })
        public static class Production {

            @XmlElement(name = "ProductGroup", required = true)
            protected PcbDataFile.Machine.Production.ProductGroup productGroup;

            /**
             * Gets the value of the productGroup property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Production.ProductGroup }
             */
            public PcbDataFile.Machine.Production.ProductGroup getProductGroup() {
                return productGroup;
            }

            /**
             * Sets the value of the productGroup property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Production.ProductGroup }
             */
            public void setProductGroup(PcbDataFile.Machine.Production.ProductGroup value) {
                this.productGroup = value;
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
             *       &lt;attribute name="No" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *       &lt;attribute name="Lane" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ProductGroup {

                @XmlAttribute(name = "No", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short no;
                @XmlAttribute(name = "Lane", required = true)
                @XmlSchemaType(name = "unsignedByte")
                protected short lane;

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
                 * Gets the value of the lane property.
                 */
                public short getLane() {
                    return lane;
                }

                /**
                 * Sets the value of the lane property.
                 */
                public void setLane(short value) {
                    this.lane = value;
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
         *         &lt;element name="Program">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Commands" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="LocalPoints" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="Watches" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                 &lt;/sequence>
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
                "program"
        })
        public static class Programs {

            @XmlElement(name = "Program", required = true)
            protected PcbDataFile.Machine.Programs.Program program;

            /**
             * Gets the value of the program property.
             *
             * @return possible object is
             * {@link PcbDataFile.Machine.Programs.Program }
             */
            public PcbDataFile.Machine.Programs.Program getProgram() {
                return program;
            }

            /**
             * Sets the value of the program property.
             *
             * @param value allowed object is
             *              {@link PcbDataFile.Machine.Programs.Program }
             */
            public void setProgram(PcbDataFile.Machine.Programs.Program value) {
                this.program = value;
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
             *         &lt;element name="Commands" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="LocalPoints" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="Watches" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "commands",
                    "localPoints",
                    "watches"
            })
            public static class Program {

                @XmlElement(name = "Commands", required = true)
                protected Object commands;
                @XmlElement(name = "LocalPoints", required = true)
                protected Object localPoints;
                @XmlElement(name = "Watches", required = true)
                protected Object watches;

                /**
                 * Gets the value of the commands property.
                 *
                 * @return possible object is
                 * {@link Object }
                 */
                public Object getCommands() {
                    return commands;
                }

                /**
                 * Sets the value of the commands property.
                 *
                 * @param value allowed object is
                 *              {@link Object }
                 */
                public void setCommands(Object value) {
                    this.commands = value;
                }

                /**
                 * Gets the value of the localPoints property.
                 *
                 * @return possible object is
                 * {@link Object }
                 */
                public Object getLocalPoints() {
                    return localPoints;
                }

                /**
                 * Sets the value of the localPoints property.
                 *
                 * @param value allowed object is
                 *              {@link Object }
                 */
                public void setLocalPoints(Object value) {
                    this.localPoints = value;
                }

                /**
                 * Gets the value of the watches property.
                 *
                 * @return possible object is
                 * {@link Object }
                 */
                public Object getWatches() {
                    return watches;
                }

                /**
                 * Sets the value of the watches property.
                 *
                 * @param value allowed object is
                 *              {@link Object }
                 */
                public void setWatches(Object value) {
                    this.watches = value;
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
         *       &lt;attribute name="LastEditingDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="LastEditingTime" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
         *       &lt;attribute name="VersionNo" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Property {

            @XmlAttribute(name = "LastEditingDate", required = true)
            protected String lastEditingDate;
            @XmlAttribute(name = "LastEditingTime", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar lastEditingTime;
            @XmlAttribute(name = "VersionNo", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short versionNo;

            /**
             * Gets the value of the lastEditingDate property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getLastEditingDate() {
                return lastEditingDate;
            }

            /**
             * Sets the value of the lastEditingDate property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setLastEditingDate(String value) {
                this.lastEditingDate = value;
            }

            /**
             * Gets the value of the lastEditingTime property.
             *
             * @return possible object is
             * {@link XMLGregorianCalendar }
             */
            public XMLGregorianCalendar getLastEditingTime() {
                return lastEditingTime;
            }

            /**
             * Sets the value of the lastEditingTime property.
             *
             * @param value allowed object is
             *              {@link XMLGregorianCalendar }
             */
            public void setLastEditingTime(XMLGregorianCalendar value) {
                this.lastEditingTime = value;
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

    }

}

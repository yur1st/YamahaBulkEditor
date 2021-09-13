
package com.editor.domain.program;

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
 *                   &lt;element name="SetupMachine">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="No" use="required" type="{}Wstring" />
 *                           &lt;attribute name="Name" use="required" type="{}Wstring" />
 *                           &lt;attribute name="ID" use="required" type="{}Wstring" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Date" use="required" type="{}Wstring" />
 *                 &lt;attribute name="Time" use="required" type="{}Wstring" />
 *                 &lt;attribute name="VersionNo" use="required" type="{}Wstring" />
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
 *                           &lt;attribute name="LastEditingDate" use="required" type="{}Wstring" />
 *                           &lt;attribute name="LastEditingTime" use="required" type="{}Wstring" />
 *                           &lt;attribute name="VersionNo" use="required" type="{}Wstring" />
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
 *                                     &lt;attribute name="No" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Lane" use="required" type="{}Wstring" />
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
 *                                     &lt;attribute name="OriginX" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="OriginY" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="SizeX" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="SizeY" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="BlockCount" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="SizeZ" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="PcbWarpHeight" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TransOffsetU" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TransOffsetT1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TransOffsetT2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="BoardStandardCT" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="BoardStandardPlanTime" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="CarriedPosCheck" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="CarriedPosCheckValue" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="CarriedPosCheckDetail" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="CarriedPosCheckMark" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="CarriedPosCheckMarkX" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="CarriedPosCheckMarkY" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="BoardEdgeOffsetDistanceLowerLeft" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="BoardEdgeOffsetDistanceLowerRight" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="BoardEdgeOffsetDistanceUpperLeft" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="BoardEdgeOffsetDistanceUpperRight" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="MountStagePosition" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_101">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="PcbFixWay" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="ConvPreFixTimer" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TransHeight" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="ConvTimer" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="YSpeed" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TransMode" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="ConvSpeed" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="PartHeight" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="ConvTransWay" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TransferOneByOne" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_102">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="MountExec" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="VacCheck" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Alignment" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="CoPlanarity" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="PrePick" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="RetrySeq" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="SkipRetry" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="PositionFreeSetup" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TrayPre" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="FixedComp" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Correct3A" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="InterfereAvoidance" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="MountSequenceMethod" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_103">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="BadSortA" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="BadSortB" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="BadSortC" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_104">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Comment" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_105">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="PreDisp" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="DotDisp" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="DotCheck" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Refresh" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="PosCorDisp" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="PosCorPreDisp" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_106">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="SpecialFunction" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_107">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="PushUpPinSetupManagement" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_108">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="HeadA1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA3" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA4" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA5" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA6" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA7" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA8" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA9" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA10" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA11" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA12" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA13" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA14" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA15" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadA16" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_109">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="HeadB1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB3" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB4" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB5" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB6" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB7" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB8" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB9" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB10" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB11" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB12" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB13" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB14" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB15" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="HeadB16" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_110">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="TempControlA1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TempControlA2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TempControlA3" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TempControlA4" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TempControlA5" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TempControlA6" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TempControlA7" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TempControlA8" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Board_111">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="TargetTempA1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TargetTempA2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TargetTempA3" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TargetTempA4" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TargetTempA5" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TargetTempA6" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TargetTempA7" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="TargetTempA8" use="required" type="{}Wstring" />
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
 *                                     &lt;attribute name="Pcb" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Blk" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Local" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PcbFid">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="X2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark2" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BlkFid">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="X2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark2" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LclFid" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="No" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="X1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="X2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Type" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Skip" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Comment" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
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
 *                                     &lt;attribute name="Pcb" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Blk" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Local" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PcbBad">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BlkBad">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark" use="required" type="{}Wstring" />
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
 *                                     &lt;attribute name="No" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="X" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="R" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Exec" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Comment" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
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
 *                                     &lt;attribute name="No" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="X" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="R" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Fid" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Bad" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Comp" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Group" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Opt" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Opt2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Head" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="PickRod" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="MountRod" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Nozzle" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Exec" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Comment" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="MaskDX" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="MaskDY" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="SeqOrder" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="GroupID" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="GrpOrder" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="CodeScan" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="MntStage" use="required" type="{}Wstring" />
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
 *                                       &lt;choice maxOccurs="unbounded">
 *                                         &lt;element name="Part_001">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="PartsName" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Comment" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_002">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="ShapeType" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Package" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="FdrType" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="CarrierTape" type="{}Wstring" />
 *                                                 &lt;attribute name="ReelDiameter" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="BitFlags" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_062">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Algorithm" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="BaseVType" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option1" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option2" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option3" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option4" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_003">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Setno" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Definition" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="XPos" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="YPos" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="FdrIdxStep" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="FdrIdxSpeed" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="FdrIdxSpeedEx" type="{}Wstring" />
 *                                                 &lt;attribute name="FeederTimerOffset" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="TapeEndDetection" type="{}Wstring" />
 *                                                 &lt;attribute name="FeederKnotSkip" type="{}Wstring" />
 *                                                 &lt;attribute name="FeederKnotSpeed" type="{}Wstring" />
 *                                                 &lt;attribute name="Optimize" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PartsGroupNo" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="FixCmp" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="SwFdr" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PitchEffect" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Correct3A" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="UnitNo" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PickPosCheck" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PickToleranceX" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PickToleranceY" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PickToleranceR" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PickToleranceOffsetX" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PickToleranceOffsetY" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="BoardDataTuning" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="ToleranceTuning" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_004">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="FreeSpace1" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="FreeSpace2" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_012">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="BodyX" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="BodyY" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MoldX" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MoldY" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_013">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="BodyX" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="BodyY" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MoldX" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MoldY" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Thicknesschk" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_028">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="RlrOffsetE" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LeadNumE" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LeadPitchE" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LeadWidthE" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LeadLengthE" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_018">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="PolMark" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PolMarkPos" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PackSizeX" type="{}Wstring" />
 *                                                 &lt;attribute name="PackSizeY" type="{}Wstring" />
 *                                                 &lt;attribute name="PackOffsetX" type="{}Wstring" />
 *                                                 &lt;attribute name="PackOffsetY" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_025">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LeadLength" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_033">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="LeadNumN" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LeadPitchN" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_034">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="LeadNumS" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LeadPitchS" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_070">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Alignment" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Threshold" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_021">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_071">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Alignment" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Threshold" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="CompIntensity" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_072">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="LightSetting" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LightLevel" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_074">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="CoplaLevel" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="CoplaThreshold" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_076">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="LightMode" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MainLightLevel" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="CoaxsLightLevel" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="SideLightLevel" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_080">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Nozzle" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="XYSpeed" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="ConvYSpeed" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="RotarySpeed" type="{}Wstring" />
 *                                                 &lt;attribute name="FdrAngle" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="VacChk" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="CorrectPos" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Action" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PickStart" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Dump" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Retry" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_081">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="PckHeight" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PckTimer" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PckSpeed" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PckVLevel" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PckSingleDir" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PckCtrlDown" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PckCtrlUp" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="NozzleTouchHeight" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_083">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="MntHeight" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MntTimer" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MntSpeed" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MntPLevel" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MntSingleDir" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MntCtrlDown" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MntCtrlUp" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MntInsertLength" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MntInsertShortDistance" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_300">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Pck2ndSrvDown" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Pck2ndSrvUp" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_301">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Mnt2ndSrvDown" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Mnt2ndSrvUp" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_302">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="PckForceExist" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="PckForceTarget" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_303">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="MntForceExist" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="MntForceTarget" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_200">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="DspCType" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DNozzle" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Dtimer" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DXpos" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DYpos" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DspAngle" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DXpt" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DYpt" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DXtime" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DYtime" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_500">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Category" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="DipAct" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="StampAct" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Marking" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_501">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Option1StationNo" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option1WaitVision" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option1DownSequenceAir" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option12ndSrvDown" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option1DownSpeed" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option1LowendHeight" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option1LowendTimer" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option1UpSequenceAir" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option12ndSrvUp" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option1UpSpeed" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_502">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="Option1ForceExist" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="Option1ForceTarget" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_520">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="SVUse" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="SVBringBack" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="SVBodyLimit" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="SVReverseCheck" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="Part_023">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
 *                                                 &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="ExLights">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="ExLight" maxOccurs="unbounded">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;attribute name="No" use="required" type="{}Wstring" />
 *                                                           &lt;attribute name="ExLightLevel" use="required" type="{}Wstring" />
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="No" use="required" type="{}Wstring" />
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
 *                                               &lt;attribute name="MarkName" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="Comment" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Mark_011">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="MarkType" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="Shape" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="Exec" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="OutSize" use="required" type="{}Wstring" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Mark_100">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Surface" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="Threshold" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="SearchAreaX" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="SearchAreaY" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="Sequence" use="required" type="{}Wstring" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Mark_200">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LightingOuter" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="LightingInner" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="LightingDrop" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="LightingIROuter" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="LightingIRInner" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="FilterInner" use="required" type="{}Wstring" />
 *                                               &lt;attribute name="FilterOuter" use="required" type="{}Wstring" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="No" use="required" type="{}Wstring" />
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
 *                                     &lt;attribute name="Pcb" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Blk" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Local" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PcbCodeScan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="X2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark2" use="required" type="{}Wstring" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="BlkCodeScan">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="X1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark1" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="X2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Y2" use="required" type="{}Wstring" />
 *                                     &lt;attribute name="Mark2" use="required" type="{}Wstring" />
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
 *                 &lt;attribute name="No" use="required" type="{}Wstring" />
 *                 &lt;attribute name="MachineType" use="required" type="{}Wstring" />
 *                 &lt;attribute name="SubMachineType" use="required" type="{}Wstring" />
 *                 &lt;attribute name="Version" use="required" type="{}Wstring" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
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
     * @param value
     *     allowed object is
     *     {@link PcbDataFile.LastEditing }
     *
     */
    public void setLastEditing(PcbDataFile.LastEditing value) {
        this.lastEditing = value;
    }

    /**
     * Gets the value of the machine property.
     *
     * @return
     *     possible object is
     *     {@link PcbDataFile.Machine }
     *
     */
    public PcbDataFile.Machine getMachine() {
        return machine;
    }

    /**
     * Sets the value of the machine property.
     *
     * @param value
     *     allowed object is
     *     {@link PcbDataFile.Machine }
     *
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
     *                 &lt;attribute name="No" use="required" type="{}Wstring" />
     *                 &lt;attribute name="Name" use="required" type="{}Wstring" />
     *                 &lt;attribute name="ID" use="required" type="{}Wstring" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Date" use="required" type="{}Wstring" />
     *       &lt;attribute name="Time" use="required" type="{}Wstring" />
     *       &lt;attribute name="VersionNo" use="required" type="{}Wstring" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
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
        protected String time;
        @XmlAttribute(name = "VersionNo", required = true)
        protected String versionNo;

        /**
         * Gets the value of the setupMachine property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.LastEditing.SetupMachine }
         *
         */
        public PcbDataFile.LastEditing.SetupMachine getSetupMachine() {
            return setupMachine;
        }

        /**
         * Sets the value of the setupMachine property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.LastEditing.SetupMachine }
         *
         */
        public void setSetupMachine(PcbDataFile.LastEditing.SetupMachine value) {
            this.setupMachine = value;
        }

        /**
         * Gets the value of the date property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
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


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="No" use="required" type="{}Wstring" />
         *       &lt;attribute name="Name" use="required" type="{}Wstring" />
         *       &lt;attribute name="ID" use="required" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SetupMachine {

            @XmlAttribute(name = "No", required = true)
            protected String no;
            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "ID", required = true)
            protected String id;

            /**
             * Gets the value of the no property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNo() {
                return no;
            }

            /**
             * Sets the value of the no property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNo(String value) {
                this.no = value;
            }

            /**
             * Gets the value of the name property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the id property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setID(String value) {
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
     *                 &lt;attribute name="LastEditingDate" use="required" type="{}Wstring" />
     *                 &lt;attribute name="LastEditingTime" use="required" type="{}Wstring" />
     *                 &lt;attribute name="VersionNo" use="required" type="{}Wstring" />
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
     *                           &lt;attribute name="No" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Lane" use="required" type="{}Wstring" />
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
     *                           &lt;attribute name="OriginX" use="required" type="{}Wstring" />
     *                           &lt;attribute name="OriginY" use="required" type="{}Wstring" />
     *                           &lt;attribute name="SizeX" use="required" type="{}Wstring" />
     *                           &lt;attribute name="SizeY" use="required" type="{}Wstring" />
     *                           &lt;attribute name="BlockCount" use="required" type="{}Wstring" />
     *                           &lt;attribute name="SizeZ" use="required" type="{}Wstring" />
     *                           &lt;attribute name="PcbWarpHeight" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TransOffsetU" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TransOffsetT1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TransOffsetT2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="BoardStandardCT" use="required" type="{}Wstring" />
     *                           &lt;attribute name="BoardStandardPlanTime" use="required" type="{}Wstring" />
     *                           &lt;attribute name="CarriedPosCheck" use="required" type="{}Wstring" />
     *                           &lt;attribute name="CarriedPosCheckValue" use="required" type="{}Wstring" />
     *                           &lt;attribute name="CarriedPosCheckDetail" use="required" type="{}Wstring" />
     *                           &lt;attribute name="CarriedPosCheckMark" use="required" type="{}Wstring" />
     *                           &lt;attribute name="CarriedPosCheckMarkX" use="required" type="{}Wstring" />
     *                           &lt;attribute name="CarriedPosCheckMarkY" use="required" type="{}Wstring" />
     *                           &lt;attribute name="BoardEdgeOffsetDistanceLowerLeft" use="required" type="{}Wstring" />
     *                           &lt;attribute name="BoardEdgeOffsetDistanceLowerRight" use="required" type="{}Wstring" />
     *                           &lt;attribute name="BoardEdgeOffsetDistanceUpperLeft" use="required" type="{}Wstring" />
     *                           &lt;attribute name="BoardEdgeOffsetDistanceUpperRight" use="required" type="{}Wstring" />
     *                           &lt;attribute name="MountStagePosition" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_101">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PcbFixWay" use="required" type="{}Wstring" />
     *                           &lt;attribute name="ConvPreFixTimer" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TransHeight" use="required" type="{}Wstring" />
     *                           &lt;attribute name="ConvTimer" use="required" type="{}Wstring" />
     *                           &lt;attribute name="YSpeed" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TransMode" use="required" type="{}Wstring" />
     *                           &lt;attribute name="ConvSpeed" use="required" type="{}Wstring" />
     *                           &lt;attribute name="PartHeight" use="required" type="{}Wstring" />
     *                           &lt;attribute name="ConvTransWay" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TransferOneByOne" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_102">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="MountExec" use="required" type="{}Wstring" />
     *                           &lt;attribute name="VacCheck" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Alignment" use="required" type="{}Wstring" />
     *                           &lt;attribute name="CoPlanarity" use="required" type="{}Wstring" />
     *                           &lt;attribute name="PrePick" use="required" type="{}Wstring" />
     *                           &lt;attribute name="RetrySeq" use="required" type="{}Wstring" />
     *                           &lt;attribute name="SkipRetry" use="required" type="{}Wstring" />
     *                           &lt;attribute name="PositionFreeSetup" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TrayPre" use="required" type="{}Wstring" />
     *                           &lt;attribute name="FixedComp" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Correct3A" use="required" type="{}Wstring" />
     *                           &lt;attribute name="InterfereAvoidance" use="required" type="{}Wstring" />
     *                           &lt;attribute name="MountSequenceMethod" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_103">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="BadSortA" use="required" type="{}Wstring" />
     *                           &lt;attribute name="BadSortB" use="required" type="{}Wstring" />
     *                           &lt;attribute name="BadSortC" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_104">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Comment" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_105">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PreDisp" use="required" type="{}Wstring" />
     *                           &lt;attribute name="DotDisp" use="required" type="{}Wstring" />
     *                           &lt;attribute name="DotCheck" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Refresh" use="required" type="{}Wstring" />
     *                           &lt;attribute name="PosCorDisp" use="required" type="{}Wstring" />
     *                           &lt;attribute name="PosCorPreDisp" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_106">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="SpecialFunction" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_107">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="PushUpPinSetupManagement" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_108">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="HeadA1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA3" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA4" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA5" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA6" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA7" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA8" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA9" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA10" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA11" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA12" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA13" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA14" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA15" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadA16" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_109">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="HeadB1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB3" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB4" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB5" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB6" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB7" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB8" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB9" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB10" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB11" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB12" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB13" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB14" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB15" use="required" type="{}Wstring" />
     *                           &lt;attribute name="HeadB16" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_110">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="TempControlA1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TempControlA2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TempControlA3" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TempControlA4" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TempControlA5" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TempControlA6" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TempControlA7" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TempControlA8" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Board_111">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="TargetTempA1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TargetTempA2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TargetTempA3" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TargetTempA4" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TargetTempA5" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TargetTempA6" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TargetTempA7" use="required" type="{}Wstring" />
     *                           &lt;attribute name="TargetTempA8" use="required" type="{}Wstring" />
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
     *                           &lt;attribute name="Pcb" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Blk" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Local" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PcbFid">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="X2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark2" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BlkFid">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="X2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark2" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LclFid" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="No" use="required" type="{}Wstring" />
     *                           &lt;attribute name="X1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="X2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Type" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Skip" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Comment" use="required" type="{}Wstring" />
     *                           &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
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
     *                           &lt;attribute name="Pcb" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Blk" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Local" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PcbBad">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BlkBad">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark" use="required" type="{}Wstring" />
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
     *                           &lt;attribute name="No" use="required" type="{}Wstring" />
     *                           &lt;attribute name="X" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y" use="required" type="{}Wstring" />
     *                           &lt;attribute name="R" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Exec" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Comment" use="required" type="{}Wstring" />
     *                           &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
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
     *                           &lt;attribute name="No" use="required" type="{}Wstring" />
     *                           &lt;attribute name="X" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y" use="required" type="{}Wstring" />
     *                           &lt;attribute name="R" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Fid" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Bad" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Comp" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Group" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Opt" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Opt2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Head" use="required" type="{}Wstring" />
     *                           &lt;attribute name="PickRod" use="required" type="{}Wstring" />
     *                           &lt;attribute name="MountRod" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Nozzle" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Exec" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Comment" use="required" type="{}Wstring" />
     *                           &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
     *                           &lt;attribute name="MaskDX" use="required" type="{}Wstring" />
     *                           &lt;attribute name="MaskDY" use="required" type="{}Wstring" />
     *                           &lt;attribute name="SeqOrder" use="required" type="{}Wstring" />
     *                           &lt;attribute name="GroupID" use="required" type="{}Wstring" />
     *                           &lt;attribute name="GrpOrder" use="required" type="{}Wstring" />
     *                           &lt;attribute name="CodeScan" use="required" type="{}Wstring" />
     *                           &lt;attribute name="MntStage" use="required" type="{}Wstring" />
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
     *                             &lt;choice maxOccurs="unbounded">
     *                               &lt;element name="Part_001">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="PartsName" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Comment" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_002">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="ShapeType" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Package" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="FdrType" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="CarrierTape" type="{}Wstring" />
     *                                       &lt;attribute name="ReelDiameter" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="BitFlags" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_062">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Algorithm" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="BaseVType" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option1" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option2" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option3" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option4" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_003">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Setno" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Definition" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="XPos" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="YPos" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="FdrIdxStep" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="FdrIdxSpeed" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="FdrIdxSpeedEx" type="{}Wstring" />
     *                                       &lt;attribute name="FeederTimerOffset" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="TapeEndDetection" type="{}Wstring" />
     *                                       &lt;attribute name="FeederKnotSkip" type="{}Wstring" />
     *                                       &lt;attribute name="FeederKnotSpeed" type="{}Wstring" />
     *                                       &lt;attribute name="Optimize" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PartsGroupNo" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="FixCmp" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="SwFdr" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PitchEffect" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Correct3A" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="UnitNo" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PickPosCheck" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PickToleranceX" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PickToleranceY" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PickToleranceR" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PickToleranceOffsetX" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PickToleranceOffsetY" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="BoardDataTuning" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="ToleranceTuning" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_004">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="FreeSpace1" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="FreeSpace2" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_012">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="BodyX" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="BodyY" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MoldX" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MoldY" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_013">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="BodyX" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="BodyY" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MoldX" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MoldY" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Thicknesschk" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_028">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="RlrOffsetE" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LeadNumE" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LeadPitchE" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LeadWidthE" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LeadLengthE" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_018">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="PolMark" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PolMarkPos" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PackSizeX" type="{}Wstring" />
     *                                       &lt;attribute name="PackSizeY" type="{}Wstring" />
     *                                       &lt;attribute name="PackOffsetX" type="{}Wstring" />
     *                                       &lt;attribute name="PackOffsetY" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_025">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LeadLength" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_033">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="LeadNumN" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LeadPitchN" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_034">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="LeadNumS" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LeadPitchS" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_070">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Alignment" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Threshold" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_021">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_071">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Alignment" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Threshold" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="CompIntensity" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_072">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="LightSetting" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LightLevel" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_074">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="CoplaLevel" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="CoplaThreshold" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_076">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="LightMode" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MainLightLevel" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="CoaxsLightLevel" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="SideLightLevel" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_080">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Nozzle" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="XYSpeed" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="ConvYSpeed" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="RotarySpeed" type="{}Wstring" />
     *                                       &lt;attribute name="FdrAngle" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="VacChk" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="CorrectPos" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Action" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PickStart" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Dump" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Retry" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_081">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="PckHeight" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PckTimer" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PckSpeed" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PckVLevel" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PckSingleDir" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PckCtrlDown" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PckCtrlUp" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="NozzleTouchHeight" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_083">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="MntHeight" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MntTimer" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MntSpeed" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MntPLevel" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MntSingleDir" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MntCtrlDown" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MntCtrlUp" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MntInsertLength" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MntInsertShortDistance" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_300">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Pck2ndSrvDown" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Pck2ndSrvUp" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_301">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Mnt2ndSrvDown" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Mnt2ndSrvUp" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_302">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="PckForceExist" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="PckForceTarget" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_303">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="MntForceExist" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="MntForceTarget" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_200">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="DspCType" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DNozzle" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Dtimer" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DXpos" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DYpos" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DspAngle" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DXpt" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DYpt" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DXtime" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DYtime" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_500">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Category" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="DipAct" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="StampAct" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Marking" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_501">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Option1StationNo" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option1WaitVision" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option1DownSequenceAir" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option12ndSrvDown" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option1DownSpeed" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option1LowendHeight" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option1LowendTimer" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option1UpSequenceAir" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option12ndSrvUp" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option1UpSpeed" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_502">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="Option1ForceExist" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="Option1ForceTarget" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_520">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="SVUse" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="SVBringBack" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="SVBodyLimit" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="SVReverseCheck" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="Part_023">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
     *                                       &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="ExLights">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="ExLight" maxOccurs="unbounded">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;attribute name="No" use="required" type="{}Wstring" />
     *                                                 &lt;attribute name="ExLightLevel" use="required" type="{}Wstring" />
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                           &lt;attribute name="No" use="required" type="{}Wstring" />
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
     *                                     &lt;attribute name="MarkName" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="Comment" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Mark_011">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="MarkType" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="Shape" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="Exec" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="OutSize" use="required" type="{}Wstring" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Mark_100">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Surface" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="Threshold" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="SearchAreaX" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="SearchAreaY" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="Sequence" use="required" type="{}Wstring" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Mark_200">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LightingOuter" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="LightingInner" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="LightingDrop" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="LightingIROuter" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="LightingIRInner" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="FilterInner" use="required" type="{}Wstring" />
     *                                     &lt;attribute name="FilterOuter" use="required" type="{}Wstring" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="No" use="required" type="{}Wstring" />
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
     *                           &lt;attribute name="Pcb" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Blk" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Local" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PcbCodeScan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="X2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark2" use="required" type="{}Wstring" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BlkCodeScan">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="X1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark1" use="required" type="{}Wstring" />
     *                           &lt;attribute name="X2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Y2" use="required" type="{}Wstring" />
     *                           &lt;attribute name="Mark2" use="required" type="{}Wstring" />
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
     *       &lt;attribute name="No" use="required" type="{}Wstring" />
     *       &lt;attribute name="MachineType" use="required" type="{}Wstring" />
     *       &lt;attribute name="SubMachineType" use="required" type="{}Wstring" />
     *       &lt;attribute name="Version" use="required" type="{}Wstring" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
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
        protected String no;
        @XmlAttribute(name = "MachineType", required = true)
        protected String machineType;
        @XmlAttribute(name = "SubMachineType", required = true)
        protected String subMachineType;
        @XmlAttribute(name = "Version", required = true)
        protected String version;

        /**
         * Gets the value of the property property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.Property }
         *
         */
        public PcbDataFile.Machine.Property getProperty() {
            return property;
        }

        /**
         * Sets the value of the property property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.Property }
         *
         */
        public void setProperty(PcbDataFile.Machine.Property value) {
            this.property = value;
        }

        /**
         * Gets the value of the production property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.Production }
         *
         */
        public PcbDataFile.Machine.Production getProduction() {
            return production;
        }

        /**
         * Sets the value of the production property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.Production }
         *
         */
        public void setProduction(PcbDataFile.Machine.Production value) {
            this.production = value;
        }

        /**
         * Gets the value of the board property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.Board }
         *
         */
        public PcbDataFile.Machine.Board getBoard() {
            return board;
        }

        /**
         * Sets the value of the board property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.Board }
         *
         */
        public void setBoard(PcbDataFile.Machine.Board value) {
            this.board = value;
        }

        /**
         * Gets the value of the fiducial property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.Fiducial }
         *
         */
        public PcbDataFile.Machine.Fiducial getFiducial() {
            return fiducial;
        }

        /**
         * Sets the value of the fiducial property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.Fiducial }
         *
         */
        public void setFiducial(PcbDataFile.Machine.Fiducial value) {
            this.fiducial = value;
        }

        /**
         * Gets the value of the badMark property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.BadMark }
         *
         */
        public PcbDataFile.Machine.BadMark getBadMark() {
            return badMark;
        }

        /**
         * Sets the value of the badMark property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.BadMark }
         *
         */
        public void setBadMark(PcbDataFile.Machine.BadMark value) {
            this.badMark = value;
        }

        /**
         * Gets the value of the offset property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.Offset }
         *
         */
        public PcbDataFile.Machine.Offset getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.Offset }
         *
         */
        public void setOffset(PcbDataFile.Machine.Offset value) {
            this.offset = value;
        }

        /**
         * Gets the value of the mounts property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.Mounts }
         *
         */
        public PcbDataFile.Machine.Mounts getMounts() {
            return mounts;
        }

        /**
         * Sets the value of the mounts property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.Mounts }
         *
         */
        public void setMounts(PcbDataFile.Machine.Mounts value) {
            this.mounts = value;
        }

        /**
         * Gets the value of the programs property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.Programs }
         *
         */
        public PcbDataFile.Machine.Programs getPrograms() {
            return programs;
        }

        /**
         * Sets the value of the programs property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.Programs }
         *
         */
        public void setPrograms(PcbDataFile.Machine.Programs value) {
            this.programs = value;
        }

        /**
         * Gets the value of the globalPoints property.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        public Object getGlobalPoints() {
            return globalPoints;
        }

        /**
         * Sets the value of the globalPoints property.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
        public void setGlobalPoints(Object value) {
            this.globalPoints = value;
        }

        /**
         * Gets the value of the preDispenses property.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        public Object getPreDispenses() {
            return preDispenses;
        }

        /**
         * Sets the value of the preDispenses property.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
        public void setPreDispenses(Object value) {
            this.preDispenses = value;
        }

        /**
         * Gets the value of the dotDispenses property.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        public Object getDotDispenses() {
            return dotDispenses;
        }

        /**
         * Sets the value of the dotDispenses property.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
        public void setDotDispenses(Object value) {
            this.dotDispenses = value;
        }

        /**
         * Gets the value of the posCorDispenses property.
         *
         * @return
         *     possible object is
         *     {@link Object }
         *
         */
        public Object getPosCorDispenses() {
            return posCorDispenses;
        }

        /**
         * Sets the value of the posCorDispenses property.
         *
         * @param value
         *     allowed object is
         *     {@link Object }
         *
         */
        public void setPosCorDispenses(Object value) {
            this.posCorDispenses = value;
        }

        /**
         * Gets the value of the parts property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.Parts }
         *
         */
        public PcbDataFile.Machine.Parts getParts() {
            return parts;
        }

        /**
         * Sets the value of the parts property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.Parts }
         *
         */
        public void setParts(PcbDataFile.Machine.Parts value) {
            this.parts = value;
        }

        /**
         * Gets the value of the marks property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.Marks }
         *
         */
        public PcbDataFile.Machine.Marks getMarks() {
            return marks;
        }

        /**
         * Sets the value of the marks property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.Marks }
         *
         */
        public void setMarks(PcbDataFile.Machine.Marks value) {
            this.marks = value;
        }

        /**
         * Gets the value of the codeScan property.
         *
         * @return
         *     possible object is
         *     {@link PcbDataFile.Machine.CodeScan }
         *
         */
        public PcbDataFile.Machine.CodeScan getCodeScan() {
            return codeScan;
        }

        /**
         * Sets the value of the codeScan property.
         *
         * @param value
         *     allowed object is
         *     {@link PcbDataFile.Machine.CodeScan }
         *
         */
        public void setCodeScan(PcbDataFile.Machine.CodeScan value) {
            this.codeScan = value;
        }

        /**
         * Gets the value of the no property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNo() {
            return no;
        }

        /**
         * Sets the value of the no property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNo(String value) {
            this.no = value;
        }

        /**
         * Gets the value of the machineType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMachineType() {
            return machineType;
        }

        /**
         * Sets the value of the machineType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMachineType(String value) {
            this.machineType = value;
        }

        /**
         * Gets the value of the subMachineType property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSubMachineType() {
            return subMachineType;
        }

        /**
         * Sets the value of the subMachineType property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSubMachineType(String value) {
            this.subMachineType = value;
        }

        /**
         * Gets the value of the version property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
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
         *                 &lt;attribute name="Pcb" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Blk" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Local" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PcbBad">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BlkBad">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
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
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.BadMark.BadUse }
             *
             */
            public PcbDataFile.Machine.BadMark.BadUse getBadUse() {
                return badUse;
            }

            /**
             * Sets the value of the badUse property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.BadMark.BadUse }
             *
             */
            public void setBadUse(PcbDataFile.Machine.BadMark.BadUse value) {
                this.badUse = value;
            }

            /**
             * Gets the value of the pcbBad property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.BadMark.PcbBad }
             *
             */
            public PcbDataFile.Machine.BadMark.PcbBad getPcbBad() {
                return pcbBad;
            }

            /**
             * Sets the value of the pcbBad property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.BadMark.PcbBad }
             *
             */
            public void setPcbBad(PcbDataFile.Machine.BadMark.PcbBad value) {
                this.pcbBad = value;
            }

            /**
             * Gets the value of the blkBad property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.BadMark.BlkBad }
             *
             */
            public PcbDataFile.Machine.BadMark.BlkBad getBlkBad() {
                return blkBad;
            }

            /**
             * Sets the value of the blkBad property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.BadMark.BlkBad }
             *
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
             *       &lt;attribute name="Pcb" use="required" type="{}Wstring" />
             *       &lt;attribute name="Blk" use="required" type="{}Wstring" />
             *       &lt;attribute name="Local" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BadUse {

                @XmlAttribute(name = "Pcb", required = true)
                protected String pcb;
                @XmlAttribute(name = "Blk", required = true)
                protected String blk;
                @XmlAttribute(name = "Local", required = true)
                protected String local;

                /**
                 * Gets the value of the pcb property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPcb() {
                    return pcb;
                }

                /**
                 * Sets the value of the pcb property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPcb(String value) {
                    this.pcb = value;
                }

                /**
                 * Gets the value of the blk property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBlk() {
                    return blk;
                }

                /**
                 * Sets the value of the blk property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBlk(String value) {
                    this.blk = value;
                }

                /**
                 * Gets the value of the local property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getLocal() {
                    return local;
                }

                /**
                 * Sets the value of the local property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setLocal(String value) {
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
             *       &lt;attribute name="X" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BlkBad {

                @XmlAttribute(name = "X", required = true)
                protected String x;
                @XmlAttribute(name = "Y", required = true)
                protected String y;
                @XmlAttribute(name = "Mark", required = true)
                protected String mark;

                /**
                 * Gets the value of the x property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getX() {
                    return x;
                }

                /**
                 * Sets the value of the x property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setX(String value) {
                    this.x = value;
                }

                /**
                 * Gets the value of the y property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getY() {
                    return y;
                }

                /**
                 * Sets the value of the y property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setY(String value) {
                    this.y = value;
                }

                /**
                 * Gets the value of the mark property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMark() {
                    return mark;
                }

                /**
                 * Sets the value of the mark property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMark(String value) {
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
             *       &lt;attribute name="X" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PcbBad {

                @XmlAttribute(name = "X", required = true)
                protected String x;
                @XmlAttribute(name = "Y", required = true)
                protected String y;
                @XmlAttribute(name = "Mark", required = true)
                protected String mark;

                /**
                 * Gets the value of the x property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getX() {
                    return x;
                }

                /**
                 * Sets the value of the x property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setX(String value) {
                    this.x = value;
                }

                /**
                 * Gets the value of the y property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getY() {
                    return y;
                }

                /**
                 * Sets the value of the y property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setY(String value) {
                    this.y = value;
                }

                /**
                 * Gets the value of the mark property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMark() {
                    return mark;
                }

                /**
                 * Sets the value of the mark property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMark(String value) {
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
         *                 &lt;attribute name="OriginX" use="required" type="{}Wstring" />
         *                 &lt;attribute name="OriginY" use="required" type="{}Wstring" />
         *                 &lt;attribute name="SizeX" use="required" type="{}Wstring" />
         *                 &lt;attribute name="SizeY" use="required" type="{}Wstring" />
         *                 &lt;attribute name="BlockCount" use="required" type="{}Wstring" />
         *                 &lt;attribute name="SizeZ" use="required" type="{}Wstring" />
         *                 &lt;attribute name="PcbWarpHeight" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TransOffsetU" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TransOffsetT1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TransOffsetT2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="BoardStandardCT" use="required" type="{}Wstring" />
         *                 &lt;attribute name="BoardStandardPlanTime" use="required" type="{}Wstring" />
         *                 &lt;attribute name="CarriedPosCheck" use="required" type="{}Wstring" />
         *                 &lt;attribute name="CarriedPosCheckValue" use="required" type="{}Wstring" />
         *                 &lt;attribute name="CarriedPosCheckDetail" use="required" type="{}Wstring" />
         *                 &lt;attribute name="CarriedPosCheckMark" use="required" type="{}Wstring" />
         *                 &lt;attribute name="CarriedPosCheckMarkX" use="required" type="{}Wstring" />
         *                 &lt;attribute name="CarriedPosCheckMarkY" use="required" type="{}Wstring" />
         *                 &lt;attribute name="BoardEdgeOffsetDistanceLowerLeft" use="required" type="{}Wstring" />
         *                 &lt;attribute name="BoardEdgeOffsetDistanceLowerRight" use="required" type="{}Wstring" />
         *                 &lt;attribute name="BoardEdgeOffsetDistanceUpperLeft" use="required" type="{}Wstring" />
         *                 &lt;attribute name="BoardEdgeOffsetDistanceUpperRight" use="required" type="{}Wstring" />
         *                 &lt;attribute name="MountStagePosition" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_101">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PcbFixWay" use="required" type="{}Wstring" />
         *                 &lt;attribute name="ConvPreFixTimer" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TransHeight" use="required" type="{}Wstring" />
         *                 &lt;attribute name="ConvTimer" use="required" type="{}Wstring" />
         *                 &lt;attribute name="YSpeed" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TransMode" use="required" type="{}Wstring" />
         *                 &lt;attribute name="ConvSpeed" use="required" type="{}Wstring" />
         *                 &lt;attribute name="PartHeight" use="required" type="{}Wstring" />
         *                 &lt;attribute name="ConvTransWay" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TransferOneByOne" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_102">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="MountExec" use="required" type="{}Wstring" />
         *                 &lt;attribute name="VacCheck" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Alignment" use="required" type="{}Wstring" />
         *                 &lt;attribute name="CoPlanarity" use="required" type="{}Wstring" />
         *                 &lt;attribute name="PrePick" use="required" type="{}Wstring" />
         *                 &lt;attribute name="RetrySeq" use="required" type="{}Wstring" />
         *                 &lt;attribute name="SkipRetry" use="required" type="{}Wstring" />
         *                 &lt;attribute name="PositionFreeSetup" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TrayPre" use="required" type="{}Wstring" />
         *                 &lt;attribute name="FixedComp" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Correct3A" use="required" type="{}Wstring" />
         *                 &lt;attribute name="InterfereAvoidance" use="required" type="{}Wstring" />
         *                 &lt;attribute name="MountSequenceMethod" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_103">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="BadSortA" use="required" type="{}Wstring" />
         *                 &lt;attribute name="BadSortB" use="required" type="{}Wstring" />
         *                 &lt;attribute name="BadSortC" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_104">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Comment" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_105">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PreDisp" use="required" type="{}Wstring" />
         *                 &lt;attribute name="DotDisp" use="required" type="{}Wstring" />
         *                 &lt;attribute name="DotCheck" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Refresh" use="required" type="{}Wstring" />
         *                 &lt;attribute name="PosCorDisp" use="required" type="{}Wstring" />
         *                 &lt;attribute name="PosCorPreDisp" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_106">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="SpecialFunction" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_107">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="PushUpPinSetupManagement" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_108">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="HeadA1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA3" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA4" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA5" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA6" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA7" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA8" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA9" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA10" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA11" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA12" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA13" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA14" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA15" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadA16" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_109">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="HeadB1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB3" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB4" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB5" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB6" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB7" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB8" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB9" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB10" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB11" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB12" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB13" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB14" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB15" use="required" type="{}Wstring" />
         *                 &lt;attribute name="HeadB16" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_110">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="TempControlA1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TempControlA2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TempControlA3" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TempControlA4" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TempControlA5" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TempControlA6" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TempControlA7" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TempControlA8" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Board_111">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="TargetTempA1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TargetTempA2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TargetTempA3" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TargetTempA4" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TargetTempA5" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TargetTempA6" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TargetTempA7" use="required" type="{}Wstring" />
         *                 &lt;attribute name="TargetTempA8" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
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
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board000 }
             *
             */
            public PcbDataFile.Machine.Board.Board000 getBoard000() {
                return board000;
            }

            /**
             * Sets the value of the board000 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board000 }
             *
             */
            public void setBoard000(PcbDataFile.Machine.Board.Board000 value) {
                this.board000 = value;
            }

            /**
             * Gets the value of the board101 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board101 }
             *
             */
            public PcbDataFile.Machine.Board.Board101 getBoard101() {
                return board101;
            }

            /**
             * Sets the value of the board101 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board101 }
             *
             */
            public void setBoard101(PcbDataFile.Machine.Board.Board101 value) {
                this.board101 = value;
            }

            /**
             * Gets the value of the board102 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board102 }
             *
             */
            public PcbDataFile.Machine.Board.Board102 getBoard102() {
                return board102;
            }

            /**
             * Sets the value of the board102 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board102 }
             *
             */
            public void setBoard102(PcbDataFile.Machine.Board.Board102 value) {
                this.board102 = value;
            }

            /**
             * Gets the value of the board103 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board103 }
             *
             */
            public PcbDataFile.Machine.Board.Board103 getBoard103() {
                return board103;
            }

            /**
             * Sets the value of the board103 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board103 }
             *
             */
            public void setBoard103(PcbDataFile.Machine.Board.Board103 value) {
                this.board103 = value;
            }

            /**
             * Gets the value of the board104 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board104 }
             *
             */
            public PcbDataFile.Machine.Board.Board104 getBoard104() {
                return board104;
            }

            /**
             * Sets the value of the board104 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board104 }
             *
             */
            public void setBoard104(PcbDataFile.Machine.Board.Board104 value) {
                this.board104 = value;
            }

            /**
             * Gets the value of the board105 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board105 }
             *
             */
            public PcbDataFile.Machine.Board.Board105 getBoard105() {
                return board105;
            }

            /**
             * Sets the value of the board105 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board105 }
             *
             */
            public void setBoard105(PcbDataFile.Machine.Board.Board105 value) {
                this.board105 = value;
            }

            /**
             * Gets the value of the board106 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board106 }
             *
             */
            public PcbDataFile.Machine.Board.Board106 getBoard106() {
                return board106;
            }

            /**
             * Sets the value of the board106 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board106 }
             *
             */
            public void setBoard106(PcbDataFile.Machine.Board.Board106 value) {
                this.board106 = value;
            }

            /**
             * Gets the value of the board107 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board107 }
             *
             */
            public PcbDataFile.Machine.Board.Board107 getBoard107() {
                return board107;
            }

            /**
             * Sets the value of the board107 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board107 }
             *
             */
            public void setBoard107(PcbDataFile.Machine.Board.Board107 value) {
                this.board107 = value;
            }

            /**
             * Gets the value of the board108 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board108 }
             *
             */
            public PcbDataFile.Machine.Board.Board108 getBoard108() {
                return board108;
            }

            /**
             * Sets the value of the board108 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board108 }
             *
             */
            public void setBoard108(PcbDataFile.Machine.Board.Board108 value) {
                this.board108 = value;
            }

            /**
             * Gets the value of the board109 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board109 }
             *
             */
            public PcbDataFile.Machine.Board.Board109 getBoard109() {
                return board109;
            }

            /**
             * Sets the value of the board109 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board109 }
             *
             */
            public void setBoard109(PcbDataFile.Machine.Board.Board109 value) {
                this.board109 = value;
            }

            /**
             * Gets the value of the board110 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board110 }
             *
             */
            public PcbDataFile.Machine.Board.Board110 getBoard110() {
                return board110;
            }

            /**
             * Sets the value of the board110 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board110 }
             *
             */
            public void setBoard110(PcbDataFile.Machine.Board.Board110 value) {
                this.board110 = value;
            }

            /**
             * Gets the value of the board111 property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Board.Board111 }
             *
             */
            public PcbDataFile.Machine.Board.Board111 getBoard111() {
                return board111;
            }

            /**
             * Sets the value of the board111 property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Board.Board111 }
             *
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
             *       &lt;attribute name="OriginX" use="required" type="{}Wstring" />
             *       &lt;attribute name="OriginY" use="required" type="{}Wstring" />
             *       &lt;attribute name="SizeX" use="required" type="{}Wstring" />
             *       &lt;attribute name="SizeY" use="required" type="{}Wstring" />
             *       &lt;attribute name="BlockCount" use="required" type="{}Wstring" />
             *       &lt;attribute name="SizeZ" use="required" type="{}Wstring" />
             *       &lt;attribute name="PcbWarpHeight" use="required" type="{}Wstring" />
             *       &lt;attribute name="TransOffsetU" use="required" type="{}Wstring" />
             *       &lt;attribute name="TransOffsetT1" use="required" type="{}Wstring" />
             *       &lt;attribute name="TransOffsetT2" use="required" type="{}Wstring" />
             *       &lt;attribute name="BoardStandardCT" use="required" type="{}Wstring" />
             *       &lt;attribute name="BoardStandardPlanTime" use="required" type="{}Wstring" />
             *       &lt;attribute name="CarriedPosCheck" use="required" type="{}Wstring" />
             *       &lt;attribute name="CarriedPosCheckValue" use="required" type="{}Wstring" />
             *       &lt;attribute name="CarriedPosCheckDetail" use="required" type="{}Wstring" />
             *       &lt;attribute name="CarriedPosCheckMark" use="required" type="{}Wstring" />
             *       &lt;attribute name="CarriedPosCheckMarkX" use="required" type="{}Wstring" />
             *       &lt;attribute name="CarriedPosCheckMarkY" use="required" type="{}Wstring" />
             *       &lt;attribute name="BoardEdgeOffsetDistanceLowerLeft" use="required" type="{}Wstring" />
             *       &lt;attribute name="BoardEdgeOffsetDistanceLowerRight" use="required" type="{}Wstring" />
             *       &lt;attribute name="BoardEdgeOffsetDistanceUpperLeft" use="required" type="{}Wstring" />
             *       &lt;attribute name="BoardEdgeOffsetDistanceUpperRight" use="required" type="{}Wstring" />
             *       &lt;attribute name="MountStagePosition" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board000 {

                @XmlAttribute(name = "OriginX", required = true)
                protected String originX;
                @XmlAttribute(name = "OriginY", required = true)
                protected String originY;
                @XmlAttribute(name = "SizeX", required = true)
                protected String sizeX;
                @XmlAttribute(name = "SizeY", required = true)
                protected String sizeY;
                @XmlAttribute(name = "BlockCount", required = true)
                protected String blockCount;
                @XmlAttribute(name = "SizeZ", required = true)
                protected String sizeZ;
                @XmlAttribute(name = "PcbWarpHeight", required = true)
                protected String pcbWarpHeight;
                @XmlAttribute(name = "TransOffsetU", required = true)
                protected String transOffsetU;
                @XmlAttribute(name = "TransOffsetT1", required = true)
                protected String transOffsetT1;
                @XmlAttribute(name = "TransOffsetT2", required = true)
                protected String transOffsetT2;
                @XmlAttribute(name = "BoardStandardCT", required = true)
                protected String boardStandardCT;
                @XmlAttribute(name = "BoardStandardPlanTime", required = true)
                protected String boardStandardPlanTime;
                @XmlAttribute(name = "CarriedPosCheck", required = true)
                protected String carriedPosCheck;
                @XmlAttribute(name = "CarriedPosCheckValue", required = true)
                protected String carriedPosCheckValue;
                @XmlAttribute(name = "CarriedPosCheckDetail", required = true)
                protected String carriedPosCheckDetail;
                @XmlAttribute(name = "CarriedPosCheckMark", required = true)
                protected String carriedPosCheckMark;
                @XmlAttribute(name = "CarriedPosCheckMarkX", required = true)
                protected String carriedPosCheckMarkX;
                @XmlAttribute(name = "CarriedPosCheckMarkY", required = true)
                protected String carriedPosCheckMarkY;
                @XmlAttribute(name = "BoardEdgeOffsetDistanceLowerLeft", required = true)
                protected String boardEdgeOffsetDistanceLowerLeft;
                @XmlAttribute(name = "BoardEdgeOffsetDistanceLowerRight", required = true)
                protected String boardEdgeOffsetDistanceLowerRight;
                @XmlAttribute(name = "BoardEdgeOffsetDistanceUpperLeft", required = true)
                protected String boardEdgeOffsetDistanceUpperLeft;
                @XmlAttribute(name = "BoardEdgeOffsetDistanceUpperRight", required = true)
                protected String boardEdgeOffsetDistanceUpperRight;
                @XmlAttribute(name = "MountStagePosition", required = true)
                protected String mountStagePosition;

                /**
                 * Gets the value of the originX property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getOriginX() {
                    return originX;
                }

                /**
                 * Sets the value of the originX property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOriginX(String value) {
                    this.originX = value;
                }

                /**
                 * Gets the value of the originY property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getOriginY() {
                    return originY;
                }

                /**
                 * Sets the value of the originY property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOriginY(String value) {
                    this.originY = value;
                }

                /**
                 * Gets the value of the sizeX property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSizeX() {
                    return sizeX;
                }

                /**
                 * Sets the value of the sizeX property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSizeX(String value) {
                    this.sizeX = value;
                }

                /**
                 * Gets the value of the sizeY property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSizeY() {
                    return sizeY;
                }

                /**
                 * Sets the value of the sizeY property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSizeY(String value) {
                    this.sizeY = value;
                }

                /**
                 * Gets the value of the blockCount property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBlockCount() {
                    return blockCount;
                }

                /**
                 * Sets the value of the blockCount property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBlockCount(String value) {
                    this.blockCount = value;
                }

                /**
                 * Gets the value of the sizeZ property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSizeZ() {
                    return sizeZ;
                }

                /**
                 * Sets the value of the sizeZ property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSizeZ(String value) {
                    this.sizeZ = value;
                }

                /**
                 * Gets the value of the pcbWarpHeight property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getPcbWarpHeight() {
                    return pcbWarpHeight;
                }

                /**
                 * Sets the value of the pcbWarpHeight property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setPcbWarpHeight(String value) {
                    this.pcbWarpHeight = value;
                }

                /**
                 * Gets the value of the transOffsetU property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getTransOffsetU() {
                    return transOffsetU;
                }

                /**
                 * Sets the value of the transOffsetU property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTransOffsetU(String value) {
                    this.transOffsetU = value;
                }

                /**
                 * Gets the value of the transOffsetT1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTransOffsetT1() {
                    return transOffsetT1;
                }

                /**
                 * Sets the value of the transOffsetT1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTransOffsetT1(String value) {
                    this.transOffsetT1 = value;
                }

                /**
                 * Gets the value of the transOffsetT2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTransOffsetT2() {
                    return transOffsetT2;
                }

                /**
                 * Sets the value of the transOffsetT2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTransOffsetT2(String value) {
                    this.transOffsetT2 = value;
                }

                /**
                 * Gets the value of the boardStandardCT property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBoardStandardCT() {
                    return boardStandardCT;
                }

                /**
                 * Sets the value of the boardStandardCT property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBoardStandardCT(String value) {
                    this.boardStandardCT = value;
                }

                /**
                 * Gets the value of the boardStandardPlanTime property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBoardStandardPlanTime() {
                    return boardStandardPlanTime;
                }

                /**
                 * Sets the value of the boardStandardPlanTime property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBoardStandardPlanTime(String value) {
                    this.boardStandardPlanTime = value;
                }

                /**
                 * Gets the value of the carriedPosCheck property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCarriedPosCheck() {
                    return carriedPosCheck;
                }

                /**
                 * Sets the value of the carriedPosCheck property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCarriedPosCheck(String value) {
                    this.carriedPosCheck = value;
                }

                /**
                 * Gets the value of the carriedPosCheckValue property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCarriedPosCheckValue() {
                    return carriedPosCheckValue;
                }

                /**
                 * Sets the value of the carriedPosCheckValue property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCarriedPosCheckValue(String value) {
                    this.carriedPosCheckValue = value;
                }

                /**
                 * Gets the value of the carriedPosCheckDetail property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCarriedPosCheckDetail() {
                    return carriedPosCheckDetail;
                }

                /**
                 * Sets the value of the carriedPosCheckDetail property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCarriedPosCheckDetail(String value) {
                    this.carriedPosCheckDetail = value;
                }

                /**
                 * Gets the value of the carriedPosCheckMark property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCarriedPosCheckMark() {
                    return carriedPosCheckMark;
                }

                /**
                 * Sets the value of the carriedPosCheckMark property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCarriedPosCheckMark(String value) {
                    this.carriedPosCheckMark = value;
                }

                /**
                 * Gets the value of the carriedPosCheckMarkX property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCarriedPosCheckMarkX() {
                    return carriedPosCheckMarkX;
                }

                /**
                 * Sets the value of the carriedPosCheckMarkX property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCarriedPosCheckMarkX(String value) {
                    this.carriedPosCheckMarkX = value;
                }

                /**
                 * Gets the value of the carriedPosCheckMarkY property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCarriedPosCheckMarkY() {
                    return carriedPosCheckMarkY;
                }

                /**
                 * Sets the value of the carriedPosCheckMarkY property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCarriedPosCheckMarkY(String value) {
                    this.carriedPosCheckMarkY = value;
                }

                /**
                 * Gets the value of the boardEdgeOffsetDistanceLowerLeft property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBoardEdgeOffsetDistanceLowerLeft() {
                    return boardEdgeOffsetDistanceLowerLeft;
                }

                /**
                 * Sets the value of the boardEdgeOffsetDistanceLowerLeft property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBoardEdgeOffsetDistanceLowerLeft(String value) {
                    this.boardEdgeOffsetDistanceLowerLeft = value;
                }

                /**
                 * Gets the value of the boardEdgeOffsetDistanceLowerRight property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBoardEdgeOffsetDistanceLowerRight() {
                    return boardEdgeOffsetDistanceLowerRight;
                }

                /**
                 * Sets the value of the boardEdgeOffsetDistanceLowerRight property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBoardEdgeOffsetDistanceLowerRight(String value) {
                    this.boardEdgeOffsetDistanceLowerRight = value;
                }

                /**
                 * Gets the value of the boardEdgeOffsetDistanceUpperLeft property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBoardEdgeOffsetDistanceUpperLeft() {
                    return boardEdgeOffsetDistanceUpperLeft;
                }

                /**
                 * Sets the value of the boardEdgeOffsetDistanceUpperLeft property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBoardEdgeOffsetDistanceUpperLeft(String value) {
                    this.boardEdgeOffsetDistanceUpperLeft = value;
                }

                /**
                 * Gets the value of the boardEdgeOffsetDistanceUpperRight property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBoardEdgeOffsetDistanceUpperRight() {
                    return boardEdgeOffsetDistanceUpperRight;
                }

                /**
                 * Sets the value of the boardEdgeOffsetDistanceUpperRight property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBoardEdgeOffsetDistanceUpperRight(String value) {
                    this.boardEdgeOffsetDistanceUpperRight = value;
                }

                /**
                 * Gets the value of the mountStagePosition property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getMountStagePosition() {
                    return mountStagePosition;
                }

                /**
                 * Sets the value of the mountStagePosition property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setMountStagePosition(String value) {
                    this.mountStagePosition = value;
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
             *       &lt;attribute name="PcbFixWay" use="required" type="{}Wstring" />
             *       &lt;attribute name="ConvPreFixTimer" use="required" type="{}Wstring" />
             *       &lt;attribute name="TransHeight" use="required" type="{}Wstring" />
             *       &lt;attribute name="ConvTimer" use="required" type="{}Wstring" />
             *       &lt;attribute name="YSpeed" use="required" type="{}Wstring" />
             *       &lt;attribute name="TransMode" use="required" type="{}Wstring" />
             *       &lt;attribute name="ConvSpeed" use="required" type="{}Wstring" />
             *       &lt;attribute name="PartHeight" use="required" type="{}Wstring" />
             *       &lt;attribute name="ConvTransWay" use="required" type="{}Wstring" />
             *       &lt;attribute name="TransferOneByOne" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board101 {

                @XmlAttribute(name = "PcbFixWay", required = true)
                protected String pcbFixWay;
                @XmlAttribute(name = "ConvPreFixTimer", required = true)
                protected String convPreFixTimer;
                @XmlAttribute(name = "TransHeight", required = true)
                protected String transHeight;
                @XmlAttribute(name = "ConvTimer", required = true)
                protected String convTimer;
                @XmlAttribute(name = "YSpeed", required = true)
                protected String ySpeed;
                @XmlAttribute(name = "TransMode", required = true)
                protected String transMode;
                @XmlAttribute(name = "ConvSpeed", required = true)
                protected String convSpeed;
                @XmlAttribute(name = "PartHeight", required = true)
                protected String partHeight;
                @XmlAttribute(name = "ConvTransWay", required = true)
                protected String convTransWay;
                @XmlAttribute(name = "TransferOneByOne", required = true)
                protected String transferOneByOne;

                /**
                 * Gets the value of the pcbFixWay property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPcbFixWay() {
                    return pcbFixWay;
                }

                /**
                 * Sets the value of the pcbFixWay property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPcbFixWay(String value) {
                    this.pcbFixWay = value;
                }

                /**
                 * Gets the value of the convPreFixTimer property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getConvPreFixTimer() {
                    return convPreFixTimer;
                }

                /**
                 * Sets the value of the convPreFixTimer property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setConvPreFixTimer(String value) {
                    this.convPreFixTimer = value;
                }

                /**
                 * Gets the value of the transHeight property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTransHeight() {
                    return transHeight;
                }

                /**
                 * Sets the value of the transHeight property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTransHeight(String value) {
                    this.transHeight = value;
                }

                /**
                 * Gets the value of the convTimer property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getConvTimer() {
                    return convTimer;
                }

                /**
                 * Sets the value of the convTimer property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setConvTimer(String value) {
                    this.convTimer = value;
                }

                /**
                 * Gets the value of the ySpeed property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getYSpeed() {
                    return ySpeed;
                }

                /**
                 * Sets the value of the ySpeed property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setYSpeed(String value) {
                    this.ySpeed = value;
                }

                /**
                 * Gets the value of the transMode property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTransMode() {
                    return transMode;
                }

                /**
                 * Sets the value of the transMode property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTransMode(String value) {
                    this.transMode = value;
                }

                /**
                 * Gets the value of the convSpeed property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getConvSpeed() {
                    return convSpeed;
                }

                /**
                 * Sets the value of the convSpeed property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setConvSpeed(String value) {
                    this.convSpeed = value;
                }

                /**
                 * Gets the value of the partHeight property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPartHeight() {
                    return partHeight;
                }

                /**
                 * Sets the value of the partHeight property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPartHeight(String value) {
                    this.partHeight = value;
                }

                /**
                 * Gets the value of the convTransWay property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getConvTransWay() {
                    return convTransWay;
                }

                /**
                 * Sets the value of the convTransWay property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setConvTransWay(String value) {
                    this.convTransWay = value;
                }

                /**
                 * Gets the value of the transferOneByOne property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTransferOneByOne() {
                    return transferOneByOne;
                }

                /**
                 * Sets the value of the transferOneByOne property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTransferOneByOne(String value) {
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
             *       &lt;attribute name="MountExec" use="required" type="{}Wstring" />
             *       &lt;attribute name="VacCheck" use="required" type="{}Wstring" />
             *       &lt;attribute name="Alignment" use="required" type="{}Wstring" />
             *       &lt;attribute name="CoPlanarity" use="required" type="{}Wstring" />
             *       &lt;attribute name="PrePick" use="required" type="{}Wstring" />
             *       &lt;attribute name="RetrySeq" use="required" type="{}Wstring" />
             *       &lt;attribute name="SkipRetry" use="required" type="{}Wstring" />
             *       &lt;attribute name="PositionFreeSetup" use="required" type="{}Wstring" />
             *       &lt;attribute name="TrayPre" use="required" type="{}Wstring" />
             *       &lt;attribute name="FixedComp" use="required" type="{}Wstring" />
             *       &lt;attribute name="Correct3A" use="required" type="{}Wstring" />
             *       &lt;attribute name="InterfereAvoidance" use="required" type="{}Wstring" />
             *       &lt;attribute name="MountSequenceMethod" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board102 {

                @XmlAttribute(name = "MountExec", required = true)
                protected String mountExec;
                @XmlAttribute(name = "VacCheck", required = true)
                protected String vacCheck;
                @XmlAttribute(name = "Alignment", required = true)
                protected String alignment;
                @XmlAttribute(name = "CoPlanarity", required = true)
                protected String coPlanarity;
                @XmlAttribute(name = "PrePick", required = true)
                protected String prePick;
                @XmlAttribute(name = "RetrySeq", required = true)
                protected String retrySeq;
                @XmlAttribute(name = "SkipRetry", required = true)
                protected String skipRetry;
                @XmlAttribute(name = "PositionFreeSetup", required = true)
                protected String positionFreeSetup;
                @XmlAttribute(name = "TrayPre", required = true)
                protected String trayPre;
                @XmlAttribute(name = "FixedComp", required = true)
                protected String fixedComp;
                @XmlAttribute(name = "Correct3A", required = true)
                protected String correct3A;
                @XmlAttribute(name = "InterfereAvoidance", required = true)
                protected String interfereAvoidance;
                @XmlAttribute(name = "MountSequenceMethod", required = true)
                protected String mountSequenceMethod;

                /**
                 * Gets the value of the mountExec property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMountExec() {
                    return mountExec;
                }

                /**
                 * Sets the value of the mountExec property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMountExec(String value) {
                    this.mountExec = value;
                }

                /**
                 * Gets the value of the vacCheck property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVacCheck() {
                    return vacCheck;
                }

                /**
                 * Sets the value of the vacCheck property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVacCheck(String value) {
                    this.vacCheck = value;
                }

                /**
                 * Gets the value of the alignment property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlignment() {
                    return alignment;
                }

                /**
                 * Sets the value of the alignment property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlignment(String value) {
                    this.alignment = value;
                }

                /**
                 * Gets the value of the coPlanarity property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCoPlanarity() {
                    return coPlanarity;
                }

                /**
                 * Sets the value of the coPlanarity property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCoPlanarity(String value) {
                    this.coPlanarity = value;
                }

                /**
                 * Gets the value of the prePick property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrePick() {
                    return prePick;
                }

                /**
                 * Sets the value of the prePick property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrePick(String value) {
                    this.prePick = value;
                }

                /**
                 * Gets the value of the retrySeq property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRetrySeq() {
                    return retrySeq;
                }

                /**
                 * Sets the value of the retrySeq property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRetrySeq(String value) {
                    this.retrySeq = value;
                }

                /**
                 * Gets the value of the skipRetry property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSkipRetry() {
                    return skipRetry;
                }

                /**
                 * Sets the value of the skipRetry property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSkipRetry(String value) {
                    this.skipRetry = value;
                }

                /**
                 * Gets the value of the positionFreeSetup property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPositionFreeSetup() {
                    return positionFreeSetup;
                }

                /**
                 * Sets the value of the positionFreeSetup property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPositionFreeSetup(String value) {
                    this.positionFreeSetup = value;
                }

                /**
                 * Gets the value of the trayPre property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrayPre() {
                    return trayPre;
                }

                /**
                 * Sets the value of the trayPre property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrayPre(String value) {
                    this.trayPre = value;
                }

                /**
                 * Gets the value of the fixedComp property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFixedComp() {
                    return fixedComp;
                }

                /**
                 * Sets the value of the fixedComp property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFixedComp(String value) {
                    this.fixedComp = value;
                }

                /**
                 * Gets the value of the correct3A property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCorrect3A() {
                    return correct3A;
                }

                /**
                 * Sets the value of the correct3A property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCorrect3A(String value) {
                    this.correct3A = value;
                }

                /**
                 * Gets the value of the interfereAvoidance property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInterfereAvoidance() {
                    return interfereAvoidance;
                }

                /**
                 * Sets the value of the interfereAvoidance property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInterfereAvoidance(String value) {
                    this.interfereAvoidance = value;
                }

                /**
                 * Gets the value of the mountSequenceMethod property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMountSequenceMethod() {
                    return mountSequenceMethod;
                }

                /**
                 * Sets the value of the mountSequenceMethod property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMountSequenceMethod(String value) {
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
             *       &lt;attribute name="BadSortA" use="required" type="{}Wstring" />
             *       &lt;attribute name="BadSortB" use="required" type="{}Wstring" />
             *       &lt;attribute name="BadSortC" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board103 {

                @XmlAttribute(name = "BadSortA", required = true)
                protected String badSortA;
                @XmlAttribute(name = "BadSortB", required = true)
                protected String badSortB;
                @XmlAttribute(name = "BadSortC", required = true)
                protected String badSortC;

                /**
                 * Gets the value of the badSortA property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBadSortA() {
                    return badSortA;
                }

                /**
                 * Sets the value of the badSortA property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBadSortA(String value) {
                    this.badSortA = value;
                }

                /**
                 * Gets the value of the badSortB property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBadSortB() {
                    return badSortB;
                }

                /**
                 * Sets the value of the badSortB property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBadSortB(String value) {
                    this.badSortB = value;
                }

                /**
                 * Gets the value of the badSortC property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBadSortC() {
                    return badSortC;
                }

                /**
                 * Sets the value of the badSortC property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBadSortC(String value) {
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
             *       &lt;attribute name="Comment" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board104 {

                @XmlAttribute(name = "Comment", required = true)
                protected String comment;

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
             *       &lt;attribute name="PreDisp" use="required" type="{}Wstring" />
             *       &lt;attribute name="DotDisp" use="required" type="{}Wstring" />
             *       &lt;attribute name="DotCheck" use="required" type="{}Wstring" />
             *       &lt;attribute name="Refresh" use="required" type="{}Wstring" />
             *       &lt;attribute name="PosCorDisp" use="required" type="{}Wstring" />
             *       &lt;attribute name="PosCorPreDisp" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board105 {

                @XmlAttribute(name = "PreDisp", required = true)
                protected String preDisp;
                @XmlAttribute(name = "DotDisp", required = true)
                protected String dotDisp;
                @XmlAttribute(name = "DotCheck", required = true)
                protected String dotCheck;
                @XmlAttribute(name = "Refresh", required = true)
                protected String refresh;
                @XmlAttribute(name = "PosCorDisp", required = true)
                protected String posCorDisp;
                @XmlAttribute(name = "PosCorPreDisp", required = true)
                protected String posCorPreDisp;

                /**
                 * Gets the value of the preDisp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreDisp() {
                    return preDisp;
                }

                /**
                 * Sets the value of the preDisp property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreDisp(String value) {
                    this.preDisp = value;
                }

                /**
                 * Gets the value of the dotDisp property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDotDisp() {
                    return dotDisp;
                }

                /**
                 * Sets the value of the dotDisp property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDotDisp(String value) {
                    this.dotDisp = value;
                }

                /**
                 * Gets the value of the dotCheck property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDotCheck() {
                    return dotCheck;
                }

                /**
                 * Sets the value of the dotCheck property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDotCheck(String value) {
                    this.dotCheck = value;
                }

                /**
                 * Gets the value of the refresh property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRefresh() {
                    return refresh;
                }

                /**
                 * Sets the value of the refresh property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRefresh(String value) {
                    this.refresh = value;
                }

                /**
                 * Gets the value of the posCorDisp property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPosCorDisp() {
                    return posCorDisp;
                }

                /**
                 * Sets the value of the posCorDisp property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPosCorDisp(String value) {
                    this.posCorDisp = value;
                }

                /**
                 * Gets the value of the posCorPreDisp property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPosCorPreDisp() {
                    return posCorPreDisp;
                }

                /**
                 * Sets the value of the posCorPreDisp property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPosCorPreDisp(String value) {
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
             *       &lt;attribute name="SpecialFunction" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board106 {

                @XmlAttribute(name = "SpecialFunction", required = true)
                protected String specialFunction;

                /**
                 * Gets the value of the specialFunction property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSpecialFunction() {
                    return specialFunction;
                }

                /**
                 * Sets the value of the specialFunction property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSpecialFunction(String value) {
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
             *       &lt;attribute name="PushUpPinSetupManagement" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board107 {

                @XmlAttribute(name = "PushUpPinSetupManagement", required = true)
                protected String pushUpPinSetupManagement;

                /**
                 * Gets the value of the pushUpPinSetupManagement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPushUpPinSetupManagement() {
                    return pushUpPinSetupManagement;
                }

                /**
                 * Sets the value of the pushUpPinSetupManagement property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPushUpPinSetupManagement(String value) {
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
             *       &lt;attribute name="HeadA1" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA2" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA3" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA4" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA5" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA6" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA7" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA8" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA9" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA10" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA11" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA12" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA13" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA14" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA15" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadA16" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board108 {

                @XmlAttribute(name = "HeadA1", required = true)
                protected String headA1;
                @XmlAttribute(name = "HeadA2", required = true)
                protected String headA2;
                @XmlAttribute(name = "HeadA3", required = true)
                protected String headA3;
                @XmlAttribute(name = "HeadA4", required = true)
                protected String headA4;
                @XmlAttribute(name = "HeadA5", required = true)
                protected String headA5;
                @XmlAttribute(name = "HeadA6", required = true)
                protected String headA6;
                @XmlAttribute(name = "HeadA7", required = true)
                protected String headA7;
                @XmlAttribute(name = "HeadA8", required = true)
                protected String headA8;
                @XmlAttribute(name = "HeadA9", required = true)
                protected String headA9;
                @XmlAttribute(name = "HeadA10", required = true)
                protected String headA10;
                @XmlAttribute(name = "HeadA11", required = true)
                protected String headA11;
                @XmlAttribute(name = "HeadA12", required = true)
                protected String headA12;
                @XmlAttribute(name = "HeadA13", required = true)
                protected String headA13;
                @XmlAttribute(name = "HeadA14", required = true)
                protected String headA14;
                @XmlAttribute(name = "HeadA15", required = true)
                protected String headA15;
                @XmlAttribute(name = "HeadA16", required = true)
                protected String headA16;

                /**
                 * Gets the value of the headA1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA1() {
                    return headA1;
                }

                /**
                 * Sets the value of the headA1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA1(String value) {
                    this.headA1 = value;
                }

                /**
                 * Gets the value of the headA2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA2() {
                    return headA2;
                }

                /**
                 * Sets the value of the headA2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA2(String value) {
                    this.headA2 = value;
                }

                /**
                 * Gets the value of the headA3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA3() {
                    return headA3;
                }

                /**
                 * Sets the value of the headA3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA3(String value) {
                    this.headA3 = value;
                }

                /**
                 * Gets the value of the headA4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA4() {
                    return headA4;
                }

                /**
                 * Sets the value of the headA4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA4(String value) {
                    this.headA4 = value;
                }

                /**
                 * Gets the value of the headA5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA5() {
                    return headA5;
                }

                /**
                 * Sets the value of the headA5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA5(String value) {
                    this.headA5 = value;
                }

                /**
                 * Gets the value of the headA6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA6() {
                    return headA6;
                }

                /**
                 * Sets the value of the headA6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA6(String value) {
                    this.headA6 = value;
                }

                /**
                 * Gets the value of the headA7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA7() {
                    return headA7;
                }

                /**
                 * Sets the value of the headA7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA7(String value) {
                    this.headA7 = value;
                }

                /**
                 * Gets the value of the headA8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA8() {
                    return headA8;
                }

                /**
                 * Sets the value of the headA8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA8(String value) {
                    this.headA8 = value;
                }

                /**
                 * Gets the value of the headA9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA9() {
                    return headA9;
                }

                /**
                 * Sets the value of the headA9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA9(String value) {
                    this.headA9 = value;
                }

                /**
                 * Gets the value of the headA10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA10() {
                    return headA10;
                }

                /**
                 * Sets the value of the headA10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA10(String value) {
                    this.headA10 = value;
                }

                /**
                 * Gets the value of the headA11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA11() {
                    return headA11;
                }

                /**
                 * Sets the value of the headA11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA11(String value) {
                    this.headA11 = value;
                }

                /**
                 * Gets the value of the headA12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA12() {
                    return headA12;
                }

                /**
                 * Sets the value of the headA12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA12(String value) {
                    this.headA12 = value;
                }

                /**
                 * Gets the value of the headA13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA13() {
                    return headA13;
                }

                /**
                 * Sets the value of the headA13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA13(String value) {
                    this.headA13 = value;
                }

                /**
                 * Gets the value of the headA14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA14() {
                    return headA14;
                }

                /**
                 * Sets the value of the headA14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA14(String value) {
                    this.headA14 = value;
                }

                /**
                 * Gets the value of the headA15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA15() {
                    return headA15;
                }

                /**
                 * Sets the value of the headA15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA15(String value) {
                    this.headA15 = value;
                }

                /**
                 * Gets the value of the headA16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadA16() {
                    return headA16;
                }

                /**
                 * Sets the value of the headA16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadA16(String value) {
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
             *       &lt;attribute name="HeadB1" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB2" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB3" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB4" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB5" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB6" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB7" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB8" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB9" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB10" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB11" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB12" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB13" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB14" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB15" use="required" type="{}Wstring" />
             *       &lt;attribute name="HeadB16" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board109 {

                @XmlAttribute(name = "HeadB1", required = true)
                protected String headB1;
                @XmlAttribute(name = "HeadB2", required = true)
                protected String headB2;
                @XmlAttribute(name = "HeadB3", required = true)
                protected String headB3;
                @XmlAttribute(name = "HeadB4", required = true)
                protected String headB4;
                @XmlAttribute(name = "HeadB5", required = true)
                protected String headB5;
                @XmlAttribute(name = "HeadB6", required = true)
                protected String headB6;
                @XmlAttribute(name = "HeadB7", required = true)
                protected String headB7;
                @XmlAttribute(name = "HeadB8", required = true)
                protected String headB8;
                @XmlAttribute(name = "HeadB9", required = true)
                protected String headB9;
                @XmlAttribute(name = "HeadB10", required = true)
                protected String headB10;
                @XmlAttribute(name = "HeadB11", required = true)
                protected String headB11;
                @XmlAttribute(name = "HeadB12", required = true)
                protected String headB12;
                @XmlAttribute(name = "HeadB13", required = true)
                protected String headB13;
                @XmlAttribute(name = "HeadB14", required = true)
                protected String headB14;
                @XmlAttribute(name = "HeadB15", required = true)
                protected String headB15;
                @XmlAttribute(name = "HeadB16", required = true)
                protected String headB16;

                /**
                 * Gets the value of the headB1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB1() {
                    return headB1;
                }

                /**
                 * Sets the value of the headB1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB1(String value) {
                    this.headB1 = value;
                }

                /**
                 * Gets the value of the headB2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB2() {
                    return headB2;
                }

                /**
                 * Sets the value of the headB2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB2(String value) {
                    this.headB2 = value;
                }

                /**
                 * Gets the value of the headB3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB3() {
                    return headB3;
                }

                /**
                 * Sets the value of the headB3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB3(String value) {
                    this.headB3 = value;
                }

                /**
                 * Gets the value of the headB4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB4() {
                    return headB4;
                }

                /**
                 * Sets the value of the headB4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB4(String value) {
                    this.headB4 = value;
                }

                /**
                 * Gets the value of the headB5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB5() {
                    return headB5;
                }

                /**
                 * Sets the value of the headB5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB5(String value) {
                    this.headB5 = value;
                }

                /**
                 * Gets the value of the headB6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB6() {
                    return headB6;
                }

                /**
                 * Sets the value of the headB6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB6(String value) {
                    this.headB6 = value;
                }

                /**
                 * Gets the value of the headB7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB7() {
                    return headB7;
                }

                /**
                 * Sets the value of the headB7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB7(String value) {
                    this.headB7 = value;
                }

                /**
                 * Gets the value of the headB8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB8() {
                    return headB8;
                }

                /**
                 * Sets the value of the headB8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB8(String value) {
                    this.headB8 = value;
                }

                /**
                 * Gets the value of the headB9 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB9() {
                    return headB9;
                }

                /**
                 * Sets the value of the headB9 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB9(String value) {
                    this.headB9 = value;
                }

                /**
                 * Gets the value of the headB10 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB10() {
                    return headB10;
                }

                /**
                 * Sets the value of the headB10 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB10(String value) {
                    this.headB10 = value;
                }

                /**
                 * Gets the value of the headB11 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB11() {
                    return headB11;
                }

                /**
                 * Sets the value of the headB11 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB11(String value) {
                    this.headB11 = value;
                }

                /**
                 * Gets the value of the headB12 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB12() {
                    return headB12;
                }

                /**
                 * Sets the value of the headB12 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB12(String value) {
                    this.headB12 = value;
                }

                /**
                 * Gets the value of the headB13 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB13() {
                    return headB13;
                }

                /**
                 * Sets the value of the headB13 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB13(String value) {
                    this.headB13 = value;
                }

                /**
                 * Gets the value of the headB14 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB14() {
                    return headB14;
                }

                /**
                 * Sets the value of the headB14 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB14(String value) {
                    this.headB14 = value;
                }

                /**
                 * Gets the value of the headB15 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB15() {
                    return headB15;
                }

                /**
                 * Sets the value of the headB15 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB15(String value) {
                    this.headB15 = value;
                }

                /**
                 * Gets the value of the headB16 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHeadB16() {
                    return headB16;
                }

                /**
                 * Sets the value of the headB16 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHeadB16(String value) {
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
             *       &lt;attribute name="TempControlA1" use="required" type="{}Wstring" />
             *       &lt;attribute name="TempControlA2" use="required" type="{}Wstring" />
             *       &lt;attribute name="TempControlA3" use="required" type="{}Wstring" />
             *       &lt;attribute name="TempControlA4" use="required" type="{}Wstring" />
             *       &lt;attribute name="TempControlA5" use="required" type="{}Wstring" />
             *       &lt;attribute name="TempControlA6" use="required" type="{}Wstring" />
             *       &lt;attribute name="TempControlA7" use="required" type="{}Wstring" />
             *       &lt;attribute name="TempControlA8" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board110 {

                @XmlAttribute(name = "TempControlA1", required = true)
                protected String tempControlA1;
                @XmlAttribute(name = "TempControlA2", required = true)
                protected String tempControlA2;
                @XmlAttribute(name = "TempControlA3", required = true)
                protected String tempControlA3;
                @XmlAttribute(name = "TempControlA4", required = true)
                protected String tempControlA4;
                @XmlAttribute(name = "TempControlA5", required = true)
                protected String tempControlA5;
                @XmlAttribute(name = "TempControlA6", required = true)
                protected String tempControlA6;
                @XmlAttribute(name = "TempControlA7", required = true)
                protected String tempControlA7;
                @XmlAttribute(name = "TempControlA8", required = true)
                protected String tempControlA8;

                /**
                 * Gets the value of the tempControlA1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTempControlA1() {
                    return tempControlA1;
                }

                /**
                 * Sets the value of the tempControlA1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTempControlA1(String value) {
                    this.tempControlA1 = value;
                }

                /**
                 * Gets the value of the tempControlA2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTempControlA2() {
                    return tempControlA2;
                }

                /**
                 * Sets the value of the tempControlA2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTempControlA2(String value) {
                    this.tempControlA2 = value;
                }

                /**
                 * Gets the value of the tempControlA3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTempControlA3() {
                    return tempControlA3;
                }

                /**
                 * Sets the value of the tempControlA3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTempControlA3(String value) {
                    this.tempControlA3 = value;
                }

                /**
                 * Gets the value of the tempControlA4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTempControlA4() {
                    return tempControlA4;
                }

                /**
                 * Sets the value of the tempControlA4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTempControlA4(String value) {
                    this.tempControlA4 = value;
                }

                /**
                 * Gets the value of the tempControlA5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTempControlA5() {
                    return tempControlA5;
                }

                /**
                 * Sets the value of the tempControlA5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTempControlA5(String value) {
                    this.tempControlA5 = value;
                }

                /**
                 * Gets the value of the tempControlA6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTempControlA6() {
                    return tempControlA6;
                }

                /**
                 * Sets the value of the tempControlA6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTempControlA6(String value) {
                    this.tempControlA6 = value;
                }

                /**
                 * Gets the value of the tempControlA7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTempControlA7() {
                    return tempControlA7;
                }

                /**
                 * Sets the value of the tempControlA7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTempControlA7(String value) {
                    this.tempControlA7 = value;
                }

                /**
                 * Gets the value of the tempControlA8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTempControlA8() {
                    return tempControlA8;
                }

                /**
                 * Sets the value of the tempControlA8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTempControlA8(String value) {
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
             *       &lt;attribute name="TargetTempA1" use="required" type="{}Wstring" />
             *       &lt;attribute name="TargetTempA2" use="required" type="{}Wstring" />
             *       &lt;attribute name="TargetTempA3" use="required" type="{}Wstring" />
             *       &lt;attribute name="TargetTempA4" use="required" type="{}Wstring" />
             *       &lt;attribute name="TargetTempA5" use="required" type="{}Wstring" />
             *       &lt;attribute name="TargetTempA6" use="required" type="{}Wstring" />
             *       &lt;attribute name="TargetTempA7" use="required" type="{}Wstring" />
             *       &lt;attribute name="TargetTempA8" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Board111 {

                @XmlAttribute(name = "TargetTempA1", required = true)
                protected String targetTempA1;
                @XmlAttribute(name = "TargetTempA2", required = true)
                protected String targetTempA2;
                @XmlAttribute(name = "TargetTempA3", required = true)
                protected String targetTempA3;
                @XmlAttribute(name = "TargetTempA4", required = true)
                protected String targetTempA4;
                @XmlAttribute(name = "TargetTempA5", required = true)
                protected String targetTempA5;
                @XmlAttribute(name = "TargetTempA6", required = true)
                protected String targetTempA6;
                @XmlAttribute(name = "TargetTempA7", required = true)
                protected String targetTempA7;
                @XmlAttribute(name = "TargetTempA8", required = true)
                protected String targetTempA8;

                /**
                 * Gets the value of the targetTempA1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetTempA1() {
                    return targetTempA1;
                }

                /**
                 * Sets the value of the targetTempA1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetTempA1(String value) {
                    this.targetTempA1 = value;
                }

                /**
                 * Gets the value of the targetTempA2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetTempA2() {
                    return targetTempA2;
                }

                /**
                 * Sets the value of the targetTempA2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetTempA2(String value) {
                    this.targetTempA2 = value;
                }

                /**
                 * Gets the value of the targetTempA3 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetTempA3() {
                    return targetTempA3;
                }

                /**
                 * Sets the value of the targetTempA3 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetTempA3(String value) {
                    this.targetTempA3 = value;
                }

                /**
                 * Gets the value of the targetTempA4 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetTempA4() {
                    return targetTempA4;
                }

                /**
                 * Sets the value of the targetTempA4 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetTempA4(String value) {
                    this.targetTempA4 = value;
                }

                /**
                 * Gets the value of the targetTempA5 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetTempA5() {
                    return targetTempA5;
                }

                /**
                 * Sets the value of the targetTempA5 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetTempA5(String value) {
                    this.targetTempA5 = value;
                }

                /**
                 * Gets the value of the targetTempA6 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetTempA6() {
                    return targetTempA6;
                }

                /**
                 * Sets the value of the targetTempA6 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetTempA6(String value) {
                    this.targetTempA6 = value;
                }

                /**
                 * Gets the value of the targetTempA7 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetTempA7() {
                    return targetTempA7;
                }

                /**
                 * Sets the value of the targetTempA7 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetTempA7(String value) {
                    this.targetTempA7 = value;
                }

                /**
                 * Gets the value of the targetTempA8 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTargetTempA8() {
                    return targetTempA8;
                }

                /**
                 * Sets the value of the targetTempA8 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTargetTempA8(String value) {
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
         *                 &lt;attribute name="Pcb" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Blk" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Local" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PcbCodeScan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="X2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark2" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BlkCodeScan">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="X2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark2" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
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
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.CodeScan.CodeScanUse }
             *     
             */
            public PcbDataFile.Machine.CodeScan.CodeScanUse getCodeScanUse() {
                return codeScanUse;
            }

            /**
             * Sets the value of the codeScanUse property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.CodeScan.CodeScanUse }
             *     
             */
            public void setCodeScanUse(PcbDataFile.Machine.CodeScan.CodeScanUse value) {
                this.codeScanUse = value;
            }

            /**
             * Gets the value of the pcbCodeScan property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.CodeScan.PcbCodeScan }
             *     
             */
            public PcbDataFile.Machine.CodeScan.PcbCodeScan getPcbCodeScan() {
                return pcbCodeScan;
            }

            /**
             * Sets the value of the pcbCodeScan property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.CodeScan.PcbCodeScan }
             *     
             */
            public void setPcbCodeScan(PcbDataFile.Machine.CodeScan.PcbCodeScan value) {
                this.pcbCodeScan = value;
            }

            /**
             * Gets the value of the blkCodeScan property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.CodeScan.BlkCodeScan }
             *     
             */
            public PcbDataFile.Machine.CodeScan.BlkCodeScan getBlkCodeScan() {
                return blkCodeScan;
            }

            /**
             * Sets the value of the blkCodeScan property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.CodeScan.BlkCodeScan }
             *     
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
             *       &lt;attribute name="X1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark1" use="required" type="{}Wstring" />
             *       &lt;attribute name="X2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark2" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BlkCodeScan {

                @XmlAttribute(name = "X1", required = true)
                protected String x1;
                @XmlAttribute(name = "Y1", required = true)
                protected String y1;
                @XmlAttribute(name = "Mark1", required = true)
                protected String mark1;
                @XmlAttribute(name = "X2", required = true)
                protected String x2;
                @XmlAttribute(name = "Y2", required = true)
                protected String y2;
                @XmlAttribute(name = "Mark2", required = true)
                protected String mark2;

                /**
                 * Gets the value of the x1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX1() {
                    return x1;
                }

                /**
                 * Sets the value of the x1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX1(String value) {
                    this.x1 = value;
                }

                /**
                 * Gets the value of the y1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getY1() {
                    return y1;
                }

                /**
                 * Sets the value of the y1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setY1(String value) {
                    this.y1 = value;
                }

                /**
                 * Gets the value of the mark1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMark1() {
                    return mark1;
                }

                /**
                 * Sets the value of the mark1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMark1(String value) {
                    this.mark1 = value;
                }

                /**
                 * Gets the value of the x2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX2() {
                    return x2;
                }

                /**
                 * Sets the value of the x2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX2(String value) {
                    this.x2 = value;
                }

                /**
                 * Gets the value of the y2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getY2() {
                    return y2;
                }

                /**
                 * Sets the value of the y2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setY2(String value) {
                    this.y2 = value;
                }

                /**
                 * Gets the value of the mark2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMark2() {
                    return mark2;
                }

                /**
                 * Sets the value of the mark2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMark2(String value) {
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
             *       &lt;attribute name="Pcb" use="required" type="{}Wstring" />
             *       &lt;attribute name="Blk" use="required" type="{}Wstring" />
             *       &lt;attribute name="Local" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CodeScanUse {

                @XmlAttribute(name = "Pcb", required = true)
                protected String pcb;
                @XmlAttribute(name = "Blk", required = true)
                protected String blk;
                @XmlAttribute(name = "Local", required = true)
                protected String local;

                /**
                 * Gets the value of the pcb property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPcb() {
                    return pcb;
                }

                /**
                 * Sets the value of the pcb property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPcb(String value) {
                    this.pcb = value;
                }

                /**
                 * Gets the value of the blk property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBlk() {
                    return blk;
                }

                /**
                 * Sets the value of the blk property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBlk(String value) {
                    this.blk = value;
                }

                /**
                 * Gets the value of the local property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocal() {
                    return local;
                }

                /**
                 * Sets the value of the local property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocal(String value) {
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
             *       &lt;attribute name="X1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark1" use="required" type="{}Wstring" />
             *       &lt;attribute name="X2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark2" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PcbCodeScan {

                @XmlAttribute(name = "X1", required = true)
                protected String x1;
                @XmlAttribute(name = "Y1", required = true)
                protected String y1;
                @XmlAttribute(name = "Mark1", required = true)
                protected String mark1;
                @XmlAttribute(name = "X2", required = true)
                protected String x2;
                @XmlAttribute(name = "Y2", required = true)
                protected String y2;
                @XmlAttribute(name = "Mark2", required = true)
                protected String mark2;

                /**
                 * Gets the value of the x1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX1() {
                    return x1;
                }

                /**
                 * Sets the value of the x1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX1(String value) {
                    this.x1 = value;
                }

                /**
                 * Gets the value of the y1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getY1() {
                    return y1;
                }

                /**
                 * Sets the value of the y1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setY1(String value) {
                    this.y1 = value;
                }

                /**
                 * Gets the value of the mark1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMark1() {
                    return mark1;
                }

                /**
                 * Sets the value of the mark1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMark1(String value) {
                    this.mark1 = value;
                }

                /**
                 * Gets the value of the x2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX2() {
                    return x2;
                }

                /**
                 * Sets the value of the x2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX2(String value) {
                    this.x2 = value;
                }

                /**
                 * Gets the value of the y2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getY2() {
                    return y2;
                }

                /**
                 * Sets the value of the y2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setY2(String value) {
                    this.y2 = value;
                }

                /**
                 * Gets the value of the mark2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMark2() {
                    return mark2;
                }

                /**
                 * Sets the value of the mark2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMark2(String value) {
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
         *                 &lt;attribute name="Pcb" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Blk" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Local" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PcbFid">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="X2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark2" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BlkFid">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="X1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="X2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark2" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LclFid" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="No" use="required" type="{}Wstring" />
         *                 &lt;attribute name="X1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark1" use="required" type="{}Wstring" />
         *                 &lt;attribute name="X2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Mark2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Type" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Skip" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Comment" use="required" type="{}Wstring" />
         *                 &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "fidUse",
                "pcbFid",
                "blkFid",
                "lclFid"
        })
        public static class Fiducial {

            @XmlElement(name = "FidUse", required = true)
            protected PcbDataFile.Machine.Fiducial.FidUse fidUse;
            @XmlElement(name = "PcbFid", required = true)
            protected PcbDataFile.Machine.Fiducial.PcbFid pcbFid;
            @XmlElement(name = "BlkFid", required = true)
            protected PcbDataFile.Machine.Fiducial.BlkFid blkFid;
            @XmlElement(name = "LclFid", required = true)
            protected List<PcbDataFile.Machine.Fiducial.LclFid> lclFid;

            /**
             * Gets the value of the fidUse property.
             * 
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Fiducial.FidUse }
             *     
             */
            public PcbDataFile.Machine.Fiducial.FidUse getFidUse() {
                return fidUse;
            }

            /**
             * Sets the value of the fidUse property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Fiducial.FidUse }
             *     
             */
            public void setFidUse(PcbDataFile.Machine.Fiducial.FidUse value) {
                this.fidUse = value;
            }

            /**
             * Gets the value of the pcbFid property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Fiducial.PcbFid }
             *     
             */
            public PcbDataFile.Machine.Fiducial.PcbFid getPcbFid() {
                return pcbFid;
            }

            /**
             * Sets the value of the pcbFid property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Fiducial.PcbFid }
             *     
             */
            public void setPcbFid(PcbDataFile.Machine.Fiducial.PcbFid value) {
                this.pcbFid = value;
            }

            /**
             * Gets the value of the blkFid property.
             *
             * @return
             *     possible object is
             *     {@link PcbDataFile.Machine.Fiducial.BlkFid }
             *     
             */
            public PcbDataFile.Machine.Fiducial.BlkFid getBlkFid() {
                return blkFid;
            }

            /**
             * Sets the value of the blkFid property.
             *
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Fiducial.BlkFid }
             *     
             */
            public void setBlkFid(PcbDataFile.Machine.Fiducial.BlkFid value) {
                this.blkFid = value;
            }

            /**
             * Gets the value of the lclFid property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the lclFid property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLclFid().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PcbDataFile.Machine.Fiducial.LclFid }
             *
             *
             */
            public List<PcbDataFile.Machine.Fiducial.LclFid> getLclFid() {
                if (lclFid == null) {
                    lclFid = new ArrayList<PcbDataFile.Machine.Fiducial.LclFid>();
                }
                return this.lclFid;
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
             *       &lt;attribute name="X1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark1" use="required" type="{}Wstring" />
             *       &lt;attribute name="X2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark2" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class BlkFid {

                @XmlAttribute(name = "X1", required = true)
                protected String x1;
                @XmlAttribute(name = "Y1", required = true)
                protected String y1;
                @XmlAttribute(name = "Mark1", required = true)
                protected String mark1;
                @XmlAttribute(name = "X2", required = true)
                protected String x2;
                @XmlAttribute(name = "Y2", required = true)
                protected String y2;
                @XmlAttribute(name = "Mark2", required = true)
                protected String mark2;

                /**
                 * Gets the value of the x1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getX1() {
                    return x1;
                }

                /**
                 * Sets the value of the x1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setX1(String value) {
                    this.x1 = value;
                }

                /**
                 * Gets the value of the y1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getY1() {
                    return y1;
                }

                /**
                 * Sets the value of the y1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setY1(String value) {
                    this.y1 = value;
                }

                /**
                 * Gets the value of the mark1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMark1() {
                    return mark1;
                }

                /**
                 * Sets the value of the mark1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMark1(String value) {
                    this.mark1 = value;
                }

                /**
                 * Gets the value of the x2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getX2() {
                    return x2;
                }

                /**
                 * Sets the value of the x2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setX2(String value) {
                    this.x2 = value;
                }

                /**
                 * Gets the value of the y2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getY2() {
                    return y2;
                }

                /**
                 * Sets the value of the y2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setY2(String value) {
                    this.y2 = value;
                }

                /**
                 * Gets the value of the mark2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMark2() {
                    return mark2;
                }

                /**
                 * Sets the value of the mark2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMark2(String value) {
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
             *       &lt;attribute name="Pcb" use="required" type="{}Wstring" />
             *       &lt;attribute name="Blk" use="required" type="{}Wstring" />
             *       &lt;attribute name="Local" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FidUse {

                @XmlAttribute(name = "Pcb", required = true)
                protected String pcb;
                @XmlAttribute(name = "Blk", required = true)
                protected String blk;
                @XmlAttribute(name = "Local", required = true)
                protected String local;

                /**
                 * Gets the value of the pcb property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPcb() {
                    return pcb;
                }

                /**
                 * Sets the value of the pcb property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPcb(String value) {
                    this.pcb = value;
                }

                /**
                 * Gets the value of the blk property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBlk() {
                    return blk;
                }

                /**
                 * Sets the value of the blk property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBlk(String value) {
                    this.blk = value;
                }

                /**
                 * Gets the value of the local property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocal() {
                    return local;
                }

                /**
                 * Sets the value of the local property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocal(String value) {
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
             *       &lt;attribute name="No" use="required" type="{}Wstring" />
             *       &lt;attribute name="X1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark1" use="required" type="{}Wstring" />
             *       &lt;attribute name="X2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Type" use="required" type="{}Wstring" />
             *       &lt;attribute name="Skip" use="required" type="{}Wstring" />
             *       &lt;attribute name="Comment" use="required" type="{}Wstring" />
             *       &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LclFid {

                @XmlAttribute(name = "No", required = true)
                protected String no;
                @XmlAttribute(name = "X1", required = true)
                protected String x1;
                @XmlAttribute(name = "Y1", required = true)
                protected String y1;
                @XmlAttribute(name = "Mark1", required = true)
                protected String mark1;
                @XmlAttribute(name = "X2", required = true)
                protected String x2;
                @XmlAttribute(name = "Y2", required = true)
                protected String y2;
                @XmlAttribute(name = "Mark2", required = true)
                protected String mark2;
                @XmlAttribute(name = "Type", required = true)
                protected String type;
                @XmlAttribute(name = "Skip", required = true)
                protected String skip;
                @XmlAttribute(name = "Comment", required = true)
                protected String comment;
                @XmlAttribute(name = "OrgBlk", required = true)
                protected String orgBlk;

                /**
                 * Gets the value of the no property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNo() {
                    return no;
                }

                /**
                 * Sets the value of the no property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNo(String value) {
                    this.no = value;
                }

                /**
                 * Gets the value of the x1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX1() {
                    return x1;
                }

                /**
                 * Sets the value of the x1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX1(String value) {
                    this.x1 = value;
                }

                /**
                 * Gets the value of the y1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getY1() {
                    return y1;
                }

                /**
                 * Sets the value of the y1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setY1(String value) {
                    this.y1 = value;
                }

                /**
                 * Gets the value of the mark1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMark1() {
                    return mark1;
                }

                /**
                 * Sets the value of the mark1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMark1(String value) {
                    this.mark1 = value;
                }

                /**
                 * Gets the value of the x2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX2() {
                    return x2;
                }

                /**
                 * Sets the value of the x2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX2(String value) {
                    this.x2 = value;
                }

                /**
                 * Gets the value of the y2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getY2() {
                    return y2;
                }

                /**
                 * Sets the value of the y2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setY2(String value) {
                    this.y2 = value;
                }

                /**
                 * Gets the value of the mark2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMark2() {
                    return mark2;
                }

                /**
                 * Sets the value of the mark2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMark2(String value) {
                    this.mark2 = value;
                }

                /**
                 * Gets the value of the type property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the skip property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSkip() {
                    return skip;
                }

                /**
                 * Sets the value of the skip property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSkip(String value) {
                    this.skip = value;
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
                 * Gets the value of the orgBlk property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrgBlk() {
                    return orgBlk;
                }

                /**
                 * Sets the value of the orgBlk property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrgBlk(String value) {
                    this.orgBlk = value;
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
             *       &lt;attribute name="X1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y1" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark1" use="required" type="{}Wstring" />
             *       &lt;attribute name="X2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Mark2" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PcbFid {

                @XmlAttribute(name = "X1", required = true)
                protected String x1;
                @XmlAttribute(name = "Y1", required = true)
                protected String y1;
                @XmlAttribute(name = "Mark1", required = true)
                protected String mark1;
                @XmlAttribute(name = "X2", required = true)
                protected String x2;
                @XmlAttribute(name = "Y2", required = true)
                protected String y2;
                @XmlAttribute(name = "Mark2", required = true)
                protected String mark2;

                /**
                 * Gets the value of the x1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX1() {
                    return x1;
                }

                /**
                 * Sets the value of the x1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX1(String value) {
                    this.x1 = value;
                }

                /**
                 * Gets the value of the y1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getY1() {
                    return y1;
                }

                /**
                 * Sets the value of the y1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setY1(String value) {
                    this.y1 = value;
                }

                /**
                 * Gets the value of the mark1 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMark1() {
                    return mark1;
                }

                /**
                 * Sets the value of the mark1 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMark1(String value) {
                    this.mark1 = value;
                }

                /**
                 * Gets the value of the x2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX2() {
                    return x2;
                }

                /**
                 * Sets the value of the x2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX2(String value) {
                    this.x2 = value;
                }

                /**
                 * Gets the value of the y2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getY2() {
                    return y2;
                }

                /**
                 * Sets the value of the y2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setY2(String value) {
                    this.y2 = value;
                }

                /**
                 * Gets the value of the mark2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMark2() {
                    return mark2;
                }

                /**
                 * Sets the value of the mark2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMark2(String value) {
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
         *                           &lt;attribute name="MarkName" use="required" type="{}Wstring" />
         *                           &lt;attribute name="Comment" use="required" type="{}Wstring" />
         *                           &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
         *                           &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
         *                           &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
         *                           &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Mark_011">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="MarkType" use="required" type="{}Wstring" />
         *                           &lt;attribute name="Shape" use="required" type="{}Wstring" />
         *                           &lt;attribute name="Exec" use="required" type="{}Wstring" />
         *                           &lt;attribute name="OutSize" use="required" type="{}Wstring" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Mark_100">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Surface" use="required" type="{}Wstring" />
         *                           &lt;attribute name="Threshold" use="required" type="{}Wstring" />
         *                           &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
         *                           &lt;attribute name="SearchAreaX" use="required" type="{}Wstring" />
         *                           &lt;attribute name="SearchAreaY" use="required" type="{}Wstring" />
         *                           &lt;attribute name="Sequence" use="required" type="{}Wstring" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Mark_200">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="LightingOuter" use="required" type="{}Wstring" />
         *                           &lt;attribute name="LightingInner" use="required" type="{}Wstring" />
         *                           &lt;attribute name="LightingDrop" use="required" type="{}Wstring" />
         *                           &lt;attribute name="LightingIROuter" use="required" type="{}Wstring" />
         *                           &lt;attribute name="LightingIRInner" use="required" type="{}Wstring" />
         *                           &lt;attribute name="FilterInner" use="required" type="{}Wstring" />
         *                           &lt;attribute name="FilterOuter" use="required" type="{}Wstring" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="No" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
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
             *
             *
             */
            public List<PcbDataFile.Machine.Marks.Mark> getMark() {
                if (mark == null) {
                    mark = new ArrayList<PcbDataFile.Machine.Marks.Mark>();
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
             *                 &lt;attribute name="MarkName" use="required" type="{}Wstring" />
             *                 &lt;attribute name="Comment" use="required" type="{}Wstring" />
             *                 &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
             *                 &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
             *                 &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
             *                 &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Mark_011">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="MarkType" use="required" type="{}Wstring" />
             *                 &lt;attribute name="Shape" use="required" type="{}Wstring" />
             *                 &lt;attribute name="Exec" use="required" type="{}Wstring" />
             *                 &lt;attribute name="OutSize" use="required" type="{}Wstring" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Mark_100">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Surface" use="required" type="{}Wstring" />
             *                 &lt;attribute name="Threshold" use="required" type="{}Wstring" />
             *                 &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
             *                 &lt;attribute name="SearchAreaX" use="required" type="{}Wstring" />
             *                 &lt;attribute name="SearchAreaY" use="required" type="{}Wstring" />
             *                 &lt;attribute name="Sequence" use="required" type="{}Wstring" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Mark_200">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="LightingOuter" use="required" type="{}Wstring" />
             *                 &lt;attribute name="LightingInner" use="required" type="{}Wstring" />
             *                 &lt;attribute name="LightingDrop" use="required" type="{}Wstring" />
             *                 &lt;attribute name="LightingIROuter" use="required" type="{}Wstring" />
             *                 &lt;attribute name="LightingIRInner" use="required" type="{}Wstring" />
             *                 &lt;attribute name="FilterInner" use="required" type="{}Wstring" />
             *                 &lt;attribute name="FilterOuter" use="required" type="{}Wstring" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="No" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
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
                protected String no;

                /**
                 * Gets the value of the mark001 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PcbDataFile.Machine.Marks.Mark.Mark001 }
                 *     
                 */
                public PcbDataFile.Machine.Marks.Mark.Mark001 getMark001() {
                    return mark001;
                }

                /**
                 * Sets the value of the mark001 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link PcbDataFile.Machine.Marks.Mark.Mark001 }
                 *     
                 */
                public void setMark001(PcbDataFile.Machine.Marks.Mark.Mark001 value) {
                    this.mark001 = value;
                }

                /**
                 * Gets the value of the mark011 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link PcbDataFile.Machine.Marks.Mark.Mark011 }
                 *     
                 */
                public PcbDataFile.Machine.Marks.Mark.Mark011 getMark011() {
                    return mark011;
                }

                /**
                 * Sets the value of the mark011 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link PcbDataFile.Machine.Marks.Mark.Mark011 }
                 *     
                 */
                public void setMark011(PcbDataFile.Machine.Marks.Mark.Mark011 value) {
                    this.mark011 = value;
                }

                /**
                 * Gets the value of the mark100 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link PcbDataFile.Machine.Marks.Mark.Mark100 }
                 *     
                 */
                public PcbDataFile.Machine.Marks.Mark.Mark100 getMark100() {
                    return mark100;
                }

                /**
                 * Sets the value of the mark100 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link PcbDataFile.Machine.Marks.Mark.Mark100 }
                 *     
                 */
                public void setMark100(PcbDataFile.Machine.Marks.Mark.Mark100 value) {
                    this.mark100 = value;
                }

                /**
                 * Gets the value of the mark200 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link PcbDataFile.Machine.Marks.Mark.Mark200 }
                 *     
                 */
                public PcbDataFile.Machine.Marks.Mark.Mark200 getMark200() {
                    return mark200;
                }

                /**
                 * Sets the value of the mark200 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link PcbDataFile.Machine.Marks.Mark.Mark200 }
                 *     
                 */
                public void setMark200(PcbDataFile.Machine.Marks.Mark.Mark200 value) {
                    this.mark200 = value;
                }

                /**
                 * Gets the value of the no property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNo() {
                    return no;
                }

                /**
                 * Sets the value of the no property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNo(String value) {
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
                 *       &lt;attribute name="MarkName" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Comment" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Mark001 {

                    @XmlAttribute(name = "MarkName", required = true)
                    protected String markName;
                    @XmlAttribute(name = "Comment", required = true)
                    protected String comment;
                    @XmlAttribute(name = "DatabaseNo", required = true)
                    protected String databaseNo;
                    @XmlAttribute(name = "LibraryUse", required = true)
                    protected String libraryUse;
                    @XmlAttribute(name = "LibraryFolder", required = true)
                    protected String libraryFolder;
                    @XmlAttribute(name = "LibraryPath", required = true)
                    protected String libraryPath;

                    /**
                     * Gets the value of the markName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMarkName() {
                        return markName;
                    }

                    /**
                     * Sets the value of the markName property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMarkName(String value) {
                        this.markName = value;
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
                 *       &lt;attribute name="MarkType" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Shape" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Exec" use="required" type="{}Wstring" />
                 *       &lt;attribute name="OutSize" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Mark011 {

                    @XmlAttribute(name = "MarkType", required = true)
                    protected String markType;
                    @XmlAttribute(name = "Shape", required = true)
                    protected String shape;
                    @XmlAttribute(name = "Exec", required = true)
                    protected String exec;
                    @XmlAttribute(name = "OutSize", required = true)
                    protected String outSize;

                    /**
                     * Gets the value of the markType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMarkType() {
                        return markType;
                    }

                    /**
                     * Sets the value of the markType property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMarkType(String value) {
                        this.markType = value;
                    }

                    /**
                     * Gets the value of the shape property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShape() {
                        return shape;
                    }

                    /**
                     * Sets the value of the shape property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShape(String value) {
                        this.shape = value;
                    }

                    /**
                     * Gets the value of the exec property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExec() {
                        return exec;
                    }

                    /**
                     * Sets the value of the exec property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExec(String value) {
                        this.exec = value;
                    }

                    /**
                     * Gets the value of the outSize property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOutSize() {
                        return outSize;
                    }

                    /**
                     * Sets the value of the outSize property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOutSize(String value) {
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
                 *       &lt;attribute name="Surface" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Threshold" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
                 *       &lt;attribute name="SearchAreaX" use="required" type="{}Wstring" />
                 *       &lt;attribute name="SearchAreaY" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Sequence" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Mark100 {

                    @XmlAttribute(name = "Surface", required = true)
                    protected String surface;
                    @XmlAttribute(name = "Threshold", required = true)
                    protected String threshold;
                    @XmlAttribute(name = "Tolerance", required = true)
                    protected String tolerance;
                    @XmlAttribute(name = "SearchAreaX", required = true)
                    protected String searchAreaX;
                    @XmlAttribute(name = "SearchAreaY", required = true)
                    protected String searchAreaY;
                    @XmlAttribute(name = "Sequence", required = true)
                    protected String sequence;

                    /**
                     * Gets the value of the surface property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSurface() {
                        return surface;
                    }

                    /**
                     * Sets the value of the surface property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSurface(String value) {
                        this.surface = value;
                    }

                    /**
                     * Gets the value of the threshold property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getThreshold() {
                        return threshold;
                    }

                    /**
                     * Sets the value of the threshold property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setThreshold(String value) {
                        this.threshold = value;
                    }

                    /**
                     * Gets the value of the tolerance property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTolerance() {
                        return tolerance;
                    }

                    /**
                     * Sets the value of the tolerance property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTolerance(String value) {
                        this.tolerance = value;
                    }

                    /**
                     * Gets the value of the searchAreaX property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSearchAreaX() {
                        return searchAreaX;
                    }

                    /**
                     * Sets the value of the searchAreaX property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSearchAreaX(String value) {
                        this.searchAreaX = value;
                    }

                    /**
                     * Gets the value of the searchAreaY property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSearchAreaY() {
                        return searchAreaY;
                    }

                    /**
                     * Sets the value of the searchAreaY property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSearchAreaY(String value) {
                        this.searchAreaY = value;
                    }

                    /**
                     * Gets the value of the sequence property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSequence() {
                        return sequence;
                    }

                    /**
                     * Sets the value of the sequence property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSequence(String value) {
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
                 *       &lt;attribute name="LightingOuter" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LightingInner" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LightingDrop" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LightingIROuter" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LightingIRInner" use="required" type="{}Wstring" />
                 *       &lt;attribute name="FilterInner" use="required" type="{}Wstring" />
                 *       &lt;attribute name="FilterOuter" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Mark200 {

                    @XmlAttribute(name = "LightingOuter", required = true)
                    protected String lightingOuter;
                    @XmlAttribute(name = "LightingInner", required = true)
                    protected String lightingInner;
                    @XmlAttribute(name = "LightingDrop", required = true)
                    protected String lightingDrop;
                    @XmlAttribute(name = "LightingIROuter", required = true)
                    protected String lightingIROuter;
                    @XmlAttribute(name = "LightingIRInner", required = true)
                    protected String lightingIRInner;
                    @XmlAttribute(name = "FilterInner", required = true)
                    protected String filterInner;
                    @XmlAttribute(name = "FilterOuter", required = true)
                    protected String filterOuter;

                    /**
                     * Gets the value of the lightingOuter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLightingOuter() {
                        return lightingOuter;
                    }

                    /**
                     * Sets the value of the lightingOuter property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLightingOuter(String value) {
                        this.lightingOuter = value;
                    }

                    /**
                     * Gets the value of the lightingInner property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLightingInner() {
                        return lightingInner;
                    }

                    /**
                     * Sets the value of the lightingInner property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLightingInner(String value) {
                        this.lightingInner = value;
                    }

                    /**
                     * Gets the value of the lightingDrop property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLightingDrop() {
                        return lightingDrop;
                    }

                    /**
                     * Sets the value of the lightingDrop property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLightingDrop(String value) {
                        this.lightingDrop = value;
                    }

                    /**
                     * Gets the value of the lightingIROuter property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLightingIROuter() {
                        return lightingIROuter;
                    }

                    /**
                     * Sets the value of the lightingIROuter property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLightingIROuter(String value) {
                        this.lightingIROuter = value;
                    }

                    /**
                     * Gets the value of the lightingIRInner property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLightingIRInner() {
                        return lightingIRInner;
                    }

                    /**
                     * Sets the value of the lightingIRInner property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLightingIRInner(String value) {
                        this.lightingIRInner = value;
                    }

                    /**
                     * Gets the value of the filterInner property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFilterInner() {
                        return filterInner;
                    }

                    /**
                     * Sets the value of the filterInner property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFilterInner(String value) {
                        this.filterInner = value;
                    }

                    /**
                     * Gets the value of the filterOuter property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFilterOuter() {
                        return filterOuter;
                    }

                    /**
                     * Sets the value of the filterOuter property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFilterOuter(String value) {
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
         *                 &lt;attribute name="No" use="required" type="{}Wstring" />
         *                 &lt;attribute name="X" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y" use="required" type="{}Wstring" />
         *                 &lt;attribute name="R" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Fid" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Bad" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Comp" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Group" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Opt" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Opt2" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Head" use="required" type="{}Wstring" />
         *                 &lt;attribute name="PickRod" use="required" type="{}Wstring" />
         *                 &lt;attribute name="MountRod" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Nozzle" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Exec" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Comment" use="required" type="{}Wstring" />
         *                 &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
         *                 &lt;attribute name="MaskDX" use="required" type="{}Wstring" />
         *                 &lt;attribute name="MaskDY" use="required" type="{}Wstring" />
         *                 &lt;attribute name="SeqOrder" use="required" type="{}Wstring" />
         *                 &lt;attribute name="GroupID" use="required" type="{}Wstring" />
         *                 &lt;attribute name="GrpOrder" use="required" type="{}Wstring" />
         *                 &lt;attribute name="CodeScan" use="required" type="{}Wstring" />
         *                 &lt;attribute name="MntStage" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
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
             *
             *
             */
            public List<PcbDataFile.Machine.Mounts.Mount> getMount() {
                if (mount == null) {
                    mount = new ArrayList<PcbDataFile.Machine.Mounts.Mount>();
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
             *       &lt;attribute name="No" use="required" type="{}Wstring" />
             *       &lt;attribute name="X" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y" use="required" type="{}Wstring" />
             *       &lt;attribute name="R" use="required" type="{}Wstring" />
             *       &lt;attribute name="Fid" use="required" type="{}Wstring" />
             *       &lt;attribute name="Bad" use="required" type="{}Wstring" />
             *       &lt;attribute name="Comp" use="required" type="{}Wstring" />
             *       &lt;attribute name="Group" use="required" type="{}Wstring" />
             *       &lt;attribute name="Opt" use="required" type="{}Wstring" />
             *       &lt;attribute name="Opt2" use="required" type="{}Wstring" />
             *       &lt;attribute name="Head" use="required" type="{}Wstring" />
             *       &lt;attribute name="PickRod" use="required" type="{}Wstring" />
             *       &lt;attribute name="MountRod" use="required" type="{}Wstring" />
             *       &lt;attribute name="Nozzle" use="required" type="{}Wstring" />
             *       &lt;attribute name="Exec" use="required" type="{}Wstring" />
             *       &lt;attribute name="Comment" use="required" type="{}Wstring" />
             *       &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
             *       &lt;attribute name="MaskDX" use="required" type="{}Wstring" />
             *       &lt;attribute name="MaskDY" use="required" type="{}Wstring" />
             *       &lt;attribute name="SeqOrder" use="required" type="{}Wstring" />
             *       &lt;attribute name="GroupID" use="required" type="{}Wstring" />
             *       &lt;attribute name="GrpOrder" use="required" type="{}Wstring" />
             *       &lt;attribute name="CodeScan" use="required" type="{}Wstring" />
             *       &lt;attribute name="MntStage" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Mount {

                @XmlAttribute(name = "No", required = true)
                protected String no;
                @XmlAttribute(name = "X", required = true)
                protected String x;
                @XmlAttribute(name = "Y", required = true)
                protected String y;
                @XmlAttribute(name = "R", required = true)
                protected String r;
                @XmlAttribute(name = "Fid", required = true)
                protected String fid;
                @XmlAttribute(name = "Bad", required = true)
                protected String bad;
                @XmlAttribute(name = "Comp", required = true)
                protected String comp;
                @XmlAttribute(name = "Group", required = true)
                protected String group;
                @XmlAttribute(name = "Opt", required = true)
                protected String opt;
                @XmlAttribute(name = "Opt2", required = true)
                protected String opt2;
                @XmlAttribute(name = "Head", required = true)
                protected String head;
                @XmlAttribute(name = "PickRod", required = true)
                protected String pickRod;
                @XmlAttribute(name = "MountRod", required = true)
                protected String mountRod;
                @XmlAttribute(name = "Nozzle", required = true)
                protected String nozzle;
                @XmlAttribute(name = "Exec", required = true)
                protected String exec;
                @XmlAttribute(name = "Comment", required = true)
                protected String comment;
                @XmlAttribute(name = "OrgBlk", required = true)
                protected String orgBlk;
                @XmlAttribute(name = "MaskDX", required = true)
                protected String maskDX;
                @XmlAttribute(name = "MaskDY", required = true)
                protected String maskDY;
                @XmlAttribute(name = "SeqOrder", required = true)
                protected String seqOrder;
                @XmlAttribute(name = "GroupID", required = true)
                protected String groupID;
                @XmlAttribute(name = "GrpOrder", required = true)
                protected String grpOrder;
                @XmlAttribute(name = "CodeScan", required = true)
                protected String codeScan;
                @XmlAttribute(name = "MntStage", required = true)
                protected String mntStage;

                /**
                 * Gets the value of the no property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNo() {
                    return no;
                }

                /**
                 * Sets the value of the no property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNo(String value) {
                    this.no = value;
                }

                /**
                 * Gets the value of the x property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getX() {
                    return x;
                }

                /**
                 * Sets the value of the x property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setX(String value) {
                    this.x = value;
                }

                /**
                 * Gets the value of the y property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getY() {
                    return y;
                }

                /**
                 * Sets the value of the y property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setY(String value) {
                    this.y = value;
                }

                /**
                 * Gets the value of the r property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getR() {
                    return r;
                }

                /**
                 * Sets the value of the r property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setR(String value) {
                    this.r = value;
                }

                /**
                 * Gets the value of the fid property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getFid() {
                    return fid;
                }

                /**
                 * Sets the value of the fid property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setFid(String value) {
                    this.fid = value;
                }

                /**
                 * Gets the value of the bad property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getBad() {
                    return bad;
                }

                /**
                 * Sets the value of the bad property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setBad(String value) {
                    this.bad = value;
                }

                /**
                 * Gets the value of the comp property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getComp() {
                    return comp;
                }

                /**
                 * Sets the value of the comp property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setComp(String value) {
                    this.comp = value;
                }

                /**
                 * Gets the value of the group property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getGroup() {
                    return group;
                }

                /**
                 * Sets the value of the group property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setGroup(String value) {
                    this.group = value;
                }

                /**
                 * Gets the value of the opt property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getOpt() {
                    return opt;
                }

                /**
                 * Sets the value of the opt property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOpt(String value) {
                    this.opt = value;
                }

                /**
                 * Gets the value of the opt2 property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getOpt2() {
                    return opt2;
                }

                /**
                 * Sets the value of the opt2 property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOpt2(String value) {
                    this.opt2 = value;
                }

                /**
                 * Gets the value of the head property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getHead() {
                    return head;
                }

                /**
                 * Sets the value of the head property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setHead(String value) {
                    this.head = value;
                }

                /**
                 * Gets the value of the pickRod property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getPickRod() {
                    return pickRod;
                }

                /**
                 * Sets the value of the pickRod property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setPickRod(String value) {
                    this.pickRod = value;
                }

                /**
                 * Gets the value of the mountRod property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMountRod() {
                    return mountRod;
                }

                /**
                 * Sets the value of the mountRod property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMountRod(String value) {
                    this.mountRod = value;
                }

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
                 * Gets the value of the exec property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getExec() {
                    return exec;
                }

                /**
                 * Sets the value of the exec property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setExec(String value) {
                    this.exec = value;
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
                 * Gets the value of the orgBlk property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getOrgBlk() {
                    return orgBlk;
                }

                /**
                 * Sets the value of the orgBlk property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOrgBlk(String value) {
                    this.orgBlk = value;
                }

                /**
                 * Gets the value of the maskDX property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMaskDX() {
                    return maskDX;
                }

                /**
                 * Sets the value of the maskDX property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMaskDX(String value) {
                    this.maskDX = value;
                }

                /**
                 * Gets the value of the maskDY property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMaskDY() {
                    return maskDY;
                }

                /**
                 * Sets the value of the maskDY property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMaskDY(String value) {
                    this.maskDY = value;
                }

                /**
                 * Gets the value of the seqOrder property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSeqOrder() {
                    return seqOrder;
                }

                /**
                 * Sets the value of the seqOrder property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setSeqOrder(String value) {
                    this.seqOrder = value;
                }

                /**
                 * Gets the value of the groupID property.
                 *
                 * @return possible object is
                 * {@link String }
                 */
                public String getGroupID() {
                    return groupID;
                }

                /**
                 * Sets the value of the groupID property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setGroupID(String value) {
                    this.groupID = value;
                }

                /**
                 * Gets the value of the grpOrder property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getGrpOrder() {
                    return grpOrder;
                }

                /**
                 * Sets the value of the grpOrder property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setGrpOrder(String value) {
                    this.grpOrder = value;
                }

                /**
                 * Gets the value of the codeScan property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCodeScan() {
                    return codeScan;
                }

                /**
                 * Sets the value of the codeScan property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCodeScan(String value) {
                    this.codeScan = value;
                }

                /**
                 * Gets the value of the mntStage property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMntStage() {
                    return mntStage;
                }

                /**
                 * Sets the value of the mntStage property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMntStage(String value) {
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
         *                 &lt;attribute name="No" use="required" type="{}Wstring" />
         *                 &lt;attribute name="X" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Y" use="required" type="{}Wstring" />
         *                 &lt;attribute name="R" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Exec" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Comment" use="required" type="{}Wstring" />
         *                 &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
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
             *
             *
             */
            public List<PcbDataFile.Machine.Offset.Repeat> getRepeat() {
                if (repeat == null) {
                    repeat = new ArrayList<PcbDataFile.Machine.Offset.Repeat>();
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
             *       &lt;attribute name="No" use="required" type="{}Wstring" />
             *       &lt;attribute name="X" use="required" type="{}Wstring" />
             *       &lt;attribute name="Y" use="required" type="{}Wstring" />
             *       &lt;attribute name="R" use="required" type="{}Wstring" />
             *       &lt;attribute name="Exec" use="required" type="{}Wstring" />
             *       &lt;attribute name="Comment" use="required" type="{}Wstring" />
             *       &lt;attribute name="OrgBlk" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Repeat {

                @XmlAttribute(name = "No", required = true)
                protected String no;
                @XmlAttribute(name = "X", required = true)
                protected String x;
                @XmlAttribute(name = "Y", required = true)
                protected String y;
                @XmlAttribute(name = "R", required = true)
                protected String r;
                @XmlAttribute(name = "Exec", required = true)
                protected String exec;
                @XmlAttribute(name = "Comment", required = true)
                protected String comment;
                @XmlAttribute(name = "OrgBlk", required = true)
                protected String orgBlk;

                /**
                 * Gets the value of the no property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNo() {
                    return no;
                }

                /**
                 * Sets the value of the no property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNo(String value) {
                    this.no = value;
                }

                /**
                 * Gets the value of the x property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getX() {
                    return x;
                }

                /**
                 * Sets the value of the x property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setX(String value) {
                    this.x = value;
                }

                /**
                 * Gets the value of the y property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getY() {
                    return y;
                }

                /**
                 * Sets the value of the y property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setY(String value) {
                    this.y = value;
                }

                /**
                 * Gets the value of the r property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getR() {
                    return r;
                }

                /**
                 * Sets the value of the r property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setR(String value) {
                    this.r = value;
                }

                /**
                 * Gets the value of the exec property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getExec() {
                    return exec;
                }

                /**
                 * Sets the value of the exec property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setExec(String value) {
                    this.exec = value;
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
                 * Gets the value of the orgBlk property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getOrgBlk() {
                    return orgBlk;
                }

                /**
                 * Sets the value of the orgBlk property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setOrgBlk(String value) {
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
         *                   &lt;choice maxOccurs="unbounded">
         *                     &lt;element name="Part_001">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="PartsName" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Comment" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_002">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="ShapeType" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Package" use="required" type="{}Wstring" />
         *                             &lt;attribute name="FdrType" use="required" type="{}Wstring" />
         *                             &lt;attribute name="CarrierTape" type="{}Wstring" />
         *                             &lt;attribute name="ReelDiameter" use="required" type="{}Wstring" />
         *                             &lt;attribute name="BitFlags" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_062">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Algorithm" use="required" type="{}Wstring" />
         *                             &lt;attribute name="BaseVType" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option1" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option2" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option3" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option4" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_003">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Setno" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Definition" use="required" type="{}Wstring" />
         *                             &lt;attribute name="XPos" use="required" type="{}Wstring" />
         *                             &lt;attribute name="YPos" use="required" type="{}Wstring" />
         *                             &lt;attribute name="FdrIdxStep" use="required" type="{}Wstring" />
         *                             &lt;attribute name="FdrIdxSpeed" use="required" type="{}Wstring" />
         *                             &lt;attribute name="FdrIdxSpeedEx" type="{}Wstring" />
         *                             &lt;attribute name="FeederTimerOffset" use="required" type="{}Wstring" />
         *                             &lt;attribute name="TapeEndDetection" type="{}Wstring" />
         *                             &lt;attribute name="FeederKnotSkip" type="{}Wstring" />
         *                             &lt;attribute name="FeederKnotSpeed" type="{}Wstring" />
         *                             &lt;attribute name="Optimize" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PartsGroupNo" use="required" type="{}Wstring" />
         *                             &lt;attribute name="FixCmp" use="required" type="{}Wstring" />
         *                             &lt;attribute name="SwFdr" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PitchEffect" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Correct3A" use="required" type="{}Wstring" />
         *                             &lt;attribute name="UnitNo" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PickPosCheck" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PickToleranceX" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PickToleranceY" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PickToleranceR" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PickToleranceOffsetX" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PickToleranceOffsetY" use="required" type="{}Wstring" />
         *                             &lt;attribute name="BoardDataTuning" use="required" type="{}Wstring" />
         *                             &lt;attribute name="ToleranceTuning" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_004">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="FreeSpace1" use="required" type="{}Wstring" />
         *                             &lt;attribute name="FreeSpace2" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_012">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="BodyX" use="required" type="{}Wstring" />
         *                             &lt;attribute name="BodyY" use="required" type="{}Wstring" />
         *                             &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MoldX" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MoldY" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_013">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="BodyX" use="required" type="{}Wstring" />
         *                             &lt;attribute name="BodyY" use="required" type="{}Wstring" />
         *                             &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MoldX" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MoldY" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Thicknesschk" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_028">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="RlrOffsetE" use="required" type="{}Wstring" />
         *                             &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LeadNumE" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LeadPitchE" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LeadWidthE" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LeadLengthE" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_018">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="PolMark" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PolMarkPos" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PackSizeX" type="{}Wstring" />
         *                             &lt;attribute name="PackSizeY" type="{}Wstring" />
         *                             &lt;attribute name="PackOffsetX" type="{}Wstring" />
         *                             &lt;attribute name="PackOffsetY" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_025">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
         *                             &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LeadLength" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_033">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="LeadNumN" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LeadPitchN" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_034">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="LeadNumS" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LeadPitchS" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_070">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Alignment" use="required" type="{}Wstring" />
         *                             &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
         *                             &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
         *                             &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
         *                             &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Threshold" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
         *                             &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
         *                             &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
         *                             &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_021">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_071">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Alignment" use="required" type="{}Wstring" />
         *                             &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
         *                             &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
         *                             &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
         *                             &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Threshold" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
         *                             &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
         *                             &lt;attribute name="CompIntensity" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
         *                             &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
         *                             &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_072">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="LightSetting" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LightLevel" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_074">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="CoplaLevel" use="required" type="{}Wstring" />
         *                             &lt;attribute name="CoplaThreshold" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_076">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="LightMode" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MainLightLevel" use="required" type="{}Wstring" />
         *                             &lt;attribute name="CoaxsLightLevel" use="required" type="{}Wstring" />
         *                             &lt;attribute name="SideLightLevel" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_080">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Nozzle" use="required" type="{}Wstring" />
         *                             &lt;attribute name="XYSpeed" use="required" type="{}Wstring" />
         *                             &lt;attribute name="ConvYSpeed" use="required" type="{}Wstring" />
         *                             &lt;attribute name="RotarySpeed" type="{}Wstring" />
         *                             &lt;attribute name="FdrAngle" use="required" type="{}Wstring" />
         *                             &lt;attribute name="VacChk" use="required" type="{}Wstring" />
         *                             &lt;attribute name="CorrectPos" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Action" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PickStart" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Dump" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Retry" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_081">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="PckHeight" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PckTimer" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PckSpeed" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PckVLevel" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PckSingleDir" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PckCtrlDown" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PckCtrlUp" use="required" type="{}Wstring" />
         *                             &lt;attribute name="NozzleTouchHeight" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_083">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="MntHeight" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MntTimer" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MntSpeed" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MntPLevel" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MntSingleDir" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MntCtrlDown" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MntCtrlUp" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MntInsertLength" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MntInsertShortDistance" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_300">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Pck2ndSrvDown" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Pck2ndSrvUp" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_301">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Mnt2ndSrvDown" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Mnt2ndSrvUp" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_302">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="PckForceExist" use="required" type="{}Wstring" />
         *                             &lt;attribute name="PckForceTarget" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_303">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="MntForceExist" use="required" type="{}Wstring" />
         *                             &lt;attribute name="MntForceTarget" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_200">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="DspCType" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DNozzle" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Dtimer" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DXpos" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DYpos" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DspAngle" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DXpt" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DYpt" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DXtime" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DYtime" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_500">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Category" use="required" type="{}Wstring" />
         *                             &lt;attribute name="DipAct" use="required" type="{}Wstring" />
         *                             &lt;attribute name="StampAct" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Marking" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_501">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Option1StationNo" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option1WaitVision" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option1DownSequenceAir" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option12ndSrvDown" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option1DownSpeed" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option1LowendHeight" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option1LowendTimer" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option1UpSequenceAir" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option12ndSrvUp" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option1UpSpeed" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_502">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="Option1ForceExist" use="required" type="{}Wstring" />
         *                             &lt;attribute name="Option1ForceTarget" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_520">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="SVUse" use="required" type="{}Wstring" />
         *                             &lt;attribute name="SVBringBack" use="required" type="{}Wstring" />
         *                             &lt;attribute name="SVBodyLimit" use="required" type="{}Wstring" />
         *                             &lt;attribute name="SVReverseCheck" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="Part_023">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
         *                             &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="ExLights">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="ExLight" maxOccurs="unbounded">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;attribute name="No" use="required" type="{}Wstring" />
         *                                       &lt;attribute name="ExLightLevel" use="required" type="{}Wstring" />
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *                 &lt;attribute name="No" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
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
             *
             *
             */
            public List<PcbDataFile.Machine.Parts.Part> getPart() {
                if (part == null) {
                    part = new ArrayList<PcbDataFile.Machine.Parts.Part>();
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
             *         &lt;choice maxOccurs="unbounded">
             *           &lt;element name="Part_001">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="PartsName" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Comment" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_002">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="ShapeType" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Package" use="required" type="{}Wstring" />
             *                   &lt;attribute name="FdrType" use="required" type="{}Wstring" />
             *                   &lt;attribute name="CarrierTape" type="{}Wstring" />
             *                   &lt;attribute name="ReelDiameter" use="required" type="{}Wstring" />
             *                   &lt;attribute name="BitFlags" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_062">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Algorithm" use="required" type="{}Wstring" />
             *                   &lt;attribute name="BaseVType" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option1" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option2" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option3" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option4" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_003">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Setno" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Definition" use="required" type="{}Wstring" />
             *                   &lt;attribute name="XPos" use="required" type="{}Wstring" />
             *                   &lt;attribute name="YPos" use="required" type="{}Wstring" />
             *                   &lt;attribute name="FdrIdxStep" use="required" type="{}Wstring" />
             *                   &lt;attribute name="FdrIdxSpeed" use="required" type="{}Wstring" />
             *                   &lt;attribute name="FdrIdxSpeedEx" type="{}Wstring" />
             *                   &lt;attribute name="FeederTimerOffset" use="required" type="{}Wstring" />
             *                   &lt;attribute name="TapeEndDetection" type="{}Wstring" />
             *                   &lt;attribute name="FeederKnotSkip" type="{}Wstring" />
             *                   &lt;attribute name="FeederKnotSpeed" type="{}Wstring" />
             *                   &lt;attribute name="Optimize" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PartsGroupNo" use="required" type="{}Wstring" />
             *                   &lt;attribute name="FixCmp" use="required" type="{}Wstring" />
             *                   &lt;attribute name="SwFdr" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PitchEffect" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Correct3A" use="required" type="{}Wstring" />
             *                   &lt;attribute name="UnitNo" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PickPosCheck" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PickToleranceX" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PickToleranceY" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PickToleranceR" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PickToleranceOffsetX" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PickToleranceOffsetY" use="required" type="{}Wstring" />
             *                   &lt;attribute name="BoardDataTuning" use="required" type="{}Wstring" />
             *                   &lt;attribute name="ToleranceTuning" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_004">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="FreeSpace1" use="required" type="{}Wstring" />
             *                   &lt;attribute name="FreeSpace2" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_012">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="BodyX" use="required" type="{}Wstring" />
             *                   &lt;attribute name="BodyY" use="required" type="{}Wstring" />
             *                   &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MoldX" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MoldY" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_013">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="BodyX" use="required" type="{}Wstring" />
             *                   &lt;attribute name="BodyY" use="required" type="{}Wstring" />
             *                   &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MoldX" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MoldY" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Thicknesschk" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_028">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="RlrOffsetE" use="required" type="{}Wstring" />
             *                   &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LeadNumE" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LeadPitchE" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LeadWidthE" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LeadLengthE" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_018">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="PolMark" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PolMarkPos" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PackSizeX" type="{}Wstring" />
             *                   &lt;attribute name="PackSizeY" type="{}Wstring" />
             *                   &lt;attribute name="PackOffsetX" type="{}Wstring" />
             *                   &lt;attribute name="PackOffsetY" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_025">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
             *                   &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LeadLength" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_033">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="LeadNumN" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LeadPitchN" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_034">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="LeadNumS" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LeadPitchS" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_070">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Alignment" use="required" type="{}Wstring" />
             *                   &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
             *                   &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
             *                   &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
             *                   &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Threshold" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
             *                   &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
             *                   &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
             *                   &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_021">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_071">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Alignment" use="required" type="{}Wstring" />
             *                   &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
             *                   &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
             *                   &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
             *                   &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Threshold" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
             *                   &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
             *                   &lt;attribute name="CompIntensity" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
             *                   &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
             *                   &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_072">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="LightSetting" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LightLevel" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_074">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="CoplaLevel" use="required" type="{}Wstring" />
             *                   &lt;attribute name="CoplaThreshold" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_076">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="LightMode" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MainLightLevel" use="required" type="{}Wstring" />
             *                   &lt;attribute name="CoaxsLightLevel" use="required" type="{}Wstring" />
             *                   &lt;attribute name="SideLightLevel" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_080">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Nozzle" use="required" type="{}Wstring" />
             *                   &lt;attribute name="XYSpeed" use="required" type="{}Wstring" />
             *                   &lt;attribute name="ConvYSpeed" use="required" type="{}Wstring" />
             *                   &lt;attribute name="RotarySpeed" type="{}Wstring" />
             *                   &lt;attribute name="FdrAngle" use="required" type="{}Wstring" />
             *                   &lt;attribute name="VacChk" use="required" type="{}Wstring" />
             *                   &lt;attribute name="CorrectPos" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Action" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PickStart" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Dump" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Retry" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_081">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="PckHeight" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PckTimer" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PckSpeed" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PckVLevel" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PckSingleDir" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PckCtrlDown" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PckCtrlUp" use="required" type="{}Wstring" />
             *                   &lt;attribute name="NozzleTouchHeight" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_083">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="MntHeight" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MntTimer" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MntSpeed" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MntPLevel" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MntSingleDir" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MntCtrlDown" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MntCtrlUp" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MntInsertLength" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MntInsertShortDistance" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_300">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Pck2ndSrvDown" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Pck2ndSrvUp" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_301">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Mnt2ndSrvDown" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Mnt2ndSrvUp" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_302">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="PckForceExist" use="required" type="{}Wstring" />
             *                   &lt;attribute name="PckForceTarget" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_303">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="MntForceExist" use="required" type="{}Wstring" />
             *                   &lt;attribute name="MntForceTarget" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_200">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="DspCType" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DNozzle" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Dtimer" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DXpos" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DYpos" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DspAngle" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DXpt" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DYpt" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DXtime" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DYtime" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_500">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Category" use="required" type="{}Wstring" />
             *                   &lt;attribute name="DipAct" use="required" type="{}Wstring" />
             *                   &lt;attribute name="StampAct" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Marking" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_501">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Option1StationNo" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option1WaitVision" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option1DownSequenceAir" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option12ndSrvDown" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option1DownSpeed" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option1LowendHeight" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option1LowendTimer" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option1UpSequenceAir" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option12ndSrvUp" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option1UpSpeed" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_502">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="Option1ForceExist" use="required" type="{}Wstring" />
             *                   &lt;attribute name="Option1ForceTarget" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_520">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="SVUse" use="required" type="{}Wstring" />
             *                   &lt;attribute name="SVBringBack" use="required" type="{}Wstring" />
             *                   &lt;attribute name="SVBodyLimit" use="required" type="{}Wstring" />
             *                   &lt;attribute name="SVReverseCheck" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="Part_023">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
             *                   &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="ExLights">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="ExLight" maxOccurs="unbounded">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;attribute name="No" use="required" type="{}Wstring" />
             *                             &lt;attribute name="ExLightLevel" use="required" type="{}Wstring" />
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *       &lt;/sequence>
             *       &lt;attribute name="No" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "partProps"
            })
            public static class Part {

                @XmlElements({
                        @XmlElement(name = "Part_001", type = PcbDataFile.Machine.Parts.Part.Part001.class),
                        @XmlElement(name = "Part_002", type = PcbDataFile.Machine.Parts.Part.Part002.class),
                        @XmlElement(name = "Part_062", type = PcbDataFile.Machine.Parts.Part.Part062.class),
                        @XmlElement(name = "Part_003", type = PcbDataFile.Machine.Parts.Part.Part003.class),
                        @XmlElement(name = "Part_004", type = PcbDataFile.Machine.Parts.Part.Part004.class),
                        @XmlElement(name = "Part_012", type = PcbDataFile.Machine.Parts.Part.Part012.class),
                        @XmlElement(name = "Part_013", type = PcbDataFile.Machine.Parts.Part.Part013.class),
                        @XmlElement(name = "Part_028", type = PcbDataFile.Machine.Parts.Part.Part028.class),
                        @XmlElement(name = "Part_018", type = PcbDataFile.Machine.Parts.Part.Part018.class),
                        @XmlElement(name = "Part_025", type = PcbDataFile.Machine.Parts.Part.Part025.class),
                        @XmlElement(name = "Part_033", type = PcbDataFile.Machine.Parts.Part.Part033.class),
                        @XmlElement(name = "Part_034", type = PcbDataFile.Machine.Parts.Part.Part034.class),
                        @XmlElement(name = "Part_070", type = PcbDataFile.Machine.Parts.Part.Part070.class),
                        @XmlElement(name = "Part_021", type = PcbDataFile.Machine.Parts.Part.Part021.class),
                        @XmlElement(name = "Part_071", type = PcbDataFile.Machine.Parts.Part.Part071.class),
                        @XmlElement(name = "Part_072", type = PcbDataFile.Machine.Parts.Part.Part072.class),
                        @XmlElement(name = "Part_074", type = PcbDataFile.Machine.Parts.Part.Part074.class),
                        @XmlElement(name = "Part_076", type = PcbDataFile.Machine.Parts.Part.Part076.class),
                        @XmlElement(name = "Part_080", type = PcbDataFile.Machine.Parts.Part.Part080.class),
                        @XmlElement(name = "Part_081", type = PcbDataFile.Machine.Parts.Part.Part081.class),
                        @XmlElement(name = "Part_083", type = PcbDataFile.Machine.Parts.Part.Part083.class),
                        @XmlElement(name = "Part_300", type = PcbDataFile.Machine.Parts.Part.Part300.class),
                        @XmlElement(name = "Part_301", type = PcbDataFile.Machine.Parts.Part.Part301.class),
                        @XmlElement(name = "Part_302", type = PcbDataFile.Machine.Parts.Part.Part302.class),
                        @XmlElement(name = "Part_303", type = PcbDataFile.Machine.Parts.Part.Part303.class),
                        @XmlElement(name = "Part_200", type = PcbDataFile.Machine.Parts.Part.Part200.class),
                        @XmlElement(name = "Part_500", type = PcbDataFile.Machine.Parts.Part.Part500.class),
                        @XmlElement(name = "Part_501", type = PcbDataFile.Machine.Parts.Part.Part501.class),
                        @XmlElement(name = "Part_502", type = PcbDataFile.Machine.Parts.Part.Part502.class),
                        @XmlElement(name = "Part_520", type = PcbDataFile.Machine.Parts.Part.Part520.class),
                        @XmlElement(name = "Part_023", type = PcbDataFile.Machine.Parts.Part.Part023.class),
                        @XmlElement(name = "ExLights", type = PcbDataFile.Machine.Parts.Part.ExLights.class)
                })
                protected List<Object> partProps;
                @XmlAttribute(name = "No", required = true)
                protected String no;

                /**
                 * Gets the value of the part001OrPart002OrPart062 property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the part001OrPart002OrPart062 property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPart001OrPart002OrPart062().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PcbDataFile.Machine.Parts.Part.Part001 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part002 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part062 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part003 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part004 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part012 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part013 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part028 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part018 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part025 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part033 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part034 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part070 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part021 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part071 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part072 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part074 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part076 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part080 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part081 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part083 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part300 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part301 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part302 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part303 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part200 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part500 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part501 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part502 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part520 }
                 * {@link PcbDataFile.Machine.Parts.Part.Part023 }
                 * {@link PcbDataFile.Machine.Parts.Part.ExLights }
                 */
                public List<Object> getPartProps() {
                    if (partProps == null) {
                        partProps = new ArrayList<Object>();
                    }
                    return this.partProps;
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
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setNo(String value) {
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
                 *       &lt;sequence>
                 *         &lt;element name="ExLight" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="No" use="required" type="{}Wstring" />
                 *                 &lt;attribute name="ExLightLevel" use="required" type="{}Wstring" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                        "exLight"
                })
                public static class ExLights {

                    @XmlElement(name = "ExLight", required = true)
                    protected List<PcbDataFile.Machine.Parts.Part.ExLights.ExLight> exLight;

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
                     * {@link PcbDataFile.Machine.Parts.Part.ExLights.ExLight }
                     */
                    public List<PcbDataFile.Machine.Parts.Part.ExLights.ExLight> getExLight() {
                        if (exLight == null) {
                            exLight = new ArrayList<PcbDataFile.Machine.Parts.Part.ExLights.ExLight>();
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
                     *       &lt;attribute name="No" use="required" type="{}Wstring" />
                     *       &lt;attribute name="ExLightLevel" use="required" type="{}Wstring" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ExLight {

                        @XmlAttribute(name = "No", required = true)
                        protected String no;
                        @XmlAttribute(name = "ExLightLevel", required = true)
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
                 *       &lt;attribute name="PartsName" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Comment" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DatabaseNo" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LibraryUse" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LibraryFolder" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LibraryPath" use="required" type="{}Wstring" />
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
                    protected String databaseNo;
                    @XmlAttribute(name = "LibraryUse", required = true)
                    protected String libraryUse;
                    @XmlAttribute(name = "LibraryFolder", required = true)
                    protected String libraryFolder;
                    @XmlAttribute(name = "LibraryPath", required = true)
                    protected String libraryPath;

                    /**
                     * Gets the value of the partsName property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="ShapeType" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Package" use="required" type="{}Wstring" />
                 *       &lt;attribute name="FdrType" use="required" type="{}Wstring" />
                 *       &lt;attribute name="CarrierTape" type="{}Wstring" />
                 *       &lt;attribute name="ReelDiameter" use="required" type="{}Wstring" />
                 *       &lt;attribute name="BitFlags" use="required" type="{}Wstring" />
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

                    @XmlAttribute(name = "ShapeType", required = true)
                    protected String shapeType;
                    @XmlAttribute(name = "Package", required = true)
                    protected String _package;
                    @XmlAttribute(name = "FdrType", required = true)
                    protected String fdrType;
                    @XmlAttribute(name = "CarrierTape")
                    protected String carrierTape;
                    @XmlAttribute(name = "ReelDiameter", required = true)
                    protected String reelDiameter;
                    @XmlAttribute(name = "BitFlags", required = true)
                    protected String bitFlags;

                    /**
                     * Gets the value of the shapeType property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getShapeType() {
                        return shapeType;
                    }

                    /**
                     * Sets the value of the shapeType property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setShapeType(String value) {
                        this.shapeType = value;
                    }

                    /**
                     * Gets the value of the package property.
                     *
                     * @return possible object is
                     * {@link String }
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setFdrType(String value) {
                        this.fdrType = value;
                    }

                    /**
                     * Gets the value of the carrierTape property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCarrierTape() {
                        return carrierTape;
                    }

                    /**
                     * Sets the value of the carrierTape property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCarrierTape(String value) {
                        this.carrierTape = value;
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="Setno" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Definition" use="required" type="{}Wstring" />
                 *       &lt;attribute name="XPos" use="required" type="{}Wstring" />
                 *       &lt;attribute name="YPos" use="required" type="{}Wstring" />
                 *       &lt;attribute name="FdrIdxStep" use="required" type="{}Wstring" />
                 *       &lt;attribute name="FdrIdxSpeed" use="required" type="{}Wstring" />
                 *       &lt;attribute name="FdrIdxSpeedEx" type="{}Wstring" />
                 *       &lt;attribute name="FeederTimerOffset" use="required" type="{}Wstring" />
                 *       &lt;attribute name="TapeEndDetection" type="{}Wstring" />
                 *       &lt;attribute name="FeederKnotSkip" type="{}Wstring" />
                 *       &lt;attribute name="FeederKnotSpeed" type="{}Wstring" />
                 *       &lt;attribute name="Optimize" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PartsGroupNo" use="required" type="{}Wstring" />
                 *       &lt;attribute name="FixCmp" use="required" type="{}Wstring" />
                 *       &lt;attribute name="SwFdr" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PitchEffect" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Correct3A" use="required" type="{}Wstring" />
                 *       &lt;attribute name="UnitNo" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PickPosCheck" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PickToleranceX" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PickToleranceY" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PickToleranceR" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PickToleranceOffsetX" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PickToleranceOffsetY" use="required" type="{}Wstring" />
                 *       &lt;attribute name="BoardDataTuning" use="required" type="{}Wstring" />
                 *       &lt;attribute name="ToleranceTuning" use="required" type="{}Wstring" />
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

                    @XmlAttribute(name = "Setno", required = true)
                    protected String setno;
                    @XmlAttribute(name = "Definition", required = true)
                    protected String definition;
                    @XmlAttribute(name = "XPos", required = true)
                    protected String xPos;
                    @XmlAttribute(name = "YPos", required = true)
                    protected String yPos;
                    @XmlAttribute(name = "FdrIdxStep", required = true)
                    protected String fdrIdxStep;
                    @XmlAttribute(name = "FdrIdxSpeed", required = true)
                    protected String fdrIdxSpeed;
                    @XmlAttribute(name = "FdrIdxSpeedEx")
                    protected String fdrIdxSpeedEx;
                    @XmlAttribute(name = "FeederTimerOffset", required = true)
                    protected String feederTimerOffset;
                    @XmlAttribute(name = "TapeEndDetection")
                    protected String tapeEndDetection;
                    @XmlAttribute(name = "FeederKnotSkip")
                    protected String feederKnotSkip;
                    @XmlAttribute(name = "FeederKnotSpeed")
                    protected String feederKnotSpeed;
                    @XmlAttribute(name = "Optimize", required = true)
                    protected String optimize;
                    @XmlAttribute(name = "PartsGroupNo", required = true)
                    protected String partsGroupNo;
                    @XmlAttribute(name = "FixCmp", required = true)
                    protected String fixCmp;
                    @XmlAttribute(name = "SwFdr", required = true)
                    protected String swFdr;
                    @XmlAttribute(name = "PitchEffect", required = true)
                    protected String pitchEffect;
                    @XmlAttribute(name = "Correct3A", required = true)
                    protected String correct3A;
                    @XmlAttribute(name = "UnitNo", required = true)
                    protected String unitNo;
                    @XmlAttribute(name = "PickPosCheck", required = true)
                    protected String pickPosCheck;
                    @XmlAttribute(name = "PickToleranceX", required = true)
                    protected String pickToleranceX;
                    @XmlAttribute(name = "PickToleranceY", required = true)
                    protected String pickToleranceY;
                    @XmlAttribute(name = "PickToleranceR", required = true)
                    protected String pickToleranceR;
                    @XmlAttribute(name = "PickToleranceOffsetX", required = true)
                    protected String pickToleranceOffsetX;
                    @XmlAttribute(name = "PickToleranceOffsetY", required = true)
                    protected String pickToleranceOffsetY;
                    @XmlAttribute(name = "BoardDataTuning", required = true)
                    protected String boardDataTuning;
                    @XmlAttribute(name = "ToleranceTuning", required = true)
                    protected String toleranceTuning;

                    /**
                     * Gets the value of the setno property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDefinition() {
                        return definition;
                    }

                    /**
                     * Sets the value of the definition property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDefinition(String value) {
                        this.definition = value;
                    }

                    /**
                     * Gets the value of the xPos property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXPos() {
                        return xPos;
                    }

                    /**
                     * Sets the value of the xPos property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFdrIdxStep() {
                        return fdrIdxStep;
                    }

                    /**
                     * Sets the value of the fdrIdxStep property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFdrIdxStep(String value) {
                        this.fdrIdxStep = value;
                    }

                    /**
                     * Gets the value of the fdrIdxSpeed property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFdrIdxSpeed() {
                        return fdrIdxSpeed;
                    }

                    /**
                     * Sets the value of the fdrIdxSpeed property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFdrIdxSpeed(String value) {
                        this.fdrIdxSpeed = value;
                    }

                    /**
                     * Gets the value of the fdrIdxSpeedEx property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFdrIdxSpeedEx() {
                        return fdrIdxSpeedEx;
                    }

                    /**
                     * Sets the value of the fdrIdxSpeedEx property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFdrIdxSpeedEx(String value) {
                        this.fdrIdxSpeedEx = value;
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
                     * Gets the value of the tapeEndDetection property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getTapeEndDetection() {
                        return tapeEndDetection;
                    }

                    /**
                     * Sets the value of the tapeEndDetection property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setTapeEndDetection(String value) {
                        this.tapeEndDetection = value;
                    }

                    /**
                     * Gets the value of the feederKnotSkip property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getFeederKnotSkip() {
                        return feederKnotSkip;
                    }

                    /**
                     * Sets the value of the feederKnotSkip property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setFeederKnotSkip(String value) {
                        this.feederKnotSkip = value;
                    }

                    /**
                     * Gets the value of the feederKnotSpeed property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getFeederKnotSpeed() {
                        return feederKnotSpeed;
                    }

                    /**
                     * Sets the value of the feederKnotSpeed property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setFeederKnotSpeed(String value) {
                        this.feederKnotSpeed = value;
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPitchEffect() {
                        return pitchEffect;
                    }

                    /**
                     * Sets the value of the pitchEffect property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPitchEffect(String value) {
                        this.pitchEffect = value;
                    }

                    /**
                     * Gets the value of the correct3A property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCorrect3A() {
                        return correct3A;
                    }

                    /**
                     * Sets the value of the correct3A property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCorrect3A(String value) {
                        this.correct3A = value;
                    }

                    /**
                     * Gets the value of the unitNo property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getUnitNo() {
                        return unitNo;
                    }

                    /**
                     * Sets the value of the unitNo property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setUnitNo(String value) {
                        this.unitNo = value;
                    }

                    /**
                     * Gets the value of the pickPosCheck property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPickPosCheck() {
                        return pickPosCheck;
                    }

                    /**
                     * Sets the value of the pickPosCheck property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPickPosCheck(String value) {
                        this.pickPosCheck = value;
                    }

                    /**
                     * Gets the value of the pickToleranceX property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPickToleranceX() {
                        return pickToleranceX;
                    }

                    /**
                     * Sets the value of the pickToleranceX property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPickToleranceX(String value) {
                        this.pickToleranceX = value;
                    }

                    /**
                     * Gets the value of the pickToleranceY property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPickToleranceY() {
                        return pickToleranceY;
                    }

                    /**
                     * Sets the value of the pickToleranceY property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPickToleranceY(String value) {
                        this.pickToleranceY = value;
                    }

                    /**
                     * Gets the value of the pickToleranceR property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPickToleranceR() {
                        return pickToleranceR;
                    }

                    /**
                     * Sets the value of the pickToleranceR property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPickToleranceR(String value) {
                        this.pickToleranceR = value;
                    }

                    /**
                     * Gets the value of the pickToleranceOffsetX property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPickToleranceOffsetX() {
                        return pickToleranceOffsetX;
                    }

                    /**
                     * Sets the value of the pickToleranceOffsetX property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPickToleranceOffsetX(String value) {
                        this.pickToleranceOffsetX = value;
                    }

                    /**
                     * Gets the value of the pickToleranceOffsetY property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPickToleranceOffsetY() {
                        return pickToleranceOffsetY;
                    }

                    /**
                     * Sets the value of the pickToleranceOffsetY property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPickToleranceOffsetY(String value) {
                        this.pickToleranceOffsetY = value;
                    }

                    /**
                     * Gets the value of the boardDataTuning property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBoardDataTuning() {
                        return boardDataTuning;
                    }

                    /**
                     * Sets the value of the boardDataTuning property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBoardDataTuning(String value) {
                        this.boardDataTuning = value;
                    }

                    /**
                     * Gets the value of the toleranceTuning property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getToleranceTuning() {
                        return toleranceTuning;
                    }

                    /**
                     * Sets the value of the toleranceTuning property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="FreeSpace1" use="required" type="{}Wstring" />
                 *       &lt;attribute name="FreeSpace2" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part004 {

                    @XmlAttribute(name = "FreeSpace1", required = true)
                    protected String freeSpace1;
                    @XmlAttribute(name = "FreeSpace2", required = true)
                    protected String freeSpace2;

                    /**
                     * Gets the value of the freeSpace1 property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getFreeSpace1() {
                        return freeSpace1;
                    }

                    /**
                     * Sets the value of the freeSpace1 property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="BodyX" use="required" type="{}Wstring" />
                 *       &lt;attribute name="BodyY" use="required" type="{}Wstring" />
                 *       &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MoldX" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MoldY" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part012 {

                    @XmlAttribute(name = "BodyX", required = true)
                    protected String bodyX;
                    @XmlAttribute(name = "BodyY", required = true)
                    protected String bodyY;
                    @XmlAttribute(name = "BodyZ", required = true)
                    protected String bodyZ;
                    @XmlAttribute(name = "MoldX", required = true)
                    protected String moldX;
                    @XmlAttribute(name = "MoldY", required = true)
                    protected String moldY;
                    @XmlAttribute(name = "MoldZ", required = true)
                    protected String moldZ;

                    /**
                     * Gets the value of the bodyX property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getBodyX() {
                        return bodyX;
                    }

                    /**
                     * Sets the value of the bodyX property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setBodyX(String value) {
                        this.bodyX = value;
                    }

                    /**
                     * Gets the value of the bodyY property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBodyY() {
                        return bodyY;
                    }

                    /**
                     * Sets the value of the bodyY property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBodyY(String value) {
                        this.bodyY = value;
                    }

                    /**
                     * Gets the value of the bodyZ property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getBodyZ() {
                        return bodyZ;
                    }

                    /**
                     * Sets the value of the bodyZ property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setBodyZ(String value) {
                        this.bodyZ = value;
                    }

                    /**
                     * Gets the value of the moldX property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getMoldX() {
                        return moldX;
                    }

                    /**
                     * Sets the value of the moldX property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setMoldX(String value) {
                        this.moldX = value;
                    }

                    /**
                     * Gets the value of the moldY property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getMoldY() {
                        return moldY;
                    }

                    /**
                     * Sets the value of the moldY property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setMoldY(String value) {
                        this.moldY = value;
                    }

                    /**
                     * Gets the value of the moldZ property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getMoldZ() {
                        return moldZ;
                    }

                    /**
                     * Sets the value of the moldZ property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="BodyX" use="required" type="{}Wstring" />
                 *       &lt;attribute name="BodyY" use="required" type="{}Wstring" />
                 *       &lt;attribute name="BodyZ" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MoldX" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MoldY" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MoldZ" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Thicknesschk" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part013 {

                    @XmlAttribute(name = "BodyX", required = true)
                    protected String bodyX;
                    @XmlAttribute(name = "BodyY", required = true)
                    protected String bodyY;
                    @XmlAttribute(name = "BodyZ", required = true)
                    protected String bodyZ;
                    @XmlAttribute(name = "MoldX", required = true)
                    protected String moldX;
                    @XmlAttribute(name = "MoldY", required = true)
                    protected String moldY;
                    @XmlAttribute(name = "MoldZ", required = true)
                    protected String moldZ;
                    @XmlAttribute(name = "Thicknesschk", required = true)
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBodyY() {
                        return bodyY;
                    }

                    /**
                     * Sets the value of the bodyY property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBodyY(String value) {
                        this.bodyY = value;
                    }

                    /**
                     * Gets the value of the bodyZ property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBodyZ() {
                        return bodyZ;
                    }

                    /**
                     * Sets the value of the bodyZ property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBodyZ(String value) {
                        this.bodyZ = value;
                    }

                    /**
                     * Gets the value of the moldX property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMoldX() {
                        return moldX;
                    }

                    /**
                     * Sets the value of the moldX property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMoldX(String value) {
                        this.moldX = value;
                    }

                    /**
                     * Gets the value of the moldY property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMoldY() {
                        return moldY;
                    }

                    /**
                     * Sets the value of the moldY property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMoldY(String value) {
                        this.moldY = value;
                    }

                    /**
                     * Gets the value of the moldZ property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMoldZ() {
                        return moldZ;
                    }

                    /**
                     * Sets the value of the moldZ property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMoldZ(String value) {
                        this.moldZ = value;
                    }

                    /**
                     * Gets the value of the thicknesschk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getThicknesschk() {
                        return thicknesschk;
                    }

                    /**
                     * Sets the value of the thicknesschk property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="PolMark" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PolMarkPos" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PackSizeX" type="{}Wstring" />
                 *       &lt;attribute name="PackSizeY" type="{}Wstring" />
                 *       &lt;attribute name="PackOffsetX" type="{}Wstring" />
                 *       &lt;attribute name="PackOffsetY" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part018 {

                    @XmlAttribute(name = "PolMark", required = true)
                    protected String polMark;
                    @XmlAttribute(name = "PolMarkPos", required = true)
                    protected String polMarkPos;
                    @XmlAttribute(name = "PackSizeX")
                    protected String packSizeX;
                    @XmlAttribute(name = "PackSizeY")
                    protected String packSizeY;
                    @XmlAttribute(name = "PackOffsetX")
                    protected String packOffsetX;
                    @XmlAttribute(name = "PackOffsetY")
                    protected String packOffsetY;

                    /**
                     * Gets the value of the polMark property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
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

                    /**
                     * Gets the value of the packSizeX property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getPackSizeX() {
                        return packSizeX;
                    }

                    /**
                     * Sets the value of the packSizeX property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setPackSizeX(String value) {
                        this.packSizeX = value;
                    }

                    /**
                     * Gets the value of the packSizeY property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getPackSizeY() {
                        return packSizeY;
                    }

                    /**
                     * Sets the value of the packSizeY property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setPackSizeY(String value) {
                        this.packSizeY = value;
                    }

                    /**
                     * Gets the value of the packOffsetX property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getPackOffsetX() {
                        return packOffsetX;
                    }

                    /**
                     * Sets the value of the packOffsetX property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setPackOffsetX(String value) {
                        this.packOffsetX = value;
                    }

                    /**
                     * Gets the value of the packOffsetY property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getPackOffsetY() {
                        return packOffsetY;
                    }

                    /**
                     * Sets the value of the packOffsetY property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setPackOffsetY(String value) {
                        this.packOffsetY = value;
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
                 *       &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part021 {

                    @XmlAttribute(name = "RlrOffset", required = true)
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
                 *       &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part023 {

                    @XmlAttribute(name = "RlrOffset", required = true)
                    protected String rlrOffset;
                    @XmlAttribute(name = "LeadWidth", required = true)
                    protected String leadWidth;

                    /**
                     * Gets the value of the rlrOffset property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRlrOffset() {
                        return rlrOffset;
                    }

                    /**
                     * Sets the value of the rlrOffset property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRlrOffset(String value) {
                        this.rlrOffset = value;
                    }

                    /**
                     * Gets the value of the leadWidth property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLeadWidth() {
                        return leadWidth;
                    }

                    /**
                     * Sets the value of the leadWidth property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="RlrOffset" use="required" type="{}Wstring" />
                 *       &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LeadWidth" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LeadLength" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part025 {

                    @XmlAttribute(name = "RlrOffset", required = true)
                    protected String rlrOffset;
                    @XmlAttribute(name = "RlrWidth", required = true)
                    protected String rlrWidth;
                    @XmlAttribute(name = "LeadWidth", required = true)
                    protected String leadWidth;
                    @XmlAttribute(name = "LeadLength", required = true)
                    protected String leadLength;

                    /**
                     * Gets the value of the rlrOffset property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="RlrOffsetE" use="required" type="{}Wstring" />
                 *       &lt;attribute name="RlrWidth" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LeadNumE" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LeadPitchE" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LeadWidthE" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LeadLengthE" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part028 {

                    @XmlAttribute(name = "RlrOffsetE", required = true)
                    protected String rlrOffsetE;
                    @XmlAttribute(name = "RlrWidth", required = true)
                    protected String rlrWidth;
                    @XmlAttribute(name = "LeadNumE", required = true)
                    protected String leadNumE;
                    @XmlAttribute(name = "LeadPitchE", required = true)
                    protected String leadPitchE;
                    @XmlAttribute(name = "LeadWidthE", required = true)
                    protected String leadWidthE;
                    @XmlAttribute(name = "LeadLengthE", required = true)
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
                 *       &lt;attribute name="LeadNumN" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LeadPitchN" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part033 {

                    @XmlAttribute(name = "LeadNumN", required = true)
                    protected String leadNumN;
                    @XmlAttribute(name = "LeadPitchN", required = true)
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
                 *       &lt;attribute name="LeadNumS" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LeadPitchS" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part034 {

                    @XmlAttribute(name = "LeadNumS", required = true)
                    protected String leadNumS;
                    @XmlAttribute(name = "LeadPitchS", required = true)
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
                 *       &lt;attribute name="Algorithm" use="required" type="{}Wstring" />
                 *       &lt;attribute name="BaseVType" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option1" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option2" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option3" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option4" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part062 {

                    @XmlAttribute(name = "Algorithm", required = true)
                    protected String algorithm;
                    @XmlAttribute(name = "BaseVType", required = true)
                    protected String baseVType;
                    @XmlAttribute(name = "Option1", required = true)
                    protected String option1;
                    @XmlAttribute(name = "Option2", required = true)
                    protected String option2;
                    @XmlAttribute(name = "Option3", required = true)
                    protected String option3;
                    @XmlAttribute(name = "Option4", required = true)
                    protected String option4;

                    /**
                     * Gets the value of the algorithm property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAlgorithm() {
                        return algorithm;
                    }

                    /**
                     * Sets the value of the algorithm property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAlgorithm(String value) {
                        this.algorithm = value;
                    }

                    /**
                     * Gets the value of the baseVType property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getBaseVType() {
                        return baseVType;
                    }

                    /**
                     * Sets the value of the baseVType property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setBaseVType(String value) {
                        this.baseVType = value;
                    }

                    /**
                     * Gets the value of the option1 property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOption1() {
                        return option1;
                    }

                    /**
                     * Sets the value of the option1 property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setOption1(String value) {
                        this.option1 = value;
                    }

                    /**
                     * Gets the value of the option2 property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOption2() {
                        return option2;
                    }

                    /**
                     * Sets the value of the option2 property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setOption2(String value) {
                        this.option2 = value;
                    }

                    /**
                     * Gets the value of the option3 property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOption3() {
                        return option3;
                    }

                    /**
                     * Sets the value of the option3 property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setOption3(String value) {
                        this.option3 = value;
                    }

                    /**
                     * Gets the value of the option4 property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOption4() {
                        return option4;
                    }

                    /**
                     * Sets the value of the option4 property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="Alignment" use="required" type="{}Wstring" />
                 *       &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
                 *       &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
                 *       &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
                 *       &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Threshold" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
                 *       &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
                 *       &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
                 *       &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part070 {

                    @XmlAttribute(name = "Alignment", required = true)
                    protected String alignment;
                    @XmlAttribute(name = "AlignRefSubMlt", required = true)
                    protected String alignRefSubMlt;
                    @XmlAttribute(name = "AlignRefSubSgl", required = true)
                    protected String alignRefSubSgl;
                    @XmlAttribute(name = "AlignRefSubScan", required = true)
                    protected String alignRefSubScan;
                    @XmlAttribute(name = "AutoThreshold", required = true)
                    protected String autoThreshold;
                    @XmlAttribute(name = "Threshold", required = true)
                    protected String threshold;
                    @XmlAttribute(name = "Tolerance", required = true)
                    protected String tolerance;
                    @XmlAttribute(name = "SearchArea", required = true)
                    protected String searchArea;
                    @XmlAttribute(name = "DatumAngle", required = true)
                    protected String datumAngle;
                    @XmlAttribute(name = "MultiMACS", required = true)
                    protected String multiMACS;
                    @XmlAttribute(name = "OffsetRec", required = true)
                    protected String offsetRec;
                    @XmlAttribute(name = "RecognitionOffsetZ", required = true)
                    protected String recognitionOffsetZ;

                    /**
                     * Gets the value of the alignment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAlignment() {
                        return alignment;
                    }

                    /**
                     * Sets the value of the alignment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAlignment(String value) {
                        this.alignment = value;
                    }

                    /**
                     * Gets the value of the alignRefSubMlt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAutoThreshold() {
                        return autoThreshold;
                    }

                    /**
                     * Sets the value of the autoThreshold property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAutoThreshold(String value) {
                        this.autoThreshold = value;
                    }

                    /**
                     * Gets the value of the threshold property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getThreshold() {
                        return threshold;
                    }

                    /**
                     * Sets the value of the threshold property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setThreshold(String value) {
                        this.threshold = value;
                    }

                    /**
                     * Gets the value of the tolerance property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getTolerance() {
                        return tolerance;
                    }

                    /**
                     * Sets the value of the tolerance property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTolerance(String value) {
                        this.tolerance = value;
                    }

                    /**
                     * Gets the value of the searchArea property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSearchArea() {
                        return searchArea;
                    }

                    /**
                     * Sets the value of the searchArea property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDatumAngle(String value) {
                        this.datumAngle = value;
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

                    /**
                     * Gets the value of the recognitionOffsetZ property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRecognitionOffsetZ() {
                        return recognitionOffsetZ;
                    }

                    /**
                     * Sets the value of the recognitionOffsetZ property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="Alignment" use="required" type="{}Wstring" />
                 *       &lt;attribute name="AlignRefSubMlt" use="required" type="{}Wstring" />
                 *       &lt;attribute name="AlignRefSubSgl" use="required" type="{}Wstring" />
                 *       &lt;attribute name="AlignRefSubScan" use="required" type="{}Wstring" />
                 *       &lt;attribute name="AutoThreshold" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Threshold" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Tolerance" use="required" type="{}Wstring" />
                 *       &lt;attribute name="SearchArea" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DatumAngle" use="required" type="{}Wstring" />
                 *       &lt;attribute name="CompIntensity" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MultiMACS" use="required" type="{}Wstring" />
                 *       &lt;attribute name="OffsetRec" use="required" type="{}Wstring" />
                 *       &lt;attribute name="RecognitionOffsetZ" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part071 {

                    @XmlAttribute(name = "Alignment", required = true)
                    protected String alignment;
                    @XmlAttribute(name = "AlignRefSubMlt", required = true)
                    protected String alignRefSubMlt;
                    @XmlAttribute(name = "AlignRefSubSgl", required = true)
                    protected String alignRefSubSgl;
                    @XmlAttribute(name = "AlignRefSubScan", required = true)
                    protected String alignRefSubScan;
                    @XmlAttribute(name = "AutoThreshold", required = true)
                    protected String autoThreshold;
                    @XmlAttribute(name = "Threshold", required = true)
                    protected String threshold;
                    @XmlAttribute(name = "Tolerance", required = true)
                    protected String tolerance;
                    @XmlAttribute(name = "SearchArea", required = true)
                    protected String searchArea;
                    @XmlAttribute(name = "DatumAngle", required = true)
                    protected String datumAngle;
                    @XmlAttribute(name = "CompIntensity", required = true)
                    protected String compIntensity;
                    @XmlAttribute(name = "MultiMACS", required = true)
                    protected String multiMACS;
                    @XmlAttribute(name = "OffsetRec", required = true)
                    protected String offsetRec;
                    @XmlAttribute(name = "RecognitionOffsetZ", required = true)
                    protected String recognitionOffsetZ;

                    /**
                     * Gets the value of the alignment property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAlignment() {
                        return alignment;
                    }

                    /**
                     * Sets the value of the alignment property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAlignment(String value) {
                        this.alignment = value;
                    }

                    /**
                     * Gets the value of the alignRefSubMlt property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAutoThreshold() {
                        return autoThreshold;
                    }

                    /**
                     * Sets the value of the autoThreshold property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAutoThreshold(String value) {
                        this.autoThreshold = value;
                    }

                    /**
                     * Gets the value of the threshold property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getThreshold() {
                        return threshold;
                    }

                    /**
                     * Sets the value of the threshold property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setThreshold(String value) {
                        this.threshold = value;
                    }

                    /**
                     * Gets the value of the tolerance property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getTolerance() {
                        return tolerance;
                    }

                    /**
                     * Sets the value of the tolerance property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setTolerance(String value) {
                        this.tolerance = value;
                    }

                    /**
                     * Gets the value of the searchArea property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getSearchArea() {
                        return searchArea;
                    }

                    /**
                     * Sets the value of the searchArea property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDatumAngle(String value) {
                        this.datumAngle = value;
                    }

                    /**
                     * Gets the value of the compIntensity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCompIntensity() {
                        return compIntensity;
                    }

                    /**
                     * Sets the value of the compIntensity property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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

                    /**
                     * Gets the value of the recognitionOffsetZ property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getRecognitionOffsetZ() {
                        return recognitionOffsetZ;
                    }

                    /**
                     * Sets the value of the recognitionOffsetZ property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="LightSetting" use="required" type="{}Wstring" />
                 *       &lt;attribute name="LightLevel" use="required" type="{}Wstring" />
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

                    @XmlAttribute(name = "LightSetting", required = true)
                    protected String lightSetting;
                    @XmlAttribute(name = "LightLevel", required = true)
                    protected String lightLevel;

                    /**
                     * Gets the value of the lightSetting property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getLightLevel() {
                        return lightLevel;
                    }

                    /**
                     * Sets the value of the lightLevel property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="CoplaLevel" use="required" type="{}Wstring" />
                 *       &lt;attribute name="CoplaThreshold" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part074 {

                    @XmlAttribute(name = "CoplaLevel", required = true)
                    protected String coplaLevel;
                    @XmlAttribute(name = "CoplaThreshold", required = true)
                    protected String coplaThreshold;

                    /**
                     * Gets the value of the coplaLevel property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCoplaLevel() {
                        return coplaLevel;
                    }

                    /**
                     * Sets the value of the coplaLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="LightMode" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MainLightLevel" use="required" type="{}Wstring" />
                 *       &lt;attribute name="CoaxsLightLevel" use="required" type="{}Wstring" />
                 *       &lt;attribute name="SideLightLevel" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part076 {

                    @XmlAttribute(name = "LightMode", required = true)
                    protected String lightMode;
                    @XmlAttribute(name = "MainLightLevel", required = true)
                    protected String mainLightLevel;
                    @XmlAttribute(name = "CoaxsLightLevel", required = true)
                    protected String coaxsLightLevel;
                    @XmlAttribute(name = "SideLightLevel", required = true)
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
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setLightMode(String value) {
                        this.lightMode = value;
                    }

                    /**
                     * Gets the value of the mainLightLevel property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMainLightLevel() {
                        return mainLightLevel;
                    }

                    /**
                     * Sets the value of the mainLightLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setMainLightLevel(String value) {
                        this.mainLightLevel = value;
                    }

                    /**
                     * Gets the value of the coaxsLightLevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCoaxsLightLevel() {
                        return coaxsLightLevel;
                    }

                    /**
                     * Sets the value of the coaxsLightLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCoaxsLightLevel(String value) {
                        this.coaxsLightLevel = value;
                    }

                    /**
                     * Gets the value of the sideLightLevel property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getSideLightLevel() {
                        return sideLightLevel;
                    }

                    /**
                     * Sets the value of the sideLightLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="Nozzle" use="required" type="{}Wstring" />
                 *       &lt;attribute name="XYSpeed" use="required" type="{}Wstring" />
                 *       &lt;attribute name="ConvYSpeed" use="required" type="{}Wstring" />
                 *       &lt;attribute name="RotarySpeed" type="{}Wstring" />
                 *       &lt;attribute name="FdrAngle" use="required" type="{}Wstring" />
                 *       &lt;attribute name="VacChk" use="required" type="{}Wstring" />
                 *       &lt;attribute name="CorrectPos" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Action" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PickStart" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Dump" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Retry" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part080 {

                    @XmlAttribute(name = "Nozzle", required = true)
                    protected String nozzle;
                    @XmlAttribute(name = "XYSpeed", required = true)
                    protected String xySpeed;
                    @XmlAttribute(name = "ConvYSpeed", required = true)
                    protected String convYSpeed;
                    @XmlAttribute(name = "RotarySpeed")
                    protected String rotarySpeed;
                    @XmlAttribute(name = "FdrAngle", required = true)
                    protected String fdrAngle;
                    @XmlAttribute(name = "VacChk", required = true)
                    protected String vacChk;
                    @XmlAttribute(name = "CorrectPos", required = true)
                    protected String correctPos;
                    @XmlAttribute(name = "Action", required = true)
                    protected String action;
                    @XmlAttribute(name = "PickStart", required = true)
                    protected String pickStart;
                    @XmlAttribute(name = "Dump", required = true)
                    protected String dump;
                    @XmlAttribute(name = "Retry", required = true)
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setXYSpeed(String value) {
                        this.xySpeed = value;
                    }

                    /**
                     * Gets the value of the convYSpeed property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getConvYSpeed() {
                        return convYSpeed;
                    }

                    /**
                     * Sets the value of the convYSpeed property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setConvYSpeed(String value) {
                        this.convYSpeed = value;
                    }

                    /**
                     * Gets the value of the rotarySpeed property.
                     *
                     * @return possible object is
                     * {@link String }
                     */
                    public String getRotarySpeed() {
                        return rotarySpeed;
                    }

                    /**
                     * Sets the value of the rotarySpeed property.
                     *
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setRotarySpeed(String value) {
                        this.rotarySpeed = value;
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVacChk(String value) {
                        this.vacChk = value;
                    }

                    /**
                     * Gets the value of the correctPos property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCorrectPos() {
                        return correctPos;
                    }

                    /**
                     * Sets the value of the correctPos property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCorrectPos(String value) {
                        this.correctPos = value;
                    }

                    /**
                     * Gets the value of the action property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getAction() {
                        return action;
                    }

                    /**
                     * Sets the value of the action property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setAction(String value) {
                        this.action = value;
                    }

                    /**
                     * Gets the value of the pickStart property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPickStart() {
                        return pickStart;
                    }

                    /**
                     * Sets the value of the pickStart property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="PckHeight" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PckTimer" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PckSpeed" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PckVLevel" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PckSingleDir" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PckCtrlDown" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PckCtrlUp" use="required" type="{}Wstring" />
                 *       &lt;attribute name="NozzleTouchHeight" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part081 {

                    @XmlAttribute(name = "PckHeight", required = true)
                    protected String pckHeight;
                    @XmlAttribute(name = "PckTimer", required = true)
                    protected String pckTimer;
                    @XmlAttribute(name = "PckSpeed", required = true)
                    protected String pckSpeed;
                    @XmlAttribute(name = "PckVLevel", required = true)
                    protected String pckVLevel;
                    @XmlAttribute(name = "PckSingleDir", required = true)
                    protected String pckSingleDir;
                    @XmlAttribute(name = "PckCtrlDown", required = true)
                    protected String pckCtrlDown;
                    @XmlAttribute(name = "PckCtrlUp", required = true)
                    protected String pckCtrlUp;
                    @XmlAttribute(name = "NozzleTouchHeight", required = true)
                    protected String nozzleTouchHeight;

                    /**
                     * Gets the value of the pckHeight property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPckHeight() {
                        return pckHeight;
                    }

                    /**
                     * Sets the value of the pckHeight property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPckHeight(String value) {
                        this.pckHeight = value;
                    }

                    /**
                     * Gets the value of the pckTimer property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPckTimer() {
                        return pckTimer;
                    }

                    /**
                     * Sets the value of the pckTimer property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPckTimer(String value) {
                        this.pckTimer = value;
                    }

                    /**
                     * Gets the value of the pckSpeed property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPckSpeed() {
                        return pckSpeed;
                    }

                    /**
                     * Sets the value of the pckSpeed property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPckSpeed(String value) {
                        this.pckSpeed = value;
                    }

                    /**
                     * Gets the value of the pckVLevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPckCtrlDown() {
                        return pckCtrlDown;
                    }

                    /**
                     * Sets the value of the pckCtrlDown property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPckCtrlDown(String value) {
                        this.pckCtrlDown = value;
                    }

                    /**
                     * Gets the value of the pckCtrlUp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPckCtrlUp() {
                        return pckCtrlUp;
                    }

                    /**
                     * Sets the value of the pckCtrlUp property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPckCtrlUp(String value) {
                        this.pckCtrlUp = value;
                    }

                    /**
                     * Gets the value of the nozzleTouchHeight property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNozzleTouchHeight() {
                        return nozzleTouchHeight;
                    }

                    /**
                     * Sets the value of the nozzleTouchHeight property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="MntHeight" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MntTimer" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MntSpeed" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MntPLevel" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MntSingleDir" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MntCtrlDown" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MntCtrlUp" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MntInsertLength" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MntInsertShortDistance" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part083 {

                    @XmlAttribute(name = "MntHeight", required = true)
                    protected String mntHeight;
                    @XmlAttribute(name = "MntTimer", required = true)
                    protected String mntTimer;
                    @XmlAttribute(name = "MntSpeed", required = true)
                    protected String mntSpeed;
                    @XmlAttribute(name = "MntPLevel", required = true)
                    protected String mntPLevel;
                    @XmlAttribute(name = "MntSingleDir", required = true)
                    protected String mntSingleDir;
                    @XmlAttribute(name = "MntCtrlDown", required = true)
                    protected String mntCtrlDown;
                    @XmlAttribute(name = "MntCtrlUp", required = true)
                    protected String mntCtrlUp;
                    @XmlAttribute(name = "MntInsertLength", required = true)
                    protected String mntInsertLength;
                    @XmlAttribute(name = "MntInsertShortDistance", required = true)
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setMntSpeed(String value) {
                        this.mntSpeed = value;
                    }

                    /**
                     * Gets the value of the mntPLevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMntCtrlDown() {
                        return mntCtrlDown;
                    }

                    /**
                     * Sets the value of the mntCtrlDown property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="DspCType" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DNozzle" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Dtimer" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DXpos" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DYpos" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DspAngle" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DXpt" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DYpt" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DXtime" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DYtime" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part200 {

                    @XmlAttribute(name = "DspCType", required = true)
                    protected String dspCType;
                    @XmlAttribute(name = "DNozzle", required = true)
                    protected String dNozzle;
                    @XmlAttribute(name = "Dtimer", required = true)
                    protected String dtimer;
                    @XmlAttribute(name = "DXpos", required = true)
                    protected String dXpos;
                    @XmlAttribute(name = "DYpos", required = true)
                    protected String dYpos;
                    @XmlAttribute(name = "DspAngle", required = true)
                    protected String dspAngle;
                    @XmlAttribute(name = "DXpt", required = true)
                    protected String dXpt;
                    @XmlAttribute(name = "DYpt", required = true)
                    protected String dYpt;
                    @XmlAttribute(name = "DXtime", required = true)
                    protected String dXtime;
                    @XmlAttribute(name = "DYtime", required = true)
                    protected String dYtime;

                    /**
                     * Gets the value of the dspCType property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDspCType() {
                        return dspCType;
                    }

                    /**
                     * Sets the value of the dspCType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDspCType(String value) {
                        this.dspCType = value;
                    }

                    /**
                     * Gets the value of the dNozzle property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDNozzle() {
                        return dNozzle;
                    }

                    /**
                     * Sets the value of the dNozzle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDNozzle(String value) {
                        this.dNozzle = value;
                    }

                    /**
                     * Gets the value of the dtimer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDtimer() {
                        return dtimer;
                    }

                    /**
                     * Sets the value of the dtimer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDtimer(String value) {
                        this.dtimer = value;
                    }

                    /**
                     * Gets the value of the dXpos property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDspAngle() {
                        return dspAngle;
                    }

                    /**
                     * Sets the value of the dspAngle property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDspAngle(String value) {
                        this.dspAngle = value;
                    }

                    /**
                     * Gets the value of the dXpt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDXpt() {
                        return dXpt;
                    }

                    /**
                     * Sets the value of the dXpt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDXpt(String value) {
                        this.dXpt = value;
                    }

                    /**
                     * Gets the value of the dYpt property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDYpt() {
                        return dYpt;
                    }

                    /**
                     * Sets the value of the dYpt property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDYpt(String value) {
                        this.dYpt = value;
                    }

                    /**
                     * Gets the value of the dXtime property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDXtime() {
                        return dXtime;
                    }

                    /**
                     * Sets the value of the dXtime property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setDXtime(String value) {
                        this.dXtime = value;
                    }

                    /**
                     * Gets the value of the dYtime property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getDYtime() {
                        return dYtime;
                    }

                    /**
                     * Sets the value of the dYtime property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="Pck2ndSrvDown" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Pck2ndSrvUp" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part300 {

                    @XmlAttribute(name = "Pck2ndSrvDown", required = true)
                    protected String pck2NdSrvDown;
                    @XmlAttribute(name = "Pck2ndSrvUp", required = true)
                    protected String pck2NdSrvUp;

                    /**
                     * Gets the value of the pck2NdSrvDown property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPck2NdSrvDown() {
                        return pck2NdSrvDown;
                    }

                    /**
                     * Sets the value of the pck2NdSrvDown property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPck2NdSrvDown(String value) {
                        this.pck2NdSrvDown = value;
                    }

                    /**
                     * Gets the value of the pck2NdSrvUp property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPck2NdSrvUp() {
                        return pck2NdSrvUp;
                    }

                    /**
                     * Sets the value of the pck2NdSrvUp property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="Mnt2ndSrvDown" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Mnt2ndSrvUp" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part301 {

                    @XmlAttribute(name = "Mnt2ndSrvDown", required = true)
                    protected String mnt2NdSrvDown;
                    @XmlAttribute(name = "Mnt2ndSrvUp", required = true)
                    protected String mnt2NdSrvUp;

                    /**
                     * Gets the value of the mnt2NdSrvDown property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMnt2NdSrvDown() {
                        return mnt2NdSrvDown;
                    }

                    /**
                     * Sets the value of the mnt2NdSrvDown property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMnt2NdSrvDown(String value) {
                        this.mnt2NdSrvDown = value;
                    }

                    /**
                     * Gets the value of the mnt2NdSrvUp property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getMnt2NdSrvUp() {
                        return mnt2NdSrvUp;
                    }

                    /**
                     * Sets the value of the mnt2NdSrvUp property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="PckForceExist" use="required" type="{}Wstring" />
                 *       &lt;attribute name="PckForceTarget" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part302 {

                    @XmlAttribute(name = "PckForceExist", required = true)
                    protected String pckForceExist;
                    @XmlAttribute(name = "PckForceTarget", required = true)
                    protected String pckForceTarget;

                    /**
                     * Gets the value of the pckForceExist property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPckForceExist() {
                        return pckForceExist;
                    }

                    /**
                     * Sets the value of the pckForceExist property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPckForceExist(String value) {
                        this.pckForceExist = value;
                    }

                    /**
                     * Gets the value of the pckForceTarget property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPckForceTarget() {
                        return pckForceTarget;
                    }

                    /**
                     * Sets the value of the pckForceTarget property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="MntForceExist" use="required" type="{}Wstring" />
                 *       &lt;attribute name="MntForceTarget" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part303 {

                    @XmlAttribute(name = "MntForceExist", required = true)
                    protected String mntForceExist;
                    @XmlAttribute(name = "MntForceTarget", required = true)
                    protected String mntForceTarget;

                    /**
                     * Gets the value of the mntForceExist property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getMntForceExist() {
                        return mntForceExist;
                    }

                    /**
                     * Sets the value of the mntForceExist property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setMntForceExist(String value) {
                        this.mntForceExist = value;
                    }

                    /**
                     * Gets the value of the mntForceTarget property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getMntForceTarget() {
                        return mntForceTarget;
                    }

                    /**
                     * Sets the value of the mntForceTarget property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="Category" use="required" type="{}Wstring" />
                 *       &lt;attribute name="DipAct" use="required" type="{}Wstring" />
                 *       &lt;attribute name="StampAct" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Marking" use="required" type="{}Wstring" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Part500 {

                    @XmlAttribute(name = "Category", required = true)
                    protected String category;
                    @XmlAttribute(name = "DipAct", required = true)
                    protected String dipAct;
                    @XmlAttribute(name = "StampAct", required = true)
                    protected String stampAct;
                    @XmlAttribute(name = "Marking", required = true)
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
                     * @param value allowed object is
                     *              {@link String }
                     */
                    public void setDipAct(String value) {
                        this.dipAct = value;
                    }

                    /**
                     * Gets the value of the stampAct property.
                     *
                     * @return possible object is
                     * {@link String }
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
                 *       &lt;attribute name="Option1StationNo" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option1WaitVision" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option1DownSequenceAir" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option12ndSrvDown" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option1DownSpeed" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option1LowendHeight" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option1LowendTimer" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option1UpSequenceAir" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option12ndSrvUp" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option1UpSpeed" use="required" type="{}Wstring" />
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

                    @XmlAttribute(name = "Option1StationNo", required = true)
                    protected String option1StationNo;
                    @XmlAttribute(name = "Option1WaitVision", required = true)
                    protected String option1WaitVision;
                    @XmlAttribute(name = "Option1DownSequenceAir", required = true)
                    protected String option1DownSequenceAir;
                    @XmlAttribute(name = "Option12ndSrvDown", required = true)
                    protected String option12NdSrvDown;
                    @XmlAttribute(name = "Option1DownSpeed", required = true)
                    protected String option1DownSpeed;
                    @XmlAttribute(name = "Option1LowendHeight", required = true)
                    protected String option1LowendHeight;
                    @XmlAttribute(name = "Option1LowendTimer", required = true)
                    protected String option1LowendTimer;
                    @XmlAttribute(name = "Option1UpSequenceAir", required = true)
                    protected String option1UpSequenceAir;
                    @XmlAttribute(name = "Option12ndSrvUp", required = true)
                    protected String option12NdSrvUp;
                    @XmlAttribute(name = "Option1UpSpeed", required = true)
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOption1DownSequenceAir() {
                        return option1DownSequenceAir;
                    }

                    /**
                     * Sets the value of the option1DownSequenceAir property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOption1LowendHeight() {
                        return option1LowendHeight;
                    }

                    /**
                     * Sets the value of the option1LowendHeight property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOption1LowendHeight(String value) {
                        this.option1LowendHeight = value;
                    }

                    /**
                     * Gets the value of the option1LowendTimer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOption1LowendTimer() {
                        return option1LowendTimer;
                    }

                    /**
                     * Sets the value of the option1LowendTimer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOption1LowendTimer(String value) {
                        this.option1LowendTimer = value;
                    }

                    /**
                     * Gets the value of the option1UpSequenceAir property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOption1UpSequenceAir() {
                        return option1UpSequenceAir;
                    }

                    /**
                     * Sets the value of the option1UpSequenceAir property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setOption1UpSequenceAir(String value) {
                        this.option1UpSequenceAir = value;
                    }

                    /**
                     * Gets the value of the option12NdSrvUp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getOption12NdSrvUp() {
                        return option12NdSrvUp;
                    }

                    /**
                     * Sets the value of the option12NdSrvUp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setOption12NdSrvUp(String value) {
                        this.option12NdSrvUp = value;
                    }

                    /**
                     * Gets the value of the option1UpSpeed property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
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
                 *       &lt;attribute name="Option1ForceExist" use="required" type="{}Wstring" />
                 *       &lt;attribute name="Option1ForceTarget" use="required" type="{}Wstring" />
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

                    @XmlAttribute(name = "Option1ForceExist", required = true)
                    protected String option1ForceExist;
                    @XmlAttribute(name = "Option1ForceTarget", required = true)
                    protected String option1ForceTarget;

                    /**
                     * Gets the value of the option1ForceExist property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOption1ForceExist() {
                        return option1ForceExist;
                    }

                    /**
                     * Sets the value of the option1ForceExist property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOption1ForceExist(String value) {
                        this.option1ForceExist = value;
                    }

                    /**
                     * Gets the value of the option1ForceTarget property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
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
                 *       &lt;attribute name="SVUse" use="required" type="{}Wstring" />
                 *       &lt;attribute name="SVBringBack" use="required" type="{}Wstring" />
                 *       &lt;attribute name="SVBodyLimit" use="required" type="{}Wstring" />
                 *       &lt;attribute name="SVReverseCheck" use="required" type="{}Wstring" />
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

                    @XmlAttribute(name = "SVUse", required = true)
                    protected String svUse;
                    @XmlAttribute(name = "SVBringBack", required = true)
                    protected String svBringBack;
                    @XmlAttribute(name = "SVBodyLimit", required = true)
                    protected String svBodyLimit;
                    @XmlAttribute(name = "SVReverseCheck", required = true)
                    protected String svReverseCheck;

                    /**
                     * Gets the value of the svUse property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getSVUse() {
                        return svUse;
                    }

                    /**
                     * Sets the value of the svUse property.
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setSVUse(String value) {
                        this.svUse = value;
                    }

                    /**
                     * Gets the value of the svBringBack property.
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getSVBringBack() {
                        return svBringBack;
                    }

                    /**
                     * Sets the value of the svBringBack property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
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
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSVBodyLimit(String value) {
                        this.svBodyLimit = value;
                    }

                    /**
                     * Gets the value of the svReverseCheck property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getSVReverseCheck() {
                        return svReverseCheck;
                    }

                    /**
                     * Sets the value of the svReverseCheck property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setSVReverseCheck(String value) {
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
         *                 &lt;attribute name="No" use="required" type="{}Wstring" />
         *                 &lt;attribute name="Lane" use="required" type="{}Wstring" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
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
             * @param value
             *     allowed object is
             *     {@link PcbDataFile.Machine.Production.ProductGroup }
             *     
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
             *       &lt;attribute name="No" use="required" type="{}Wstring" />
             *       &lt;attribute name="Lane" use="required" type="{}Wstring" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ProductGroup {

                @XmlAttribute(name = "No", required = true)
                protected String no;
                @XmlAttribute(name = "Lane", required = true)
                protected String lane;

                /**
                 * Gets the value of the no property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getNo() {
                    return no;
                }

                /**
                 * Sets the value of the no property.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNo(String value) {
                    this.no = value;
                }

                /**
                 * Gets the value of the lane property.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLane() {
                    return lane;
                }

                /**
                 * Sets the value of the lane property.
                 *
                 * @param value allowed object is
                 *              {@link String }
                 */
                public void setLane(String value) {
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
         * 
         * 
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
             *
             *
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
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setCommands(Object value) {
                    this.commands = value;
                }

                /**
                 * Gets the value of the localPoints property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *
                 */
                public Object getLocalPoints() {
                    return localPoints;
                }

                /**
                 * Sets the value of the localPoints property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *
                 */
                public void setLocalPoints(Object value) {
                    this.localPoints = value;
                }

                /**
                 * Gets the value of the watches property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *
                 */
                public Object getWatches() {
                    return watches;
                }

                /**
                 * Sets the value of the watches property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *
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
         *       &lt;attribute name="LastEditingDate" use="required" type="{}Wstring" />
         *       &lt;attribute name="LastEditingTime" use="required" type="{}Wstring" />
         *       &lt;attribute name="VersionNo" use="required" type="{}Wstring" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Property {

            @XmlAttribute(name = "LastEditingDate", required = true)
            protected String lastEditingDate;
            @XmlAttribute(name = "LastEditingTime", required = true)
            protected String lastEditingTime;
            @XmlAttribute(name = "VersionNo", required = true)
            protected String versionNo;

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
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastEditingDate(String value) {
                this.lastEditingDate = value;
            }

            /**
             * Gets the value of the lastEditingTime property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastEditingTime() {
                return lastEditingTime;
            }

            /**
             * Sets the value of the lastEditingTime property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastEditingTime(String value) {
                this.lastEditingTime = value;
            }

            /**
             * Gets the value of the versionNo property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getVersionNo() {
                return versionNo;
            }

            /**
             * Sets the value of the versionNo property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setVersionNo(String value) {
                this.versionNo = value;
            }

        }

    }

}

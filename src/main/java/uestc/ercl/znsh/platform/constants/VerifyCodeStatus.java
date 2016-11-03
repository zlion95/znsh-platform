/*
 * Copyright (c) 2016. Embedded Real-Time Computation Lab Of UESTC.
 *
 * 版权所有：电子科技大学・信息与软件工程学院・嵌入式实时计算研究所（简称ERCL）
 * http://www.is.uestc.edu.cn
 *
 * 未经许可，任何其他组织或个人不得将此程序——
 * 1、用于商业用途。
 * 2、修改或再发布。
 */
package uestc.ercl.znsh.platform.constants;

/**
 * 动态验证结果
 *
 * @apiNote 分别为：正确，错误，过期，不存在，系统错
 */
public enum VerifyCodeStatus
{
    VALID,
    INVALID,
    EXPIRED,
    NONE,
    ERROR
}
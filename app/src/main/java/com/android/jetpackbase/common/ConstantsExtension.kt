package com.android.jetpackbase.common

import com.android.jetpackbase.model.AddressInfo
import com.android.jetpackbase.model.CompletedIssueData
import com.android.jetpackbase.model.HelpFaqData
import com.android.jetpackbase.model.IssueData

fun updateIssueList(): MutableList<IssueData> {
    val list: MutableList<IssueData> = ArrayList()
    val addressInfo = AddressInfo(" R.K Salai, Nungambakkam, Chennai-31", "13.082680", "80.270721")
    val des =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna sit aliqua"
/*    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))
    list.add(IssueData("","Battery Issue", "TN 05 AB 7534", "25th May", des, addressInfo))*/
    return list
}


fun updateCompletedIssueList(): MutableList<CompletedIssueData> {
    val list: MutableList<CompletedIssueData> = ArrayList()
    val addressInfo = AddressInfo(" R.K Salai, Nungambakkam, Chennai-31", "13.082680", "80.270721")
    val des =
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";
    list.add(
        CompletedIssueData(
            "Battery Issue",
            "TN 05 AB 1234",
            "25th May",
            des, des,
            addressInfo
        )
    )
    list.add(
        CompletedIssueData(
            "Break Problem",
            "TN 05 AB 1234",
            "28th Jan",
            des, des,
            addressInfo
        )
    )
    list.add(
        CompletedIssueData(
            "Break Problem",
            "TN 05 AB 1234",
            "12th Mar",
            des, des,
            addressInfo
        )
    )
    list.add(
        CompletedIssueData(
            "Break Problem",
            "TN 05 AB 1234",
            "04th Apr",
            des, des,
            addressInfo
        )
    )
    list.add(
        CompletedIssueData(
            "Break Problem",
            "TN 05 AB 1234",
            "31th Sep",
            des, des,
            addressInfo
        )
    )
    list.add(
        CompletedIssueData(
            "Break Problem",
            "TN 05 AB 1234",
            "18th Oct",
            des, des,
            addressInfo
        )
    )
    list.add(
        CompletedIssueData(
            "Break Problem",
            "TN 05 AB 1234",
            "07th Dec",
            des, des,
            addressInfo
        )
    )
    list.add(
        CompletedIssueData(
            "Break Problem",
            "TN 05 AB 1234",
            "24th Jan",
            des, des,
            addressInfo
        )
    )
    list.add(
        CompletedIssueData(
            "Break Problem",
            "TN 05 AB 1234",
            "29th Feb",
            des, des,
            addressInfo
        )
    )
    return list
}

fun getHelpFaqList(): MutableList<HelpFaqData> {
    val list: MutableList<HelpFaqData> = ArrayList()
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    list.add(
        HelpFaqData(
            "Where can i pick  the bike from?",
            "You can pick the bike from any of our zones which are listed on the app"
        )
    )
    return list
}
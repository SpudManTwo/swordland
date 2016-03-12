<%-- 
    Document   : craftingProofOfConcept
    Created on : Feb 27, 2016, 10:44:21 PM
    Author     : SpudManTwo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crafting</title>
    </head>
    <body>
        <p>Enter the weapon to be generated as a String in the following format.<br>MaterialName Level AbbreviationOfType WisdomOfMaker</p>
        <table>
            <tr>
                <td>OHS</td>
                <td>One Handed Sword</td>
            </tr>
            <tr>
                <td>THS</td>
                <td>Two Handed Sword</td>
            </tr>
            <tr>
                <td>OHCS</td>
                <td>One Handed Curved Sword</td>
            </tr>
            <tr>
                <td>THCS</td>
                <td>Two Handed Curved Sword</td>
            </tr>
            <tr>
                <td>OHD</td>
                <td>One Handed Dagger</td>
            </tr>
            <tr>
                <td>OHR</td>
                <td>One Handed Rapier</td>
            </tr>
            <tr>
                <td>OHT</td>
                <td>One Handed Trauma</td>
            </tr>
            <tr>
                <td>OHA</td>
                <td>One Handed Axe</td>
            </tr>
            <tr>
                <td>THBA</td>
                <td>Two Handed Battle Axe</td>
            </tr>
            <tr>
                <td>TW</td>
                <td>Throwing Weapons</td>
            </tr>
            <tr>
                <td>THAS</td>
                <td>Two Handed Assault Spear</td>
            </tr>        
        </table>
        <form method="post" action="CraftResults.jsp">
        <input type="text" name="data"></input><br>
        <input type="submit"></input>
        </form>
    </body>
</html>

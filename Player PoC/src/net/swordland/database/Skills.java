/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.swordland.database;

import java.util.ArrayList;
import java.util.TreeMap;
import net.swordland.Skill;
import net.swordland.Attack;

/**
 *
 * @author Kazumi
 */
public final class Skills 
{
    private Skills() {    }
    
    private static TreeMap<String, Skill> AllSkills;
    private static ArrayList<Skill> StartingSkills;
    
    public static void setSkillDatabase()
    {
        AllSkills = new TreeMap<>();
        StartingSkills = new ArrayList<>();
        SetOHSSkills();
    }
    
    public static void SetOHSSkills()
    {
        AllSkills.put("SIDx010101010103", new Skill(
                "SIDx010101010103",
                "OHS",
                "Nova Ascention",
                "After 9 vicious slashes you deal one final hit blow. Deals 525% normal damage per hit for the first 9, "
                        + "Last hit does 975% normal damage. ",
                4,
                181,
                null,
                "Howling Octave",
                8,
                1,
                new Attack[]{
                    new Attack(5.25f),
                    new Attack(5.25f),
                    new Attack(5.25f),
                    new Attack(5.25f),
                    new Attack(5.25f),
                    new Attack(5.25f),
                    new Attack(5.25f),
                    new Attack(5.25f),
                    new Attack(5.25f),
                    new Attack(9.75f)}
        ));
        AllSkills.put("SIDx010001010103", new Skill(
                "SIDx010001010103",                
                "OHS",
                "Howling Octave",
                "A drawing of a vertical and horizontal number 8 does 8 hits to your opponent. Does 300% normal damage per hit.",
                4,
                64,
                new String[] { "Nova Ascencion" },
                "Deadly Sins",
                8,
                1,
                new Attack[]{
                    new Attack(3),
                    new Attack(3),
                    new Attack(3),
                    new Attack(3),
                    new Attack(3),
                    new Attack(3),
                    new Attack(3),
                    new Attack(3)}
        ));
        AllSkills.put("SIDx010000010103", new Skill(
                "SIDx010000010103",
                "OHS",
                "Deadly Sins",
                "A 7 hit combo named after the 7 deadly sins. Each hit does 190% normal damage per hit.",
                3,
                23,
                new String[] { "Howling Octave" },
                "Star Quint Prominence",
                7,
                1,
                new Attack[]{
                    new Attack(1.9f),
                    new Attack(1.9f),
                    new Attack(1.9f),
                    new Attack(1.9f),
                    new Attack(1.9f),
                    new Attack(1.9f),
                    new Attack(1.9f)}
        ));
        AllSkills.put("SIDx010000000103", new Skill(
                "SIDx010000000103",
                "OHS",
                "Star Quint Prominence",
                "A 5 hit combo that resembles the shape of a star. Each hit does 130% damage.",
                2,
                8,
                new String[] { "Deadly Sins" },
                "Savage Fulcrum",
                5,
                1,
                new Attack[]{
                    new Attack(1.3f),
                    new Attack(1.3f),
                    new Attack(1.3f),
                    new Attack(1.3f),
                    new Attack(1.3f)}
        ));
        AllSkills.put("SIDx010000000003", new Skill(
                "SIDx010000000003",
                "OHS",
                "Savage Fulcrum",
                "A four hit combo that carves the number 4 into your opponent. Does normal damage per hit.",
                1,
                3,
                new String[] { "Star Quint Prominence" },
                null,
                4,
                1,
                new Attack[]{
                    new Attack(1),
                    new Attack(1),
                    new Attack(1),
                    new Attack(1)}
        ));
        AllSkills.put("SIDx010000000102", new Skill(
                "SIDx010000000102",
                "OHS",
                "Lightning Fall",
                "A shocking attack where the user flips in the air and pushes electricity out of the ground, hitting anyone near them. "
                        + "Has 100% range and does 50% normal damage.",
                2,
                8,
                null,
                "Serration Wave",
                1,
                1,
                new Attack[]{ new Attack(.5f) }
        ));
        AllSkills.put("SIDx010000000002", new Skill(
                "SIDx010000000002",
                "OHS",
                "Serration Wave",
                "A spinning attack that hits your surrounding area once. Does 25% damage.",
                1,
                3,
                new String[]{ "Lightning Fall" },
                null,
                1,
                1,
                new Attack[]{ new Attack(.25f) }
        ));
        AllSkills.put("SIDx010000000101", new Skill(
                "SIDx010000000101",
                "OHS",
                "Sharp Nail",
                "After two fast but powerful horizontal slashes, the user slams downwards with a third. Does 300% normal damage.",
                2,
                8,
                null,
                "Vorpal Strike",
                3,
                1,
                new Attack[]{
                    new Attack(3),
                    new Attack(3),
                    new Attack(3)}
        ));
        AllSkills.put("SIDx010000000001", new Skill(
                "SIDx010000000001",
                "OHS",
                "Vorpal Strike",
                "A heavy single strike that does 300% normal damage.",
                2,
                8,
                new String[]{ "Sharp Nail" },
                null,
                3,
                1,
                new Attack[]{ new Attack(3) }
        ));
    }
    
    public static void SetSimpleSkills()
    {
        AllSkills.put("SIDx020000000101", new Skill(
                "SIDx020000000101",
                "Simple", 
                "Snake Bite", 
                "A two hit combo that targets your opponent's weapon and attempts to cut it in half. Does no damage.",
                2,
                8,
                null,
                "Horizontal Arc",
                2,
                1,
                new Attack[]{
                    new Attack("cut_weapon"),
                    new Attack("cut_weapon")}
        ));
        AllSkills.put("SIDx020000000001", new Skill(
                "SIDx020000000001",
                "Simple", 
                "Horizontal Arc", 
                "A two hit combo that swings your weapon right and then left. Does normal damage per hit.",
                1,
                3,
                new String[]{"Snake Bite"},
                null,
                2,
                1,
                new Attack[]{
                    new Attack(1),
                    new Attack(1)}
        ));
    }

    public static ArrayList<Skill> getStartingSkills()
    {
        return Skills.StartingSkills;
    }
}

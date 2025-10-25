package com.moklyak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//
//
public class Main {

    public static String loremText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam nec orci et enim ornare gravida. Suspendisse potenti. Proin ac diam massa. Phasellus arcu diam, lacinia non felis at, rhoncus gravida mi. Donec faucibus dignissim nulla ac suscipit. Nam eu mollis eros. Mauris commodo turpis interdum, condimentum erat et, mattis ligula. Cras in sagittis massa. Ut id est consequat, maximus leo at, elementum sapien. Nulla ut orci sit amet mi pretium viverra in vitae nunc.\n" +
            "\n" +
            "In ornare turpis at sollicitudin viverra. Nullam vulputate in tortor eget aliquet. Morbi mattis placerat ullamcorper. Aliquam faucibus nisi vel lacus varius elementum. Suspendisse sit amet ante risus. Vestibulum sit amet odio elementum, sollicitudin quam id, convallis magna. Quisque malesuada velit leo, at faucibus ipsum dignissim eget. Pellentesque elementum augue et odio lobortis, et iaculis dolor condimentum. Ut id velit eu erat vestibulum hendrerit sit amet finibus urna. Praesent blandit leo sit amet consequat laoreet. Quisque maximus euismod tellus, nec convallis felis congue a. Fusce eget nisi sed justo mattis pharetra at at tortor. Sed tincidunt fringilla mollis. In congue libero vel sapien aliquet bibendum.\n" +
            "\n" +
            "Morbi eu viverra nunc. Donec tempus, sapien id vestibulum scelerisque, risus sapien posuere arcu, eu tristique felis odio vitae nulla. Maecenas gravida tristique arcu a posuere. Morbi fermentum vitae libero nec viverra. Duis aliquet ex dolor, at mattis purus varius eget. Duis fermentum venenatis ultricies. Suspendisse vestibulum imperdiet tincidunt. Sed eget congue eros. Duis quis felis ac nunc mollis lacinia et ac arcu. Cras urna dolor, rhoncus at sagittis eget, consequat a ex.\n" +
            "\n" +
            "Morbi gravida dignissim dui, vitae viverra elit rutrum in. Cras non nulla vestibulum, dictum tellus sit amet, laoreet purus. Suspendisse aliquet sem sed nisl ornare blandit nec ac libero. Nulla tristique scelerisque velit, sit amet eleifend libero rutrum quis. Nullam accumsan porta mauris, eget fermentum magna sodales sed. Nunc venenatis elementum lacus, non finibus tellus maximus ac. Fusce fringilla nisi a metus lacinia fringilla. Nulla mi velit, finibus sit amet dui dictum, sollicitudin ultricies mi. Donec eget posuere massa, vitae ultricies magna. Morbi ultricies eleifend vulputate. Suspendisse potenti. Aliquam pellentesque dui mi, at mollis orci consectetur eu. Duis in mollis purus, vel aliquet augue. Nunc vehicula sit amet leo vitae tristique. Suspendisse elementum neque mauris, in iaculis dui fringilla a. Morbi aliquet felis in nibh mollis finibus.\n" +
            "\n" +
            "Donec quis sem accumsan ligula fringilla fringilla. Vivamus ut tellus eu lectus volutpat dapibus. Quisque aliquet, velit et bibendum tempus, quam ante condimentum turpis, sed convallis ipsum magna vitae nibh. Quisque ac condimentum enim, a scelerisque mauris. Nunc ac tortor eu lorem porta bibendum non in neque. Aliquam eget nisl vitae eros porttitor luctus non in ligula. Morbi sed metus condimentum, gravida neque a, sodales ligula. Vestibulum non risus convallis, egestas orci eget, porta urna. Sed iaculis massa tempus interdum gravida. Quisque vulputate efficitur diam eget facilisis. Ut mattis tellus lectus, ut hendrerit neque aliquet nec.";

    public static void main(String[] args) {
        List<Integer> araryList = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        List<Integer> linkedList = new LinkedList<>(List.of(2, 4, 6, 8, 0));
        Filter<Integer> f = x -> x * x;

        araryList = MyCollectionUtils.filter(araryList, f);
        linkedList = MyCollectionUtils.filter(linkedList, f);

        System.out.println(araryList);
        System.out.println(linkedList);


        List<String> textList = List.of(loremText.split("[\\p{Punct}\\s]+"));
        Map<String, Integer> counted = MyCollectionUtils.countSame(textList);

        System.out.println(counted);

    }
}
package main

import "testing"

func TestHello(t *testing.T){
	got := Hello("world")

	want := "Hello world"

	if got != want {
		t.Errorf("Got : %q , want : %q",got,want)
	}
}
func TestHello2(t *testing.T){
        got := Hello("snow")

        want := "Hello snow"

        if got != want {
                t.Errorf("Got : %q , want : %q",got,want)
        }
}

# Updated Version
There is an updated version of this template available at [this other repository](https://gitlab.com/christian-steinmeyer/latex-paper-template). It has more functionality and also an IEEE-ready version for IEEE submissions.

---
---


## Theses Template

This template is based on 
https://github.com/uniba-dsg/dsg-templates/tree/master/dsg-seminar-en

But it was altered in several ways that aim at improving usability.

Note, that this template is optimized for theses in computer science and Java 
as main programming language. 

## Usage

You can easily get started by defining variables such as the title of your 
thesis etc. by changing them in [variables](config/variables.tex).

Chose whether you want the title page with one logo or with two logos in 
[config](config/config.tex) by including the according file there. Default is one 
logo.

Images go in the [images](images) directory.

Other resources, e.g. source code files, go in the [resources](resources) directory.

Simply start writing by adding sections in the [sections](sections) directory and
including these files below.

Feel free to configure listings, e.g. for other languages under 
[listings](config/listings.tex). Layout changes can be made in [layout](config/layout.tex). Add
packages to [packages](config/packages.tex). Add new commands to [commands](config/commands.tex).

## Examples

[Here](build/thesis-template.pdf), you can find a built example PDF. And [here](build/thesis-template-alternative.pdf) is an alternative title page with two logos instead of one (e.g. one for the university and one for the chair). 
